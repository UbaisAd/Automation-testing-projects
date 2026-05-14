# SmartXFramework

A simple and scalable Selenium automation framework built using:

- Java 17
- Selenium WebDriver 4
- TestNG
- Maven
- WebDriverManager

This framework follows the Page Object Model (POM) design pattern and is suitable for UI automation testing projects.

---

# Project Structure

SmartXFramework
│
├── pom.xml
├── testng.xml
│
├── src
│   ├── main
│   │   └── java
│   │       ├── core
│   │       │   ├── BaseTest.java
│   │       │   └── DriverFactory.java
│   │       │
│   │       ├── pages
│   │       │   └── LoginPage.java
│   │       │
│   │       └── utils
│   │           └── WaitHelper.java
│   │
│   └── test
│       └── java
│           └── tests
│               └── LoginTest.java
│
└── target

---

# Technologies Used

| Technology | Version |
|---|---|
| Java | 17 |
| Maven | 3+ |
| Selenium | 4.21.0 |
| TestNG | 7.8.0 |
| WebDriverManager | 5.8.0 |

---

# Features

- Selenium WebDriver setup
- TestNG integration
- Maven build management
- Page Object Model structure
- Explicit wait utilities
- Driver management using WebDriverManager
- Scalable folder architecture
- Easy GitHub integration

---

# Prerequisites

Install the following before running the project:

- Java JDK 17+
- Maven
- Google Chrome browser
- VS Code / IntelliJ IDEA

---

# Clone Repository

```bash
gh repo clone UbaisAd/Automation-testing-projects
