# Spring Boot Todo Application

This project is a **simple and functional Todo application** built using **Java** and **Spring Boot**. The app provides core functionalities to manage tasks efficiently, including creating, reading, updating, and deleting todos.

## Features

- **Add New Todos**: Create new tasks with detailed descriptions.
- **View Todos**: Display a comprehensive list of all existing tasks.
- **Update Todos**: Modify the content of existing tasks.
- **Delete Todos**: Remove tasks when they are no longer needed.
- **User-Friendly Interface**: An intuitive and responsive frontend for seamless user interaction.

## Technologies Used

- **Java**: The core programming language for backend development.
- **Spring Boot**: A powerful framework for creating robust and scalable applications.
- **Spring Data JPA**: For easy integration with relational databases.
- **H2 Database**: An in-memory database for quick and efficient testing.
- **Thymeleaf**: A server-side Java template engine for building dynamic web pages.
- **Maven**: Dependency and build management tool.
- **HTML/CSS**: For structuring and styling the frontend.

## Getting Started

Follow the steps below to set up and run the project on your local machine.

### Prerequisites

Ensure that the following tools are installed on your system:

- **Java Development Kit (JDK)**: Version 17 or higher.
- **Maven**: For managing dependencies and building the project.
- **Git**: To clone the repository.

### Installation Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/cevrimxe/Spring-Boot-Todo-App.git
   ```

2. **Navigate to the Project Directory**
   ```bash
   cd Spring-Boot-Todo-App
   ```

3. **Install Dependencies**
   Run Maven to download all necessary dependencies:
   ```bash
   mvn clean install
   ```

### Running the Application

Start the application with the following command:
```bash
mvn spring-boot:run
```

Once the application is running, open your browser and navigate to:
```
http://localhost:8081
```

## How to Use

- **Home Page**:
  - Displays a list of all todos.
  - Provides options to edit or delete existing tasks.

- **Add Todo**:
  - Click on the "Add New Todo" button to create a new task.
  - Provide a description and submit the form.

- **Edit Todo**:
  - Click on the "Edit" button next to a task to modify its details.

- **Delete Todo**:
  - Click on the "Delete" button to remove a task permanently.

## Project Structure

The project follows a standard Spring Boot structure:

```
src/
|-- main/
|   |-- java/com/example/todo/
|   |   |-- controller/       # Controllers to handle HTTP requests
|   |   |-- model/            # Entity classes representing the data model
|   |   |-- repository/       # Interfaces for database operations
|   |   |-- service/          # Business logic layer
|   |-- resources/
|       |-- application.properties  # Configuration file
|-- test/                     # Unit and integration tests
```


