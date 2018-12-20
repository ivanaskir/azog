package lt.sventes.entities;

import javax.persistence.*;
import java.util.List;


@Entity
public class Country {

    private @Id @GeneratedValue Long id;
    private String name;
    private String flagImg;
    private String president;


    protected Country(){}

    public Country(String name, String flagImg, String president) {
        this.name = name;
        this.flagImg = flagImg;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlagImg() {
        return flagImg;
    }

    public void setFlagImg(String flagImg) {
        this.flagImg = flagImg;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }
}
