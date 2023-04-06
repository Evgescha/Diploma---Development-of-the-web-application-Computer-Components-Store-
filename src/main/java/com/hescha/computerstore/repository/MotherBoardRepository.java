package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.MotherBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface MotherBoardRepository extends JpaRepository<MotherBoard, Long> {
        List<MotherBoard> findBySocket(String socket);
    List<MotherBoard> findBySocketContains(String socket);
        List<MotherBoard> findByProvider(String provider);
    List<MotherBoard> findByProviderContains(String provider);
        MotherBoard findByChipset(Integer chipset);
        List<MotherBoard> findByRamType(String ramType);
    List<MotherBoard> findByRamTypeContains(String ramType);
        MotherBoard findByRamSlotNumber(Integer ramSlotNumber);
        MotherBoard findByCategory(Category category);
}
