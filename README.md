## Exercise: IntegerPairs (12 Points)

The project name of this exercise is **IntegerPairs**.

The purpose of this assignment is to apply what you have learned about decisions with `if` statements, compound `if` statements and multiple alternatives

### Problem Description

The detailed description of this problem comes from the Programming Exercise P3.8 that is in the book (page 126).

You are to write a program that will take one string of four positive integers (e.g. "0 1 1 2") and will test to see if there are two pairs present in the string. 

Hints:

- After you are done with the scanner be sure to call {your scanner variable name}.close();

- Don't be afraid to make local variables. You can use them to hold the numbers you get from the string.

This problem should be solved by writing all your code in `public static void main`. You will want to implement the algorithm inside of the `main` method. 

Using the test input, your output should look like:

`Enter four numbers: 1 2 2 2 not two pairs`

### Getting Started

Like our last exercise, we are going to do this exercise by writing the source code that solves the problem first in **IntegerPairs.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **IntegerPairs.java**. This is where your code will go. Replace the code in that file with the code in the grey box below:

```java
package edu.sbcc.cs105;

public class Main {
    public static String countPairs(int i1, int i2, int i3, int i4) {
        // Put code here to count the pairs
    }
    
    public static void main(String[] args) {
        // Put code here to read integers from user
    }

}
```

Now go through IntegerPairs.java, add the proper headers as in past assignments and then change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed.

For your code get four numbers from the user using the `Scanner` class as in past assignments, then output the words `two pairs`, or `not two pairs` only. The unit test will test for exactly these words.

Once you've written your code run the code by single clicking on **IntegerPairs.java** in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

Once you have run the tests, the results of them should look something like the following:

<img src="https://www.dropbox.com/s/79zw4fbsjebbx1s/junit_test.png?dl=1" width="257" height="445" />

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to BitBucket. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. 

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **IntegerPairs.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your BitBucket username and password) go by:

1. Push **OK** to complete the commit. You may get no confirmation, but you can check BitBucket to see if the code now exists there.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code every time you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.