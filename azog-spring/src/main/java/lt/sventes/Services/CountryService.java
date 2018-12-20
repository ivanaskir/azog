package lt.sventes.Services;
import lt.sventes.dto.CountryDto;
import lt.sventes.dto.HolidayDto;
import lt.sventes.entities.Country;
import lt.sventes.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public CountryRepository getCountryRepository() {
        return countryRepository;
    }

    public void setCountryRepository(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Transactional
    public Collection<CountryDto> findAll() {
        return countryRepository.findAll().stream().map(country->
                new CountryDto(country.getName(),
                        country.getFlagImg(),
                        country.getPresident())).collect(Collectors.toList());
    }

    @Transactional
    public void addCountryToRepository(CountryDto countryDto) {

        Country country=new Country(countryDto.getName(),
                countryDto.getFlagImg(),
                countryDto.getPresident());
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountryByName(String name, CountryDto countryDto) {
        Country savedCountry=countryRepository.findByName(name).get(0);
        savedCountry.setName(countryDto.getName());
        savedCountry.setFlagImg(countryDto.getFlagImg());
        savedCountry.setPresident(countryDto.getPresident());
        Country updateCountry=countryRepository.save(savedCountry);
    }

    @Transactional
    @Modifying
    public void deleteCountryByName(String name) {
        countryRepository.deleteByName(name);
    }


}
