package com.github.okmarcos.staties.repositories;

import com.github.okmarcos.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
