package com.example.demo.dao;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.example.demo.entity.Person;
import com.example.demo.entity.PersonSolr;

public interface PersonSolrDAO extends SolrCrudRepository<PersonSolr, Integer>{

}
