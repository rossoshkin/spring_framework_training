package com.example.MyBookShopApp.data.book.file;

import javax.persistence.*;

@Entity
@Table(name = "book_file")
public class BookFileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String hash;

    @Column(columnDefinition = "INT NOT NULL")
    private String type_id;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String path;
}
