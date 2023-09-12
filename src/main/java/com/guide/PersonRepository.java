package com.guide;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonRepository extends Neo4jRepository {
    Person findByName(String name);
    List<Person> findByTeammatesName(String name);
}
