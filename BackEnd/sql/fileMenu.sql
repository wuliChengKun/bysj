-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件', '3', '1', 'file', 'system/file/index', 1, 0, 'C', '0', '0', 'system:file:list', '#', 'admin', sysdate(), '', null, '上传文件菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:file:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:file:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:file:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:file:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('上传文件导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:file:export',       '#', 'admin', sysdate(), '', null, '');