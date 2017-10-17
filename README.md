# AWS Lambda Example

* * *

### Step 1: Implement function handler

**LambdaFunctionHandler.java** implements the **handleRequest** method. This method is the entry point for the Lambda function, and it will be invoked by Lambda in response to input from the event sources of this function.

For this demonstration, we are doing a simple Hello World implementation, such as:
´´´´java
public class LambdaFunctionHandler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
    	 String output = "Hello, " + input + "!";
    	 return output;
    }

}
´´´´
* * *

### Step 2: Testing the function

You can run **LambdaFunctionHandlerTest.java** just as a normal JUnit test.

* * *

### Step 3: Uploading the function

Using the **Amazon Web Services -> Upload Function to AWS Lambda** we can upload the function to AWS 

* * *

### Step 4: Invoke the function

Now we are ready to run the function in the cloud. Right-click on the project and select **Amazon Web Services -> Run on AWS Lambda**.  
In the input dialog, enter the JSON input for this function.

Click **Invoke** and check the output of your function in the Eclipse Console View.

* * *


