package com.e.comerce.project.product.web;

import com.e.comerce.project.product.Product;
import com.e.comerce.project.product.ProductCommand;
import com.e.comerce.project.product.ProductQuery;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.PriorityQueue;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/store/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
class ProductRestService {

    private final ProductCommand command;

    private final ProductQuery query;

    @PostMapping(value = "/product")
    @ResponseStatus(CREATED)
    Product create(@Valid @RequestBody ProductInput input) {
        return command.create(input);
    }

    @GetMapping("/products")
    @ResponseStatus(OK)
    List<Product> findAll() {
        return query.findAll();
    }

}
