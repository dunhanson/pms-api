/*
 Navicat Premium Data Transfer

 Source Server         : vagrant
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : 192.168.33.10:3306
 Source Schema         : pms

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 15/02/2023 23:19:31
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_authority
-- ----------------------------
DROP TABLE IF EXISTS `sys_authority`;
CREATE TABLE `sys_authority`
(
    `auth_id`     int                                                            NOT NULL AUTO_INCREMENT COMMENT '权限ID',
    `parent_id`   int NULL DEFAULT NULL COMMENT '父ID',
    `auth_name`   varchar(45) CHARACTER SET armscii8 COLLATE armscii8_general_ci NOT NULL COMMENT '权限名称',
    `auth_code`   varchar(45) CHARACTER SET armscii8 COLLATE armscii8_general_ci NOT NULL COMMENT '权限代码',
    `url`         varchar(45) CHARACTER SET armscii8 COLLATE armscii8_general_ci NOT NULL COMMENT 'url路径',
    `create_time` datetime                                                       NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`auth_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = armscii8 COLLATE = armscii8_general_ci COMMENT = '权限' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_department
-- ----------------------------
DROP TABLE IF EXISTS `sys_department`;
CREATE TABLE `sys_department`
(
    `dept_id`     int                                                          NOT NULL AUTO_INCREMENT COMMENT '部门',
    `dept_name`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
    `dept_status` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '状态（10=正常 20=删除）',
    `sort_num`    int                                                          NOT NULL COMMENT '排序顺序',
    `create_time` datetime                                                     NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`dept_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '部门' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_login_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_login_log`;
CREATE TABLE `sys_login_log`
(
    `login_id`    int                                                          NOT NULL AUTO_INCREMENT,
    `user_id`     int                                                          NOT NULL COMMENT '用户ID',
    `ip_address`  varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'IP地址',
    `ip_location` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'IP归属',
    `create_time` datetime                                                     NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`login_id`) USING BTREE,
    CONSTRAINT `fk_sys_login_log_sys_login_log_1` FOREIGN KEY (`login_id`) REFERENCES `sys_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '登录日志' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_operate_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_operate_log`;
CREATE TABLE `sys_operate_log`
(
    `opt_id`        int                                                          NOT NULL AUTO_INCREMENT COMMENT '操作日志ID',
    `create_time`   datetime                                                     NOT NULL COMMENT '创建时间',
    `module_name`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '模块名称',
    `oper_type`     varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '操作类型（10=新增 20=删除 30=修改 40=查询）',
    `user_id`       int                                                          NOT NULL COMMENT '用户ID',
    `ip_address`    varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'IP地址',
    `ip_location`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'IP归属',
    `oper_status`   int                                                          NOT NULL COMMENT '操作状态（10=正常 20=失败）',
    `request_url`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请求地址',
    `request_param` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请求参数',
    `response_body` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '响应内容',
    PRIMARY KEY (`opt_id`) USING BTREE,
    INDEX           `fk_sys_operate_log_sys_operate_log_1`(`user_id` ASC) USING BTREE,
    CONSTRAINT `fk_sys_operate_log_sys_operate_log_1` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '操作日志' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_position
-- ----------------------------
DROP TABLE IF EXISTS `sys_position`;
CREATE TABLE `sys_position`
(
    `post_id`     int                                                          NOT NULL AUTO_INCREMENT,
    `post_name`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '职位名称',
    `post_code`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '岗位编码',
    `post_sort`   int                                                          NOT NULL COMMENT '排序顺序',
    `post_status` int                                                          NOT NULL COMMENT '职位状态（10=启用 20=暂停 30=删除）',
    `create_time` datetime                                                     NOT NULL COMMENT '创建时间',
    `remark`      varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注信息',
    `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`post_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '职位' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`
(
    `role_id`     int                                                          NOT NULL AUTO_INCREMENT,
    `role_name`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色名称',
    `role_code`   varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色编码',
    `role_sort`   int                                                          NOT NULL COMMENT '排序顺序',
    `role_status` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '角色状态（10=启用 20=禁用 30=删除）',
    `create_time` datetime                                                     NOT NULL COMMENT '更新时间',
    `remark`      varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注信息',
    `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '角色' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_role_authority
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_authority`;
CREATE TABLE `sys_role_authority`
(
    `role_id` int NOT NULL COMMENT '角色',
    `auth_id` int NOT NULL COMMENT '权限ID',
    INDEX     `fk_sys_role_authority_sys_role_authority_1`(`role_id` ASC) USING BTREE,
    INDEX     `fk_sys_role_authority_sys_role_authority_2`(`auth_id` ASC) USING BTREE,
    CONSTRAINT `fk_sys_role_authority_sys_role_authority_1` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT `fk_sys_role_authority_sys_role_authority_2` FOREIGN KEY (`auth_id`) REFERENCES `sys_authority` (`auth_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`
(
    `user_id`     int                                                           NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `nickname`    varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
    `avatar`      varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
    `sex`         int NULL DEFAULT NULL COMMENT '性别（10=男 20=女 ）',
    `email`       varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
    `username`    varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '用户名',
    `password`    varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
    `phone`       varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号码',
    `user_status` int                                                           NOT NULL COMMENT '用户状态（10=正常 20=禁用 30=注销）',
    `user_type`   int                                                           NOT NULL COMMENT '用户类型（10=系统用户 20=添加用户）',
    `create_time` datetime                                                      NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
    `remark`      varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注说明',
    `dept_id`     int NULL DEFAULT NULL COMMENT '部门ID',
    `post_id`     int NULL DEFAULT NULL COMMENT '职位ID',
    PRIMARY KEY (`user_id`) USING BTREE,
    INDEX         `fk_sys_user_sys_user_1`(`dept_id` ASC) USING BTREE,
    INDEX         `fk_sys_user_sys_user_2`(`post_id` ASC) USING BTREE,
    CONSTRAINT `fk_sys_user_sys_user_1` FOREIGN KEY (`dept_id`) REFERENCES `sys_department` (`dept_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT `fk_sys_user_sys_user_2` FOREIGN KEY (`post_id`) REFERENCES `sys_position` (`post_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`
(
    `user_id` int NOT NULL COMMENT '用户ID',
    `role_id` int NOT NULL COMMENT '角色ID',
    INDEX     `fk_sys_user_role_sys_user_role_1`(`user_id` ASC) USING BTREE,
    INDEX     `fk_sys_user_role_sys_user_role_2`(`role_id` ASC) USING BTREE,
    CONSTRAINT `fk_sys_user_role_sys_user_role_1` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
    CONSTRAINT `fk_sys_user_role_sys_user_role_2` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET
FOREIGN_KEY_CHECKS = 1;
