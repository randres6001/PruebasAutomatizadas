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

***************************************************************************************************************************
Automatización de Pruebas en Serenity BDD

Este repositorio contiene pruebas automatizadas desarrolladas en Java utilizando el patrón Screenplay y Serenity BDD para la página de demostración de Serenity (https://demo.serenity.is).
Requisitos Previos

Asegúrate de tener instalados los siguientes programas en tu entorno de desarrollo:

    Java Development Kit (JDK)
    IntelliJ IDEA (o tu IDE preferido compatible con Gradle)
    Gradle
    Git (opcional para clonar este repositorio)

Configuración del Proyecto

    Clona este repositorio en tu máquina local usando el siguiente comando:

    bash

    git clone https://ruta-del-repositorio.git

    Abre el proyecto en tu IDE (IntelliJ IDEA recomendado).

    Configura las dependencias y plugins necesarios en el archivo build.gradle para asegurar que el proyecto se compile correctamente.

Ejecución de las Pruebas

    Abre una terminal en tu IDE o desde la línea de comandos.
    Navega hasta la carpeta raíz del proyecto donde se encuentra el archivo build.gradle.
    Ejecuta el siguiente comando para ejecutar todas las pruebas:

    bash

    gradle clean test aggregate

    Este comando limpia los resultados anteriores, ejecuta las pruebas y genera el reporte de Serenity BDD.

Estructura del Proyecto

    src/test/java/com/yourpackage/: Contiene las clases de pruebas y la implementación del patrón Screenplay.
    src/test/resources/features/: Contiene los archivos .feature escritos en Gherkin que describen los escenarios de prueba.
    build.gradle: Archivo de configuración de Gradle para gestionar las dependencias y la ejecución de las pruebas.

Escenarios de Prueba

    Crear una Unidad de Negocio Nueva
        Descripción: Este escenario prueba la funcionalidad de crear una unidad de negocio nueva en la página de demostración de Serenity.
        Archivo de Prueba: CrearUnidadNegocio.feature
        Clase de Prueba: CrearUnidadNegocioStepDefinitions.java

    Crear un Contacto Nuevo
        Descripción: Este escenario verifica la capacidad de crear un nuevo contacto en la aplicación de demostración de Serenity.
        Archivo de Prueba: CrearContacto.feature
        Clase de Prueba: CrearContactoStepDefinitions.java

    Crear un Proveedor Nuevo
        Descripción: Prueba la funcionalidad de crear un nuevo proveedor en la página de demostración de Serenity.
        Archivo de Prueba: CrearProveedor.feature
        Clase de Prueba: CrearProveedorStepDefinitions.java

Reportes de Ejecución

Después de ejecutar las pruebas, encontrarás los reportes de Serenity BDD en la carpeta target/site/serenity/. Abre el archivo index.html para ver el reporte completo de las pruebas ejecutadas.
