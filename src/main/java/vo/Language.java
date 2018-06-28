package vo;

import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "language_name")
    private String languageName;

    @OneToOne(fetch=FetchType.LAZY, optional = false, mappedBy="language", cascade = CascadeType.ALL, targetEntity = Country.class)
    @JoinColumn(name="country_id")
    private Country country;

    public Language() {
    }

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
