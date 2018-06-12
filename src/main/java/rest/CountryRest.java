package rest;

public class CountryRest {
    private long id;
    private String countryName;

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

    public String toString() {
        return "CountryRest{" +
            "id=" + id +
            ", countryName='" + countryName + '\'' +
            '}';
    }
}
