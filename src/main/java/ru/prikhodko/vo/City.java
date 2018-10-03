package ru.prikhodko.vo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "city")
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "city_name")
    private String cityName;

    @JoinColumn(name = "country_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Country country;

    public City() {
    }

    public City(City city) {
    }

    /*public City(long id) {
        this.id = id;
    }*/

    public City(String cityName) {
        /*this.id = id;*/
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
