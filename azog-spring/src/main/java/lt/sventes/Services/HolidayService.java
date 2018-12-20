package lt.sventes.Services;
import lt.sventes.dto.HolidayDto;
import lt.sventes.entities.Holiday;
import lt.sventes.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class HolidayService {

@Autowired
    HolidayRepository holidayRepository;

    public HolidayService(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    public HolidayRepository getHolidayRepository() {
        return holidayRepository;
    }

    public void setHolidayRepository(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    @Transactional
    public Collection<HolidayDto> findAll() {
        return holidayRepository.findAll().stream().map(holiday->
                new HolidayDto(holiday.getName(),
                                holiday.getDescription(),
                                holiday.getImage(),
                                holiday.getType(),
                                holiday.isFlag())).collect(Collectors.toList());
    }

    @Transactional
    public void addHolidayToRepository(HolidayDto holidayDto) {

        Holiday holiday=new Holiday(holidayDto.getName(),
                                    holidayDto.getDescription(),
                                    holidayDto.getImage(),
                                    holidayDto.getType(),
                                    holidayDto.isFlag());
        holidayRepository.save(holiday);
    }

    @Transactional
    public void updateHolidayByName(String name, HolidayDto holidayDto) {
        Holiday savedHoliday=holidayRepository.findByName(name).get(0);
        savedHoliday.setName(holidayDto.getName());
        savedHoliday.setDescription(holidayDto.getDescription());
        savedHoliday.setImage(holidayDto.getImage());
        savedHoliday.setType(holidayDto.getType());
        savedHoliday.setFlag(holidayDto.isFlag());
        Holiday updateHoliday=holidayRepository.save(savedHoliday);
    }

    @Transactional
    @Modifying
    public void deleteHolidayByName(String name) {
        holidayRepository.deleteByName(name);
    }
}


