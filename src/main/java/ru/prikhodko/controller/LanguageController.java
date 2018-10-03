package ru.prikhodko.controller;

import org.springframework.web.bind.annotation.*;
import ru.prikhodko.vo.Language;

@RestController
@RequestMapping(value = "/language")
public class LanguageController {
    @PostMapping
    public void addLanguage(@RequestBody Language language){
        System.out.println("adding language " + language);
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Language getLanguage(@PathVariable Integer id) {
        return new Language(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteLanguage(@PathVariable Integer id) {
        System.out.println("deleted language with id: " + id);
    }

    @PutMapping
    public void updateLanguage(@RequestBody Language language) {
        System.out.println("updating language " + language);
    }
}
