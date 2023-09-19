<template>
<view class="content">
	<view :style='{"minHeight":"100vh","padding":"0px 0 80rpx","borderColor":"#21d5ae","background":"#fff","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">Photo Title</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx"}' :disabled="ro.zhaopianbiaoti" v-model="ruleForm.zhaopianbiaoti" placeholder="Photo Title"></input>
			</view>
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">Album Category</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="xiangcefenleiChange" :value="xiangcefenleiIndex"  :range="xiangcefenleiOptions">
					<view :style='{"width":"100%","padding":"0 20rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#666","background":"none"}' class="uni-input">{{ruleForm.xiangcefenlei?ruleForm.xiangcefenlei:"Please select Album Category"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">Shooting time</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' mode="date" :value="ruleForm.paisheshijian" @change="paisheshijianChange">
					<view :style='{"width":"100%","padding":"0 20rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#666","background":"none"}' class="uni-input">{{ruleForm.paisheshijian?ruleForm.paisheshijian:"Please select Shooting time"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="" @tap="zhaopianTap">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">照片</view>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-if="ruleForm.zhaopian" :src="baseUrl+ruleForm.zhaopian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">UserName</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx"}' :disabled="ro.yonghuming" v-model="ruleForm.yonghuming" placeholder="UserName"></input>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"padding":"20rpx 20rpx","margin":"0 0 24rpx","borderColor":"#d9eff0","borderWidth":"0 0 2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","width":"100%","borderStyle":"dashed","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#369555","fontWeight":"600"}' class="title">Photo description</view>
                <xia-editor ref="editor" :style='{"padding":"0px","borderColor":"#f4e5e2","borderRadius":"0px","color":"#666","background":"none","borderWidth":"0px","width":"100%","borderStyle":"solid","height":"auto"}' v-model="ruleForm.zhaopianmiaoshu" placeholder="Photo description" @editorChange="zhaopianmiaoshuChange"></xia-editor>
			</view>
			
			<view :style='{"padding":"0px","margin":"40rpx 0 0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"center","height":"auto"}' class="btn" >
				<button :style='{"padding":"0 40rpx","boxShadow":"0px 0px 0px #ccc","margin":"0 0 40rpx","borderColor":"#d8f5e3","color":"#333","display":"inline","minWidth":"200rpx","borderRadius":"0px","background":"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(226,247,234,1) 100%)","borderWidth":"2rpx","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid","fontWeight":"500","height":"88rpx"}' @tap="onSubmitTap" class="bg-red">submitted</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				zhaopianbiaoti: '',
				xiangcefenlei: '',
				paisheshijian: '',
				zhaopian: '',
				yonghuming: '',
				zhaopianmiaoshu: '',
				},
				xiangcefenleiOptions: [],
				xiangcefenleiIndex: 0,
				user: {},
                ro:{
                   zhaopianbiaoti : false,
                   xiangcefenlei : false,
                   paisheshijian : false,
                   zhaopian : false,
                   yonghuming : false,
                   zhaopianmiaoshu : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			
			this.ruleForm.yonghuming = this.user.yonghuming
			this.ro.yonghuming = true;


			res = await this.$api.option(`xiangcefenlei`,`xiangcefenlei`,{});
			this.xiangcefenleiOptions = res.data;
            this.xiangcefenleiOptions.unshift("Please select Album Category");

			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			if (options.id) {
				this.ruleForm.id = options.id;
				res = await this.$api.info(`chongwuxiangce`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='zhaopianbiaoti'){
					this.ruleForm.zhaopianbiaoti = obj[o];
					this.ro.zhaopianbiaoti = true;
					continue;
					}
					if(o=='xiangcefenlei'){
					this.ruleForm.xiangcefenlei = obj[o];
					this.ro.xiangcefenlei = true;
					continue;
					}
					if(o=='paisheshijian'){
					this.ruleForm.paisheshijian = obj[o];
					this.ro.paisheshijian = true;
					continue;
					}
					if(o=='zhaopian'){
					this.ruleForm.zhaopian = obj[o].split(",")[0];
					this.ro.zhaopian = true;
					continue;
					}
					if(o=='yonghuming'){
					this.ruleForm.yonghuming = obj[o];
					this.ro.yonghuming = true;
					continue;
					}
					if(o=='zhaopianmiaoshu'){
					this.ruleForm.zhaopianmiaoshu = obj[o];
					this.ro.zhaopianmiaoshu = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            zhaopianmiaoshuChange(e) {
                this.ruleForm.zhaopianmiaoshu = e
            },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},


			paisheshijianChange(e) {
				this.ruleForm.paisheshijian = e.target.value;
				this.$forceUpdate();
			},


			xiangcefenleiChange(e) {
				this.xiangcefenleiIndex = e.target.value
				this.ruleForm.xiangcefenlei = this.xiangcefenleiOptions[this.xiangcefenleiIndex]
			},

			zhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {













				var obj;
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`chongwuxiangce`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
						if(this.ruleForm.id){
							await this.$api.update(`chongwuxiangce`, this.ruleForm);
						}else{
							await this.$api.add(`chongwuxiangce`, this.ruleForm);
						}
						this.$utils.msgBack('Successfully submitted');
					}
				} else {
					if(this.ruleForm.id){
						await this.$api.update(`chongwuxiangce`, this.ruleForm);
					}else{
						await this.$api.add(`chongwuxiangce`, this.ruleForm);
					}
					this.$utils.msgBack('Successfully submitted');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
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
