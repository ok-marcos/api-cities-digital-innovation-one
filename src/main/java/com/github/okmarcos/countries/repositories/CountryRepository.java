package com.github.okmarcos.countries.repositories;

import com.github.okmarcos.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
