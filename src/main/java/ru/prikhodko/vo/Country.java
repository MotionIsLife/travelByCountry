package ru.prikhodko.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "country_name", unique = true)
    private String countryName;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country", cascade = CascadeType.REMOVE) //CascadeType.PERSIST
    private Set<City> cities;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)//ALL поборол ошибку при сохранении языка
    @JoinColumn(name="language_id")
    private Language language;

    public Country() {
    }

    public Country(String countryName) {
        this.countryName = countryName;
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
