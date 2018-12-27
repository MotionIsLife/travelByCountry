package ru.prikhodko.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.prikhodko.service.CountryService;
import ru.prikhodko.vo.Country;

import java.util.List;

@Repository
@Transactional
public class CountryDAO {

    @Autowired
    private CountryService countryService;


    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public List<Country> findAll() {
        return countryService.getAll();
    }

}
