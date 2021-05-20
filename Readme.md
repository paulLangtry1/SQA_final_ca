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
| Features for creating a new StudentGrade, adding a score for a particular criterion for a grade and getting all StudentGrades associated with a specific Rubric. Include TDD.  |  2        | 3    | 2h |High | Paul| Uncompleted|
| Features to provide summary calculations across all graded students, including average, standard deviation, minimum and maximum score for a specific criterion of a Rubric   |  3        | 5     | 3h  |High | Paul| Uncompleted|
| Select test coverage tool and create documentation. Identify any issues with the code and make changes.  |  3        | 5     | 3h |High | Paul| Uncompleted|

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