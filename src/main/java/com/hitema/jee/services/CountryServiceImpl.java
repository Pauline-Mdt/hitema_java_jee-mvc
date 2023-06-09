package com.hitema.jee.services;

import com.hitema.jee.entities.Country;
import com.hitema.jee.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private CountryRepository repository;
    private static final Logger log = LoggerFactory.getLogger(CountryServiceImpl.class);

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Country create(Country country) {
        return repository.save(country);
    }

    @Override
    public Country read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Country update(Country country) {
        return repository.save(country);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Country> readAll() {
        return repository.findAll();
    }
}
