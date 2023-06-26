create table if not exists sys_authority
(
    auth_id     int auto_increment comment 'ID'
        primary key,
    parent_id   int         null comment '父ID',
    auth_name   varchar(50) not null comment '权限名称',
    auth_code   varchar(50) not null comment '权限代码',
    url         varchar(50) null comment 'url路径',
    create_time datetime    null comment '创建时间',
    update_time datetime    null comment '更新时间',
    constraint auth_id
        unique (auth_id)
);

create table if not exists sys_department
(
    dept_id     int auto_increment comment '主键ID'
        primary key,
    dept_name   varchar(50)           not null comment '部门名称',
    dept_status tinyint(2) default 10 null comment '部门状态（10=启用 20=删除）',
    sort_num    tinyint(2)            null comment '排序顺序',
    create_time datetime              null comment '创建时间',
    update_time datetime              null comment '更新时间'
)
    comment '部门';

create table if not exists sys_login_log
(
    login_id    int auto_increment comment '登录ID'
        primary key,
    user_id     int         null comment '用户ID',
    ip_address  varchar(50) null comment 'IP地址',
    ip_location varchar(50) null comment 'IP归属',
    create_time datetime    null comment '创建时间'
)
    comment '登录日志';

create table if not exists sys_operate_log
(
    opt_id        int auto_increment comment '操作日志ID'
        primary key,
    create_time   datetime    null comment '创建时间',
    module_name   varchar(50) null comment '模块名称',
    opt_type      tinyint(2)  null comment '操作类型（10=新增 20=删除 30=修改 40=查询）',
    user_id       int         null comment '用户ID',
    ip_address    varchar(50) null comment 'IP地址',
    ip_location   varchar(50) null,
    opt_status    tinyint(2)  null comment '操作状态（10=正常 20=失败）',
    request_url   text        null comment '请求地址',
    request_param text        null comment '请求参数',
    response_body text        null comment '响应内容'
)
    comment '操作日志';

create table if not exists sys_position
(
    post_id     int         null comment '职位ID',
    post_code   varchar(50) null comment '岗位编码',
    sort_num    tinyint(2)  null comment '排序号码',
    post_status tinyint(2)  null comment '职位状态',
    create_time datetime    null comment '创建时间',
    update_time datetime    null comment '更新时间',
    remark      varchar(50) null comment '备注说明'
)
    comment '职位';

create table if not exists sys_role
(
    role_id     int auto_increment comment '角色ID'
        primary key,
    role_name   varchar(50) null comment '角色名称',
    role_code   varchar(50) null comment '角色编码',
    role_sort   tinyint(2)  null comment '排序顺序',
    role_status tinyint(2)  null comment '角色状态（10=启用 20=禁用 30=删除）',
    create_time int         null comment '创建时间',
    update_time int         null comment '更新时间',
    remark      varchar(50) null comment '备注信息'
)
    comment '角色';

create table if not exists sys_role_authority
(
    role_id int null comment '角色ID',
    auth_id int null comment '权限ID'
)
    comment '角色权限';

create table if not exists sys_user
(
    user_id     int auto_increment comment '用户ID'
        primary key,
    nickname    varchar(50)  null comment '昵称',
    avatar      text         null comment '头像',
    sex         tinyint(2)   null comment '性别（10=男 20=女 ）',
    email       varchar(50)  null comment '邮箱',
    username    varchar(50)  null comment '用户名',
    password    varchar(500) null comment '密码',
    phone       varchar(20)  null comment '手机号码',
    user_status tinyint(2)   null comment '用户状态（10=正常 20=禁用 30=注销）',
    user_type   tinyint(2)   null comment '用户类型（10=系统用户 20=添加用户）',
    create_time int          null comment '创建时间',
    update_time int          null comment '更新时间',
    dept_id     int          null comment '部门ID',
    post_id     int          null comment '职位ID',
    remark      int          null comment '备注说明'
)
    comment '用户';

create table if not exists sys_user_role
(
    user_id int null comment '用户ID',
    role_id int null comment '角色ID'
)
    comment '用户角色';

