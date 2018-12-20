package lt.sventes.repository;

import lt.sventes.entities.Celebrations;
import lt.sventes.entities.Country;
import lt.sventes.entities.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface HolidayRepository extends JpaRepository<Holiday, Long> {

//   @Query("select co from Holiday h join h.celebrations c join c.country co where h.name=:holidayName and co.name =: countryName")
//    public Country searchCountryFromHoliday(@Param("holidayName")String holidayName, @Param("countryName")String countryName);

    public List<Holiday> findAll();

    public List<Holiday> findByName(String name);

    public void deleteByName(String name);
}

