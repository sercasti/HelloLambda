# AWS Lambda Example

* * *

### Step 1: Implement your function

Open up **LambdaFunctionHandler.java** and implement the **handleRequest** method. This method is the entry point for your Lambda function, and it will be invoked by Lambda in response to input from the event sources of your function.

> **Note:** You can add new classes and additional external dependencies in your project if needed.

* * *

### Step 2: Test your function

Open up **LambdaFunctionHandlerTest.java**. Fill in your test logic to validate the input and output of your function handler, and then run it locally as a normal JUnit test.

> **Note:** The unit test provides a sample JSON input file if you have chosen a predefined event type as your function input. You can modify the JSON file, or create new ones based on it.

* * *

### Step 3: Upload your function

Under Project or Package Explorer View, right-click on your project and select **Amazon Web Services -> Upload Function to AWS Lambda**. Then follow the steps to create a new Lambda function or upload your code to an existing function.

* * *

### Step 4: Invoke your function

Now we are ready to run the function in the cloud. Right-click on your project again and select **Amazon Web Services -> Run on AWS Lambda**.  
In the input dialog, enter the JSON input for your function, or select one of the JSON files in your project.

> **Tip:** You can add new JSON input files in your project, and they will show up in this dialog as long as the file name ends with ".json".

Click **Invoke** and check the output of your function in the Eclipse Console View.

* * *


