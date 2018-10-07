package ru.prikhodko.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "COUNTRY")
@SequenceGenerator(name = "entity_id_gen", sequenceName = "COUNTRY_SEQ", allocationSize = 1)
public class Country implements Serializable {

    @Id
    @GeneratedValue(generator = "entity_id_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "country_name", unique = true)
    private String countryName;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL) //CascadeType.PERSIST
    private List<City> cities;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)//ALL поборол ошибку при сохранении языка
    @JoinColumn(name="language_id")
    private Language language;

    public Country() {
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(String.format(
                "Country[id=%d, name='%s']%n",
                id, countryName));
        if (cities != null) {
            for(City city : cities) {
                result.append(String.format(
                        "City[id=%d, name='%s']%n",
                        city.getId(), city.getCityName()));
            }
        }

        return result.toString();
    }
}
