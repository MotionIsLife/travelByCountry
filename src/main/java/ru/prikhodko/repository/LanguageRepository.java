package ru.prikhodko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.vo.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
