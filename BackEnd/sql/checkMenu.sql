-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单审核', '3', '1', 'check', 'system/check/index', 1, 0, 'C', '0', '0', 'system:check:list', '#', 'admin', sysdate(), '', null, '订单审核菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单审核查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:check:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单审核新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:check:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单审核修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:check:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单审核删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:check:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单审核导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:check:export',       '#', 'admin', sysdate(), '', null, '');