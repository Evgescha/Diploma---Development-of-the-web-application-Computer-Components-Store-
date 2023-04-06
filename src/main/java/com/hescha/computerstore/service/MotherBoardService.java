package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.MotherBoard;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class MotherBoardService extends CrudService<MotherBoard> {

    private final MotherBoardRepository repository;

    public MotherBoardService(MotherBoardRepository repository) {
        super(repository);
        this.repository = repository;
    }

                                                        public List<MotherBoard> findBySocket(String socket) {
                    return repository.findBySocket(socket);
                }
                        public List<MotherBoard> findBySocketContains(String socket) {
                return repository.findBySocketContains(socket);
            }
                                                                public List<MotherBoard> findByProvider(String provider) {
                    return repository.findByProvider(provider);
                }
                        public List<MotherBoard> findByProviderContains(String provider) {
                return repository.findByProviderContains(provider);
            }
                                                public MotherBoard findByChipset(Integer chipset) {
                return repository.findByChipset(chipset);
            }
                                                                public List<MotherBoard> findByRamType(String ramType) {
                    return repository.findByRamType(ramType);
                }
                        public List<MotherBoard> findByRamTypeContains(String ramType) {
                return repository.findByRamTypeContains(ramType);
            }
                                                public MotherBoard findByRamSlotNumber(Integer ramSlotNumber) {
                return repository.findByRamSlotNumber(ramSlotNumber);
            }
                                                public MotherBoard findByCategory(Category category) {
                return repository.findByCategory(category);
            }
            

    public MotherBoard update(Long id, MotherBoard entity) {
        MotherBoard read = read(id);
        if(read == null){
            throw new RuntimeException("Entity MotherBoard not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(MotherBoard entity, MotherBoard read) {
                                    read.setSocket(entity.getSocket());
                                                read.setProvider(entity.getProvider());
                                                read.setChipset(entity.getChipset());
                                                read.setRamType(entity.getRamType());
                                                read.setRamSlotNumber(entity.getRamSlotNumber());
                                                read.setCategory(entity.getCategory());
                        }
}
