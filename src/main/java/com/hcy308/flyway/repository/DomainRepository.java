package com.hcy308.flyway.repository;

import com.hcy308.flyway.model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<Domain, Long> {

    Domain findByDomain(String domain);

}

