

为数据库创建账号并授权

```bash

create user 'galsang-admin'@'localhost' identified by '123456';  

create user 'galsang-admin'@'%' identified by '123456';  

create database `galsang-admin` DEFAULT CHARSET utf8 COLLATE utf8_general_ci;  

grant all privileges on `galsang-admin`.* to 'galsang-admin'@'localhost' identified by '123456';  

grant all privileges on `galsang-admin`.* to 'galsang-admin'@'%' identified by '123456';  

```


