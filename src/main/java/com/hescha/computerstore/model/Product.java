package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Product extends AbstractEntity {
    private String name;
    @Column(length = 1000)
    private String shortDescription;
    @Column(length = 100_000)
    private String description;
    private String image;
    private Double price;
    @OneToMany
    private List<Comment> comments = new ArrayList<>();
    private Boolean deleted = false;
    private Category category;
}
