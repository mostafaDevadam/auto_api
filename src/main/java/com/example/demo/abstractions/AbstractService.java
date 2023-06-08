package com.example.demo.abstractions;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;

public abstract class AbstractService<ModelType> {
	
	public abstract void create(ModelType data);
	
	public abstract List<ModelType> findAll();
	
	public abstract Optional<ModelType> findById(ObjectId _id);
	
	public abstract void updateOne(ObjectId _id, ModelType data);
	
	public abstract void removeOne(ObjectId _id);
	
	
	
	
	


}
