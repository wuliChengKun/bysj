import request from '@/utils/request'

// 查询遥感案例列表
export function listCase(query) {
  return request({
    url: '/system/case/list',
    method: 'get',
    params: query
  })
}

// 查询遥感案例详细
export function getCase(caseId) {
  return request({
    url: '/system/case/' + caseId,
    method: 'get'
  })
}

// 新增遥感案例
export function addCase(data) {
  return request({
    url: '/system/case',
    method: 'post',
    data: data
  })
}

// 修改遥感案例
export function updateCase(data) {
  return request({
    url: '/system/case',
    method: 'put',
    data: data
  })
}

// 删除遥感案例
export function delCase(caseId) {
  return request({
    url: '/system/case/' + caseId,
    method: 'delete'
  })
}

// 导出遥感案例
export function exportCase(query) {
  return request({
    url: '/system/case/export',
    method: 'get',
    params: query
  })
}