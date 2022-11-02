package com.codegym.be.service;

import java.util.List;
import java.util.Optional;

public interface AnimalService<T, Long> {
    List<T> findAll();

    void deleteById(Long id);

    Optional<T> findById(Long id);
}
