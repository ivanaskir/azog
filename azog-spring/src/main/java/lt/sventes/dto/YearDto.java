package lt.sventes.dto;

public class YearDto {

    private int numberOfYears;
    private int numberOfDays;
    private String horoscope;

    protected YearDto(){}

    public YearDto(int numberOfYears, int numberOfDays, String horoscope) {
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
