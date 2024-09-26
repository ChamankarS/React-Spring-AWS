
# Clone the Repo on both the instance

  git clone <git_http_url_project>
  Setup the RDS on AWS
  
# Installing MariaDB, Setting Password, and Importing Database on Ubuntu Linux
## Setup MariaDB and Import MySQL

```bash
sudo apt update
sudo apt install mariadb-server
sudo systemctl start mariadb
sudo systemctl enable mariadb
sudo mysql_secure_installation
sudo mysql -h <rds_endpoint> -u <username> -p
```
```sql
CREATE DATABASE event_management_system;
GRANT ALL PRIVILEGES ON <database_name>.* TO 'username'@'localhost' IDENTIFIED BY 'your_password';
```
### Import Database from SQL File
```bash
sudo mysql -h <rds_endpoint> -u <username> -p <database_name> < EventSpherebackend.sql
```
```bash
sudo mysql -h <rds_endpoint> -u <username> -p
```
```sql
show databases;
show tables;
select * from <table_name>;
