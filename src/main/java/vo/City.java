package vo;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cityName")
    private String cityName;

    /*@Column(name = "country")*/
    @JoinColumn(name = "country_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Country country;

    public City() {
    }

    public City(long id) {
        this.id = id;
    }

    public City(long id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String toString() {
        return "CityRest{" +
            "id=" + id +
            ", cityName='" + cityName + '\'' +
            '}';
    }
}
