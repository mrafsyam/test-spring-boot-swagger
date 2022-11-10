package com.guild.swaggerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    private static List<Policy> policies = new ArrayList<>();

    @GetMapping
    public List<Policy> getPolicies(){
        return policies;
    }

    @PostMapping
    public Policy createPolicy(@RequestBody Policy policy){
        policies.add(policy);
        return policy;
    }
}
