<template>
  <div>
    <el-dialog v-bind="$attrs" v-on="$listeners" @open="onOpen" @close="onClose" title="Dialog Titile">
      <el-row :gutter="15">
        <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">
          <el-col :span="12">
            <el-form-item label="上传" prop="field103" required>
              <el-upload ref="field103" :file-list="field103fileList" :action="field103Action" multiple
                         :before-upload="field103BeforeUpload">
                <el-button size="small" type="primary" icon="el-icon-upload">点击上传</el-button>
              </el-upload>
            </el-form-item>
          </el-col>
        </el-form>
      </el-row>
      <div slot="footer">
        <el-button @click="close">取消</el-button>
        <el-button type="primary" @click="handelConfirm">确定</el-button>
      </div>
    </el-dialog>
  </div>
</template>
<script>
export default {
  name:"fileUpload",
  inheritAttrs: false,
  components: {},
  props: [],
  data() {
    return {
      formData: {
        field103: null,
      },
      rules: {},
      field103Action: 'https://jsonplaceholder.typicode.com/posts/',
      field103fileList: [],
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    onOpen() {},
    onClose() {
      this.$refs['elForm'].resetFields()
    },
    close() {
      this.$emit('update:visible', false)
    },
    handelConfirm() {
      this.$refs['elForm'].validate(valid => {
        if (!valid) return
        this.close()
      })
    },
    field103BeforeUpload(file) {
      let isRightSize = file.size / 1024 / 1024 / 1024 < 2
      if (!isRightSize) {
        this.$message.error('文件大小超过 2GB')
      }
      return isRightSize
    },
  }
}

</script>
<style>
.el-upload__tip {
  line-height: 1.2;
}

</style>
