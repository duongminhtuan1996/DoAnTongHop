package edu.nuce.quanlybanlaptop.repository;

import edu.nuce.quanlybanlaptop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
