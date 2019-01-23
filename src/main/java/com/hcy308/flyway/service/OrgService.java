package com.hcy308.flyway.service;

import com.hcy308.flyway.model.Org;

import java.util.List;

public interface OrgService {

    List<Org> getAll();

    void clear();

    Org create(String name);
}
