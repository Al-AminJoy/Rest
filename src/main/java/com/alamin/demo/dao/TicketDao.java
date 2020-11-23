package com.alamin.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.alamin.demo.model.Ticket;
@RepositoryRestResource(collectionResourceRel="ticket",path="ticket")
public interface TicketDao extends JpaRepository<Ticket,Integer>{

}
