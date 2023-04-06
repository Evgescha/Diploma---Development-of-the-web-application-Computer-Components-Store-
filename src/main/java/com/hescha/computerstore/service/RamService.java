package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Ram;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class RamService extends CrudService<Ram> {

    private final RamRepository repository;

    public RamService(RamRepository repository) {
        super(repository);
        this.repository = repository;
    }

                                                        public List<Ram> findByType(String type) {
                    return repository.findByType(type);
                }
                        public List<Ram> findByTypeContains(String type) {
                return repository.findByTypeContains(type);
            }
                                                public Ram findByVolume(Integer volume) {
                return repository.findByVolume(volume);
            }
                                                                public List<Ram> findByFrequency(String frequency) {
                    return repository.findByFrequency(frequency);
                }
                        public List<Ram> findByFrequencyContains(String frequency) {
                return repository.findByFrequencyContains(frequency);
            }
                                                public Ram findByCategory(Category category) {
                return repository.findByCategory(category);
            }
            

    public Ram update(Long id, Ram entity) {
        Ram read = read(id);
        if(read == null){
            throw new RuntimeException("Entity Ram not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(Ram entity, Ram read) {
                                    read.setType(entity.getType());
                                                read.setVolume(entity.getVolume());
                                                read.setFrequency(entity.getFrequency());
                                                read.setCategory(entity.getCategory());
                        }
}
