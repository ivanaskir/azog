package lt.sventes.controllers;
import io.swagger.annotations.Api;
import lt.sventes.Services.CountryService;
import lt.sventes.dto.CountryDto;
import lt.sventes.dto.CountryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/api/country")
@Api(value="country")
public class CountryController {

    @Autowired
    private CountryService countryService;


    public CountryController(){}

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    public CountryService getCountryService() {
        return countryService;
    }

    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping( value="/showAll", method= RequestMethod.GET)
    public Collection<CountryDto> getAllCountries() {
        return countryService.findAll();
    }


    @RequestMapping(value="/add", method=RequestMethod.POST)
    public void addCountry(@RequestBody CountryDto countryDto){
        System.out.println("Adding new country to repository..."+countryDto.getName());
        countryService.addCountryToRepository(countryDto);
    }

    @RequestMapping(value="/update/{name}", method=RequestMethod.PUT)
    public void updateCountry(@PathVariable("name")String name, @RequestBody CountryDto countryDto){
        countryService.updateCountryByName(name, countryDto);
    }

    @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
    public void deleteHoliday(@PathVariable("name")String name){
        countryService.deleteCountryByName(name);
    }




}
