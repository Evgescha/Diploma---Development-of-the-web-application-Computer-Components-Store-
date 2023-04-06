package com.hescha.computerstore.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public enum Category{
    PROCESSOR,
    MOTHER_BOARD,
    RAM,
    SDD_HDD,
    VIDEOCARD,
    PERIFERIA
}
