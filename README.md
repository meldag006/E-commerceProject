# E-commerceProject (OOP)
A comprehensive e-commerce backend simulation developed in Java, focusing on **Object-Oriented Programming (OOP)** principles.

## Overview
This project simulates the core functionalities of an e-commerce platform, including user management, product inventory, and order processing.

## Key Features
* **Encapsulation:** All data fields are private, accessed through controlled getters and setters.
* **Dynamic Inventory Management:** Automatically reduces product stocks upon successful orders and prevents orders if stock is insufficient.
* **Security & Masking:** Credit card numbers are masked (showing only the last 4 digits) in order summaries for privacy.
* **Duplicate Prevention:** An intelligent "Favorite" system that prevents adding the same product multiple times.
* **Relational Logic:** Demonstrates complex relationships between User, Product, CreditCard, and Order objects.

## System Architecture(UML)
 The system is built on a modular structure consisting of 4 main classes and a comprehensive test suite:
 * **User:** Manages profile, order history, and favorite lists.
 * **Product:** Handles item details and stock queries.
 * **Order:** Manages the transaction logic between users and products.
 * **CreditCard:** Stores payment information securely.

<img width="732" height="797" alt="Ekran görüntüsü 2026-03-31 224825" src="https://github.com/user-attachments/assets/9de322f1-a493-4ba0-a039-eff75c4c7135" />


## Test Scenarios
The `Test.java` class includes 24 distinct test cases, covering:
* Successful order placement and stock reduction.
* Order cancellation by user input.
* Handling out-of-stock errors.
* Profile viewing with masked credit card details.


## Our Team
This project is a group work.
* **Melda Güngör**
* **Feyza Özdemir**
* **Kübra Temur**

**Build Status:** BUILD SUCCESSFULL
