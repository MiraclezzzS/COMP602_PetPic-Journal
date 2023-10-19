<template>
	<view class="content">
		<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"120rpx 40rpx 80rpx","background":"url(http://localhost:8080/ssm85bqd1pj/admin/dist/img/login.png) no-repeat center top / 100% 100%","height":"100%"}'>
			<view :style='{"padding":"40rpx 80rpx","boxShadow":"0px 0px 0px #aaa","borderColor":"#f0bebb","borderRadius":"40rpx","background":"none","borderWidth":"0px","display":"block","width":"100%","borderStyle":"solid","height":"auto","marginTop":"40%"}'>
				<image :style='{"margin":"0 auto","borderRadius":"8rpx","objectFit":"cover","top":"-320rpx","left":"0","display":"none","width":"100%","position":"absolute","opacity":".3","height":"auto"}' src="http://codegen.caihongy.cn/20221223/15e44917f9454ced9a9ebc4b2d40acc4.gif" mode="aspectFill"></image>
				<view v-if="loginType==1" :style='{"width":"100%","margin":"0 0 20rpx","borderRadius":"12rpx","background":"none","height":"auto"}' class="uni-form-item uni-column">
					<u--input v-model="username" shape='circle'  placeholder="Please enter an account" color='black'></u--input>
				</view>
				<view v-if="loginType==1" :style='{"width":"100%","margin":"0 0 20rpx","borderRadius":"12rpx","background":"none","height":"auto"}' class="uni-form-item uni-column">
					<u--input v-model="password" shape='circle' type="password" color='black' placeholder="Please enter the password" />
				</view>
				<picker v-if="roleNum>1" :style='{"boxShadow":"0px 0px 0px #2c77cb","margin":"0 0 32rpx 0","borderColor":"#b5eacb","borderRadius":"0px","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"auto"}' @change="optionsChange" :value="index" :range="options">
					<view class="uni-picker-type" :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#767676"}'>{{options[index]}}</view>
				</picker>
				<u-button v-if="loginType==1" class="btn-submit" color='#FFC300' @tap="onLoginTap" type="primary" >Login</u-button>
				<u-button v-if="loginType==2" class="btn-submit" @tap="onFaceLoginTap" type="primary">Face recognition login</u-button>
								<view class="links" :style='{"boxShadow":"0px 0px 0px #eee","padding":"0","margin":"40rpx 0 0","borderRadius":"0px","alignItems":"flex-start","flexWrap":"wrap","textAlign":"center","background":"none","display":"block","width":"100%","justifyContent":"center","height":"auto"}'>
					<view class="link-highlight" @tap="onRegisterTap('yonghu')" :style='{"border":"2rpx solid #ddd","padding":"20rpx","margin":"0px 20rpx 20rpx 0","color":"#333","borderRadius":"2px","textAlign":"center","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(238,238,238,1) 100%)","display":"inline-block","width":"100%","fontSize":"28rpx","order":"2"}'>registerUser</view>
				</view>
				<view class="links" :style='{"boxShadow":"0px 0px 0px #eee","padding":"0","margin":"40rpx 0 0","borderRadius":"0px","alignItems":"flex-start","flexWrap":"wrap","textAlign":"center","background":"none","display":"block","width":"100%","justifyContent":"center","height":"auto"}'>
					<u-button v-if="loginType==1" class="btn-submit" color='#aaa' @tap="onVisitorLoginTap" type="primary" >visitor Login</u-button>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				username: '',
				password: '',
                loginType:1,
				codes: [{
				  num: 1,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}, {
				  num: 2,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}, {
				  num: 3,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}, {
				  num: 4,
				  color: '#000',
				  rotate: '10deg',
				  size: '16px'
				}],
				options: [
					'Please select the login user type',
				],
                optionsValues: [
					'',
                    'yonghu',
				],
				index: 0,
				roleNum:0,
			}
		},
		onLoad() {
			let options = ['Please select the login user type'];
			let menus = menu.list();
			this.menuList = menus;
			for(let i=0;i<this.menuList.length;i++){
				if(this.menuList[i].hasFrontLogin=='是'){
					options.push(this.menuList[i].roleName);
					this.roleNum++;
				}
			}
			if(this.roleNum==1) {
				this.index = 1;
			}	
			this.options = options;
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.loginFrom.content.input.backgroundColor
					// })
				})
			},
			onRegisterTap(tableName) {
                uni.setStorageSync("loginTable", tableName);
				this.$utils.jump('../register/register')
			},
			async onVisitorLoginTap() {
                
				let res = await this.$api.login(`${this.optionsValues[this.index]}`, {
					username: 'visitor',
					password: '123456'
				});
                uni.removeStorageSync("useridTag");
				uni.setStorageSync("token", res.token);
				uni.setStorageSync("nickname",this.username);
				uni.setStorageSync("nowTable", `${this.optionsValues[this.index]}`);
				res = await this.$api.session(`${this.optionsValues[this.index]}`);
                if(res.data.headImage) {
                    uni.setStorageSync('headportrait', res.data.headImage);
                } else if(res.data.headportrait) {
                    uni.setStorageSync('headportrait', res.data.headportrait);
                }
				// saveUserid
				uni.setStorageSync("userid", res.data.id);
				if(res.data.vip) {
					uni.setStorageSync("vip", res.data.vip);
				}
				uni.setStorageSync("role", `${this.options[this.index]}`);
				this.$utils.tab('../index/index');
			},
			async onLoginTap() {
                if (!this.username) {
					this.$utils.msg('enter one user name')
					return
				}
                if (!this.password) {
					this.$utils.msg('enter UserPassWord')
					return
				}
                if (!this.optionsValues[this.index]) {
					this.$utils.msg('Please select the login user type')
					return
				}
				let res = await this.$api.login(`${this.optionsValues[this.index]}`, {
					username: this.username,
					password: this.password
				});
                uni.removeStorageSync("useridTag");
				uni.setStorageSync("token", res.token);
				uni.setStorageSync("nickname",this.username);
				uni.setStorageSync("nowTable", `${this.optionsValues[this.index]}`);
				res = await this.$api.session(`${this.optionsValues[this.index]}`);
                if(res.data.headImage) {
                    uni.setStorageSync('headportrait', res.data.headImage);
                } else if(res.data.headportrait) {
                    uni.setStorageSync('headportrait', res.data.headportrait);
                }
				// saveUserid
				uni.setStorageSync("userid", res.data.id);
				if(res.data.vip) {
					uni.setStorageSync("vip", res.data.vip);
				}
				uni.setStorageSync("role", `${this.options[this.index]}`);
				this.$utils.tab('../index/index');
			},
			optionsChange(e) {
				this.index = e.target.value
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
