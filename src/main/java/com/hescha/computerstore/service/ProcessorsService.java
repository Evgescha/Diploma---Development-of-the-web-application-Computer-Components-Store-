package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Processors;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class ProcessorsService extends CrudService<Processors> {

    private final ProcessorsRepository repository;

    public ProcessorsService(ProcessorsRepository repository) {
        super(repository);
        this.repository = repository;
    }

                                                        public List<Processors> findBySocket(String socket) {
                    return repository.findBySocket(socket);
                }
                        public List<Processors> findBySocketContains(String socket) {
                return repository.findBySocketContains(socket);
            }
                                                                public List<Processors> findByModule(String module) {
                    return repository.findByModule(module);
                }
                        public List<Processors> findByModuleContains(String module) {
                return repository.findByModuleContains(module);
            }
                                                public Processors findByCoreNumber(Integer coreNumber) {
                return repository.findByCoreNumber(coreNumber);
            }
                                                public Processors findByInternalGraphic(Boolean internalGraphic) {
                return repository.findByInternalGraphic(internalGraphic);
            }
                                                public Processors findByFrequency(Double frequency) {
                return repository.findByFrequency(frequency);
            }
                                                public Processors findByCategory(Category category) {
                return repository.findByCategory(category);
            }
            

    public Processors update(Long id, Processors entity) {
        Processors read = read(id);
        if(read == null){
            throw new RuntimeException("Entity Processors not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(Processors entity, Processors read) {
                                    read.setSocket(entity.getSocket());
                                                read.setModule(entity.getModule());
                                                read.setCoreNumber(entity.getCoreNumber());
                                                read.setInternalGraphic(entity.getInternalGraphic());
                                                read.setFrequency(entity.getFrequency());
                                                read.setCategory(entity.getCategory());
                        }
}
