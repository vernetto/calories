
#Database

Mariadb running on localhost 

##References

https://oracle-base.com/articles/mysql/mysql-connections-in-sql-developer

https://dev.mysql.com/doc/refman/5.5/en/grant.html


##Commands

**create database:**

CREATE DATABASE calories;

**create user:**

GRANT ALL PRIVILEGES ON calories.* TO 'calories'@'localhost' IDENTIFIED BY 'calories';

**drop user:** 

drop user 'calories'@'localhost';

