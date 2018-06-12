package rest;

public class LanguageRest {
    private long id;
    private String languageName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String toString() {
        return "LanguageRest{" +
            "id=" + id +
            ", languageName='" + languageName + '\'' +
            '}';
    }
}
