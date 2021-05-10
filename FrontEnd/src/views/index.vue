<template>
  <div class="app-container home">
    <el-row :gutter="20">
    </el-row>
    <div class="block">
      <span class="demonstration"></span>
      <el-carousel height="300px">
        <el-carousel-item>
          <h3 class="small">
            <img src="../assets/images/img1.png"/>
          </h3>
        </el-carousel-item>
        <el-carousel-item>
          <h3 class="small">
            <img src="../assets/images/img2.png"/>
          </h3>
        </el-carousel-item>
        <el-carousel-item>
          <h3 class="small">
            <img src="../assets/images/img3.png"/>
          </h3>
        </el-carousel-item>
      </el-carousel>
    </div>
  </div>
</template>

<script>
export default {
  name: "index",
  data() {
    return {
      // 版本号
      version: "3.4.0",
    };
  },
  methods: {

  }
};
</script>

<style scoped lang="scss">
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 150px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #99a9bf;
}

.el-carousel__item:nth-child(2n+1) {
  background-color: #d3dce6;
}
</style>

