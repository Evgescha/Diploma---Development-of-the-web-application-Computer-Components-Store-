package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Category;
import com.hescha.computerstore.model.Periferia;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public class PeriferiaService extends CrudService<Periferia> {

    private final PeriferiaRepository repository;

    public PeriferiaService(PeriferiaRepository repository) {
        super(repository);
        this.repository = repository;
    }

                                        public Periferia findByCategory(Category category) {
                return repository.findByCategory(category);
            }
            

    public Periferia update(Long id, Periferia entity) {
        Periferia read = read(id);
        if(read == null){
            throw new RuntimeException("Entity Periferia not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(Periferia entity, Periferia read) {
                                    read.setCategory(entity.getCategory());
                        }
}
