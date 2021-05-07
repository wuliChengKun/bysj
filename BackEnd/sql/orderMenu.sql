-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单', '3', '1', 'order', 'system/order/index', 1, 0, 'C', '0', '0', 'system:order:list', '#', 'admin', sysdate(), '', null, '订单菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:order:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:order:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:order:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:order:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:order:export',       '#', 'admin', sysdate(), '', null, '');