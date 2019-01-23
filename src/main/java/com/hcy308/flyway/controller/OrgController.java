package com.hcy308.flyway.controller;

import com.hcy308.flyway.model.Org;
import com.hcy308.flyway.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/1/org")
public class OrgController {

    private final OrgService orgService;

    @Autowired
    public OrgController(OrgService orgService) {
        this.orgService = orgService;
    }

    @GetMapping()
    public List<Org> getAll() {
        return orgService.getAll();
    }

}

