package lt.sventes.repository;
import lt.sventes.entities.Country;
import lt.sventes.entities.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {

    public List<Country> findAll();

    public List<Country> findByName(String name);

    public void deleteByName(String name);

}
