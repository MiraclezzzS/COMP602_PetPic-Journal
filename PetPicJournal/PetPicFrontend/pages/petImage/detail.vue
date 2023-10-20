
<template>
<view>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view class="container" :style='{"minHeight":"100vh","width":"100%","padding":"0px 0 132rpx","position":"relative","background":"url() fixed,#fff","height":"auto"}'>
						<swiper :style='{"border":"0px dotted #f7de91","padding":"0px ","margin":"40rpx auto","borderColor":"#f4e5e2","alignItems":"center","display":"flex","justifyContent":"center","borderRadius":"40rpx","background":"#fff","borderWidth":"0px","width":"calc(100% - 48rpx)","borderStyle":"solid","height":"480rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
				<swiper-item :style='{"width":"100%","height":"100%"}' v-for="(swiper,index) in swiperList" :key="index">
					<image :style='{"width":"auto","margin":"0px auto","maxHeight":"100%","display":"block","height":"100%","maxWidth":"100%"}' mode="aspectFill" v-if="swiper.substring(0,4)=='http'" :src="swiper"></image>
					<image :style='{"width":"auto","margin":"0px auto","maxHeight":"100%","display":"block","height":"100%","maxWidth":"100%"}' mode="aspectFill" v-else :src="baseUrl+swiper"></image>
				</swiper-item>
			</swiper>
									            <view :style='{"padding":"0px 24rpx 24rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}' class="detail-content">
				<view :style='{"padding":"0 40rpx 0 20rpx","margin":"0 0 20rpx","borderColor":"white","borderRadius":"0px","borderWidth":"2rpx","background":"linear-gradient(270deg, white 0%, rgb(255 235 59 / 16%) 100%)","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"space-between","height":"88rpx"}' class="detail-list-item price priceFavor">
					<view :style='{"border":"0px solid #e9b6b6","boxShadow":"0px 0px 0px #ccc","margin":"8rpx 12rpx 0","color":"#ffa200","textAlign":"center","display":"block","borderRadius":"100%","background":"none","width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","textShadow":"0px 0px 0px #ccc","height":"64rpx"}' v-if="storeupFlag==1" class="cuIcon-favorfill" @click="shoucang"></view>
					<view :style='{"border":"0px solid #e9b6b6","boxShadow":"0px 0px 0px #ccc","margin":"8rpx 12rpx 0","color":"#ffa200","textAlign":"center","display":"block","borderRadius":"100%","background":"none","width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","textShadow":"0px 0px 0px #ccc","height":"64rpx"}' v-if="storeupFlag==0" class="cuIcon-favor" @click="shoucang"></view>
				</view>

				<view :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"white","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, white 0%, rgb(255 235 59 / 16%) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}' class="lable">Photo Title：</view>
					<view :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}' class="text">{{detail.pettitle}}</view>
				</view>
				<view :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"white","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, white 0%, rgb(255 235 59 / 16%) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}' class="lable">Album Category：</view>
					<view :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}' class="text">{{detail.imageclass}}</view>
				</view>

				<view class="detail-list-item" :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"white","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, white 0%, rgb(255 235 59 / 16%) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}'>Shooting time：</view>
					<view  class="text" :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>{{detail.imagetime}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"white","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, white 0%, rgb(255 235 59 / 16%) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}'>UserName：</view>
					<view  class="text" :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>{{detail.username}}</view>
				</view>





				<view class="detail-list-item rich" :style='{"padding":"24rpx 24rpx","margin":"0 0 24rpx 0","borderColor":"white","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, white 0%, rgb(255 235 59 / 16%) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 20rpx 0","color":"#369555","textAlign":"left","width":"100%","lineHeight":"1.5","fontSize":"30rpx","fontWeight":"600"}'>Photo description</view>
					<view class="rich-text" :style='{"border":"0px solid #f7de91","padding":"0 20rpx 0 0","boxShadow":"0 0px 0px rgba(182,158,18,.4),inset 0px 0px 0px 0px #fcf6d6","margin":"0","borderRadius":"0px","color":"#666","background":"none","width":"calc(100% - 8rpx)","lineHeight":"1.5","textIndent":"2em"}'>
						<rich-text :nodes="detail.imageremark"></rich-text>
					</view>
				</view>


				<view class="time-content" :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}'>
					<view class="comoment-header" :style='{"border":"0px solid #fdd802","boxShadow":"inset 0px 0px 0px 0px #fcf3bf","padding":"0px 40rpx","margin":"0 auto 40rpx","borderRadius":"0rpx","background":"url(http://localhost:8080/ssm85bqd1pj/admin/dist/img/comments.png) repeat-x 0% 100%","display":"flex","width":"calc(100%)","justifyContent":"space-between","height":"100rpx"}'>
						<view :style='{"padding":"0px 0px","lineHeight":"86rpx","fontSize":"32rpx","color":"#3c5928","fontWeight":"600"}'></view>
						<view :style='{"border":"0px solid #64b7ea","padding":"0 0px 0 0px","margin":"0 0px 0 0","borderRadius":"0px","background":"rgba(255,255,255,.0)","display":"flex","lineHeight":"86rpx"}' @click="onCommentTap" class="btn-comment-content" style="display: flex;align-items: center;">
							<view :style='{"margin":"0px 8rpx 0","lineHeight":"86rpx","fontSize":"28rpx","color":"#fcf3bf"}' class="cuIcon-add"></view>
							<view :style='{"margin":"80px -10px 30px 10px","lineHeight":"86rpx","fontSize":"28rpx"}'>Add Comment</view>
						</view>
					</view>
				
					<view :style='{"padding":"20rpx","margin":"32rpx 0 32rpx","borderColor":"white","borderRadius":"0px","background":"linear-gradient(270deg, white 0%, rgb(255 235 59 / 16%) 100%)","borderWidth":"2rpx","width":"100%","borderStyle":"solid","height":"auto"}' v-for="(item,index) in commentList" v-bind:key="index" class="cu-item comment-item">
						<view :style='{"width":"100%","display":"flex","height":"auto"}'>
							<image :style='{"width":"60rpx","margin":"0 8rpx 0 0","borderRadius":"100%","display":"block","height":"60rpx"}' v-if="item.avatarurl" mode="aspectFill" :src="baseUrl+item.avatarurl"></image>
							<view :style='{"lineHeight":"60rpx","fontSize":"28rpx","color":"#333","fontWeight":"bold"}' class="text-grey">{{item.nickname}}</view>
						</view>
						<view :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666","textIndent":"2em"}' class="text-gray text-content text-df">
							{{item.content}}
						</view>
						<view :style='{"lineHeight":"24rpx","fontSize":"24rpx","color":"#666","textAlign":"right"}' class="margin-top-sm text-gray text-df">{{item.addtime}}</view>
						<view v-if="item.reply" :style='{"margin":"8rpx 0","lineHeight":"1.5","fontSize":"28rpx","color":"#666","textIndent":"2em"}' class="text-gray text-content text-df">
							Reply:{{item.reply}}
						</view>
					</view>
				</view>

				<view class="bottom-content bg-white tabbar border shop" :style='{"width":"100%","padding":"20rpx 0px","flexWrap":"wrap","background":"none","display":"flex","height":"auto"}'>

				</view>
			</view>

		</view>
	</view>
</mescroll-uni>
</view>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
                userid: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null,
				downOption: {
					auto: false 
				},
				upOption: {
					noMoreSize: 3, 
					textNoMore: '~ There is no more ~',
				},
				hasNext: true,
				user: {},
				storeupFlag: 0,
				count: 0,
				timer: null
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {
			this.id = options.id;
            if(options.userid) {
                this.userid = options.userid;
            }
			this.init();
		},
        onUnload() {
            if(this.timer) {
                clearInterval(this.timer);
            }
        },
		async onShow(options) {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
			this.getStoreup();
			let cleanType = uni.getStorageSync('discusschongwuxiangceCleanType')
			if(cleanType){
				uni.removeStorageSync('discusschongwuxiangceCleanType')
				this.mescroll.num = 1
				this.upCallback(this.mescroll)
			}
			let crossCleanType = uni.getStorageSync('crossCleanType')
            if(crossCleanType) {
				uni.removeStorageSync('crossCleanType')
                res = await this.$api.info('petimage', this.id);
                this.detail = res.data;
            }
		},
		destroyed: function() {
		},
		methods: {
			onPayTap(){
				uni.setStorageSync('paytable','chongwuxiangce');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			async getStoreup() {
				let params = {
					page: 1,
					limit: 1,
					refid : this.id,
					tablename : 'petimage',
					userid: this.user.id,
					type: 1,
				}
				let res = await this.$api.list(`storeup`, params);
				this.storeupFlag = res.data.list.length;
			},
			async shoucang(){
				let _this = this;
				let params = {
					page: 1,
					limit: 1,
					refid : _this.detail.id,
					tablename : 'petimage',
					userid: _this.user.id,
					type: 1,
				}
				let res = await _this.$api.list(`storeup`, params);
				if (res.data.list.length == 1) {
					let storeupId = res.data.list[0].id;
					uni.showModal({
						title: 'message',
						content: ' is cancel',
						success: async function(res) {
							if (res.confirm) {
								await _this.$api.del('storeup', JSON.stringify([storeupId]));
								_this.$utils.msg('cancel success');
								_this.getStoreup();
							}
						}
					});
					return;
				}
				uni.showModal({
					title: 'message',
					content: 'is strored',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.add('storeup', {
								userid: _this.user.id,
								name: _this.detail.pettitle,
								picture: _this.swiperList[0],
								refid: _this.detail.id,
								tablename: 'petimage',
                                type: 1
							});
							_this.$utils.msg('Collection successful');
							_this.getStoreup();
						}
					}
				});
			},
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				uni.setStorageSync('crossTable','petimage');
				uni.setStorageSync(`crossObj`, this.detail);
				uni.setStorageSync(`statusColumnName`, statusColumnName);
				uni.setStorageSync(`statusColumnValue`, statusColumnValue);
				uni.setStorageSync(`tips`, tips);
				if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
					var obj = uni.getStorageSync('crossObj');
					for (var o in obj){
						if(o==statusColumnName && obj[o]==statusColumnValue){
							this.$utils.msg(tips);
							return
						}
					}
				}
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			async init(){
                if(this.timer) {
                    clearInterval(this.timer);
                }
				let res = await this.$api.info('petimage', this.id);
				this.detail = res.data;
				this.swiperList = this.detail.petimage ? this.detail.petimage.split(",") : [];
				this.detail.imageremark = this.detail.imageremark.replace(/img src/gi,"img style=\"width:100%;\" src");
			},

			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			async upCallback(mescroll) {
                let res = await this.$api.list('discusspetimage', {
					page: mescroll.num,
					limit: 10,
					refid: this.id
				});
				if (mescroll.num == 1) this.commentList = [];
				this.commentList = this.commentList.concat(res.data.list);
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);

            },



			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			download(url){
				let _this = this;
				url=_this.$base.url +  url;
				uni.downloadFile({
					url: url,
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('Download Success');
							 window.open(url);
						}
					}
				});
			},
			//
			onCartTabTap() {
				this.$utils.tab('../shop-cart/shop-cart')
			},
			// Add Comment
			async onCommentTap() {
				console.log('**************************************')
				this.$utils.jump(`../discussPet/add-or-update?refid=${this.id}`)
			},
			onSHTap() {
				this.$refs.popup.open()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.seat-list {
		display: flex;
		align-items: center;
		flex-wrap: wrap;
		background: #FFFFFF;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		font-size: 30upx;
		.seat-item {
			width: 33.33%;
			display: flex;
			align-items: center;
			flex-direction: column;
			margin-bottom: 20upx;
	
			.seat-icon {
				width: 50upx;
				height: 50upx;
				margin-bottom: 10upx;
			}
		}
	}
	
	audio {
		display: flex;
		flex-direction: column;
	}
	
	.audio /deep/ .uni-audio-default {
		width: inherit;
	}
</style>
