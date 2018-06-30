package ru.prikhodko.repository;

import org.springframework.data.repository.CrudRepository;
import ru.prikhodko.vo.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {
}
