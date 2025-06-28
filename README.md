# Java OOP Library System

Welcome to the Java OOP Library System project! This repository contains a hands-on implementation of object-oriented programming (OOP) concepts in Java, developed as part of a learning exercise. The system simulates a library where users (including students) can borrow and return books and magazines. This README provides an overview of the project, explains the OOP principles demonstrated, details the development process, and offers instructions for setting up and extending the code.

## Project Overview

This project implements a simple library management system using Java, focusing on key OOP principles: **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**. The system allows:
- Adding books and magazines to a library.
- Managing users (including students with borrowing limits).
- Borrowing and returning items with availability tracking.
- Validating data and preventing duplicate borrowing.

The code is structured to serve as a learning tool for understanding OOP concepts through practical application.

## Features

- **Book and Magazine Management**: Add and track books (with title, author, ISBN) and magazines (with title, issue number, publication date).
- **User and Student Classes**: General users and a student subclass with a maximum borrowing limit of 3 items.
- **Borrowing System**: Borrow and return items, with availability checks and duplicate prevention.
- **Data Validation**: Ensure book attributes (title, author, ISBN) are not null or empty.
- **Polymorphism**: Use a `Borrowable` interface to handle both books and magazines uniformly.

## OOP Concepts Demonstrated

1. **Encapsulation**:
   - Private fields (e.g., `title`, `isAvailable`) with public getters and setters.
   - Validation in setters to protect data integrity (e.g., non-empty ISBN).

2. **Inheritance**:
   - `Student` class extends `User`, inheriting borrowing functionality and adding a `maxItems` limit.

3. **Polymorphism**:
   - `Borrowable` interface implemented by `Book` and `Magazine`, allowing a `Library` to manage both types via a single `List<Borrowable>`.

4. **Abstraction**:
   - `Borrowable` interface abstracts borrowing behavior, hiding implementation details from the `Library` and `User` classes.

## Development Process

### Exercise 1: Extend the User Class (Inheritance)
- **Goal**: Create a `Student` class that inherits from `User` with a limit of 3 borrowed items.
- **Implementation**: Added a `Student` class with `maxItems = 3` and overrode `borrowItem` to enforce the limit.
- **Outcome**: Students can borrow up to 3 items, with appropriate feedback when the limit is reached.

### Exercise 2: Add a New Borrowable Item (Polymorphism)
- **Goal**: Implement a `Magazine` class and integrate it with the existing system using polymorphism.
- **Implementation**: Created a `Magazine` class with `title`, `issueNumber`, and `publicationDate`. Updated `Library` to use `List<Borrowable>` and `User`/`Student` to handle any `Borrowable` item.
- **Outcome**: The system now supports borrowing and returning both books and magazines, demonstrated through the `LibrarySystem` main method.

### Exercise 3: Enhance Encapsulation
- **Goal**: Add validation to `Book` setters and prevent duplicate borrowing in `User`.
- **Implementation**: Added setters with checks for null/empty values in `Book`. Modified `User.borrowItem` to reject duplicates by comparing item references.
- **Outcome**: The system validates book data and prevents users from borrowing the same item twice.

### Planned Exercises (Not Implemented)
- **Exercise 4: Improve Library Functionality**
  - Add methods to list borrowed items by user ID and search books by author.
- **Exercise 5: Handle Exceptions**
  - Implement a custom `NotFoundException` and add exception handling for missing items or users.

These exercises are left as future enhancements for learners to explore.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher.
- An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with Java support.
- Git (for cloning the repository).

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
