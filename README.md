# Selenium-Java-Cucumber Automation Framework

This project is a test automation framework using Selenium WebDriver with Java and Cucumber for BDD testing.

## Prerequisites

Before running the tests, make sure you have the following installed:

- Java JDK 11 or higher
- Gradle 7.0 or higher
- Chrome browser (for ChromeDriver)

## Project Setup

1. Clone the repository:
```bash
git clone https://github.com/Alchemist2309/slenium-java-cucumber.git
cd slenium-java-cucumber
>Gradle: create a Gradle java Project
select folder project
select Groovy
enter
```

2. Install dependencies:
```bash
./gradlew build
```

## Dependencies

The project uses the following main dependencies (managed by Gradle):

- Selenium WebDriver (4.16.1)
- Cucumber Java (7.14.0)
- Cucumber JUnit (7.14.0)
- JUnit (4.13.2)

All dependencies are managed in the `build.gradle` file.

## Project Structure

```
src
├── test
    ├── java
    │   ├── pages       # Page Object classes
    │   ├── runner      # Test runners
    │   └── steps       # Step definitions
    └── resources
        └── features    # Cucumber feature files
```

## Running Tests

To run all tests:
```bash
./gradlew test
```

## Reports

After running the tests, you can find the reports in:
- Cucumber HTML Report: `target/cucumber-reports`

## Configuration

The framework uses ChromeDriver by default. Make sure you have Chrome browser installed.

## Common Issues

1. ChromeDriver version mismatch:
   - Update your Chrome browser to the latest version
   - Or download the matching ChromeDriver version from: https://sites.google.com/chromium.org/driver/

2. Permission denied when running gradlew:
   ```bash
   chmod +x gradlew
   ```

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request