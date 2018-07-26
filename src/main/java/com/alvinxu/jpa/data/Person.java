package com.alvinxu.jpa.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(collection = "person")
public class Person implements Serializable {
    @Id
    @Field("id")
    private int id;
    @Field("name")
    private String name;
    @Field("age")
    private int age;
    @Field("address")
    private String address;
}
