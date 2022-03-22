package com.bezkoder.spring.files.upload.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "file")
@Setter
@Getter
@NoArgsConstructor
public class FileEntity {

    public FileEntity(String path) {
        this.path = path;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String path;

}
