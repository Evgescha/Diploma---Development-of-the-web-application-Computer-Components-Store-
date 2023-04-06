package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.SddHdd;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class SddHddService extends CrudService<SddHdd> {

    private final SddHddRepository repository;

    public SddHddService(SddHddRepository repository) {
        super(repository);
        this.repository = repository;
    }

                                        public SddHdd findByVolume(Integer volume) {
                return repository.findByVolume(volume);
            }
                                                                public List<SddHdd> findByFormFactor(String formFactor) {
                    return repository.findByFormFactor(formFactor);
                }
                        public List<SddHdd> findByFormFactorContains(String formFactor) {
                return repository.findByFormFactorContains(formFactor);
            }
                                                                public List<SddHdd> findByReadSpeed(String readSpeed) {
                    return repository.findByReadSpeed(readSpeed);
                }
                        public List<SddHdd> findByReadSpeedContains(String readSpeed) {
                return repository.findByReadSpeedContains(readSpeed);
            }
                                                                public List<SddHdd> findByWriteSpeed(String writeSpeed) {
                    return repository.findByWriteSpeed(writeSpeed);
                }
                        public List<SddHdd> findByWriteSpeedContains(String writeSpeed) {
                return repository.findByWriteSpeedContains(writeSpeed);
            }
                                                public SddHdd findByCategory(Category category) {
                return repository.findByCategory(category);
            }
            

    public SddHdd update(Long id, SddHdd entity) {
        SddHdd read = read(id);
        if(read == null){
            throw new RuntimeException("Entity SddHdd not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(SddHdd entity, SddHdd read) {
                                    read.setVolume(entity.getVolume());
                                                read.setFormFactor(entity.getFormFactor());
                                                read.setReadSpeed(entity.getReadSpeed());
                                                read.setWriteSpeed(entity.getWriteSpeed());
                                                read.setCategory(entity.getCategory());
                        }
}
