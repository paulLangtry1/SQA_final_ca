# Software Quality Assurance Project Plan #
## Introduction ## 

As part of a Software Quality management plan for an organisation you have been asked to implement an example software project. This will be a reference guide for best practices that the rest of the team can refer to. The project will demonstrate the following topics:

1. Scrum sprint backlog and task estimation
2. Unit testing and Test-Driven development
3. Test coverage metric
4. Team version-control 


## Sprint Backlog & Task Estimation ##
Sprints are a great way to plan out tasks and assign them to developers. Estimations are an essential way of keeping track of time taken to complete projects.


| Task        | Sprint      | Points        | Estimate    | Priority  |  Developer  |  Status  |
| :---        |    :----:   |          ---: |         ---:|       ---:|      ---:|      ---:|
| Create Code Review Documentation  | 1      | 1         | 30 mins |High |Paul| Completed|
| Create Necessary Classes   |  1        | 1     | 30 mins  |High | Paul| Completed|
| Features for create a new Rubric, add a criterion to a Rubric, get list of Rubrics, get a specific Rubric by name. Include TDD.  |  2        |   3   | 2h  |High | Paul| Completed|
| Features for creating a new StudentGrade, adding a score for a particular criterion for a grade and getting all StudentGrades associated with a specific Rubric. Include TDD.  |  2        | 3    | 2h |High | Paul| Completed|
| Features to provide summary calculations across all graded students, including average, standard deviation, minimum and maximum score for a specific criterion of a Rubric   |  3        | 5     | 3h  |High | Paul| Completed|
| Select test coverage tool and create documentation. Identify any issues with the code and make changes.  |  3        | 5     | 3h |High | Paul| Completed|

## Estimate Justification & Velocity Metric ##
## Fibonacci Scale ##
I used the **Fibonacci Scale** in order to measure my estimates during this **Sprint Backlog**. The Fibonacci Scale is measured by the *sum of the preceding two numbers*, e.g 0, 1, 2, 3, 5, 8, 13 etc. I chose this method as I used it during my internship with DEASP and I liked the concept. A score of 13 would indicate a very complex task that could take **weeks** to complete.

<p align="left">
  <img src="https://i.gyazo.com/806f475ae850102b494c1950deae6e0f.png"
        alt="Fibonacci Scale" width="500"/>
</p>


## Sprint 1 ##
In Sprint 1 I am assigning tasks that need to be completed in order to move on and **start the next sprint**. These **tasks** are necessary to move forward with the project so their priotiy is **High**. I have only assigned 1 from the **Fibonacci Scale** as it takes less than a hour to complete each task. **Sprint 1** has a total velocity of 2, resulting from adding the two estimates together.

## Sprint 2 ##
In **Sprint 2** the *core functionality* of the application has to be implemented. These features include **Test-Driven Development** which add to the complexity and have been assigned an estimate of 3 each, coming to a **total velocity** of **6** for these tasks.

## Sprint 3 ##
In **Sprint 3** the final features are being added which include calculations. The code completed during *Sprint 2* also needs to be tested and checked using the test coverage tool which adds to the time taken. Necessary documentation also needs to be completed in relation to the testing. The **total velocity** comes to **10** for sprint 3.

## Test Driven Development ##
I have been using a Test Driven Development approach to coding each method so far. I am benefitting from testing my methods as soon as I cerate them and I find it makes everything clear and easier to keep track of if anything starts failing. I have linked an example to my TDD approach <a href="https://github.com/paulLangtry1/SQA_final_ca/blob/rubric-features/SQA_final/src/UnitTests.java">here</a>.</br> It can be seen that I'm using this approach from the start. If the getAllRubrics is empty the test will fail. If the title or criteria does not match the tests will fail. The example linked will pass as the values are matching.

## Code Review Checklist ##
It is important for a team to **check** each others code during sprints. When a member of a team creates a pull request they should assign at least two other members to review their code before a pull request is approved and merged. I have written a few guidelines to follow when reviewing the code below.
1. Is the code written following the coding standards and guidelines?
2. Am I able to understand the code easily?
3. Can I unit test/ debug the code easily to find the root cause?
4. Is the same code duplicated more than twice?
5. Is this function or class too large? If the answer is yes, is the function or class doing too many things?
<p align="left">
  <img src="https://i.gyazo.com/c9bb62dbd2d8e4f941b4763792b0232f.png"
        alt="Code Review Checklist" width="500"/>
</p>

An example of my work conveying these methods can be seen <a href="https://github.com/paulLangtry1/SQA_final_ca/pull/6">here</a>.</br>

## Code Coverage Tool ##

I decided to go with *EclEmma Java Code Coverage* tool as I already had it installed on my system. Using **Eclipse** it is very easy to locate the tool as you can search *EclEmma Java Code Coverage* tool on the marketplace and from there easily install it. Once installed you can right click your project and down near the bottom you will see *Run As* then selected *JUnit Test*.

**First Run**
<p align="left">
  <img src="https://i.gyazo.com/03be2ec53070fc901fb6bcc6fafa7327.png"
        alt="Test Coverage" width="500"/>
</p>.</br>
As Can be seen from my first run I've achieved a very high test coverage score over **97%**.

There a visibly no gaps in the unit tests from what I can see only untested code in the object classes for the setters as seen below.

<p align="left">
  <img src="https://i.gyazo.com/45236cbf3e34f6d347370c25836343ba.png"
        alt="Test Coverage" width="500"/>
</p>.</br>

After identifying these gaps I can see how I would achieve 100& code coverage in this situation but it's not need as it's a setter and does not need a unit test.

## Team Version Control ##
I followed the **Gitflow** process throughout this project. The branches created in order were as follows:
1. Initial Classes
2. Rubric Features
3. Student Grade Features
4. Calculations Features

Each *feature branch* was created in order of how the work was completed by following the project brief. After each branch was finished it was merged into main and the appropriate Gitflow processes were followed.





