package com.codegym.be.service;

import com.codegym.be.model.Animal;
import com.codegym.be.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService<Animal, Long>{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Page<Animal> findAll(Pageable pageable) {
        return animalRepository.findAll(pageable);
    }

    @Override
    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public Optional<Animal> findById(Long id) {
        return animalRepository.findById(id);
    }
}
