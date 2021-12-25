# Jasper Reports Spring Boot


 
## :information_source: Information 

Reporting project developed with Spring Boot, Jasper Reports and MYSQL. Was developed:

- Creation of reports with graphics;
- The creation of sub-reports;
- Creation of certificates with QRCode;
- The generation of graphs by grouping via SQL query;
- Mathematical calculations were developed in the reports, such as: values and averages of employees and their respective salaries.

## ⚠️ Prerequisite
[![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/br/java/technologies/javase-downloads.html) >= 11 

![Spring Badge](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

![](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)

![mysql](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

![JPA-hibernate (1)](https://user-images.githubusercontent.com/44611131/136869865-0e3d7476-5128-4471-8817-8df40315b970.jpg)

![jasperreports](https://user-images.githubusercontent.com/44611131/147388162-52a73982-9a02-40fa-8cb4-06038aeb7c3c.png)



##  🔧 Install 


![](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)


```
git clone https://github.com/RamonBecker/JasperReportsSpringBoot.git

```

![](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
```
git clone https://github.com/RamonBecker/JasperReportsSpringBoot.git
or install github https://desktop.github.com/ 
```

## Demo


![bandicam 2021-12-24 21-01-11-512](https://user-images.githubusercontent.com/44611131/147375156-1bbd09cc-5a8b-4edf-9d0f-c8dd7762ae45.gif)

--- 
### Examples of created reports

![func13-1](https://user-images.githubusercontent.com/44611131/147375051-e1d0343b-b458-4f62-9f40-6da4692a5a48.PNG)
![func13-2](https://user-images.githubusercontent.com/44611131/147375061-ceb9a2b4-5913-438a-b132-feb5e2a10d41.PNG)

--- 
![func14-1](https://user-images.githubusercontent.com/44611131/147375124-230d4708-0d01-44a6-acf1-4aaffaa60e1c.PNG)
![func14-2](https://user-images.githubusercontent.com/44611131/147375133-0d627764-3580-4fd5-b26d-c9adda966964.PNG)


## ⚙️ Installing Jaspersoft Studio
To view all reports download and install Jaspersoft Studio. The version you should install is 6.15.0
https://sourceforge.net/projects/jasperstudio/files/JaspersoftStudio-6.15.0/

After installing Jaspersoft Studio, import the CursoUdemy project using the option: Projects from Folder or Archive

![importacao](https://user-images.githubusercontent.com/44611131/147388510-d5d7eab0-da32-45d4-9aa1-52e5d5f55fcd.PNG)


## Database Schema

![diagrama](https://user-images.githubusercontent.com/44611131/147388660-d4e3d84c-09c2-4c4c-9499-c2c5f1d8f1e1.PNG)

## ⚙️ Installing MySQL

Enter the following commands in the terminal.

```
sudo apt update
sudo apt install mysql-server

```
### Configuring MySQL

For new installations, you will want to run the security script that is included. This changes some of the less secure default options for things like root logins and example users. Enter the command below.

```
sudo mysql_secure_installation
```
This will take you through a series of prompts where you can make some changes to the security options of your MySQL installation. The first prompt will ask you if you want to configure the Validate Password Plugin, which can be used to test the strength of your MySQL password. Regardless of your choice, the next prompt will be to set the password for the MySQL root user. Sign in and then confirm a secure password of your choice.

From there, you can press Y and then ENTER to accept the default answers for all subsequent questions. This will remove some anonymous users and the test database, disable remote login for root, and load all of these new rules so that MySQL immediately respects the changes you made.

### Testing MySQL

To see if MYSQL is running, type the following command.

```
systemctl status mysql.service
```

If MySQL is not running, you can start it with the following command.
```
sudo systemctl start mysql

Now try to connect your root user to MySQL.
```
mysql -u root -p


### Attention when creating and connecting the database

Check the application.properties file

```
spring.datasource.url= jdbc:mysql://localhost:3306/jaspercurso?serverTimezone=America/Sao_Paulo
spring.datasource.username=username
spring.datasource.password=password
```

You must create the database in MYSQL with the name jaspercurso

Download and run the scripts in MYSQL that are on DRIVE

```
https://drive.google.com/drive/folders/1stylLk15XBLslN9vAJLjL8zQQe1UZ4qN?usp=sharing

```

## Settings for reading the QR Code

If you are on Windows
```
Open CMD (terminal) and type ipconfig
```

If you are on Linux
```
Open the terminal and type ifconfig
```
Check your machine's IP.

Open the file employees-19-jasper

![teste](https://user-images.githubusercontent.com/44611131/147388396-3a6c641a-cf08-481b-baa4-2225639565c4.PNG)

in a file editor and look for the following line:
```
"http://192.168.0.104:8080/certificados?cid=" 

Where is 192.168.0.104 change to your IP
```
## :zap: Technologies	

- Java
- JPA
- Spring Boot
- Jaspersoft Studio
- Jasper Reports

## :memo: Developed features

- [x] Listing of employees by their addresses;
- [x] Listing of employees by their positions;
- [x] Listing of employees by states;
- [x] Listing of employees by their ids;
- [x] Listing of employees by their ages;
- [x] Generation of graphs through sum grouping, mathematical calculations of employees' salaries.


## :technologist:	 Author

By Ramon Becker 👋🏽 Get in touch!



[<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/github.svg' alt='github' height='40'>](https://github.com/RamonBecker)  [<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/linkedin.svg' alt='linkedin' height='40'>](https://www.linkedin.com/in/https://www.linkedin.com/in/ramon-becker-da-silva-96b81b141//)
![Gmail Badge](https://img.shields.io/badge/-ramonbecker68@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:ramonbecker68@gmail.com)
