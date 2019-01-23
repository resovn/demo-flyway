package com.hcy308.flyway.controller;

import com.hcy308.flyway.model.Domain;
import com.hcy308.flyway.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/1/domain")
public class DomainController {

    private final DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping()
    public List<Domain> getAll() {
        return domainService.getAll();
    }

}

