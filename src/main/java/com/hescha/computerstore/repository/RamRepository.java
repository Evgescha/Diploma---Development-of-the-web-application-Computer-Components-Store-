package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Ram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface RamRepository extends JpaRepository<Ram, Long> {
        List<Ram> findByType(String type);
    List<Ram> findByTypeContains(String type);
        Ram findByVolume(Integer volume);
        List<Ram> findByFrequency(String frequency);
    List<Ram> findByFrequencyContains(String frequency);
        Ram findByCategory(Category category);
}
