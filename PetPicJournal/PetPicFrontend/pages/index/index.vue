<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"20rpx 0 0","background":"#fff","height":"auto"}'>
	
		
		<u-swiper
		                :list="swiperList"
		                previousMargin="30"
		                nextMargin="30"
		                circular
		                :autoplay="true"
		                radius="5"
		                bgColor="#ffffff"
		        ></u-swiper>
		
		
		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0px","margin":"40rpx auto 40rpx","borderColor":"#edcfc9","outline":"0px solid #ccc","borderRadius":"40rpx","flexWrap":"wrap","background":"#fff","borderWidth":"0px","display":"flex","width":"calc(100% - 48rpx)","borderStyle":"solid ","height":"auto"}'>
            
			<block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"width":"25%","padding":"20rpx 0","margin":"0","borderRadius":"100%","background":"none","height":"auto"}' class="menu-list" v-if="button=='View' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2('../'+child.tableName+'/list')">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0px","margin":"0px auto","color":"#3c5928","borderRadius":"100%","background":"none","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
                                <view :style='{"padding":"0","margin":"12rpx auto 0","color":"#3d8e59","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		
		
		<view class="listBox news">
		
			
		  
			<view class="title" :style='{"padding":"0 40rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"-50rpx auto 0px","overflow":"hidden","borderRadius":"0rpx","background":"url(http://localhost:8080/ssm85bqd1pj/admin/dist/img/news.png) repeat-x 0% 100%","display":"flex","width":"calc(100%)","lineHeight":"url(http://codegen.caihongy.cn/20230407/f36a64fc22f34055a70a17f487c5f75e.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230407/208980f2d46b4e8da270f53f8def4c8d.png) no-repeat right top / auto 100%,#e22d2d","minWidth":"50%","justifyContent":"space-between","height":"100rpx"}'>
					
			</view>
			
		    <view>  		
			  <u-list
			  			@scrolltolower="scrolltolower"
			  		>
			  			<u-list-item
			  				v-for="(item, index) in news"
			  				:key="index"
			  			>
			  				<u-cell

			  					:title="item.title"
								isLink
							    @click="onNewsDetailTap(item.id)"
			  				>
			  					<u-avatar
			  						slot="icon"
			  						shape="square"
			  						size="35"
			  						src="http://localhost:8080/ssm85bqd1pj/admin/dist/img/10.png"
			  						customStyle="margin: -3px 5px -3px 0"
									
			  					></u-avatar>
			  				</u-cell>
			  			</u-list-item>
			  		</u-list>
			</view>
		  
		  
			
			<view v-if="false && 1 == 3" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		
		<!-- System Introduction -->
		<view :style='{"padding":"0px","margin":"-400rpx auto 40rpx","borderRadius":"0px","flexWrap":"wrap","display":"flex","width":"calc(100%)","position":"relative","justifyContent":"center","height":"auto"}'>
		  <view class="title" :style='{"padding":"0 40rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"-50rpx auto 0px","overflow":"hidden","borderRadius":"0rpx","background":"url(http://localhost:8080/ssm85bqd1pj/admin/dist/img/infos.png) repeat-x 0% 100%","display":"flex","width":"calc(100%)","lineHeight":"url(http://codegen.caihongy.cn/20230407/f36a64fc22f34055a70a17f487c5f75e.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230407/208980f2d46b4e8da270f53f8def4c8d.png) no-repeat right top / auto 100%,#e22d2d","minWidth":"50%","justifyContent":"space-between","height":"100rpx"}'/>
		  
		  <view :style='{"padding":"0 40rpx","margin":"-10rpx 0 40rpx","color":"#3c5928","textAlign":"center","display":"inline-block","minWidth":"50%","overflow":"hidden","borderRadius":"40rpx","top":"120rpx","width":"calc(100% - 160rpx)","lineHeight":"80rpx","fontSize":"32rpx","position":"absolute","fontWeight":"600","height":"80rpx","zIndex":"999"}'>{{systemIntroductionDetail.title}}</view>
		  <view :style='{"padding":"0 0 0 20rpx","margin":"-10rpx","color":"#666","textAlign":"center","display":"none","overflow":"hidden","borderRadius":"0","top":"190rpx","background":"none","width":"auto","fontSize":"28rpx","lineHeight":"86rpx","position":"absolute","height":"86rpx","zIndex":"999"}'>{{systemIntroductionDetail.subtitle}}</view>
		  <view :style='{"padding":"160rpx 40rpx 40rpx","margin":"0rpx 0 0","borderColor":"#ccc","borderRadius":"20rpx 20rpx 0 0","background":"#fff","borderWidth":"0px","display":"flex","width":"calc(100% - 80rpx)","position":"relative","borderStyle":"solid","justifyContent":"space-between","height":"auto"}'>
		    <img :style='{"padding":"0px","boxShadow":"inset 0px 0px 0px 0px #edf3fe","margin":"0 0 0 0","borderColor":"#daefe2","objectFit":"cover","borderRadius":"0px","borderWidth":"12rpx","display":"block","width":"100%","borderStyle":"solid","height":"400rpx"}' v-if="systemIntroductionDetail.picture1" :src="baseUrl+systemIntroductionDetail.picture1">
		    <img :style='{"padding":"0px","boxShadow":"inset 0px 0px 0px 0px #edf3fe","margin":"0","borderColor":"#aee7e9","objectFit":"cover","bottom":"-60rpx","display":"none","right":"0%","borderRadius":"100%","borderWidth":"16rpx","width":"400rpx","position":"absolute","borderStyle":"solid","height":"400rpx"}' v-if="systemIntroductionDetail.picture2" :src="baseUrl+systemIntroductionDetail.picture2">
		    <img :style='{"padding":"24rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","objectFit":"cover","display":"none","right":"12rpx","borderRadius":"10%","borderWidth":"8rpx 4rpx 4rpx 4rpx","width":"30%","position":"absolute","borderStyle":"solid","height":"400rpx"}' v-if="systemIntroductionDetail.picture3" :src="baseUrl+systemIntroductionDetail.picture3">
		  </view>
		  <view :style='{"padding":"0px 20rpx 40rpx","boxShadow":"inset 0px 0px 0px 0px #87acf1","margin":"0px auto 80rpx","borderColor":"#eee","color":"#3d8e59","textIndent":"2em","borderRadius":"0 0 20rpx 20rpx","background":"#fff","borderWidth":"0px","width":"calc(100% - 80rpx)","lineHeight":"48rpx","fontSize":"28rpx","borderStyle":"double solid solid solid","height":"auto"}' v-html="systemIntroductionDetail.content"></view>
		  <view :style='{"width":"82%","position":"absolute","top":"152rpx","background":"url() no-repeat","display":"none","height":"36rpx"}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

		
		
		<!-- About us -->
		<view :style='{"border":"0px solid #f4e5e2","padding":"0px","margin":"40rpx auto 80rpx","borderRadius":"0px","flexWrap":"wrap","display":"flex","width":"calc(100% - 0px)","position":"relative","justifyContent":"center","height":"auto"}'>
		  <view class="title" :style='{"padding":"0 40rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"-50rpx auto 0px","overflow":"hidden","borderRadius":"0rpx","background":"url(http://localhost:8080/ssm85bqd1pj/admin/dist/img/us.png) repeat-x 0% 100%","display":"flex","width":"calc(100%)","lineHeight":"url(http://codegen.caihongy.cn/20230407/f36a64fc22f34055a70a17f487c5f75e.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20230407/208980f2d46b4e8da270f53f8def4c8d.png) no-repeat right top / auto 100%,#e22d2d","minWidth":"50%","justifyContent":"space-between","height":"100rpx"}'/>
		  
		  <view :style='{"padding":"0px","margin":"-10px 0 0 20rpx","overflow":"hidden","color":"#666","borderRadius":"0","textAlign":"center","background":"none","display":"none","width":"auto","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'>{{aboutUsDetail.subtitle}}</view>
		  <view :style='{"padding":"0rpx 0rpx 100rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"80rpx 0 0","display":"flex","float":"left","justifyContent":"space-between","borderRadius":"20rpx 20rpx 0 0","flexWrap":"wrap","background":"#fff","width":"calc(100% - 80rpx)","position":"relative","height":"auto","order":"1"}'>
		    <img :style='{"padding":"0px","boxShadow":"inset 0px 0px 0px 0px #fff","margin":"0px 0 0","borderColor":"#daefe2","objectFit":"cover","display":"inline-block","transform":"rotate(0deg)","borderRadius":"0px","borderWidth":"12rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"300rpx"}' v-if="aboutUsDetail.picture1" :src="baseUrl+aboutUsDetail.picture1">
		    <img :style='{"padding":"12rpx","margin":"0px","borderColor":"#c6eaf1","objectFit":"cover","display":"none","borderRadius":"100%","top":"-200rpx","left":"100rpx","borderWidth":"4rpx","background":"#fff","width":"320rpx","position":"absolute","borderStyle":"solid","height":"320rpx"}' v-if="aboutUsDetail.picture2" :src="baseUrl+aboutUsDetail.picture2">
		    <img :style='{"width":"48%","margin":"0px","objectFit":"cover","borderRadius":"16rpx","display":"none","height":"160rpx"}' v-if="aboutUsDetail.picture3" :src="baseUrl+aboutUsDetail.picture3">
		  </view>
		  <view :style='{"padding":"0px 20rpx 40rpx","boxShadow":"0px 0px 0px #ccc","margin":"0px auto 80rpx","borderColor":"#666","color":"#3d8e59","textIndent":"2em","float":"left","overflow":"hidden","borderRadius":"0 0 20rpx 20rpx","background":"#fff","borderWidth":"0px","width":"calc(100% - 80rpx)","lineHeight":"48rpx","fontSize":"28rpx","borderStyle":"solid","height":"auto","order":"2"}' v-html="aboutUsDetail.content"></view>
		  <view :style='{"top":"206rpx","left":"69%","background":"url(http://codegen.caihongy.cn/20230410/540318ca19b242108315f4fdbf711c4c.png) no-repeat center top / 100% 100%","display":"none","width":"100rpx","position":"absolute","height":"106rpx"}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

														<view class="listBox list">
			<view v-if="false && 1 == 1" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"padding":"0 40rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"0 auto 0px","overflow":"hidden","borderRadius":"0rpx","background":"url(http://localhost:8080/ssm85bqd1pj/admin/dist/img/pets.png) repeat-x 0% 100%","display":"flex","width":"calc(100%)","lineHeight":"86rpx","justifyContent":"space-between","height":"100rpx"}'>
			</view>
			
			<view v-if="false && 1 == 2" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  <view class="list-box style1" :style='{"padding":"0px","boxShadow":"0 0px 0px rgba(0,0,0,.1)","margin":"80rpx auto","borderRadius":"0px","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 48rpx)","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('chongwuxiangce',product.id)" v-for="(product,index) in homechongwuxiangcelist" :key="index" class="list-item" :style='{"padding":"20rpx","margin":"0 0 40rpx","backgroundColor":"#fff","borderColor":"#86ce9f #e1f9eb","borderRadius":"60rpx","flexWrap":"wrap","borderWidth":"2rpx","display":"flex","width":"48%","borderStyle":"solid","height":"auto"}'>
			                			  <view :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#3d8e59","textAlign":"center","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}' class="list-item-title ">{{product.pettitle}}</view>
			  			  			  			                			  <view :style='{"padding":"4rpx 20rpx","whiteSpace":"nowrap","overflow":"hidden","color":"#3d8e59","textAlign":"center","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}' class="list-item-title ">{{product.imageclass}}</view>
			  			  			  			                			  			  			                			  			  <image :style='{"minHeight":"260rpx","padding":"0","margin":"0 auto","objectFit":"cover","borderRadius":"20rpx","display":"block","width":"100%","height":"auto"}' class="list-item-image" mode="aspectFill" v-if="product.petimage.substring(0,4)=='http'" :src="product.petimage"></image>
			  <image :style='{"minHeight":"260rpx","padding":"0","margin":"0 auto","objectFit":"cover","borderRadius":"20rpx","display":"block","width":"100%","height":"auto"}' class="list-item-image" mode="aspectFill" v-else :src="product.petimage?baseUrl+product.petimage.split(',')[0]:''"></image>
			  			  			                			  			  			                			  			  			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 1 == 3" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																														<!-- 商品列表 -->
		
		

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true,
					src:'http://localhost:8080/ssm85bqd1pj/admin/dist/img/1.png'
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
				iconArr: [
				  'cuIcon-same',
				  'cuIcon-deliver',
				  'cuIcon-evaluate',
				  'cuIcon-shop',
				  'cuIcon-ticket',
				  'cuIcon-cascades',
				  'cuIcon-discover',
				  'cuIcon-question',
				  'cuIcon-pic',
				  'cuIcon-filter',
				  'cuIcon-footprint',
				  'cuIcon-pulldown',
				  'cuIcon-pullup',
				  'cuIcon-moreandroid',
				  'cuIcon-refund',
				  'cuIcon-qrcode',
				  'cuIcon-remind',
				  'cuIcon-profile',
				  'cuIcon-home',
				  'cuIcon-message',
				  'cuIcon-link',
				  'cuIcon-lock',
				  'cuIcon-unlock',
				  'cuIcon-vip',
				  'cuIcon-weibo',
				  'cuIcon-activity',
				  'cuIcon-friendadd',
				  'cuIcon-friendfamous',
				  'cuIcon-friend',
				  'cuIcon-goods',
				  'cuIcon-selection'
				],
                role : '',
                aboutUsDetail: {},
                systemIntroductionDetail: {},
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				swiperList: [],
				homechongwuxiangcelist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            this.role = uni.getStorageSync("role");
            let table = uni.getStorageSync("nowTable");
            let res = await this.$api.session(table);
            this.user = res.data;
            this.tableName = table;
            let menus = menu.list();
            this.menuList = menus;
            this.menuList.forEach((item,key) => {
                if(this.role==item.roleName) {
                    item.frontMenu.forEach((item2,key2) => {
                        if(item2.child[0].buttons.indexOf("View")>-1) {
                            this.swiperMenuList.push(item2);
                        }
                    })
                }
            })
        },
		async onShow() {
            let res;
			let swiperList = []
			res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						url: this.$base.url+item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
            this.getAboutUs();
            this.getSystemIntroduction();
			res = await this.$api.list('news', {
				page: 1,
				limit: 6,
                sort: 'id',
                order: 'desc'
			});
			this.news = res.data.list


			res = await this.$api.list('petimage', {
				page: 1,
        sort: 'imagetime',
        order: 'desc',

				limit: 4
			});
			this.homechongwuxiangcelist = res.data.list
		},

		methods: {

			onSwiperTap(e) {

			},
            async getAboutUs() {
                let res = await this.$api.info('aboutus', 1)
                this.aboutUsDetail = res.data;
            },
            async getSystemIntroduction() {
                let res = await this.$api.info('systemintro', 1)
                this.systemIntroductionDetail = res.data;
            },
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(url) {
                uni.setStorageSync("useridTag",0);
                uni.navigateTo({
                    url: url,
                    fail: function() {
                        uni.switchTab({
                            url: url
                        });
                    }
                });
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
