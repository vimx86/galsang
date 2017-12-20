
# 数据库设计方案

## 数据库账号

为数据库创建账号并授权

```bash

create user 'galsang-admin'@'localhost' identified by '123456';  

create user 'galsang-admin'@'%' identified by '123456';  

create database `galsang-admin` DEFAULT CHARSET utf8 COLLATE utf8_general_ci;  

grant all privileges on `galsang-admin`.* to 'galsang-admin'@'localhost' identified by '123456';  

grant all privileges on `galsang-admin`.* to 'galsang-admin'@'%' identified by '123456';  

```

## 数据表设计原则

1. 库名称使用下划线风格，字段名称使用驼峰风格
2. 字符编码使用utf8mb4

## 数据库表

详情参见 `galsang-admin.sql` 文件