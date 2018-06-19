package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LanguageRepository;
import service.LanguageService;

@Service("languageService")
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguageRepository repository;
}
