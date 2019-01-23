package com.hcy308.flyway.service;

import com.hcy308.flyway.model.Org;
import com.hcy308.flyway.repository.OrgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {

    private final OrgRepository orgRepository;

    @Autowired
    public OrgServiceImpl(OrgRepository orgRepository) {
        this.orgRepository = orgRepository;
    }

    @Override
    public List<Org> getAll() {
        return orgRepository.findAll();
    }

    @Override
    public void clear() {
        orgRepository.deleteAll();
    }

    @Override
    public Org create(String name) {
        Org o = new Org();
        o.setName(name);
        return orgRepository.save(o);
    }
}
