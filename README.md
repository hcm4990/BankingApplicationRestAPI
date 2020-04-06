BankingApplicationRestAPI

Application is mostly complete, but had some issues with connecting the Spring Boot code and the PostgreSQL server. Nevertheless, I am happy with what I wrote overall, even if it's not 100% complete.

This banking application has a Rest API via Spring Boot in Java. It has functions such as adding a user, opening an account, depositing/withdrawing money, and approving a loan with preconditions.

The bulk of the code is in \gs-serving-web-content-complete\src\main\java\com\example\servingwebcontent\. There are also three html files in \gs-serving-web-content-complete\src\main\java\com\example\resources\static\ though.

Steps:

1. First design your database tables:

This step is complete. I wrote my tables in both localhost and in a DB hosted on RDS. I'v also uploaded a word document with my Database design, on this project, with the title "PostgreSQL Database Tables".

2. Create a Spring Boot app in your local IDE and implement the models:

This step is also complete. I have a app in my local IDE, and I've uploaded the code to github.

3. Bring up a Postgres SQL in your local environment, and create those tables:

This step is complete as well. I created a localhost database with 4 tables and integrated the tables with the Spring Boot code.

4. Try to bring up the app and make sure your app connects with the DB:

The app is up, but connecting to the DB is not functioning as of now. I focused heavily on making sure that there is a backend codebase to build off of in the future.

The link for the app is http://springgettingstarted-env.eba-m6z4miwb.us-east-1.elasticbeanstalk.com/

Front-end is basic right now. Linking the different html pages isn't done yet, but that is because mappings would need to be tweaked a bit.

5. Implement CRUD APIs:

CRUD APIs are implemented basically. Fully testing is not possible, but the overall theory/thinking behind it should be correct. Mapping isn't fully implemented but there is semi-skeleton/semi-complete code there.

6. Test that the operations work:

Testing is a bit difficult. Nevertheless, I've tested the SQL commands and they should work.

7. Implement the required functions:

The functions are successfully implemented in the Spring Boot code. They are in the file "DAOImplementation.java", while their "header file" is "DAO.java". "Mapper.java" contains mappings for these functions.

8. Test/tweak and implement a Swagger UI or Basic Authentication if possible:

I added a field for username/password for each a_user, which is a user who may have up to 3 bank accounts. The HTML routing I was setting up also was making sure that user could only delete users or accounts once the user had passed that level of validation.

