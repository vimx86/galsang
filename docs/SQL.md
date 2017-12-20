
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

1. 库名称使用`下划线`风格，字段名称使用`驼峰`风格
2. 字符编码使用 `utf8mb4`
3. 禁止使用数据库`关键字`和`保留字`作为`库`或`字段`名称

## 数据库表

详情参见 `galsang-admin.sql` 文件