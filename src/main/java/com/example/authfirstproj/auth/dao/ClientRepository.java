package com.example.authfirstproj.auth.dao;

import org.springframework.data.repository.CrudRepository;


public interface ClientRepository
        extends CrudRepository<ClientEntity, String> {
}
