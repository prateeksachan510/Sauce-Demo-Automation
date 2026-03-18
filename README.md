# Sauce Demo - Web Automation Framework

## 📌 Project Overview
A comprehensive automated testing suite for the **Sauce Demo** e-commerce platform. This project demonstrates an end-to-end user journey, from secure login to a successful checkout process.

## 🛠️ Tech Stack
* **Language:** Java 17
* **Automation Tool:** Selenium WebDriver (v4.x)
* **Test Runner:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)

## 🚀 Key Framework Features
* **Page Object Model:** Separates UI locators from test logic for 100% maintainability.
* **Synchronization:** Utilizes **Explicit Waits** (WebDriverWait) to handle dynamic element loading without using flaky `Thread.sleep`.
* **Assertions:** Comprehensive validation of cart totals, product names, and success messages using TestNG Assertions.
* **Clean Code:** Adheres to DRY (Don't Repeat Yourself) principles and proper Java naming conventions.

## 📁 Project Structure
- `src/main/java/pages`: Contains Page Object classes and locators.
- `src/test/java/tests`: Contains TestNG test scripts and assertions.
- `pom.xml`: Dependency management for Selenium and TestNG.

## ⚙️ How to Run
1. Clone the repository: `git clone [https://github.com/prateeksachan510/Sauce-Demo-Automation.git]`
2. Navigate to the project folder.
3. Run the command: `mvn test`