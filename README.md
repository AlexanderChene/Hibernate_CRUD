 # hibernate_CRUD
This Projects implements CRUD (Create, Read, Update and Delete) operations on mysql database with Java Hibernate

# 1. Create MySQL database
I created a customer information table with: first name, last name, email

![image](https://user-images.githubusercontent.com/30871262/44366133-c234ec80-a499-11e8-9e7e-8e2978b2276e.png)


# 2. Write a Hibernate configuration file to set the connection url, database username and password for JDBC 

# 3. Create a Customer class, map the class to the database customer table (class fields map to the column of entity)

# 4. CRUD Process: 
      1. Create session factory 
      2. Use session to create query, retrieve object or create new object in transaction
      3. Session submit the transactions
      4. Then the operation will show in the database
 
 # File directory:
 
![image](https://user-images.githubusercontent.com/30871262/44366968-5b650280-a49c-11e8-9290-9658e2d61bc1.png)

Hibernate configuration file are in src : hibernate.cfg.xml

CRUD classes file are in src/crud
  
