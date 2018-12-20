package lt.sventes.entities;
import javax.persistence.*;
import java.util.Set;


@Entity
public class Celebrations {
    private @Id @GeneratedValue Long id;

    @ManyToOne(cascade={CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany
    private Set<Year> yearsTocelebrate;

    public Celebrations() {}



    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Year> getYearsTocelebrate() {
        return yearsTocelebrate;
    }

    public void setYearsTocelebrate(Set<Year> yearsTocelebrate) {
        this.yearsTocelebrate = yearsTocelebrate;
    }
}
