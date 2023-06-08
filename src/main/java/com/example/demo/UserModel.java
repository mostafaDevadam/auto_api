package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("user")
public class UserModel {
	@Getter
    @Setter
    @Field("_id")
    @Id
    private ObjectId _id;

    @Getter
    @Setter
    @Field("name")
    private String name;

    @Getter
    @Setter
    @Field("email")
    private String email;
}
