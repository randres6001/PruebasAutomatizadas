Automated Testing with Serenity BDD

This repository contains automated tests developed in Java using the Screenplay pattern and Serenity BDD for the Serenity demo page (https://demo.serenity.is).
Prerequisites

Make sure you have the following programs installed in your development environment:

    Java Development Kit (JDK)
    IntelliJ IDEA (or your preferred IDE compatible with Gradle)
    Gradle
    Git (optional for cloning this repository)

Project Setup

    Clone this repository to your local machine using the following command:

    bash

    git clone https://repository-url.git

    Open the project in your IDE (IntelliJ IDEA recommended).

    Configure the necessary dependencies and plugins in the build.gradle file to ensure the project compiles successfully.

Running the Tests

    Open a terminal in your IDE or from the command line.
    Navigate to the root folder of the project where the build.gradle file is located.
    Run the following command to execute all tests:

    bash

    gradle clean test aggregate

    This command cleans previous results, runs the tests, and generates the Serenity BDD report.

Project Structure

    src/test/java/com/yourpackage/: Contains the test classes and Screenplay pattern implementation.
    src/test/resources/features/: Contains the .feature files written in Gherkin describing the test scenarios.
    build.gradle: Gradle configuration file for managing dependencies and test execution.

Test Scenarios

    Create a New Business Unit
        Description: This scenario tests the functionality of creating a new business unit on the Serenity demo page.
        Test File: CreateBusinessUnit.feature
        Test Class: CreateBusinessUnitStepDefinitions.java

    Create a New Contact
        Description: This scenario verifies the ability to create a new contact in the Serenity demo application.
        Test File: CreateContact.feature
        Test Class: CreateContactStepDefinitions.java

    Create a New Supplier
        Description: Tests the functionality of creating a new supplier on the Serenity demo page.
        Test File: CreateSupplier.feature
        Test Class: CreateSupplierStepDefinitions.java

Execution Reports

After running the tests, you'll find the Serenity BDD reports in the target/site/serenity/ folder. Open the index.html file to view the complete report of the executed tests.

