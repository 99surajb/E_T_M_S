package com.cdac.etms.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.etms.entities.Client;

public interface ClientDao extends JpaRepository<Client, Integer>{

}
