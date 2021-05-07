-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件审核', '3', '1', 'filecheck', 'system/filecheck/index', 1, 0, 'C', '0', '0', 'system:filecheck:list', '#', 'admin', sysdate(), '', null, '上传文件审核菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件审核查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:filecheck:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件审核新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:filecheck:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件审核修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:filecheck:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件审核删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:filecheck:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件审核导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:filecheck:export',       '#', 'admin', sysdate(), '', null, '');