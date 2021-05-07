import request from '@/utils/request'

// 查询订单审核列表
export function listCheck(query) {
  return request({
    url: '/system/check/list',
    method: 'get',
    params: query
  })
}

// 查询订单审核详细
export function getCheck(orderCheckId) {
  return request({
    url: '/system/check/' + orderCheckId,
    method: 'get'
  })
}

// 新增订单审核
export function addCheck(data) {
  return request({
    url: '/system/check',
    method: 'post',
    data: data
  })
}

// 修改订单审核
export function updateCheck(data) {
  return request({
    url: '/system/check',
    method: 'put',
    data: data
  })
}

// 删除订单审核
export function delCheck(orderCheckId) {
  return request({
    url: '/system/check/' + orderCheckId,
    method: 'delete'
  })
}

// 导出订单审核
export function exportCheck(query) {
  return request({
    url: '/system/check/export',
    method: 'get',
    params: query
  })
}