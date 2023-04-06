package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Videocard;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class VideocardService extends CrudService<Videocard> {

    private final VideocardRepository repository;

    public VideocardService(VideocardRepository repository) {
        super(repository);
        this.repository = repository;
    }

                                                        public List<Videocard> findByProcessor(String processor) {
                    return repository.findByProcessor(processor);
                }
                        public List<Videocard> findByProcessorContains(String processor) {
                return repository.findByProcessorContains(processor);
            }
                                                public Videocard findByRam(Integer ram) {
                return repository.findByRam(ram);
            }
                                                                public List<Videocard> findByRamType(String ramType) {
                    return repository.findByRamType(ramType);
                }
                        public List<Videocard> findByRamTypeContains(String ramType) {
                return repository.findByRamTypeContains(ramType);
            }
                                                public Videocard findByCoolerNumber(Integer coolerNumber) {
                return repository.findByCoolerNumber(coolerNumber);
            }
                                                public Videocard findByCategory(Category category) {
                return repository.findByCategory(category);
            }
            

    public Videocard update(Long id, Videocard entity) {
        Videocard read = read(id);
        if(read == null){
            throw new RuntimeException("Entity Videocard not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(Videocard entity, Videocard read) {
                                    read.setProcessor(entity.getProcessor());
                                                read.setRam(entity.getRam());
                                                read.setRamType(entity.getRamType());
                                                read.setCoolerNumber(entity.getCoolerNumber());
                                                read.setCategory(entity.getCategory());
                        }
}
