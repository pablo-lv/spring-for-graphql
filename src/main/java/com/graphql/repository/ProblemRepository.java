package com.graphql.repository;

import com.graphql.entity.Problem;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProblemRepository extends CrudRepository<Problem, UUID> {
}
