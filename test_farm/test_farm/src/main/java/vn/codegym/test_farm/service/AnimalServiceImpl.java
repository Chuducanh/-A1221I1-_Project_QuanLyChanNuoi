package vn.codegym.test_farm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.test_farm.model.Animal;
import vn.codegym.test_farm.repository.AnimalRepository;

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

    @Override
    public void save(Animal animal) {
        animalRepository.save(animal);
    }

    @Override
    public void update(Long id, Animal animal) {
        animal.setId(id);
        animalRepository.save(animal);
    }


}
