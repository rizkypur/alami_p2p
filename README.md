## Alami P2P Automation with Katalon 

### Test Cases
**There are two test cases in this project**
1. Register New User - Pemberi Dana (With Email Verification)
2. Login New User


### Project Sctructure (Brief)

This project need to add custom keyword **GlobalVariableUpdater** to be able to update some Global variables Permanently on dev Profiles. So Test cases will be expexting to run new account by replacing the previous one everytime  Test Cases / Test Suits Executed.


```
+--- Profiles 
|   +--- dev (Default Execution)
|   +--- default
|         
+--- Test Cases 
|   +--- Login User – Pemberi Dana
|   +--- Registrasi New User – Pemberi Dana       
|
+--- Object Repository 
|   +--- Form Registrasi Pemberi Dana
|   +--- Home Page
|   +--- Page Ketentuan Pengguna
|   +--- Page Mailnesia
|   +--- Page Success Activation
|   +--- Page Alami - Dashboard
|
+--- Test Suites
|   +--- E2E Register_and_Login
|            
+--- Keywords
|   + (default package)	
|    \--- GlobalVariableUpdater.groovy
```


### How to Run the Project
1. Open the project via Katalon Studio
2. Choose menu Clone Git Project
3. Input github URL, usernmae and Password of your github
4. Run the Test Suits
5. You can run each test cases individually