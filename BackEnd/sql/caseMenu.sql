-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('遥感案例', '3', '1', 'case', 'system/case/index', 1, 0, 'C', '0', '0', 'system:case:list', '#', 'admin', sysdate(), '', null, '遥感案例菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('遥感案例查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:case:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('遥感案例新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:case:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('遥感案例修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:case:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('遥感案例删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:case:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('遥感案例导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:case:export',       '#', 'admin', sysdate(), '', null, '');