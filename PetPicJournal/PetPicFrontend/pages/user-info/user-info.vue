<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","padding":"0px 0 0px","borderColor":"#21d5ae","background":"#fff","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
		<view :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}'>
			<view :style='{"minHeight":"100rpx","padding":"0 20rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","alignItems":"center","borderRadius":"0px","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#369555","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>UserName</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.username" placeholder="UserName"></input>
			</view>
			<view :style='{"minHeight":"100rpx","padding":"0 20rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","alignItems":"center","borderRadius":"0px","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#369555","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>Full Name</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.name" placeholder="Full Name"></input>
			</view>
			<view :style='{"minHeight":"100rpx","padding":"0 20rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","alignItems":"center","borderRadius":"0px","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#369555","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>PassWord</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'  type="password" v-model="ruleForm.password" placeholder="PassWord"></input>
			</view>
			<view v-if="tableName=='yonghu'" :style='{"minHeight":"100rpx","padding":"0 20rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","alignItems":"center","borderRadius":"0px","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"padding":"0 20rpx 0 0","color":"#369555","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}' class="title">Gender</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="yonghusexChange" :value="yonghusexIndex" :range="yonghusexOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input picker-select-input">{{ruleForm.sex?ruleForm.sex:"Please select Gender"}}</view>
				</picker>
			</view>
			<view :style='{"minHeight":"100rpx","padding":"0 20rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","alignItems":"center","borderRadius":"0px","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#369555","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>Phone</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.phone" placeholder="Phone"></input>
			</view>
			<view :style='{"minHeight":"100rpx","padding":"0 20rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","alignItems":"center","borderRadius":"0px","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='yonghu'" @tap="yonghuheadImageTap" class="">
				<view class="title" :style='{"padding":"0 20rpx 0 0","color":"#369555","textAlign":"right","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","fontWeight":"600"}'>Profile Picture</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.headImage" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.headImage" mode=""></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view :style='{"padding":"0px","margin":"48rpx 0 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"center","height":"auto"}' class="btn">
				<button @tap="update()" class="cu-btn lg" :style='{"padding":"0 40rpx","margin":"0 0px 40rpx","borderColor":"#d8f5e3","color":"#333","minWidth":"200rpx","borderRadius":"0px","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(226,247,234,1) 100%)","borderWidth":"2rpx","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'>save</button>
				<button @tap="logout()" class="cu-btn lg" :style='{"padding":"0 40rpx","boxShadow":"0px 0px 0px #ccc","margin":"0 0px 20rpx","borderColor":"#eee","color":"#333","minWidth":"200rpx","borderRadius":"0px","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(238,238,238,1) 100%)","borderWidth":"2rpx","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}'>Login out</button>
			</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				yonghusexOptions: [],
				yonghusexIndex: 0,
			}
		},
        components: {
            multipleSelect
        },
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			if(this.tableName=='yonghu'){
				this.yonghusexOptions = "male,female".split(',');
				this.yonghusexOptions.forEach((item, index) => {
					if(item==this.ruleForm.sex) {
						this.yonghusexIndex = index;
					}
				});
			}
			console.log("yonghusexOptions---------------");
			console.log(this.yonghusexOptions[0]);
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            yonghusexChange(e) {
                    this.yonghusexIndex = e.target.value
                    this.ruleForm.sex = this.yonghusexOptions[this.yonghusexIndex]
            },
			yonghuheadImageTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.headImage = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('. .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// register
			async update() {
				if((!this.ruleForm.username) && `yonghu` == this.tableName){
					this.$utils.msg(`UserName not null`);
					return
				}
				if((!this.ruleForm.name) && `yonghu` == this.tableName){
					this.$utils.msg(`Full Name not null`);
					return
				}
				if((!this.ruleForm.password) && `yonghu` == this.tableName){
					this.$utils.msg(`PassWord not null`);
					return
				}
				if(`yonghu` == this.tableName && this.ruleForm.phone&&(!this.$validate.isMobile(this.ruleForm.phone))){
					this.$utils.msg(`Phone`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('Modify success');;
			},

		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
