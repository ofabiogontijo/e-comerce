package com.e.comerce.project.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

interface ProductRepository extends JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {

}
