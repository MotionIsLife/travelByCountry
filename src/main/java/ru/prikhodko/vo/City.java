package ru.prikhodko.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CITY")
@SequenceGenerator(name = "entity_id_gen", sequenceName = "CITY_SEQ", allocationSize = 1)
public class City implements Serializable {
    @Id
    @GeneratedValue(generator = "entity_id_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "hero_city")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean heroCity;

    @Column(name = "hero_city_new")
    @Type(type = "ru.prikhodko.type.NumericBooleanTypeNewUserType")
    private Boolean heroCityNew;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    public City() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Boolean getHeroCity() {
        return heroCity;
    }

    public void setHeroCity(Boolean heroCity) {
        this.heroCity = heroCity;
    }

    public Boolean getHeroCityNew() {
        return heroCityNew;
    }

    public void setHeroCityNew(Boolean heroCityNew) {
        this.heroCityNew = heroCityNew;
    }

    @Override
    public String toString() {
        return "CityRest{" +
            "id=" + id +
            ", cityName='" + cityName + '\'' +
            '}';
    }
}
