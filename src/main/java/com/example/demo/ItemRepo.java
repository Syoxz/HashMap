package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository <Item, Integer> {

}
