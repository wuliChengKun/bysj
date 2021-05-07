import request from '@/utils/request'

// 查询上传文件审核列表
export function listFilecheck(query) {
  return request({
    url: '/system/filecheck/list',
    method: 'get',
    params: query
  })
}

// 查询上传文件审核详细
export function getFilecheck(fileCheckId) {
  return request({
    url: '/system/filecheck/' + fileCheckId,
    method: 'get'
  })
}

// 新增上传文件审核
export function addFilecheck(data) {
  return request({
    url: '/system/filecheck',
    method: 'post',
    data: data
  })
}

// 修改上传文件审核
export function updateFilecheck(data) {
  return request({
    url: '/system/filecheck',
    method: 'put',
    data: data
  })
}

// 删除上传文件审核
export function delFilecheck(fileCheckId) {
  return request({
    url: '/system/filecheck/' + fileCheckId,
    method: 'delete'
  })
}

// 导出上传文件审核
export function exportFilecheck(query) {
  return request({
    url: '/system/filecheck/export',
    method: 'get',
    params: query
  })
}