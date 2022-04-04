package com.api.banco.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class GenericService<T> {

    @Autowired
    private JpaRepository<T, Long> repository;

    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    public T save(T post) {
        return repository.save(post);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
