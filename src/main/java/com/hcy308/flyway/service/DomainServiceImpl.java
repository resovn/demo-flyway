package com.hcy308.flyway.service;

import com.hcy308.flyway.model.Domain;
import com.hcy308.flyway.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainServiceImpl implements DomainService {

    private final DomainRepository domainRepository;

    @Autowired
    public DomainServiceImpl(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    @Override
    public List<Domain> getAll() {
        return domainRepository.findAll();
    }

    @Override
    public void clear() {
        domainRepository.deleteAll();
    }

    @Override
    public Domain get(long id) {
        return domainRepository.findById(id).orElse(null);
    }

    @Override
    public Domain get(String domain) {
        return domainRepository.findByDomain(domain);
    }

    @Override
    public Domain create(String domain) {
        Domain d = new Domain();
        d.setDomain(domain);
        return domainRepository.save(d);
    }

    @Override
    public void delete(long id) {
        domainRepository.deleteById(id);
    }

    @Override
    public void delete(String domain) {
        Domain d = get(domain);
        if (d != null) {
            domainRepository.delete(d);
        }
    }

    @Override
    public void delete(Domain domain) {
        domainRepository.delete(domain);
    }
}

