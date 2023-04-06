package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Comment;
import com.hescha.computerstore.model.Product;
import com.hescha.computerstore.model.User;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Service
public class CommentService extends CrudService<Comment> {

    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<Comment> findByMessage(String message) {
        return repository.findByMessage(message);
    }

    public List<Comment> findByMessageContains(String message) {
        return repository.findByMessageContains(message);
    }

    public Comment findByOwner(User owner) {
        return repository.findByOwner(owner);
    }

    public Comment findByProduct(Product product) {
        return repository.findByProduct(product);
    }

    public Comment findByCreationDate(LocalDateTime creationDate) {
        return repository.findByCreationDate(creationDate);
    }


    public Comment update(Long id, Comment entity) {
        Comment read = read(id);
        if (read == null) {
            throw new RuntimeException("Entity Comment not found");
        }
        updateFields(entity, read);
        return update(read);

    }

    private void updateFields(Comment entity, Comment read) {
        read.setMessage(entity.getMessage());
        read.setOwner(entity.getOwner());
        read.setProduct(entity.getProduct());
        read.setCreationDate(entity.getCreationDate());
    }
}
