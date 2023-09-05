<!--template part-->
<template>
<view class="content">
	<view :style='{"minHeight":"100vh","padding":"0px 0 80rpx","borderColor":"#21d5ae","background":"#fff","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","height":"auto"}' class="app-update-pv">
			<!--loginin user name div-->
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">UserName</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx"}' :disabled="ro.yonghuming" v-model="ruleForm.yonghuming" placeholder="UserName"></input>
			</view>
			<!--name div-->	
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">Full Name</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="Full Name"></input>
			</view>
			
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">PassWord</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" placeholder="PassWord"></input>
			</view>
			
			<!-- sex div-->
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">Gender</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="sexChange" :value="xingbieIndex"  :range="sexOptions">
					<view :style='{"width":"100%","padding":"0 20rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#666","background":"none"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"Please select Gender"}}</view>
				</picker>
			</view>
			<!-- phone div-->
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">Phone</view>
				<input :style='{"border":"0","padding":"0px 20rpx","margin":"0px","color":"#666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx"}' :disabled="ro.lianxidianhua" v-model="ruleForm.lianxidianhua" placeholder="Phone"></input>
			</view>
			
			<view :style='{"padding":"0 20rpx 0px","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","lineHeight":"100rpx","borderStyle":"solid","height":"auto"}' class="" @tap="headTap">
				<view :style='{"width":"auto","padding":"0 20rpx 0 0","fontSize":"28rpx","color":"#369555","textAlign":"right","fontWeight":"600"}' class="title">Head Sculpture</view>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-if="ruleForm.touxiang" :src="baseUrl+ruleForm.touxiang.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"72rpx","margin":"12rpx 0","borderRadius":"100%","objectFit":"cover","display":"block","height":"72rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			
 

			
			<!--save button-->
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
				yonghuming: '',
				xingming: '',
				mima: '',
				xingbie: '',
				lianxidianhua: '',
				touxiang: '',
				},
				sexOptions: [],
				xingbieIndex: 0,
				// login User Information
				user: {},
                ro:{
                   yonghuming : false,
                   xingming : false,
                   mima : false,
                   xingbie : false,
                   lianxidianhua : false,
                   touxiang : false,
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
			// get User Information
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss get


			// define six 
			this.sexOptions = "男,女".split(',')

			// if login，get saved userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// if get refid，get refid info
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			//  if update Operate
			if (options.id) {
				this.ruleForm.id = options.id;
				// get info
				res = await this.$api.info(`yonghu`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// change table 
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yonghuming'){
					this.ruleForm.yonghuming = obj[o];
					this.ro.yonghuming = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='mima'){
					this.ruleForm.mima = obj[o];
					this.ro.mima = true;
					continue;
					}
					if(o=='xingbie'){
					this.ruleForm.xingbie = obj[o];
					this.ro.xingbie = true;
					continue;
					}
					if(o=='lianxidianhua'){
					this.ruleForm.lianxidianhua = obj[o];
					this.ro.lianxidianhua = true;
					continue;
					}
					if(o=='touxiang'){
					this.ruleForm.touxiang = obj[o].split(",")[0];
					this.ro.touxiang = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},




			// sex change
			sexChange(e) {
				this.xingbieIndex = e.target.value
				this.ruleForm.xingbie = this.sexOptions[this.xingbieIndex]
			},
			
			// head change	
			headTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
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













//跨表计算判断
				var obj;
				if((!this.ruleForm.yonghuming)){
					this.$utils.msg(`UserName not null`);
					return
				}
				if((!this.ruleForm.xingming)){
					this.$utils.msg(`Full Name not null`);
					return
				}
				if((!this.ruleForm.mima)){
					this.$utils.msg(`PassWord not null`);
					return
				}
				if(this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`Phone应输入手机格式`);
					return
				}
				//更新跨表属性
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
					let res = await this.$api.list(`yonghu`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`yonghu`, this.ruleForm);
						}else{
							await this.$api.add(`yonghu`, this.ruleForm);
						}
						this.$utils.msgBack('Successfully submitted');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`yonghu`, this.ruleForm);
					}else{
						await this.$api.add(`yonghu`, this.ruleForm);
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
