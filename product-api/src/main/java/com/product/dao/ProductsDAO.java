package com.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entitys.Product;

public interface ProductsDAO  extends JpaRepository<Product, Long>{
	// con solo esto se implementa el crud de la entidad

}
