package com.example.demo.car;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("car")
public class CarModel {
	@Getter
    @Setter
    @Field
    @Id
    private ObjectId _id;

    @Getter
    @Setter
    @Field("name")
    private String name;

}
