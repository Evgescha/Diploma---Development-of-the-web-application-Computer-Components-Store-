package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Periferia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface PeriferiaRepository extends JpaRepository<Periferia, Long> {
        Periferia findByCategory(Category category);
}
