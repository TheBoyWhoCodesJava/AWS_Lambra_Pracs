package com.nt.lambda.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirstLambda_Sum implements RequestHandler<Object,Integer> {

    public Integer first_lambda_sum(Integer x, Integer y ){
        return x+y;
    }

    @Override

    public Integer handleRequest(Object o, Context logs) {
        Integer sum=first_lambda_sum(100,300);
        logs.getLogger().log("Lambda function sum is: "+sum);
        log.info("Function sum is"+sum);
        return sum;
    }
}
