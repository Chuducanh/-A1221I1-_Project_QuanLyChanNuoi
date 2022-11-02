package com.codegym.be.service;

import com.codegym.be.model.Animal;
import com.codegym.be.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService<Animal, Long>{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
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
