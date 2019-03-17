
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


#Security

To configure social login https://access.redhat.com/documentation/en-us/red_hat_single_sign-on/7.0/html/server_administration_guide/identity_broker http://www.keycloak.org/docs/latest/server_admin/index.html#_identity_broker

For Google : https://developers.google.com/identity/protocols/OpenIDConnect https://console.developers.google.com/apis/dashboard?project=calories-186017&duration=PT1H


#Environment

export PATH=/d/pierre/Java/jdk-11.0.2/bin:$PATH

export JAVA_HOME="D:\pierre\Java\jdk-11.0.2"
