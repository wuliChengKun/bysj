<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="分类ID" prop="groupId">
        <el-input
          v-model="queryParams.groupId"
          placeholder="请输入分类ID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="案例Price" prop="casePrice">
        <el-input
          v-model="queryParams.casePrice"
          placeholder="请输入案例Price"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="案例拇指图" prop="caseThumb">
        <el-input
          v-model="queryParams.caseThumb"
          placeholder="请输入案例拇指图"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="生产时间" prop="producetime">
        <el-input
          v-model="queryParams.producetime"
          placeholder="请输入生产时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地域" prop="area">
        <el-input
          v-model="queryParams.area"
          placeholder="请输入地域"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部门" prop="department">
        <el-input
          v-model="queryParams.department"
          placeholder="请输入部门"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据名称" prop="dataname">
        <el-input
          v-model="queryParams.dataname"
          placeholder="请输入数据名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据格式" prop="dataformat">
        <el-input
          v-model="queryParams.dataformat"
          placeholder="请输入数据格式"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="描述" prop="description">
        <el-input
          v-model="queryParams.description"
          placeholder="请输入描述"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="解析度" prop="resolution">
        <el-input
          v-model="queryParams.resolution"
          placeholder="请输入解析度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="左上纬度" prop="topleftlatitude">
        <el-input
          v-model="queryParams.topleftlatitude"
          placeholder="请输入左上纬度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="左上经度" prop="topleftlongitude">
        <el-input
          v-model="queryParams.topleftlongitude"
          placeholder="请输入左上经度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="左下纬度" prop="bottomleftlatitude">
        <el-input
          v-model="queryParams.bottomleftlatitude"
          placeholder="请输入左下纬度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="左下经度" prop="bottomleftlongitude">
        <el-input
          v-model="queryParams.bottomleftlongitude"
          placeholder="请输入左下经度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="右上纬度" prop="toprightlatitude">
        <el-input
          v-model="queryParams.toprightlatitude"
          placeholder="请输入右上纬度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="右上经度" prop="toprightlongitude">
        <el-input
          v-model="queryParams.toprightlongitude"
          placeholder="请输入右上经度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="右下纬度" prop="bottomrightlatitude">
        <el-input
          v-model="queryParams.bottomrightlatitude"
          placeholder="请输入右下纬度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="右下经度" prop="bottomrightlongitude">
        <el-input
          v-model="queryParams.bottomrightlongitude"
          placeholder="请输入右下经度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="中心纬度" prop="centerlatitude">
        <el-input
          v-model="queryParams.centerlatitude"
          placeholder="请输入中心纬度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="中心经度" prop="centerlongitude">
        <el-input
          v-model="queryParams.centerlongitude"
          placeholder="请输入中心经度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:case:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:case:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:case:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:case:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="caseList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="案例ID" align="center" prop="caseId" />
      <el-table-column label="分类ID" align="center" prop="groupId" />
      <el-table-column label="案例Price" align="center" prop="casePrice" />
      <el-table-column label="案例拇指图" align="center">
        <template slot-scope="scope">
          <img :src="scope.row.caseThumb" width="60" height="45" alt="这是图片">
        </template>
      </el-table-column>
      <el-table-column label="生产时间" align="center" prop="producetime" />
      <el-table-column label="有文件" align="center" prop="havefile" />
      <el-table-column label="地域" align="center" prop="area" />
      <el-table-column label="部门" align="center" prop="department" />
      <el-table-column label="数据名称" align="center" prop="dataname" />
      <el-table-column label="数据格式" align="center" prop="dataformat" />
      <el-table-column label="描述" align="center" prop="description" />
<!--      <el-table-column label="解析度" align="center" prop="resolution" />
      <el-table-column label="左上纬度" align="center" prop="topleftlatitude" />
      <el-table-column label="左上经度" align="center" prop="topleftlongitude" />
      <el-table-column label="左下纬度" align="center" prop="bottomleftlatitude" />
      <el-table-column label="左下经度" align="center" prop="bottomleftlongitude" />
      <el-table-column label="右上纬度" align="center" prop="toprightlatitude" />
      <el-table-column label="右上经度" align="center" prop="toprightlongitude" />
      <el-table-column label="右下纬度" align="center" prop="bottomrightlatitude" />
      <el-table-column label="右下经度" align="center" prop="bottomrightlongitude" />
      <el-table-column label="中心纬度" align="center" prop="centerlatitude" />
      <el-table-column label="中心经度" align="center" prop="centerlongitude" />-->
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:case:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:case:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改遥感案例对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="分类ID" prop="groupId">
          <el-input v-model="form.groupId" placeholder="请输入分类ID" />
        </el-form-item>
        <el-form-item label="案例Price" prop="casePrice">
          <el-input v-model="form.casePrice" placeholder="请输入案例Price" />
        </el-form-item>
        <el-form-item label="案例拇指图" prop="caseThumb">
          <el-input v-model="form.caseThumb" placeholder="请输入案例拇指图" />
        </el-form-item>
        <el-form-item label="生产时间" prop="producetime">
          <el-input v-model="form.producetime" placeholder="请输入生产时间" />
        </el-form-item>
        <el-form-item label="有文件">
          <el-input v-model="form.havefile" placeholder="请输入是否有文件ture/false"/>
        </el-form-item>
        <el-form-item label="地域" prop="area">
          <el-input v-model="form.area" placeholder="请输入地域" />
        </el-form-item>
        <el-form-item label="部门" prop="department">
          <el-input v-model="form.department" placeholder="请输入部门" />
        </el-form-item>
        <el-form-item label="数据名称" prop="dataname">
          <el-input v-model="form.dataname" placeholder="请输入数据名称" />
        </el-form-item>
        <el-form-item label="数据格式" prop="dataformat">
          <el-input v-model="form.dataformat" placeholder="请输入数据格式" />
        </el-form-item>
        <el-form-item label="描述" prop="description">
          <el-input v-model="form.description" placeholder="请输入描述" />
        </el-form-item>
        <el-form-item label="解析度" prop="resolution">
          <el-input v-model="form.resolution" placeholder="请输入解析度" />
        </el-form-item>
        <el-form-item label="左上纬度" prop="topleftlatitude">
          <el-input v-model="form.topleftlatitude" placeholder="请输入左上纬度" />
        </el-form-item>
        <el-form-item label="左上经度" prop="topleftlongitude">
          <el-input v-model="form.topleftlongitude" placeholder="请输入左上经度" />
        </el-form-item>
        <el-form-item label="左下纬度" prop="bottomleftlatitude">
          <el-input v-model="form.bottomleftlatitude" placeholder="请输入左下纬度" />
        </el-form-item>
        <el-form-item label="左下经度" prop="bottomleftlongitude">
          <el-input v-model="form.bottomleftlongitude" placeholder="请输入左下经度" />
        </el-form-item>
        <el-form-item label="右上纬度" prop="toprightlatitude">
          <el-input v-model="form.toprightlatitude" placeholder="请输入右上纬度" />
        </el-form-item>
        <el-form-item label="右上经度" prop="toprightlongitude">
          <el-input v-model="form.toprightlongitude" placeholder="请输入右上经度" />
        </el-form-item>
        <el-form-item label="右下纬度" prop="bottomrightlatitude">
          <el-input v-model="form.bottomrightlatitude" placeholder="请输入右下纬度" />
        </el-form-item>
        <el-form-item label="右下经度" prop="bottomrightlongitude">
          <el-input v-model="form.bottomrightlongitude" placeholder="请输入右下经度" />
        </el-form-item>
        <el-form-item label="中心纬度" prop="centerlatitude">
          <el-input v-model="form.centerlatitude" placeholder="请输入中心纬度" />
        </el-form-item>
        <el-form-item label="中心经度" prop="centerlongitude">
          <el-input v-model="form.centerlongitude" placeholder="请输入中心经度" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listCase, getCase, delCase, addCase, updateCase, exportCase } from "@/api/system/case";
import FileUpload from '@/components/FileUpload';

export default {
  name: "Case",
  components: {
    FileUpload,
  },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: false,
      // 总条数
      total: 0,
      // 遥感案例表格数据
      caseList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        groupId: null,
        casePrice: null,
        caseThumb: null,
        producetime: null,
        havefile: null,
        area: null,
        department: null,
        dataname: null,
        dataformat: null,
        description: null,
        resolution: null,
        topleftlatitude: null,
        topleftlongitude: null,
        bottomleftlatitude: null,
        bottomleftlongitude: null,
        toprightlatitude: null,
        toprightlongitude: null,
        bottomrightlatitude: null,
        bottomrightlongitude: null,
        centerlatitude: null,
        centerlongitude: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询遥感案例列表 */
    getList() {
      this.loading = true;
      listCase(this.queryParams).then(response => {
        this.caseList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        caseId: null,
        groupId: null,
        casePrice: null,
        caseThumb: null,
        producetime: null,
        havefile: null,
        area: null,
        department: null,
        dataname: null,
        dataformat: null,
        description: null,
        resolution: null,
        topleftlatitude: null,
        topleftlongitude: null,
        bottomleftlatitude: null,
        bottomleftlongitude: null,
        toprightlatitude: null,
        toprightlongitude: null,
        bottomrightlatitude: null,
        bottomrightlongitude: null,
        centerlatitude: null,
        centerlongitude: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.caseId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加遥感案例";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const caseId = row.caseId || this.ids
      getCase(caseId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改遥感案例";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.caseId != null) {
            updateCase(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addCase(this.form).then(response => {
              this.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const caseIds = row.caseId || this.ids;
      this.$confirm('是否确认删除遥感案例编号为"' + caseIds + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delCase(caseIds);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      const queryParams = this.queryParams;
      this.$confirm('是否确认导出所有遥感案例数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return exportCase(queryParams);
        }).then(response => {
          this.download(response.msg);
        })
    }
  }
};
</script>
