package com.hcy308.flyway.repository;

import com.hcy308.flyway.model.Org;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgRepository extends JpaRepository<Org, Long> {
}
