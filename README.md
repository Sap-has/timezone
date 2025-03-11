# Time Zone Converter

## Overview
This project is a simple Time Zone Converter web application built using **Java (Spring Boot), HTML, CSS, and JavaScript**. It allows users to select different time zones, view their current times in a table, and add/remove time zones dynamically. The application updates automatically every minute to ensure accurate timekeeping.

## Features
- Select a time zone from a dropdown menu.
- Add multiple time zones to a table.
- Remove selected time zones from the table.
- Auto-refresh every minute to update time.
- Time format: `YYYY-MM-DD HH:MM` (year-month-day hour:minute).
- Simple and responsive UI using HTML and CSS.

## Technologies Used
- **Backend:** Java, Spring Boot (without security or Hibernate)
- **Frontend:** HTML, CSS, JavaScript
- **Time Management:** Java `java.time` package

## Setup and Installation
### Prerequisites
- Java (JDK 11 or later)
- Maven
- Git

### Steps
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Sap-has/timezone.git
   cd timezone
   ```

2. **Build and Run the Project:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

3. **Access the Application:**
   Open your browser and go to:
   ```
   http://localhost:8080
   ```

## Deployment Options
To deploy this application online for free, consider using:
- [Render](https://render.com/)
- [Fly.io](https://fly.io/)
- [Oracle Cloud Free Tier](https://www.oracle.com/cloud/free/)

## Future Enhancements
- Add a feature to save user preferences.
- Improve the UI with more styling.
- Implement an API to fetch global time zone data.

## License
This project is open-source under the **MIT License**.

## Author
Created by **Sap-has**

