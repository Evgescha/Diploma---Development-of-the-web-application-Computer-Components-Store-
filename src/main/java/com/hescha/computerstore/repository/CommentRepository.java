package com.hescha.computerstore.repository;

import com.hescha.computerstore.model.Comment;
import com.hescha.computerstore.model.Product;
import com.hescha.computerstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByMessage(String message);

    List<Comment> findByMessageContains(String message);

    Comment findByOwner(User owner);

    Comment findByProduct(Product product);

    Comment findByCreationDate(LocalDateTime creationDate);
}
