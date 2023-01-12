package com.example.lambda;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingLambda implements RequestHandler<Person, String> {
    static final Logger LOGGER = LoggerFactory.getLogger(GreetingLambda.class);

    @Override
    public String handleRequest(Person input, Context context) {
        LOGGER.info("====== Function name: {} ======", context.getFunctionName());
        LOGGER.info("====== invokeFunctionArn: {} ======", context.getInvokedFunctionArn());
        return "Hello " + input.getName();
    }
}
