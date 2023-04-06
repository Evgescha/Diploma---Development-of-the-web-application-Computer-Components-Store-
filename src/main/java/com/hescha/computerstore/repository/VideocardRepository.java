package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Videocard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface VideocardRepository extends JpaRepository<Videocard, Long> {
        List<Videocard> findByProcessor(String processor);
    List<Videocard> findByProcessorContains(String processor);
        Videocard findByRam(Integer ram);
        List<Videocard> findByRamType(String ramType);
    List<Videocard> findByRamTypeContains(String ramType);
        Videocard findByCoolerNumber(Integer coolerNumber);
        Videocard findByCategory(Category category);
}
