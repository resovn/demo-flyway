package com.hcy308.flyway.service;

import com.hcy308.flyway.ApplicationTests;
import com.hcy308.flyway.model.Domain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DomainServiceTests extends ApplicationTests {

    @Autowired
    private DomainService domainService;

    @Before
    public void init() {
        domainService.clear();
        domainService.create("foo.com");
        domainService.create("bar.com");
    }

    @Test
    public void listAll() {
        List<Domain> domains = domainService.getAll();
        Assert.assertEquals(domains.size(), 2);
    }

    @Test
    public void getDomain() {
        Domain domain = domainService.get("foo.com");
        Assert.assertEquals(domain.getDomain(), "foo.com");
        Domain domain2 = domainService.get(domain.getId());
        Assert.assertEquals(domain2.getDomain(), "foo.com");
    }

    @Test
    public void deleteDomain() {
        Domain domain = domainService.get("foo.com");
        domainService.delete(domain);
        Assert.assertNull(domainService.get(domain.getId()));
        domainService.delete("bar.com");
        Assert.assertNull(domainService.get("bar.com"));
    }

}

