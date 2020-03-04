package com.zafir.crudapp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
/*
* These below 3 fields will be imported to the database with  MappedSuperclass annotation.
* */

@EntityListeners(AuditingEntityListener.class)
/*
 * EntityListeners(AuditingEntityListener.class)
 * It basically monitors this class and it works to create and update the  below annotations
 * @LastModifiedDate
 * @CreatedDate
 * */

@JsonIgnoreProperties(value = {"createdAt","updatedAt"})
/*
* It ignores the createdAt and updatedAt column while inserting data
* While returning data this annotation doesn't impact anything.
* */

public abstract class Auditable implements Serializable {
    /*
    * Serialization simply means conversion of java objects into sql rows and vice versa.
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "createdAt",nullable = false,updatable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date createdAt = new Date();

    @Column(name = "updatedAt",nullable = false)
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date updatedAt = new Date();

}
