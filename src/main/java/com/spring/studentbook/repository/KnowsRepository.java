package com.spring.studentbook.repository;

import com.spring.studentbook.model.relationship.Knows;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface KnowsRepository extends Neo4jRepository<Knows, Long> {


}
