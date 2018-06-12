package vo;

public class City {
    private long id;
    private String cityName;

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

    public String toString() {
        return "CityRest{" +
            "id=" + id +
            ", cityName='" + cityName + '\'' +
            '}';
    }
}
