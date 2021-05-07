-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('购物车分片', '3', '1', 'fragment', 'system/fragment/index', 1, 0, 'C', '0', '0', 'system:fragment:list', '#', 'admin', sysdate(), '', null, '购物车分片菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('购物车分片查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:fragment:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('购物车分片新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:fragment:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('购物车分片修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:fragment:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('购物车分片删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:fragment:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('购物车分片导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:fragment:export',       '#', 'admin', sysdate(), '', null, '');