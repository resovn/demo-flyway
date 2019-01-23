package com.hcy308.flyway.service;

import com.hcy308.flyway.ApplicationTests;
import com.hcy308.flyway.model.Org;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrgServiceTests extends ApplicationTests {

    @Autowired
    private OrgService orgService;

    @Before
    public void init() {
        orgService.clear();
        orgService.create("foo");
        orgService.create("bar");
    }

    @Test
    public void listAll() {
        List<Org> domains = orgService.getAll();
        Assert.assertEquals(domains.size(), 2);
    }

}
