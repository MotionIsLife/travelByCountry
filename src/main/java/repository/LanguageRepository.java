package repository;

import org.springframework.data.repository.CrudRepository;
import vo.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {
}
