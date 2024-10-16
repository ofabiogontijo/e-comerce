package com.e.comerce.project.product;

import com.e.comerce.project.product.web.ProductInput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ProductCommand {

    private final ProductRepository repository;

    public Product create(ProductInput input) {
        return repository.save(Product.of(input));
    }

}
