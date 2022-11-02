package com.codegym.be.controller;

import com.codegym.be.model.Animal;
import com.codegym.be.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animal")
    public ResponseEntity<List<Animal>> getAnimalList()
    {
        List<Animal> animal = animalService.findAll();
        if (animal.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(animal,HttpStatus.OK);
    }

    @DeleteMapping("/animal/{id}")
    public ResponseEntity<Animal> deleteAnimal(@PathVariable("id") Long id)
    {
        Optional<Animal> animal = animalService.findById(id);
        if (!animal.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        animalService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
