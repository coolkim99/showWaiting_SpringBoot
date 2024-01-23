package com.example.showmewaiting.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "store")
@Getter @Setter
public class Store {

    @Id
    @Column(name = "store_id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

//    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
//    private List<Item> menuItems = new ArrayList<>();

    //생성 메서드
//    public void createMenu(Store store, ) {
//        for(Item item : )
//    }
}
