package com.e.comerce.project.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class ProductQuery {

    private final ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

}
