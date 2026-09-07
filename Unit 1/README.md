# Unit 1 Java Programming Project

This project is designed for AP CS-A, focusing on Unit 1 concepts such as primitive data types, variable declaration, operators, and casting. The project includes a set of methods that students need to implement, along with unit tests to verify their functionality.

## Project Structure

- **`Unit1.java`**: Contains method headers and task descriptions. Students are required to implement the method bodies.
- **`Unit1Test.java`**: JUnit test cases for each method in `Unit1.java`. These tests validate the correctness of the implemented methods.
- **`pom.xml`**: Maven configuration file that manages dependencies and plugins required to build and run the project.

## Prerequisites

- Java 17 (or compatible version)
- Maven 3.x

## Getting Started

### Get the Project

1. Navigate to our Canvas course for AP CS-A.
2. Find the assignment Unit 1 Programming Problems.
3. Follow your instructor's link to the starter repository.
4. Create your own **public** copy of the starter repository using your instructor's directions. Use the repository name your instructor specifies.

### Clone the Repository

Clone your own copy of the repository to your local machine using GitHub Desktop or open your copy in GitHub Codespaces. [Directions can be found here.](https://github.com/hotdogontology/Java-Workflow)

### Run Tests

Run the JUnit tests to verify your implementations.

```sh
mvn test
```

The starter methods are unfinished, so failing tests are expected initially. Edit `src/main/java/unit1/Unit1.java`; keep the package, class name, and method signatures. Your official grade is in Submitty.

### Submit Your Work

1. Keep your work in `src/main/java/unit1/Unit1.java`. Do not rename or move the file.
2. Commit and push your changes to the `main` branch of your own public GitHub repository.
3. Open the assignment in Submitty and enter your repository's HTTPS URL (for example, `https://github.com/YOUR_USERNAME/AP-CSA-Unit-1`). Use your own repository URL, not the instructor's starter repository URL.
4. Click **Grade My Repository** and review your results. Pushing alone does not submit your work for a grade.

Check your results in Submitty after every submission. Each of the five methods is worth 20 points, for 100 points total. You may fix your code and resubmit according to the course deadline and submission policy.

## Method Descriptions

Students need to implement the following methods in `Unit1.java`:

1. **`addIntegers(int a, int b)`**: Returns the sum of two integers.
2. **`castDoubleToInt(double value)`**: Converts a double to an integer by casting.
3. **`isTrue(boolean value)`**: Returns `true` if the boolean parameter is true, otherwise returns `false`.
4. **`maxValueMinusOne()`**: Returns the maximum integer value (`Integer.MAX_VALUE`) minus one.
5. **`multiplyIntAndDouble(int a, double b)`**: Returns the product of an integer and a double as a double.

## Common Mistakes to Avoid

- Forgetting that Java is case-sensitive (e.g., `myScore` is not the same as `myscore`).
- Forgetting to specify the type when declaring a variable (e.g., using `name = value;` instead of `type name = value;`).
- Using a variable name without declaring the variable.
- Using the wrong name for a variable (e.g., declaring it as `studentTotal` but using `total` later).
- Using the wrong type for a variable, especially when using integer types in calculations that yield fractional results. Either cast one value to double or use a double variable.
- Using `==` to compare double values instead of testing if the absolute value of the difference between the values is below a certain threshold.
- Assuming 0 is smaller than other int values; use `Integer.MIN_VALUE` for the smallest possible int value.

## Acknowledgements

This project has been adapted from the repo generously shared by [Kevin Hare](https://csplusplus.com/). 

OpenAI's Codex assisted with the migration to Submitty and preparation of the student starter materials.

