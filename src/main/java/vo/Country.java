package vo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "country_name")
    private String countryName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country", targetEntity = City.class)
    private Set<City> cities;

    @OneToOne(optional = true)
    @JoinColumn(name="language_id")
    private Language language;

    public Country() {
    }

    public Country(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String toString() {
        return "CountryController{" +
            "id=" + id +
            ", countryName='" + countryName + '\'' +
            '}';
    }
}
