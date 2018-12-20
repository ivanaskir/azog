package lt.sventes.controllers;

import io.swagger.annotations.Api;
import lt.sventes.Services.HolidayService;
import lt.sventes.dto.HolidayDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/holiday")
@Api(value="holiday")
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    public HolidayController(HolidayService holidayService) {
        this.holidayService = holidayService;
    }

    public HolidayService getHolidayService() {
        return holidayService;
    }

    public void setHolidayService(HolidayService holidayService) {
        this.holidayService = holidayService;
    }


    @RequestMapping( value="/showAll", method= RequestMethod.GET)
    public Collection<HolidayDto> getAllHolidays() {
        return holidayService.findAll();
    }


    @RequestMapping(value="/add", method=RequestMethod.POST)
    public void addHoliday(@RequestBody HolidayDto holidayDto){
        System.out.println("Adding new holiday to repository..."+holidayDto.getName());
        holidayService.addHolidayToRepository(holidayDto);
    }

    @RequestMapping(value="/update/{name}", method=RequestMethod.PUT)
    public void updateHoliday(@PathVariable("name")String name, @RequestBody HolidayDto holidayDto){
        holidayService.updateHolidayByName(name, holidayDto);
    }

    @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
    public void deleteHoliday(@PathVariable("name")String name){
        holidayService.deleteHolidayByName(name);
    }




}
