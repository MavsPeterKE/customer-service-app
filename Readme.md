# Customer Service API

## Overview

The **Customer Service** is a Spring Boot application that exposes several API endpoints for managing customer data. It implements basic operations like registering a customer, retrieving customer information, and querying specific user profiles. The application follows the **MVC architecture** and is designed to be containerized using Docker for easy deployment. Additionally, the application includes Swagger for API documentation and Lombok to minimize boilerplate code.

---

## Table of Contents

1. [Features](#features)
2. [Prerequisites](#prerequisites)
3. [Installation](#installation)
4. [API Endpoints](#api-endpoints)
5. [Application Architecture](#application-architecture)
6. [Dockerization](#dockerization)
7. [Swagger Documentation](#swagger-documentation)
8. [Configuration](#configuration)
9. [License](#license)

---

## Features

- **Register Customer**: Register new customers via the `/customers/v1/register` endpoint.
- **Get All Customers**: Retrieve all customer data via the `/customers/v1/get` endpoint.
- **Get Customer Profile**: Retrieve a specific customer's profile using their ID via `/customers/v1/profile/{id}`.
- **MVC Architecture**: The app follows a clear separation of concerns with Controllers, Services, Repositories, and Models.
- **Swagger Docs**: Automatically generated Swagger documentation for easy API exploration.
- **Lombok Integration**: Reduces boilerplate code by automatically generating getters, setters, constructors, etc.

---

## Prerequisites

Ensure that you have the following installed on your machine:

- **Java 11+**: Required to run the Spring Boot application.
- **Maven**: For building the project.
- **Docker**: For containerization.
- **MySql** (or another database): Configured in `application.properties` for database interaction.

---
