# Supermarket Billing System

Supermarket Billing System is a desktop application developed in Java, designed to facilitate the billing process in supermarkets by managing product sales, customer transactions, and administrative functionalities. This application is built using Java Swing for the user interface, JWT (JSON Web Tokens) for secure authentication, and MySQL as the backend database.

## Features

- **Product Management:** Add, update, and delete products.
- **Billing:** Generate invoices and calculate totals.
- **User Authentication:** Secure login and logout using JWT.
- **Reports:** View and export sales and product reports.
- **User Management:** Manage user accounts within the system.

## Prerequisites

Before you run the application, ensure you have the following installed:
- Java JDK 8 or higher
- MySQL 8.0 or higher
- Any Java IDE (NetBeans, IntelliJ IDEA, Eclipse, etc.)

## Installation

Follow these steps to get your development environment running:

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/supermarket-billing-system.git
   cd supermarket-billing-system

2. **Database Setup
  Install MySQL on your machine and start the MySQL server.
  Create a database named supermarket.
    ```sql
    CREATE DATABASE supermarket;

  Import the provided SQL script to set up the tables and initial data.
    ```bash
    mysql -u root -p supermarket < path/to/supermarket.sql
    
    
3. **Configure MySQL Credentials
  Navigate to the Java DB connection class (usually found at src/main/java/Project/ConnectionProvider.java).
  Update the MySQL connection properties by replacing the strings "root" and "Enter_Your_Password" with your MySQL  username and password respectively.
  
    ```Java
    Connection conn = DriverManager.getConnection(url,"root","Enter_Your_Password");
  
4. **Update Image Paths
  The application uses images for a better user interface experience. You need to update the paths to these images in every JFrame file.
  Search for lines containing setIconImage and ImageIcon and update the paths accordingly.
    ```Java    
    LabelName.setIcon(new javax.swing.ImageIcon("Path/To/Icon"));
  You can find a list of icons I used in the repository under the Icons_Used folder in the repository.
  
## Running the Application

  1. **Open the Project
  Open the project in your preferred Java IDE.
  Do a maven clean install to verify if the dependencies are working.
  Right click on the project and select Run (or) Find the main class under the source directory, Login.java, and run it to start the application.

  2. **Login to the Application
  Use the default credentials in the Login.
  Usage
  Once you start the application, you will be presented with a login screen. Enter your username and password to access the main dashboard.
  
 #### Dashboard: Navigate through different functionalities like adding products, generating bills, and viewing reports.
 #### Product Management: Go to the Products section to add, edit, or delete products.
 #### Billing: Select products, add them to the cart, and generate an invoice by going to the Billing section.
 #### Reports: View sales and product reports in the Reports section.
## Contributing
Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

## Fork the Project
Create your Feature Branch (git checkout -b feature/AmazingFeature)
Commit your Changes (git commit -m 'Add some AmazingFeature')
Push to the Branch (git push origin feature/AmazingFeature)
Open a Pull Request
