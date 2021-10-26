package com.jokerconf.jpapuzzlers.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name = "owner")
@Entity
public class Owner {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "owner")
    private Set<Pet> pets;
}