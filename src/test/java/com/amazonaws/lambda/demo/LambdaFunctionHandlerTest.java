package com.amazonaws.lambda.demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static String input;

    @BeforeClass
    public static void createInput() throws IOException {
        input = "world";
    }

    private Context createContext() {
        TestContext ctx = new TestContext();
        ctx.setFunctionName("MyLambdaFunction");
        return ctx;
    }

    @Test
    public void testLambdaFunctionHandler() {
        LambdaFunctionHandler handler = new LambdaFunctionHandler();
        Context ctx = createContext();
        String output = handler.handleRequest(input, ctx);
        Assert.assertEquals("Hello, " + input + "!", output);
    }
}
