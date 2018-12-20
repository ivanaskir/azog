package lt.sventes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Year {
    private @Id @GeneratedValue Long id;
    private int numberOfYears;
    private int numberOfDays;
    private String horoscope;

    protected Year(){}

    public Year(int numberOfYears, int numberOfDays, String horoscope) {
        this.numberOfYears = numberOfYears;
        this.numberOfDays = numberOfDays;
        this.horoscope = horoscope;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }
}
