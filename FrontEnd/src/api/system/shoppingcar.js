import request from '@/utils/request'

// 查询购物车列表
export function listShoppingcar(query) {
  return request({
    url: '/system/shoppingcar/list',
    method: 'get',
    params: query
  })
}

// 查询购物车详细
export function getShoppingcar(shoppingcarId) {
  return request({
    url: '/system/shoppingcar/' + shoppingcarId,
    method: 'get'
  })
}

// 新增购物车
export function addShoppingcar(data) {
  return request({
    url: '/system/shoppingcar',
    method: 'post',
    data: data
  })
}

// 修改购物车
export function updateShoppingcar(data) {
  return request({
    url: '/system/shoppingcar',
    method: 'put',
    data: data
  })
}

// 删除购物车
export function delShoppingcar(shoppingcarId) {
  return request({
    url: '/system/shoppingcar/' + shoppingcarId,
    method: 'delete'
  })
}

// 导出购物车
export function exportShoppingcar(query) {
  return request({
    url: '/system/shoppingcar/export',
    method: 'get',
    params: query
  })
}