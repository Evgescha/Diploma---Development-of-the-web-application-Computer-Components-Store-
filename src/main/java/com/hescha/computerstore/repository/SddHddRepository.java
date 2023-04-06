package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.SddHdd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Set;

@Repository
public interface SddHddRepository extends JpaRepository<SddHdd, Long> {
        SddHdd findByVolume(Integer volume);
        List<SddHdd> findByFormFactor(String formFactor);
    List<SddHdd> findByFormFactorContains(String formFactor);
        List<SddHdd> findByReadSpeed(String readSpeed);
    List<SddHdd> findByReadSpeedContains(String readSpeed);
        List<SddHdd> findByWriteSpeed(String writeSpeed);
    List<SddHdd> findByWriteSpeedContains(String writeSpeed);
        SddHdd findByCategory(Category category);
}
