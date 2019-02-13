package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "SpringH2Solr")
public class PersonSolr {
 
    @Field
    private int id;
    
    @Field
    private String name;
 
    public PersonSolr(Person p) {
    	this.id = p.getId();
    	this.name = p.getName();
    }
	/*
	 * @Temporal(TemporalType.DATE)
	 * 
	 * @Column(name = "Date_Of_Birth", nullable = false) private Date dateOfBirth;
	 */
 
    public Integer getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
	/*
	 * public Date getDateOfBirth() { return dateOfBirth; }
	 * 
	 * public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth =
	 * dateOfBirth; }
	 */
 
    @Override
    public String toString() {
    	
    	return "{\"id\":" + this.id + ", \"name\": \"" + this.getName() + "\"}";
    }
}
