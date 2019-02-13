package com.example.demo.dao;

import java.util.Date;
import java.util.List;
 
import com.example.demo.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface PersonSDAO extends CrudRepository<Person, Integer> {
 
    //public List<Person> findByFullNameLike(String name);
 
    
 
}
