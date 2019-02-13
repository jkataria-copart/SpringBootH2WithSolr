package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.dao.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonSDAO personSDAO;
    
    @Autowired
    PersonSolrDAO personSolrDAO;
    
    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();
        personSDAO.findAll().forEach(person -> persons.add(person));
        return persons;
    }

    public Person getPersonById(int id) {
        return personSDAO.findById(id).get();
    }

    public Person saveOrUpdate(Person person) {
    	Person p = personSDAO.save(person);
    	PersonSolr psolr = new PersonSolr(p);
    	saveToSolr(psolr);
    	return p;
    }

    public void delete(int id) {
    	personSDAO.deleteById(id);
    }
    public void saveToSolr(PersonSolr person) {
    	personSolrDAO.save(person);
    }
}