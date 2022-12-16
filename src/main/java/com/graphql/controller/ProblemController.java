package com.graphql.controller;

import com.graphql.entity.Problem;
import com.graphql.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class ProblemController {

    @Autowired
    private ProblemRepository problemRepository;

    @QueryMapping
    Iterable<Problem> problems() {
        var problems = problemRepository.findAll();
        problems.forEach(problem -> problem.setTag(
                new ArrayList<>(Arrays.asList(problem.getTags().split(",")))
        ));
        return problems;
    }
}
