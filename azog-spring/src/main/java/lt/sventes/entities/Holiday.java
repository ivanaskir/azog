package lt.sventes.entities;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
public class Holiday {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String image;
    private String type;
    private boolean flag;

    @OneToMany(cascade=CascadeType.REMOVE)
    private Set<Celebrations> celebrations;

    protected Holiday() {}

    public Holiday(String name, String description, String image, String type, boolean flag) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.type = type;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Set<Celebrations> getCelebrations() {
        return celebrations;
    }

    public void setCelebrations(Set<Celebrations> celebrations) {
        this.celebrations = celebrations;
    }
}




