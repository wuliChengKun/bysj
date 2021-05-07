import request from '@/utils/request'

// 查询购物车分片列表
export function listFragment(query) {
  return request({
    url: '/system/fragment/list',
    method: 'get',
    params: query
  })
}

// 查询购物车分片详细
export function getFragment(shoppingcarFragmentId) {
  return request({
    url: '/system/fragment/' + shoppingcarFragmentId,
    method: 'get'
  })
}

// 新增购物车分片
export function addFragment(data) {
  return request({
    url: '/system/fragment',
    method: 'post',
    data: data
  })
}

// 修改购物车分片
export function updateFragment(data) {
  return request({
    url: '/system/fragment',
    method: 'put',
    data: data
  })
}

// 删除购物车分片
export function delFragment(shoppingcarFragmentId) {
  return request({
    url: '/system/fragment/' + shoppingcarFragmentId,
    method: 'delete'
  })
}

// 导出购物车分片
export function exportFragment(query) {
  return request({
    url: '/system/fragment/export',
    method: 'get',
    params: query
  })
}