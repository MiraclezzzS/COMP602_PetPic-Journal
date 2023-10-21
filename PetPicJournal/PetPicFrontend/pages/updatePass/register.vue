<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"120rpx 40rpx 80rpx","background":"url() no-repeat center top / 100% 100%,#fff","height":"100%"}'>
		<view :style='{"padding":"40rpx 80rpx","boxShadow":"0px 0px 0px #aaa","borderColor":"#e9be70","borderRadius":"40rpx","background":"none","borderWidth":"0px","display":"block","width":"100%","borderStyle":"solid","height":"auto"}'>

			
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<u--input shape='circle' v-model="password1" type="password" class="uni-input" name="" placeholder=" new Password" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='yonghu'" class="uni-form-item uni-column">
				<u--input shape='circle' v-model="password2" type="password" class="uni-input" name="" placeholder=" Confirm Password" />
			</view>
			
			<u-button  class="btn-submit" @tap="register" type="primary">update Password</u-button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
			    password1:"",
				password2:"",
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
		    this.tableName = table;
			},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},

			// register
			async register() {
				this.role = uni.getStorageSync("role");
				let table = uni.getStorageSync("nowTable");
				let res = await this.$api.session(table);
				if((!this.password1) && `yonghu` == this.tableName){
					this.$utils.msg(`Old passWord not null`);
					return
				}
           
				if(`yonghu` == this.tableName && (this.password1!=this.password2)){
				    this.$utils.msg(`The confirm password inputs is wrong`);
				    return
				}
				await this.$api.updatePass(`${this.tableName}`, this.password1,res.data.id);
				this.$utils.msgBack('Update successful');
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
