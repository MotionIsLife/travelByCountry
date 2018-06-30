package ru.prikhodko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.prikhodko.repository.LanguageRepository;
import ru.prikhodko.service.LanguageService;
import ru.prikhodko.vo.Language;

import java.util.List;

@Service("languageService")
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageRepository repository;

    public void save(Language language) {
        repository.save(language);
    }

    public void delete(Language language) {
        repository.delete(language);
    }

    public List<Language> findAll() {
        return (List<Language>) repository.findAll();
    }

    public Language findById(Long id) {
        return repository.findById(id).get();
    }
}