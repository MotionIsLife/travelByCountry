package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LanguageRepository;
import service.LanguageService;
import vo.Language;

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
