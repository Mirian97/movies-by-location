# Movies by Location

## Overview

Movies by Location is a Spring Boot application developed as part of the Uber Challenge to retrieve and display movie information based on filming locations in San Francisco. The application fetches data from the San Francisco Open Data API and provides an endpoint to query movies, optionally filtering by title.

## Features

- **Retrieve Movie Data**: Fetches movie details including title, release year, filming location, and main actors from the San Francisco Open Data API.
- **Filter by Title**: Allows users to filter movies by a search query matching the movie title.
- **Swagger UI**: Integrated Swagger UI for easy API exploration and testing.
- **Reactive Web Client**: Utilizes Spring WebFlux for non-blocking API calls.

## Technologies Used

- **Java 17**: Programming language.
- **Spring Boot 3.5.4**: Framework for building the application.
- **Spring WebFlux**: For reactive, non-blocking HTTP requests.
- **Lombok**: To reduce boilerplate code.
- **Springdoc OpenAPI**: For API documentation and Swagger UI.
- **Maven**: Dependency management and build tool.

## Prerequisites

- Java 17 or higher
- Maven 3.9.11

## Setup and Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/Mirian97/movies-by-location.git
   cd movies-by-location
   ```

2. **Build the Project**:

   ```bash
   mvn clean install
   ```

3. **Run the Application**:

   ```bash
   mvn spring-boot:run
   ```

4. **Access the Application**:
   - The application runs on `http://localhost:8080`.
   - Swagger UI is available at `http://localhost:8080/swagger-ui.html`.

## API Endpoints

- **GET /movies**
  - **Description**: Retrieves a list of movies, optionally filtered by title.
  - **Parameters**:
    - `title` (optional): Filters movies by a case-insensitive title search.
  - **Example**:
    ```bash
    curl http://localhost:8080/movies?title=Matrix
    ```
  - **Response**: JSON array of movie objects with fields: `title`, `release_year`, `location`, `actor_1`, `actor_2`, `actor_3`.

## Project Structure

- **config/**: Configuration classes for WebClient and OpenAPI.
- **controller/**: REST controller handling movie-related endpoints.
- **model/**: Data model for movie location records.
- **service/**: Service layer for fetching and filtering movie data.
- **MovieLocationApplication.java**: Main application entry point.

## License

This project is licensed under the Apache License, Version 2.0. See the [LICENSE](http://www.apache.org/licenses/LICENSE-2.0) file for details.
