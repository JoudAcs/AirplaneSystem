# Airplane Ticket Reservation System

## Introduction

The Airplane Ticket Reservation System is a Java-based application that allows users to book flight tickets to various destinations. The system provides an interactive interface where users can input their personal information, choose their travel class (Business Class, First Class, or Economy Class), and specify the date and time of the flight. After booking, the system generates a ticket that includes booking details.

## Project Purpose

The purpose of this project is to simplify the flight booking process through an interactive user interface. The system collects user details such as name, email, phone number, and personal ID, and then allows users to select their destination and flight schedule. Additionally, booking data is saved in a text file.

## Key Features

- User input for personal details including name, email, phone number, and date of birth.
- Selection of the destination city and flight date.
- Choice of travel class (Business Class, First Class, or Economy Class).
- Ticket generation with booking details.
- Saving booking data to a text file.
- Program rating via a star-based system (from 1 to 5).

## How to Run the Project

## From the Command Line

To run the project from the command line:

1. Build the project using your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
2. After building, navigate to the `dist` folder where the compiled JAR file is located.
3. Run the application with the following command:

  ###Instructions
1. When the program starts, you will be prompted to enter your personal information such as name, email, and date of birth.
2. Next, you'll be asked for your phone number and personal ID number.
3. Choose the city you wish to travel to.
4. Enter the flight date (day, month, year) and the flight time (hour and minute).
5. Select your travel class: Business Class, First Class, or Economy Class.
6. After booking, the system will print your ticket and save your booking data in a text file.
7. Finally, you can rate the program using stars from 1 to 5.

###Project Structure
- AirplaneTicketsReservation.java: Contains the main code to run the application.
- CustomerInformation.java: Stores user information.
- City.java: Stores the destination city details.
- Date.java: Stores the flight date details.
- Time.java: Stores the flight time details.
- TicketPrinting.java: Contains the code for printing the ticket.
- BussinessClass.java, FirstClass.java, EconomicClass.java: Contain details for different flight classes.

