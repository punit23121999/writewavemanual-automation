WriteWave Application - Test Automation and Bug Reporting



Overview



This repository contains the necessary files and documentation for testing the WriteWave application. The WriteWave application is a web-based platform designed for document creation, editing, and sharing. This repository includes:



Automation Test Script: A Java-based Selenium script for automating user registration, login, and post creation.




Test Plan Document: A detailed test plan outlining the testing strategy, scope, and methodology for the WriteWave application.




Bug Report: An Excel sheet documenting the identified bugs during the testing process.








WriteWave-Testing/


├── src/


│   └── automatethewritewaveappication.java  # Selenium automation script


├── documents/


│   └── WriteWave_Test_Plan.docx            # Test Plan Document


├── reports/


│   └── WRITEWAVEBUG_REPORT.xlsx            # Bug Report Excel Sheet



└── README.md                               # This README file





Files Description



1. automatethewritewaveappication.java



Description: This is a Java-based Selenium automation script that automates the following functionalities of the WriteWave application:




User registration




User login




Post creation (including file upload)





Navigation and scrolling



Dependencies:



Selenium WebDriver



ChromeDriver

Usage:


Ensure ChromeDriver is installed and configured



Run the script to automate the testing of the WriteWave application.



2. WriteWave_Test_Plan.docx


Description: This document outlines the comprehensive test plan for the WriteWave application. It includes:



Objectives and scope of testing



Test methodology and approach



Assumptions, risks, and mitigation plans



Roles and responsibilities of the QA team


Test environment details



Entry and exit criteria for different testing phases


Test automation strategy using Selenium


Usage: Refer to this document to understand the testing strategy and execution plan for the WriteWave application.



3. WRITEWAVEBUG_REPORT.xlsx


Description: This Excel sheet contains the bug report for the WriteWave application. It includes:


Bug ID, priority, and description


Pre-conditions and steps to reproduce


Expected vs. actual results


Status and browser/device information


Usage: This report is used to track and manage the bugs identified during the testing process.

