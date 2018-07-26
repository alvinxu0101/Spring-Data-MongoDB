package com.alvinxu.jpa.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/*通过Data注解则可以不用写get/set方法*/
@Data
/*创建名字为user的数据库，如果不加的话，那么创建的数据库名字则默认为类名*/
@Document(collection = "user")
public class User implements Serializable {
    /*映射到mongo中的集合中的字段*/
    @Id
    @Field("id")
    private int id;
    @Field("name")
    private String name;
    @Field("address")
    private String address;
}
