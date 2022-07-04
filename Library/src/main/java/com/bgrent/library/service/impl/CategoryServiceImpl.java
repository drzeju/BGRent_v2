package com.bgrent.library.service.impl;

import com.bgrent.library.model.Category;
import com.bgrent.library.repository.CategoryRepository;
import com.bgrent.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Category save(Category category) {
        Category categorySave = new Category(category.getName());
        return repository.save(categorySave);
    }

    @Override
    public Category getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Category update(Category category) {
        Category categoryUpdate = new Category();
        categoryUpdate.setName(category.getName());
        categoryUpdate.set_activated(category.is_activated());
        categoryUpdate.set_deleted(category.is_deleted());
        return repository.save(categoryUpdate);
    }

    @Override
    public void deleteById(Long id) {
        Category category = repository.getById(id);
        category.set_deleted(true);
        category.set_activated(false);
        repository.save(category);
    }

    @Override
    public void enableById(Long id) {
        Category category = repository.getById(id);
        category.set_deleted(false);
        category.set_activated(true);
        repository.save(category);
    }
}
