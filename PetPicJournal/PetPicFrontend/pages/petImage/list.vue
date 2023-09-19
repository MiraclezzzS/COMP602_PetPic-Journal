<template>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view :style='{"padding":"40rpx 0","borderColor":"#21d5ae","alignItems":"flex-start","display":"block","justifyContent":"space-between","minHeight":"100vh","flexWrap":"wrap","background":"#fff","borderWidth":"0px 0","width":"100%","position":"relative","borderStyle":"dashed","height":"auto"}'>
			<view class="cu-bar bg-white search" style="width:100%" :style="[{top:CustomBar + 'px'}]">
				<picker v-if="queryList.length>1" mode="selector" :range="queryList" range-key="queryName" :value="queryIndex" @change="queryChange" style="padding-left: 20upx;">
					<view><image style="width: 20upx;height: 33upx;" src="../../static/center/to.png"></image></view>
				</picker>
					<view v-if="queryIndex==0" class="search-form round">
						<text class="cuIcon-search"></text>
						<input v-model="searchForm.zhaopianbiaoti" type="text" placeholder="Photo Title" ></input>
					</view>
					<view v-if="queryIndex==1" class="search-form round">
						<text class="cuIcon-search"></text>
						<input v-model="searchForm.imageclass" type="text" placeholder="Album Category" ></input>
					</view>
					<view v-if="queryIndex==2" class="search-form round">
						<text class="cuIcon-search"></text>
						<input v-model="searchForm.username" type="text" placeholder="UserName" ></input>
					</view>
				<view class="action">
					<button @tap="search" class="cu-btn shadow-blur round">search</button>
				</view>
			</view>
			<view :style='{"width":"100%","alignItems":"flex-start","flexWrap":"wrap","background":"none","display":"flex","height":"auto"}'>
				<scroll-view scroll-x="true" class="category-one" :style='{"padding":"0px 20rpx 0px","boxShadow":"0 0px 0px rgba(0,0,0,.2)","borderColor":"#f0d20c","whiteSpace":"nowrap","borderRadius":"0","background":"none","borderWidth":"0","display":"flex","width":"100%","borderStyle":"dotted dashed solid double","height":"auto"}'>
					<view :class='categoryName === item.imageclass ? "active" : ""' class="tab" v-for="(item,index) in categoryList" :key="index" @tap="categoryClick(item.imageclass)">{{item.imageclass}}</view>
				</scroll-view>

			
			<!-- 样式1 -->
			<view class="uni-product-list" :style='{"padding":"0px 24rpx 24rpx","margin":"60rpx 0 0","flexWrap":"wrap","background":"none","flex":"1","display":"flex","width":"calc(100% - 220rpx)","justifyContent":"space-between","height":"auto"}'>
				<view @tap="onDetailTap(product)" class="uni-product" :style='{"padding":"20rpx","margin":"0 0 40rpx","borderColor":"#86ce9f #e1f9eb","borderRadius":"60rpx","flexWrap":"wrap","borderWidth":"2rpx","background":"#fff","display":"flex","width":"48%","position":"relative","borderStyle":"solid","height":"auto"}' v-for="(product,index) in list" :key="index">
					<view class="uni-product-title" :style='{"padding":"4rpx 20rpx","margin":"0 0 8rpx","whiteSpace":"nowrap","color":"#3d8e59","textAlign":"center","overflow":"hidden","borderRadius":"0","background":"none","width":"96%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}'>{{product.zhaopianbiaoti}}</view>
					<view class="uni-product-title" :style='{"padding":"4rpx 20rpx","margin":"0 0 8rpx","whiteSpace":"nowrap","color":"#3d8e59","textAlign":"center","overflow":"hidden","borderRadius":"0","background":"none","width":"96%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}'>{{product.imageclass}}</view>
					<image :style='{"minHeight":"260rpx","padding":"0","margin":"8rpx auto 8rpx","objectFit":"cover","borderRadius":"20rpx","display":"block","width":"100%","height":"auto","order":"1"}' mode="aspectFill" class="uni-product-image" v-if="preHttp(product.zhaopian)" :src="product.zhaopian.split(',')[0]"></image>
					<image :style='{"minHeight":"260rpx","padding":"0","margin":"8rpx auto 8rpx","objectFit":"cover","borderRadius":"20rpx","display":"block","width":"100%","height":"auto","order":"1"}' mode="aspectFill" class="uni-product-image" v-else :src="product.zhaopian?baseUrl+product.zhaopian.split(',')[0]:''"></image>
					<view :style='{"width":"100%","padding":"8rpx 20rpx","justifyContent":"space-between","display":"flex","height":"auto","order":"5"}'>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('chongwuxiangce','Modify')) || (!userid && isAuthFront('chongwuxiangce','Modify'))" @click.stop="onUpdateTap(product.id)">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}' class="cuIcon-edit"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}'>Modify</text>
						</view>
						<view :style='{"display":"flex"}' v-if="(userid && isAuth('chongwuxiangce','Delete')) || (!userid && isAuthFront('chongwuxiangce','Delete'))" @click.stop="onDeleteTap(product.id)">
							<text :style='{"margin":"0 8rpx 0 0","fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}' class="cuIcon-delete"></text>
							<text :style='{"fontSize":"28rpx","lineHeight":"1","color":"#666","display":"inline-block"}'>Delete</text>
						</view>
					</view>
				</view>
			</view>
			
			
			
			

			</view>
			
			
			
		</view>

		<button :style='{"border":"0px solid #fff","boxShadow":"0 4rpx 8rpx rgba(0,0,0,.3)","color":"#fff","bottom":"120rpx","right":"128rpx","outline":"none","borderRadius":"100%","background":"#86CE9F","width":"88rpx","lineHeight":"88rpx","fontSize":"28rpx","position":"fixed","height":"88rpx","zIndex":"9999"}' v-if="userid && isAuth('chongwuxiangce','Add')" class="add-btn" @click="onAddTap()">Add</button>
		<button :style='{"border":"0px solid #fff","boxShadow":"0 4rpx 8rpx rgba(0,0,0,.3)","color":"#fff","bottom":"120rpx","right":"128rpx","outline":"none","borderRadius":"100%","background":"#86CE9F","width":"88rpx","lineHeight":"88rpx","fontSize":"28rpx","position":"fixed","height":"88rpx","zIndex":"9999"}' v-if="!userid && isAuthFront('chongwuxiangce','Add')" class="add-btn" @click="onAddTap()">Add</button>
	</view>
</mescroll-uni>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				queryList:[
					{
						queryName:"Photo Title",
					},
					{
						queryName:"Album Category",
					
					
					},
					
					{
						queryName:"UserName",
					},
				],
				queryIndex: 0,
				list: [],
				lists: [],
                userid: '',
				mescroll: null, 
				downOption: {
					auto: false 
				},
				upOption: {
					noMoreSize: 5, 
					textNoMore: '~ There is no more ~',
				},
				hasNext: true,
				searchForm:{},
				categoryList:[],
				categoryName :'All',
				CustomBar: '0'
			};
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onShow() {
            if(uni.getStorageSync("useridTag")==1){
                this.userid=uni.getStorageSync("useridTag");
                uni.removeStorageSync("useridTag");
            } else {
                this.userid = "";
            }
			this.btnColor = this.btnColor.sort(()=> {
                                return (0.5-Math.random());
                        });
            let res = {};
            if(this.userid) {
                res = await this.$api.page('imageclass', {page:1,limit:100});
            } else {
                res = await this.$api.list('imageclass', {page:1,limit:100});
            }
			res.data.list.splice(0,0,{id:0,imageclass:'All'})
			this.categoryList = res.data.list;
			this.hasNext = true
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		onLoad(options) {
            if(uni.getStorageSync("useridTag")==1){
                this.userid=uni.getStorageSync("useridTag");
                uni.removeStorageSync("useridTag");
            } else {
                this.userid = "";
            }
			this.hasNext = true
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		methods: {
            priceChange(price) {
                return Number(price).toFixed(2);
            },
            preHttp(str) {
                return str && str.substr(0,4)=='http';
            },
			queryChange(e) {
				this.queryIndex=e.detail.value;
				this.searchForm.zhaopianbiaoti="";
				this.searchForm.imageclass="";
				this.searchForm.username="";
			},
			categoryClick(categoryName){
				this.categoryName = categoryName;
				this.mescroll.resetUpScroll();
			},
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},
			async upCallback(mescroll) {
				let params = {
					page: mescroll.num,
					limit: mescroll.size
				}
        params['sort'] = 'id';
        params['order'] = 'desc';
        params['sort'] = 'id';
        params['order'] = 'desc';
        params['sort'] = 'imagetime';
        params['order'] = 'desc';
        params['sort'] = 'id';
        params['order'] = 'desc';
        params['sort'] = 'id';
        params['order'] = 'desc';
        params['sort'] = 'id';
        params['order'] = 'desc';

				if(this.categoryName!='All'){
					params.imageclass = '%' + this.categoryName + '%'
				}

				if(this.searchForm.zhaopianbiaoti){
					params['zhaopianbiaoti'] = '%' + this.searchForm.zhaopianbiaoti + '%'
				}
				if(this.searchForm.imageclass){
					params['imageclass'] = '%' + this.searchForm.imageclass + '%'
				}
				if(this.searchForm.username){
					params['username'] = '%' + this.searchForm.username + '%'
				}



                let res = {}
                if(this.userid) {
                    res = await this.$api.page(`chongwuxiangce`, params);
                } else {
                    res = await this.$api.list(`chongwuxiangce`, params);
                }
				if (mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);
			},
			// Details
			onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
			},
			// Modify
			onUpdateTap(id){
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./add-or-update?id=${id}`)
			},
			onAddTap(){
                uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./add-or-update`)
			},
			onDeleteTap(id){
				var _this = this;
				uni.showModal({
					title: 'message ',
					content: 'id Deleted',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.del('chongwuxiangce', JSON.stringify([id]));
							_this.hasNext = true
							
							_this.mescroll.resetUpScroll()
						}
					}
				});
			},
			// search
			async search(){
				this.mescroll.num = 1
				let searchForm = {
					page: this.mescroll.num,
					limit: this.mescroll.size
				}

                searchForm['sort'] = 'id';
                searchForm['order'] = 'desc';
                searchForm['sort'] = 'id';
                searchForm['order'] = 'desc';
                searchForm['sort'] = 'imagetime';
                searchForm['order'] = 'desc';
                searchForm['sort'] = 'id';
                searchForm['order'] = 'desc';
                searchForm['sort'] = 'id';
                searchForm['order'] = 'desc';
                searchForm['sort'] = 'id';
                searchForm['order'] = 'desc';

				if(this.searchForm.zhaopianbiaoti){
					searchForm['zhaopianbiaoti'] = '%' + this.searchForm.zhaopianbiaoti + '%'
				}
				if(this.searchForm.imageclass){
					searchForm['imageclass'] = '%' + this.searchForm.imageclass + '%'
				}
				if(this.searchForm.username){
					searchForm['username'] = '%' + this.searchForm.username + '%'
				}
                let res = {};
                if(this.userid) {
                    res = await this.$api.page(`chongwuxiangce`, searchForm);
                } else {
                    res = await this.$api.list(`chongwuxiangce`, searchForm);
                }
				if (this.mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				this.mescroll.endSuccess(this.mescroll.size, this.hasNext);
			}
		}
	};
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.category-one .tab {
		cursor: pointer;
		padding: 0 20rpx;
		margin: 0 8rpx;
		color: #333;
		display: inline-block;
		font-size: 28rpx;
		border-color: #9fdfba;
		line-height: 80rpx;
		border-radius: 0;
		background: #edfbf3;
		width: auto;
		border-width: 0px;
		border-style: solid;
		text-align: center;
		min-width: 126rpx;
		height: 80rpx;
	}
	
	.category-one .tab.active {
		cursor: pointer;
		padding: 0 20rpx;
		margin: 0 8rpx;
		color: #333;
		font-weight: 600;
		display: inline-block;
		font-size: 28rpx;
		border-color: #9fdfba;
		line-height: 80rpx;
		border-radius: 0;
		background: #edfbf3;
		width: auto;
		border-width: 0 0 4rpx;
		border-style: solid;
		text-align: center;
		min-width: 126rpx;
		height: 80rpx;
	}
	
	.category-two .tab {
		cursor: pointer;
		padding: 0;
		margin: 0 0 20rpx;
		color: #555;
		display: inline-block;
		font-size: 28rpx;
		border-color: #cbf0f1;
		line-height: 80rpx;
		border-radius: 0px;
		background: rgba(255,255,255,1);
		width: 100%;
		border-width: 0px 0px 4rpx;
		border-style: solid;
		text-align: center;
		height: 84rpx;
	}
	
	.category-two .tab.active {
		cursor: pointer;
		padding: 0;
		margin: 0 0 20rpx;
		color: #333;
		font-weight: 600;
		display: inline-block;
		font-size: 28rpx;
		border-color: #92d5d6;
		line-height: 80rpx;
		border-radius: 0px;
		background: #ecfafb;
		width: 100%;
		border-width: 0px 0px 4rpx;
		border-style: solid;
		text-align: center;
		height: 84rpx;
	}
	
	
	.category-three .tab.active {
		cursor: pointer;
		padding: 0;
		color: #fff;
		background: #000;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
	
	.category-three .tab {
		cursor: pointer;
		padding: 0;
		color: #fff;
		background: burlywood;
		display: inline-block;
		width: 100%;
		font-size: 28rpx;
		line-height: 80rpx;
		text-align: center;
	}
	
</style>
