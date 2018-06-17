package vo;

import java.util.Set;

public class Country {
    private long id;
    private String countryName;
    private Set<String> cities;
    private Language language;

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

    public Set<String> getCities() {
        return cities;
    }

    public void setCities(Set<String> cities) {
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
