## Exercise: IntegerPairs (12 Points)

The project name of this exercise is **IntegerPairs**.

The purpose of this assignment is to apply what you have learned about decisions with `if` statements, compound `if` statements and multiple alternatives

### Problem Description

The detailed description of this problem comes from the Programming Exercise P3.8 that is in the book (page 126, of the _Late Objects_ version).

You are to write a program that will take one string of four positive integers, with each integer separated by white space, (e.g. "0 1 1 2") and will test to see if there are two pairs present in the string. 

Hints:

- After you are done with the scanner be sure to call {your scanner variable name}.close();

- Don't be afraid to make local variables. You can use them to hold the numbers you get from the string.

This problem should be solved by writing all your code in `public static void main`. You will want to implement the algorithm inside of the `main` method. 

Using the test input, your output should look like:

```
Enter four numbers: 1 2 2 2 
not two pairs
```

### Getting Started

Like our last exercise, we are going to do this exercise by writing the source code that solves the problem first in **IntegerPairs.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://209.129.49.15:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **IntegerPairs.java**. This is where your code will go. Replace the code in that file with the code in the grey box below:

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

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **pull request** in the class BitBucket repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository or the repository for this assignment on BitBucket (the project you forked from to create your project).

<img src="https://www.dropbox.com/s/p40wg00a72khhpv/create-pull-request.png?dl=1" width="207" height="207" />

1\. Click on the **Create pull request** icon. 

You should see something similar to this picture:

<img src="https://www.dropbox.com/s/rrgmvpc9wtfjqrr/pull-request-screen-first.png?dl=1" width="600" height="250" />

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. Once you select **Select Branch**, as directed below, you should see the following:

<img src="https://www.dropbox.com/s/r9cmia1ixppglko/pull-request-master.png?dl=1" width="600" height="250" />

2\. Select **Select Branch** you should see something like this:

3\. Select **master** 

4\. Press the **Continue** button.

Once you've followed these steps you should see this at the top:

<img src="https://www.dropbox.com/s/mglhiaeqd2qn72p/pull-request-description.png?dl=1" width="514" height="325" />

5\. Under **Title**, give the pull request a meaningful title. It's mostly for your benefit.

6\. Under **Description**, describe the purpose of this pull request. Usually it's just to submit the assignment. However, you can also use this field to let me know anything that might be wrong or different with your code.

7\. Finally, click on **Create**

After selecting **Create**, your code should build and be tested within a minute or so. Remember, green good, red bad.