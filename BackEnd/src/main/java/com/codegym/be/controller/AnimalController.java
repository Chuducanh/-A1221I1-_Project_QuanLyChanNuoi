package com.codegym.be.controller;

import com.codegym.be.model.Animal;
import com.codegym.be.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public ResponseEntity<Page<Animal>> getAnimalList(@PageableDefault(value = 1) Pageable pageable)
    {
        Page<Animal> animal = animalService.findAll(pageable);
        if (animal.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(animal,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
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
