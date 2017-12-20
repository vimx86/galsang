/*
Navicat MySQL Data Transfer

Source Server         : galsang-admin
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : galsang-admin

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-12-20 15:55:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `auth_role`
-- ----------------------------
DROP TABLE IF EXISTS `auth_role`;
CREATE TABLE `auth_role` (
  `id` varchar(36) CHARACTER SET utf8mb4 NOT NULL COMMENT '角色id',
  `code` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '角色代码',
  `name` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '角色名称',
  `remark` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '备注',
  `deleted` tinyint(4) DEFAULT '0' COMMENT '删除： 0 - 否；1 - 是',
  `createdTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updatedTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of auth_role
-- ----------------------------

-- ----------------------------
-- Table structure for `auth_user`
-- ----------------------------
DROP TABLE IF EXISTS `auth_user`;
CREATE TABLE `auth_user` (
  `id` varchar(36) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户名称',
  `password` varchar(32) CHARACTER SET utf8mb4 NOT NULL COMMENT '密码',
  `loginPhone` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '登录手机号',
  `loginEmail` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '登录邮箱',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '用户状态： 0 - 禁用； 1 - 启用',
  `isSuperAdmin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '系统管理员： 0 - 否； 1 - 是',
  `deptId` varchar(36) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '部门id',
  `createdTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `updatedTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of auth_user
-- ----------------------------
