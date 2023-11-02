
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | TianFu Xu                  |
| Date         | 11/01/2023                 |
| Course       | Fall                       |
| Assignment # | 4                          |

# Assignment Overview
The objective of this assignment is to showcase the practical implementation of the adapter design pattern in Java. The provided code presents a scenario where a legacy system, represented by the LegacySystem class, needs to be integrated with a modern HTTPS-based system. To achieve this, two interfaces, CustomerData_HTTPS and CustomerData_USB, are defined, specifying methods for printing and retrieving customer data. The LegacySystem class implements the CustomerData_USB interface to provide concrete implementations. To facilitate seamless integration, an adapter class named LegacySystemAdapter is introduced. This adapter class implements the CustomerData_HTTPS interface and encapsulates an instance of the CustomerData_USB interface, enabling it to delegate calls to the legacy system. The Main class serves as the program's entry point, creating instances of the legacy system and its adapter, and invoking methods to demonstrate successful adaptation and interaction between the two systems. Overall, this assignment offers a hands-on opportunity to apply the adapter pattern, ensuring compatibility and interoperability between a legacy system and a modern HTTPS-based system.

# GitHub Repository Link:
https://github.com/TianfuXu1/CS-665-Assignment-4.git

# Implementation Description 

# 1. Flexibility and Extensibility:
   - The use of interfaces (CustomerData_USB and CustomerData_HTTPS) and the adapter pattern (LegacySystemAdapter) allows for easy integration of new object types in the future. For instance, if a new type of system with a different interface is introduced, a corresponding adapter class can be created without modifying existing code. This promotes a high level of flexibility and extensibility.

# 2. Simplicity and Understandability:
   - The code is structured in a clear and straightforward manner, adhering to best practices and naming conventions. This makes it easy for others to read and understand the implementation. Class names, method names, and variable names are chosen to be descriptive, aiding in comprehension.

# 3. Avoidance of Duplicated Code:
   - Duplicated code has been minimized by utilizing the adapter pattern. The LegacySystemAdapter class acts as a bridge between the Legacy System and the HTTPS-based system. This ensures that common operations are not repeated across different systems, promoting code reusability and maintainability.

# 4. Design Patterns:
   - The adapter pattern has been employed in the form of the LegacySystemAdapter class. This pattern allows the integration of incompatible interfaces, enabling the Legacy System to seamlessly communicate with the HTTPS-based system. The choice of this pattern facilitates the decoupling of the Legacy System from the modern HTTPS-based system, promoting code maintainability and flexibility.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




