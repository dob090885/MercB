This readme.txt file very clearly laid out design principles, and briefly mentions all major design decisions, as well as their justification for what they decided.

System requirements:
1. Java must be installed and environment variables must be set
2. Maven must be installed and set environment variables. To verify open command prompt and type 'mvn --version'
3. Chrome version 75.0.3770.100 (Offizieller Build) (64-Bit) as I configure chrome driver for the same
4. Firefox must be installed in your system

GitHib Repository:
To clone the project, here is the GitHub link "https://github.com/dob090885/MercB.git"

Tools:
1. I used Eclipse as IDE 
2. Maven for Build Management
3. TestNG for configuring test run

Steps to run the project:
1. Fetch the code from GitHub
2. Navigate to "..\MerB\MercedesBenz\src\main\java\MBOnlineShopWorklow\MercedesBenz" and open the file "config.properties"
3. Select browser on which you want to run by providing value in variable "browser=" as 'chrome' or 'firefox'
2. Open command prompt and navigate to "cd ../MerB/MercedesBenz" where pom.xml file is present
3. type the command 'mvn test'. This command will clean, build and run the test

Test report location:
1. Simple TestNG report will be displayed on command prompt
2. 'ExtendReports.html' can be found on the same location where pom.xml file is present




