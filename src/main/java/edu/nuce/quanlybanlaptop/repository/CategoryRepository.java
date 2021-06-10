package edu.nuce.quanlybanlaptop.repository;

import edu.nuce.quanlybanlaptop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
   // Category findOneByCode(Long id);
}
