
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

				<view :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}' class="lable">Full Name：</view>
					<view :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}' class="text">{{detail.name}}</view>
				</view>

				<view class="detail-list-item" :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}'>UserName：</view>
					<view  class="text" :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>{{detail.username}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}'>Gender：</view>
					<view  class="text" :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>{{detail.sex}}</view>
				</view>
				<view class="detail-list-item" :style='{"padding":"2rpx 12rpx 2rpx","margin":"0 0 20rpx","borderColor":"#e1f9eb","borderRadius":"0px","flexWrap":"wrap","borderWidth":"2rpx","background":"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"8rpx 8rpx 0","color":"#369555","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx","minWidth":"180rpx","fontWeight":"600"}'>Phone：</view>
					<view  class="text" :style='{"padding":"8rpx 8rpx 20rpx","margin":"0px 0 0","color":"#666","flex":"1","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>{{detail.phone}}</view>
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
				mescroll: null, //mescroll entity
				downOption: {
					auto: false //get callback; dfine true
				},
				upOption: {
					noMoreSize: 3, //define 3,for beautifull
					textNoMore: '~ There is no more ~',
				},
				hasNext: true,
				user: {},
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
			// init
			this.init();
		},
        onUnload() {
            if(this.timer) {
                clearInterval(this.timer);
            }
        },
		async onShow(options) {
			let table = uni.getStorageSync("nowTable");
			// get User Information
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
			let crossCleanType = uni.getStorageSync('crossCleanType')
            if(crossCleanType) {
				uni.removeStorageSync('crossCleanType')
                res = await this.$api.info('yonghu', this.id);
                this.detail = res.data;
            }
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			// pay
			onPayTap(){
				uni.setStorageSync('paytable','yonghu');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				uni.setStorageSync('crossTable','yonghu');
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
			// get Details
			async init(){
                if(this.timer) {
                    clearInterval(this.timer);
                }
				let res = await this.$api.info('yonghu', this.id);
				this.detail = res.data;
				// get head image
				this.swiperList = this.detail.headImage ? this.detail.headImage.split(",") : [];
			},

			// mescroll callback
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*down callback */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/* up callback*/
			async upCallback(mescroll) {
				mescroll.endSuccess(mescroll.size, this.hasNext);

            },



			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// download
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
				this.$utils.jump(`../discussyonghu/add-or-update?refid=${this.id}`)
			},
			onSHTap() {
				this.$refs.popup.open()
			},
		}
	}
</script>

<style lang="scss" scoped>
	
	
	.seat-list {
		align-items: center;
		flex-wrap: wrap;
		display: flex;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		background: #FFFFFF;
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
	
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
