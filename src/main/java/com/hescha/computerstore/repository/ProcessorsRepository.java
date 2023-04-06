package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Processors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface ProcessorsRepository extends JpaRepository<Processors, Long> {
        List<Processors> findBySocket(String socket);
    List<Processors> findBySocketContains(String socket);
        List<Processors> findByModule(String module);
    List<Processors> findByModuleContains(String module);
        Processors findByCoreNumber(Integer coreNumber);
        Processors findByInternalGraphic(Boolean internalGraphic);
        Processors findByFrequency(Double frequency);
        Processors findByCategory(Category category);
}
