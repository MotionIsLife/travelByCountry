package ru.prikhodko.vo;

import javax.persistence.*;

@Entity
@Table(name = "LANGUAGE")
@SequenceGenerator(name = "entity_id_gen", sequenceName = "LANGUAGE_SEQ", allocationSize = 1)
public class Language {

    @Id
    @GeneratedValue(generator = "entity_id_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "language_name")
    private String languageName;

    /*@OneToOne(fetch=FetchType.LAZY, optional = false, mappedBy="language", cascade = CascadeType.ALL, targetEntity = Country.class)
    @JoinColumn(name="country_id", referencedColumnName = "id")*/
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "language", cascade = CascadeType.ALL)
    private Country country;

    public Language() {
    }

    public Language(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
