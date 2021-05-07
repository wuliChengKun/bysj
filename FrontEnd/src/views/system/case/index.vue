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
      <el-form-item label="案例Name" prop="caseName">
        <el-input
          v-model="queryParams.caseName"
          placeholder="请输入案例Name"
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
      <el-form-item label="卫星号" prop="statelliteid">
        <el-input
          v-model="queryParams.statelliteid"
          placeholder="请输入卫星号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="传感器号" prop="sensorid">
        <el-input
          v-model="queryParams.sensorid"
          placeholder="请输入传感器号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="成像时间" prop="receivetime">
        <el-input
          v-model="queryParams.receivetime"
          placeholder="请输入成像时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="轨道圈号" prop="orbitid">
        <el-input
          v-model="queryParams.orbitid"
          placeholder="请输入轨道圈号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据生产方式" prop="producetype">
        <el-select v-model="queryParams.producetype" placeholder="请选择数据生产方式" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="景列号" prop="sceneid">
        <el-input
          v-model="queryParams.sceneid"
          placeholder="请输入景列号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品数据ID" prop="productid">
        <el-input
          v-model="queryParams.productid"
          placeholder="请输入产品数据ID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据等级" prop="productlevel">
        <el-input
          v-model="queryParams.productlevel"
          placeholder="请输入数据等级"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品质量" prop="productquality">
        <el-input
          v-model="queryParams.productquality"
          placeholder="请输入产品质量"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品质量报告" prop="productqualityreport">
        <el-input
          v-model="queryParams.productqualityreport"
          placeholder="请输入产品质量报告"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据格式" prop="productformat">
        <el-input
          v-model="queryParams.productformat"
          placeholder="请输入数据格式"
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
      <el-form-item label="波段" prop="bands">
        <el-input
          v-model="queryParams.bands"
          placeholder="请输入波段"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="景path" prop="scenepath">
        <el-input
          v-model="queryParams.scenepath"
          placeholder="请输入景path"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="景row" prop="scenerow">
        <el-input
          v-model="queryParams.scenerow"
          placeholder="请输入景row"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卫星路径" prop="satpath">
        <el-input
          v-model="queryParams.satpath"
          placeholder="请输入卫星路径"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卫星行" prop="satrow">
        <el-input
          v-model="queryParams.satrow"
          placeholder="请输入卫星行"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="条带景数目" prop="scenecount">
        <el-input
          v-model="queryParams.scenecount"
          placeholder="请输入条带景数目"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="景漂移" prop="sceneshift">
        <el-input
          v-model="queryParams.sceneshift"
          placeholder="请输入景漂移"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品开始时间" prop="starttime">
        <el-input
          v-model="queryParams.starttime"
          placeholder="请输入产品开始时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品结束时间" prop="endtime">
        <el-input
          v-model="queryParams.endtime"
          placeholder="请输入产品结束时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品中间时间" prop="centertime">
        <el-input
          v-model="queryParams.centertime"
          placeholder="请输入产品中间时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="产品分辨率" prop="imagegsd">
        <el-input
          v-model="queryParams.imagegsd"
          placeholder="请输入产品分辨率"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="像素宽度" prop="widthinpixels">
        <el-input
          v-model="queryParams.widthinpixels"
          placeholder="请输入像素宽度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="像素高度" prop="heightinpixels">
        <el-input
          v-model="queryParams.heightinpixels"
          placeholder="请输入像素高度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="仪表宽度" prop="widthinmeters">
        <el-input
          v-model="queryParams.widthinmeters"
          placeholder="请输入仪表宽度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="仪表高度" prop="heightinmeters">
        <el-input
          v-model="queryParams.heightinmeters"
          placeholder="请输入仪表高度"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="云覆盖量" prop="cloudpercent">
        <el-input
          v-model="queryParams.cloudpercent"
          placeholder="请输入云覆盖量"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="质量信息" prop="qualityinfo">
        <el-input
          v-model="queryParams.qualityinfo"
          placeholder="请输入质量信息"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="像素位" prop="pixelbits">
        <el-input
          v-model="queryParams.pixelbits"
          placeholder="请输入像素位"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="有效像素位" prop="validpixelbits">
        <el-input
          v-model="queryParams.validpixelbits"
          placeholder="请输入有效像素位"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="相机侧视角" prop="rollviewingangle">
        <el-input
          v-model="queryParams.rollviewingangle"
          placeholder="请输入相机侧视角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="相机前后视角" prop="pitchviewingangle">
        <el-input
          v-model="queryParams.pitchviewingangle"
          placeholder="请输入相机前后视角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卫星平台滚动角" prop="rollsatelliteangle">
        <el-input
          v-model="queryParams.rollsatelliteangle"
          placeholder="请输入卫星平台滚动角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卫星平台平均俯视角" prop="pitchsatelliteangle">
        <el-input
          v-model="queryParams.pitchsatelliteangle"
          placeholder="请输入卫星平台平均俯视角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卫星平台平均航偏角" prop="yawsatelliteangle">
        <el-input
          v-model="queryParams.yawsatelliteangle"
          placeholder="请输入卫星平台平均航偏角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="太阳方位角" prop="solarazimuth">
        <el-input
          v-model="queryParams.solarazimuth"
          placeholder="请输入太阳方位角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="太阳高度角" prop="solarzenith">
        <el-input
          v-model="queryParams.solarzenith"
          placeholder="请输入太阳高度角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卫星方位角" prop="satelliteazimuth">
        <el-input
          v-model="queryParams.satelliteazimuth"
          placeholder="请输入卫星方位角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卫星高度角" prop="satellitezenith">
        <el-input
          v-model="queryParams.satellitezenith"
          placeholder="请输入卫星高度角"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="增益模式" prop="gainmode">
        <el-input
          v-model="queryParams.gainmode"
          placeholder="请输入增益模式"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="积分时间" prop="integrationtime">
        <el-input
          v-model="queryParams.integrationtime"
          placeholder="请输入积分时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="积分级数" prop="integrationlevel">
        <el-input
          v-model="queryParams.integrationlevel"
          placeholder="请输入积分级数"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="地球椭圆" prop="earthellipsoid">
        <el-input
          v-model="queryParams.earthellipsoid"
          placeholder="请输入地球椭圆"
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
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-goods"
          size="mini"
          :disabled="multiple"
          @click="handleAddShoppingcar"
          v-hasPermi="['system:fragment:addshoppingcar']"
        >加入购物车</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="caseList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="案例ID" align="center" prop="caseId" />-->
<!--      <el-table-column label="分类ID" align="center" prop="groupId" />-->
      <el-table-column label="案例名称" align="center" prop="caseName" />
      <el-table-column label="案例价格（万元）" align="center" prop="casePrice" />
      <el-table-column label="案例拇指图" align="center" prop="caseThumb">
          <img src=prop prop = "caseThumb">
      </el-table-column>
      <el-table-column label="卫星号" align="center" prop="statelliteid" />
<!--      <el-table-column label="传感器号" align="center" prop="sensorid" />
      <el-table-column label="成像时间" align="center" prop="receivetime" />
      <el-table-column label="轨道圈号" align="center" prop="orbitid" />
      <el-table-column label="数据生产方式" align="center" prop="producetype" />
      <el-table-column label="景列号" align="center" prop="sceneid" />
      <el-table-column label="产品数据ID" align="center" prop="productid" />
      <el-table-column label="数据等级" align="center" prop="productlevel" />
      <el-table-column label="产品质量" align="center" prop="productquality" />
      <el-table-column label="产品质量报告" align="center" prop="productqualityreport" />
      <el-table-column label="数据格式" align="center" prop="productformat" />
      <el-table-column label="生产时间" align="center" prop="producetime" />
      <el-table-column label="波段" align="center" prop="bands" />
      <el-table-column label="景path" align="center" prop="scenepath" />
      <el-table-column label="景row" align="center" prop="scenerow" />
      <el-table-column label="卫星路径" align="center" prop="satpath" />
      <el-table-column label="卫星行" align="center" prop="satrow" />
      <el-table-column label="条带景数目" align="center" prop="scenecount" />
      <el-table-column label="景漂移" align="center" prop="sceneshift" />
      <el-table-column label="产品开始时间" align="center" prop="starttime" />
      <el-table-column label="产品结束时间" align="center" prop="endtime" />
      <el-table-column label="产品中间时间" align="center" prop="centertime" />
      <el-table-column label="产品分辨率" align="center" prop="imagegsd" />
      <el-table-column label="像素宽度" align="center" prop="widthinpixels" />
      <el-table-column label="像素高度" align="center" prop="heightinpixels" />
      <el-table-column label="仪表宽度" align="center" prop="widthinmeters" />
      <el-table-column label="仪表高度" align="center" prop="heightinmeters" />
      <el-table-column label="云覆盖量" align="center" prop="cloudpercent" />
      <el-table-column label="质量信息" align="center" prop="qualityinfo" />
      <el-table-column label="像素位" align="center" prop="pixelbits" />
      <el-table-column label="有效像素位" align="center" prop="validpixelbits" />
      <el-table-column label="相机侧视角" align="center" prop="rollviewingangle" />
      <el-table-column label="相机前后视角" align="center" prop="pitchviewingangle" />
      <el-table-column label="卫星平台滚动角" align="center" prop="rollsatelliteangle" />
      <el-table-column label="卫星平台平均俯视角" align="center" prop="pitchsatelliteangle" />
      <el-table-column label="卫星平台平均航偏角" align="center" prop="yawsatelliteangle" />
      <el-table-column label="太阳方位角" align="center" prop="solarazimuth" />
      <el-table-column label="太阳高度角" align="center" prop="solarzenith" />
      <el-table-column label="卫星方位角" align="center" prop="satelliteazimuth" />
      <el-table-column label="卫星高度角" align="center" prop="satellitezenith" />
      <el-table-column label="增益模式" align="center" prop="gainmode" />
      <el-table-column label="积分时间" align="center" prop="integrationtime" />
      <el-table-column label="积分级数" align="center" prop="integrationlevel" />
      <el-table-column label="地球椭圆" align="center" prop="earthellipsoid" />
      <el-table-column label="左上纬度" align="center" prop="topleftlatitude" />
      <el-table-column label="左上经度" align="center" prop="topleftlongitude" />
      <el-table-column label="右上纬度" align="center" prop="toprightlatitude" />
      <el-table-column label="右上经度" align="center" prop="toprightlongitude" />
      <el-table-column label="右下纬度" align="center" prop="bottomrightlatitude" />
      <el-table-column label="右下经度" align="center" prop="bottomrightlongitude" />
      <el-table-column label="左下纬度" align="center" prop="bottomleftlatitude" />
      <el-table-column label="左下经度" align="center" prop="bottomleftlongitude" />-->
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-more"
            @click="handleDetail(scope.row)"
            v-hasPermi="['system:case:detail']"
          >详细</el-button>
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
        <el-form-item label="案例Name" prop="caseName">
          <el-input v-model="form.caseName" placeholder="请输入案例Name" />
        </el-form-item>
        <el-form-item label="案例Price" prop="casePrice">
          <el-input v-model="form.casePrice" placeholder="请输入案例Price" />
        </el-form-item>
        <el-form-item label="案例拇指图" prop="caseThumb">
          <el-input v-model="form.caseThumb" placeholder="请输入案例拇指图" />
        </el-form-item>
        <el-form-item label="卫星号" prop="statelliteid">
          <el-input v-model="form.statelliteid" placeholder="请输入卫星号" />
        </el-form-item>
        <el-form-item label="传感器号" prop="sensorid">
          <el-input v-model="form.sensorid" placeholder="请输入传感器号" />
        </el-form-item>
        <el-form-item label="成像时间" prop="receivetime">
          <el-input v-model="form.receivetime" placeholder="请输入成像时间" />
        </el-form-item>
        <el-form-item label="轨道圈号" prop="orbitid">
          <el-input v-model="form.orbitid" placeholder="请输入轨道圈号" />
        </el-form-item>
        <el-form-item label="数据生产方式" prop="producetype">
          <el-select v-model="form.producetype" placeholder="请选择数据生产方式">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="景列号" prop="sceneid">
          <el-input v-model="form.sceneid" placeholder="请输入景列号" />
        </el-form-item>
        <el-form-item label="产品数据ID" prop="productid">
          <el-input v-model="form.productid" placeholder="请输入产品数据ID" />
        </el-form-item>
        <el-form-item label="数据等级" prop="productlevel">
          <el-input v-model="form.productlevel" placeholder="请输入数据等级" />
        </el-form-item>
        <el-form-item label="产品质量" prop="productquality">
          <el-input v-model="form.productquality" placeholder="请输入产品质量" />
        </el-form-item>
        <el-form-item label="产品质量报告" prop="productqualityreport">
          <el-input v-model="form.productqualityreport" placeholder="请输入产品质量报告" />
        </el-form-item>
        <el-form-item label="数据格式" prop="productformat">
          <el-input v-model="form.productformat" placeholder="请输入数据格式" />
        </el-form-item>
        <el-form-item label="生产时间" prop="producetime">
          <el-input v-model="form.producetime" placeholder="请输入生产时间" />
        </el-form-item>
        <el-form-item label="波段" prop="bands">
          <el-input v-model="form.bands" placeholder="请输入波段" />
        </el-form-item>
        <el-form-item label="景path" prop="scenepath">
          <el-input v-model="form.scenepath" placeholder="请输入景path" />
        </el-form-item>
        <el-form-item label="景row" prop="scenerow">
          <el-input v-model="form.scenerow" placeholder="请输入景row" />
        </el-form-item>
        <el-form-item label="卫星路径" prop="satpath">
          <el-input v-model="form.satpath" placeholder="请输入卫星路径" />
        </el-form-item>
        <el-form-item label="卫星行" prop="satrow">
          <el-input v-model="form.satrow" placeholder="请输入卫星行" />
        </el-form-item>
        <el-form-item label="条带景数目" prop="scenecount">
          <el-input v-model="form.scenecount" placeholder="请输入条带景数目" />
        </el-form-item>
        <el-form-item label="景漂移" prop="sceneshift">
          <el-input v-model="form.sceneshift" placeholder="请输入景漂移" />
        </el-form-item>
        <el-form-item label="产品开始时间" prop="starttime">
          <el-input v-model="form.starttime" placeholder="请输入产品开始时间" />
        </el-form-item>
        <el-form-item label="产品结束时间" prop="endtime">
          <el-input v-model="form.endtime" placeholder="请输入产品结束时间" />
        </el-form-item>
        <el-form-item label="产品中间时间" prop="centertime">
          <el-input v-model="form.centertime" placeholder="请输入产品中间时间" />
        </el-form-item>
        <el-form-item label="产品分辨率" prop="imagegsd">
          <el-input v-model="form.imagegsd" placeholder="请输入产品分辨率" />
        </el-form-item>
        <el-form-item label="像素宽度" prop="widthinpixels">
          <el-input v-model="form.widthinpixels" placeholder="请输入像素宽度" />
        </el-form-item>
        <el-form-item label="像素高度" prop="heightinpixels">
          <el-input v-model="form.heightinpixels" placeholder="请输入像素高度" />
        </el-form-item>
        <el-form-item label="仪表宽度" prop="widthinmeters">
          <el-input v-model="form.widthinmeters" placeholder="请输入仪表宽度" />
        </el-form-item>
        <el-form-item label="仪表高度" prop="heightinmeters">
          <el-input v-model="form.heightinmeters" placeholder="请输入仪表高度" />
        </el-form-item>
        <el-form-item label="云覆盖量" prop="cloudpercent">
          <el-input v-model="form.cloudpercent" placeholder="请输入云覆盖量" />
        </el-form-item>
        <el-form-item label="质量信息" prop="qualityinfo">
          <el-input v-model="form.qualityinfo" placeholder="请输入质量信息" />
        </el-form-item>
        <el-form-item label="像素位" prop="pixelbits">
          <el-input v-model="form.pixelbits" placeholder="请输入像素位" />
        </el-form-item>
        <el-form-item label="有效像素位" prop="validpixelbits">
          <el-input v-model="form.validpixelbits" placeholder="请输入有效像素位" />
        </el-form-item>
        <el-form-item label="相机侧视角" prop="rollviewingangle">
          <el-input v-model="form.rollviewingangle" placeholder="请输入相机侧视角" />
        </el-form-item>
        <el-form-item label="相机前后视角" prop="pitchviewingangle">
          <el-input v-model="form.pitchviewingangle" placeholder="请输入相机前后视角" />
        </el-form-item>
        <el-form-item label="卫星平台滚动角" prop="rollsatelliteangle">
          <el-input v-model="form.rollsatelliteangle" placeholder="请输入卫星平台滚动角" />
        </el-form-item>
        <el-form-item label="卫星平台平均俯视角" prop="pitchsatelliteangle">
          <el-input v-model="form.pitchsatelliteangle" placeholder="请输入卫星平台平均俯视角" />
        </el-form-item>
        <el-form-item label="卫星平台平均航偏角" prop="yawsatelliteangle">
          <el-input v-model="form.yawsatelliteangle" placeholder="请输入卫星平台平均航偏角" />
        </el-form-item>
        <el-form-item label="太阳方位角" prop="solarazimuth">
          <el-input v-model="form.solarazimuth" placeholder="请输入太阳方位角" />
        </el-form-item>
        <el-form-item label="太阳高度角" prop="solarzenith">
          <el-input v-model="form.solarzenith" placeholder="请输入太阳高度角" />
        </el-form-item>
        <el-form-item label="卫星方位角" prop="satelliteazimuth">
          <el-input v-model="form.satelliteazimuth" placeholder="请输入卫星方位角" />
        </el-form-item>
        <el-form-item label="卫星高度角" prop="satellitezenith">
          <el-input v-model="form.satellitezenith" placeholder="请输入卫星高度角" />
        </el-form-item>
        <el-form-item label="增益模式" prop="gainmode">
          <el-input v-model="form.gainmode" placeholder="请输入增益模式" />
        </el-form-item>
        <el-form-item label="积分时间" prop="integrationtime">
          <el-input v-model="form.integrationtime" placeholder="请输入积分时间" />
        </el-form-item>
        <el-form-item label="积分级数" prop="integrationlevel">
          <el-input v-model="form.integrationlevel" placeholder="请输入积分级数" />
        </el-form-item>
        <el-form-item label="地球椭圆" prop="earthellipsoid">
          <el-input v-model="form.earthellipsoid" placeholder="请输入地球椭圆" />
        </el-form-item>
        <el-form-item label="左上纬度" prop="topleftlatitude">
          <el-input v-model="form.topleftlatitude" placeholder="请输入左上纬度" />
        </el-form-item>
        <el-form-item label="左上经度" prop="topleftlongitude">
          <el-input v-model="form.topleftlongitude" placeholder="请输入左上经度" />
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
        <el-form-item label="左下纬度" prop="bottomleftlatitude">
          <el-input v-model="form.bottomleftlatitude" placeholder="请输入左下纬度" />
        </el-form-item>
        <el-form-item label="左下经度" prop="bottomleftlongitude">
          <el-input v-model="form.bottomleftlongitude" placeholder="请输入左下经度" />
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
import { listCase, getCase, delCase, addCase, updateCase, exportCase, addShoppingcar1} from "@/api/system/case";

export default {
  name: "Case",
  components: {
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
        caseName: null,
        casePrice: null,
        caseThumb: null,
        statelliteid: null,
        sensorid: null,
        receivetime: null,
        orbitid: null,
        producetype: null,
        sceneid: null,
        productid: null,
        productlevel: null,
        productquality: null,
        productqualityreport: null,
        productformat: null,
        producetime: null,
        bands: null,
        scenepath: null,
        scenerow: null,
        satpath: null,
        satrow: null,
        scenecount: null,
        sceneshift: null,
        starttime: null,
        endtime: null,
        centertime: null,
        imagegsd: null,
        widthinpixels: null,
        heightinpixels: null,
        widthinmeters: null,
        heightinmeters: null,
        cloudpercent: null,
        qualityinfo: null,
        pixelbits: null,
        validpixelbits: null,
        rollviewingangle: null,
        pitchviewingangle: null,
        rollsatelliteangle: null,
        pitchsatelliteangle: null,
        yawsatelliteangle: null,
        solarazimuth: null,
        solarzenith: null,
        satelliteazimuth: null,
        satellitezenith: null,
        gainmode: null,
        integrationtime: null,
        integrationlevel: null,
        earthellipsoid: null,
        topleftlatitude: null,
        topleftlongitude: null,
        toprightlatitude: null,
        toprightlongitude: null,
        bottomrightlatitude: null,
        bottomrightlongitude: null,
        bottomleftlatitude: null,
        bottomleftlongitude: null
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
        caseName: null,
        casePrice: null,
        caseThumb: null,
        statelliteid: null,
        sensorid: null,
        receivetime: null,
        orbitid: null,
        producetype: null,
        sceneid: null,
        productid: null,
        productlevel: null,
        productquality: null,
        productqualityreport: null,
        productformat: null,
        producetime: null,
        bands: null,
        scenepath: null,
        scenerow: null,
        satpath: null,
        satrow: null,
        scenecount: null,
        sceneshift: null,
        starttime: null,
        endtime: null,
        centertime: null,
        imagegsd: null,
        widthinpixels: null,
        heightinpixels: null,
        widthinmeters: null,
        heightinmeters: null,
        cloudpercent: null,
        qualityinfo: null,
        pixelbits: null,
        validpixelbits: null,
        rollviewingangle: null,
        pitchviewingangle: null,
        rollsatelliteangle: null,
        pitchsatelliteangle: null,
        yawsatelliteangle: null,
        solarazimuth: null,
        solarzenith: null,
        satelliteazimuth: null,
        satellitezenith: null,
        gainmode: null,
        integrationtime: null,
        integrationlevel: null,
        earthellipsoid: null,
        topleftlatitude: null,
        topleftlongitude: null,
        toprightlatitude: null,
        toprightlongitude: null,
        bottomrightlatitude: null,
        bottomrightlongitude: null,
        bottomleftlatitude: null,
        bottomleftlongitude: null
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
    /** 详细按钮操作 */
    handleDetail(row) {
      this.reset();
      const caseId = row.caseId || this.ids
      getCase(caseId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "查看遥感案例详细";
      });
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
    },
    /** 加入购物车按钮操作 */
    handleAddShoppingcar(row) {
      const caseIds = row.caseId || this.ids;
      return addShoppingcar1(caseIds);
    }
  }
};
</script>
