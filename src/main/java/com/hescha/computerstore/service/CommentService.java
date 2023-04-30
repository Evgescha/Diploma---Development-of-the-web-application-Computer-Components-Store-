package com.hescha.computerstore.service;

import com.hescha.computerstore.model.Comment;
import com.hescha.computerstore.repository.*;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends CrudService<Comment> {

    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        super(repository);
        this.repository = repository;
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
