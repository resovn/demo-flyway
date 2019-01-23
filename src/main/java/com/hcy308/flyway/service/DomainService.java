package com.hcy308.flyway.service;

import com.hcy308.flyway.model.Domain;

import java.util.List;

public interface DomainService {

    List<Domain> getAll();

    void clear();

    Domain create(String domain);

    Domain get(long id);

    Domain get(String domain);

    void delete(long id);

    void delete(String domain);

    void delete(Domain domain);
}

