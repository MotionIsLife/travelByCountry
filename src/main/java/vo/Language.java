package vo;

public class Language {
    private long id;
    private String languageName;

    public Language(Long id) {
        this.id = id;
    }

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
        return "LanguageController{" +
            "id=" + id +
            ", languageName='" + languageName + '\'' +
            '}';
    }
}
