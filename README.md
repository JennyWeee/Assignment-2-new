Advanced Programming				
COSC1295 | Assignment 2: Data Analytics Hub		
						
Name: Janini Weerakoon				
STID: s3913723					


=> IDE used : Eclipse IDE Version: 2023-09 (4.29.0) Build id: 20230907-1323
=> Java Version : 21
=> JavaFX Version : 21
=> Database Used : Sqlite
=> How To Run The Code : Unzip the Archive And Open it With the Eclipse IDE

Github link: https://github.com/JennyWeee/Assignment-2-new

HOW TO RUN THE CODE
===================

To execute the provided Java code within Eclipse, please follow these steps:

1. Open Eclipse:

	=> Launch the Eclipse Integrated Development Environment (IDE).
	=> Download the Project files and import
	=> In Eclipse, go to "File" > "Open project file." > "Archive".
	=> Browse for the project directory (e.g., "DataAnalyticsHub.zip").
	=> Click "Finish."

2. Add Classes

	=> Copy and paste the respective Java classes into their corresponding packages. 
	=> Ensure that the package declarations at the top of each file match the folder structure.

3.Configure JavaFX:

	=> If JavaFX is not set up in your Eclipse environment, please follow this link for setup 	instructions.

4. Set Up Database Connection

	=> Locate the database file named ‘dahp.db'.
	=> Open HeidiSql.
	=> Select the network type as SQLite in HeidiSQL.
	=> Choose the database file from HeidiSQL and open it.
	=> Create tables using SQL queries or using the graphical user interface.

5.Connecting Database

=> In Eclipse, import a library called sqlite-jdbc-3.7.2.jar.
=> In the databaseUtil class in the dbConnection package, ensure that the database connection is configured.
Resolve Dependencies:

=> If any missing imports are reported by Eclipse, you may need to add the required JavaFX libraries to your project's build path. Right-click on your project, navigate to "Build Path" > "Add Libraries," and select "User Library." Create a new user library and include the JavaFX libraries.
Run the Code:

=> Identify the class with the main method.
=> Right-click on the "Main" class and select "Run".
=> Now you're good to go! :)

The code follows Object-Oriented (OO) design principles to create a modular, encapsulated, and maintainable application. Key OO design concepts include:
-Classes and Objects
-Encapsulation
-Inheritance
-Polymorphism
-Abstraction
-Composition
-Dependency Injection
-Single Responsibility Principle (SRP)
-Error/Exception Handling
-UI and Business Logic Separation
-Comments and Documentation

-----------------------------------------------------------------------------------------------------
CODE DESCRIPTION
=================

Package :View
	Class	:DashboardPage
		Methods:start(Stage,String,String,boolean):void
	Class	:EditProfilePage
		Methods:start(Stage,String,String):void
	Class	:LoginPage
		Methods:start(Stage):void
	Class	:RegistrationPage
		Methods:RegistrationPage():Constructor
			RegistrationPage(Stage):Constructor
			start(Stage):void
------------------------------------------------------------------------------------------
Package	:Controller
	Class	:DashboardPage
		Methods:bulkImportPosts(Stage):void
			deletePost(int):boolean
			exportPostToCSV(Stage):void
			handleSelectedOption(int, Stage):void
			retrievePostInfo(int):String
			retrieveTopLikedPosts(int):String
			retrieveTopSharedPosts(int):String
			savePostToCSV(String, File):boolean
			showAddPostDialog(Stage):void
			showAlert(String, String):void
			showDeletePostDialog(Stage):void
			showRetrievePostDialog(Stage):void
			showRetrieveTopLikesDialog(Stage):void
			showRetrieveTopSharesDialog(Stage):void
			showSharesDistributionPieChart(Stage):void
			validateAndSavePost(String, String, String, String, LocalDate, String):boolean
	Class	:EditProfilePage
		Methods:getFullName(String):String
			isVIP(String):boolean
			showAlert(String, String):void
			updateUserProfile(String, String, String, String, String):boolean
	Class	:LoginPage
		Methods:getFullName(String):String
			navigateToDashboard(Stage, String, String, boolean):void
			showAlert(String, String):void
			validateLogin(String, String):boolean
	Class	:RegistrationPage
		Methods:RegistrationPage():Constructor
			RegistrationPage(Stage):Constrctor
			isVIP(Stage, String, String, String, String):void
			navigateToDashboard(String, String, boolean):void
			registerUser(String, String, String, String, int):boolean
			showAlert(String, String):void
--------------------------------------------------------------------------------------------
Package	:Model
	Class	:DashboardPage
		Methods:bulkImportPosts(Stage):void
			checkIfRecordExists(int, Connection):boolean
			deletePost(int):boolean
			exportPostToCSV(Stage):void
			handleSelectedOption(int, Stage):void
			parseId(String):int
			retrievePostInfo(int):String
			retrieveTopLikedPosts(int):String
			retrieveTopSharedPosts(int):String
			savePostToCSV(String, File):boolean
			showAddPostDialog(Stage):void
			showAlert(String, String):void
			showDeletePostDialog(Stage):void
			showRetrievePostDialog(Stage):void
			showRetrieveTopLikesDialog(Stage):void
			showRetrieveTopSharesDialog(Stage):void
			showSharesDistributionPieChart(Stage):void
			validateAndSavePost(String, String, String, String, LocalDate, String):boolean
	Class	:EditProfilePage
		Methods:getFullName(String):String
			isVIP(String):boolean
			showAlert(String, String):void
			updateUserProfile(String, String, String, String, String):boolean
	Class	:LoginPage
		Methods:getFullName(String):String
			navigateToDashboard(Stage, String, String, boolean):void
			showAlert(String, String):void
			validateLogin(String, String):boolean
	Class	:RegistrationPage
		Methods:RegistrationPage():Constructor
			RegistrationPage(Stage):Constrctor
			isVIP(Stage, String, String, String, String):void
			navigateToDashboard(String, String, boolean):void
			registerUser(String, String, String, String, int):boolean
			showAlert(String, String):void
	Class	:isVIP
		Methods:checkVIP(String):boolean
---------------------------------------------------------------------------------------
Package	:dbConnection
	Class	:DatabaseUtil
		Methods:closeConnection()
			getConnection()
