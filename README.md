# Bus Reservation System

A Java-based console application for managing bus ticket bookings, built using JDBC for database connectivity and the DAO (Data Access Object) design pattern.

## Description
This project allows users to book bus tickets, view bus details, and manage reservations through a Java application connected to an SQL database. It follows the DAO design pattern to separate business logic from database operations, making the code cleaner and easier to maintain.

## Features
- View available buses and their details
- Book bus tickets
- Store and retrieve booking records from the database
- Prevents double-booking using proper database transactions

## Tech Stack
- Java
- JDBC (Java Database Connectivity)
- SQL (for database storage)

## Project Structure
- `Bus.java` – Represents a bus entity (model class)
- `BusDAO.java` – Handles database operations related to buses
- `Booking.java` – Represents a booking entity (model class)
- `BookingDAO.java` – Handles database operations related to bookings
- `DbConnection.java` – Manages the database connection setup
- `BusDemo.java` – Demo/entry point to run bus-related operations
- `JDBCDemo.java` – Demo/entry point to test JDBC connectivity

## How to Run
1. Clone this repository
2. Set up an SQL database with tables for buses and bookings
3. Update the database URL, username, and password in `DbConnection.java`
4. Compile all `.java` files
5. Run `BusDemo.java` to start the application

## Key Concepts Used
- JDBC for connecting Java application to a database
- DAO (Data Access Object) pattern for clean separation of data logic
- ACID properties to ensure safe and consistent booking transactions
