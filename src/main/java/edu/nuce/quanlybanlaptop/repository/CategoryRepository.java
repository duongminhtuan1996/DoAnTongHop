package edu.nuce.quanlybanlaptop.repository;

import edu.nuce.quanlybanlaptop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
