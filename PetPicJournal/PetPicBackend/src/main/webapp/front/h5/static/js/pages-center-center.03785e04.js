(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-center-center"],{"0b61":function(e,t,n){var r=n("24fb");t=r(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-1da01357]{height:calc(100vh - 94px);box-sizing:border-box}',""]),e.exports=t},"27ae":function(e,t,n){"use strict";n.r(t);var r=n("55b4"),i=n.n(r);for(var o in r)"default"!==o&&function(e){n.d(t,e,(function(){return r[e]}))}(o);t["default"]=i.a},"55b4":function(e,t,n){"use strict";var r=n("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,n("96cf");var i=r(n("3b8d")),o=r(n("2971")),a={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],iconArr:["cuIcon-same","cuIcon-deliver","cuIcon-evaluate","cuIcon-shop","cuIcon-ticket","cuIcon-cascades","cuIcon-discover","cuIcon-question","cuIcon-pic","cuIcon-filter","cuIcon-footprint","cuIcon-pulldown","cuIcon-pullup","cuIcon-moreandroid","cuIcon-refund","cuIcon-qrcode","cuIcon-remind","cuIcon-profile","cuIcon-home","cuIcon-message","cuIcon-link","cuIcon-lock","cuIcon-unlock","cuIcon-vip","cuIcon-weibo","cuIcon-activity","cuIcon-friendadd","cuIcon-friendfamous","cuIcon-friend","cuIcon-goods","cuIcon-selection"]}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,i.default)(regeneratorRuntime.mark((function e(){var t,n,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.role=uni.getStorageSync("role"),t=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(t);case 4:n=e.sent,this.user=n.data,this.tableName=t,r=o.default.list(),this.menuList=r;case 9:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),onShow:function(){var e=(0,i.default)(regeneratorRuntime.mark((function e(){var t,n,r;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return uni.removeStorageSync("useridTag"),this.role=uni.getStorageSync("role"),t=uni.getStorageSync("nowTable"),e.next=5,this.$api.session(t);case 5:n=e.sent,this.user=n.data,this.tableName=t,r=o.default.list(),this.menuList=r;case 10:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{onPageTap:function(e){uni.setStorageSync("useridTag",1),uni.navigateTo({url:e,fail:function(){uni.switchTab({url:e})}})}}};t.default=a},"72bc":function(e,t,n){"use strict";var r=n("941f"),i=n.n(r);i.a},"74d9":function(e,t,n){"use strict";var r,i=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-uni-view",{staticClass:"content"},[n("v-uni-view",{style:{minHeight:"100vh",padding:"0px 0 120rpx",borderColor:"#21d5ae",flexWrap:"wrap",background:"#fff",borderWidth:"0px 0 0",display:"block",width:"100%",position:"relative",borderStyle:"dashed",height:"auto"}},[n("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{padding:"40rpx 40rpx 40rpx",boxShadow:"inset 0px 0px 0px 0px #f7dcab",margin:"0px auto 20rpx",borderColor:"#e9be70",display:"flex",justifyContent:"space-between",borderRadius:"0",flexWrap:"wrap",background:"none",borderWidth:"0px 0px 0px 0px",width:"calc(100% - 0px)",position:"relative",borderStyle:"solid",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../user-info/user-info")}}},["yonghu"==e.tableName?n("v-uni-view",{staticClass:"userinfo",style:{padding:"0",margin:"0",alignItems:"flex-start",flexWrap:"wrap",background:"none",display:"flex",width:"calc(100% - 0px)",position:"static",height:"auto",order:"2"}},[n("v-uni-image",{style:{padding:"0px",margin:"0px 0 20rpx",borderColor:"#1bd0a9",objectFit:"cover",textAlign:"center",right:"100rpx",borderRadius:"100%",top:"80rpx",background:"rgba(255,255,255,.6)",borderWidth:"0px",width:"120rpx",position:"absolute",borderStyle:"solid",height:"120rpx",zIndex:"999"},attrs:{src:e.user.touxiang?e.baseUrl+e.user.touxiang:"/static/gen/upload.png"}}),n("v-uni-view",{staticClass:"info",style:{padding:"36rpx 16rpx 60rpx 40rpx",margin:"0 auto",borderColor:"#86ce9f #e1f9eb",flexDirection:"column",display:"block",float:"left",justifyContent:"center",minHeight:"324rpx",borderRadius:"20rpx",background:"url(http://codegen.caihongy.cn/20230410/9f502c94c8b84bc0aea8e0b413fa7698.png) repeat-x 0% 100%,#f5fdf8",borderWidth:"8rpx 2rpx 0",width:"100%",borderStyle:"solid",height:"auto"}},[n("v-uni-view",{style:{padding:"4rpx 8rpx",borderColor:"#eecece",margin:"0 0 0px",color:"#369555",borderWidth:"0 0 0px",width:"90%",lineHeight:"60rpx",fontSize:"28rpx",borderStyle:"dashed",fontWeight:"600"}},[e._v(e._s(e.user.yonghuming)),e.user.vip&&"是"==e.user.vip?n("v-uni-text",[e._v("(VIP)")]):e._e()],1)],1)],1):e._e(),n("v-uni-view",{staticClass:"setting",style:{padding:"20rpx 0 0",margin:"0px 0 0",borderColor:"#1bd0a9",alignItems:"flex-start",display:"flex",right:"80rpx",justifyContent:"center",top:"220rpx",background:"none",borderWidth:"0px",width:"160rpx",position:"absolute",borderStyle:"solid",height:"auto"}},[n("v-uni-view",{staticClass:"cuIcon-settings",style:{border:"0",width:"80rpx",lineHeight:"80rpx",fontSize:"80rpx",color:"#369555",borderRadius:"0"}})],1)],1),n("v-uni-view",{staticClass:"list",style:{padding:"0px 24rpx 80rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",margin:"0 auto",borderColor:"#1bd0a9",display:"block",justifyContent:"space-between",overflow:"hidden",borderRadius:"0px",flexWrap:"wrap",background:"#fff",borderWidth:"0px 0px 0px 0px",width:"calc(100% - 48rpx)",borderStyle:"solid",height:"auto"}},[e._l(e.menuList,(function(t){return[e._l(t.backMenu,(function(r,i){return e.role==t.roleName?[e._l(r.child,(function(t,r){return["yifahuodingdan"!=t.tableName&&"yituikuandingdan"!=t.tableName&&"yiquxiaodingdan"!=t.tableName&&"weizhifudingdan"!=t.tableName&&"yizhifudingdan"!=t.tableName&&"yiwanchengdingdan"!=t.tableName&&"exampaper"!=t.tableName&&"examquestion"!=t.tableName?n("v-uni-view",{key:r+"_0",staticClass:"li",style:{padding:"0 40rpx 0px",borderColor:"#e1f9eb",margin:"0 0 20rpx",alignItems:"center",display:"flex",float:"left",borderRadius:"0px",borderWidth:"2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",width:"100%",lineHeight:"88rpx",borderStyle:"solid",height:"100rpx"},attrs:{"hover-class":"hover"},on:{click:function(n){arguments[0]=n=e.$handleEvent(n),e.onPageTap("../"+t.tableName+"/list?userid="+e.user.id+"&menuJump="+t.menuJump)}}},[n("v-uni-view",{class:t.appFrontIcon,style:{width:"88rpx",lineHeight:"88rpx",fontSize:"56rpx",color:"#369555"}}),n("v-uni-view",{staticClass:"text",style:{padding:"0 8rpx",color:"#369555",flex:"1",width:"100%",lineHeight:"88rpx",fontSize:"28rpx",fontWeight:"500"}},[e._v(e._s(t.menu))]),n("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"32rpx",color:"#369555"}})],1):e._e()]}))]:e._e()}))]})),n("v-uni-view",{staticClass:"li",style:{padding:"0 40rpx 0px",borderColor:"#e1f9eb",margin:"0 0 20rpx",alignItems:"center",display:"flex",float:"left",borderRadius:"0px",borderWidth:"2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",width:"100%",lineHeight:"88rpx",borderStyle:"solid",height:"100rpx"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../chat/chat")}}},[n("v-uni-view",{staticClass:"cuIcon-service",style:{width:"88rpx",lineHeight:"88rpx",fontSize:"56rpx",color:"#369555"}}),n("v-uni-view",{staticClass:"text",style:{padding:"0 8rpx",color:"#369555",flex:"1",width:"100%",lineHeight:"88rpx",fontSize:"28rpx",fontWeight:"500"}},[e._v("Feedback suggestions")]),n("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"32rpx",color:"#369555"}})],1)],2)],1)],1)},o=[];n.d(t,"b",(function(){return i})),n.d(t,"c",(function(){return o})),n.d(t,"a",(function(){return r}))},"941f":function(e,t,n){var r=n("0b61");"string"===typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);var i=n("4f06").default;i("982cb5b8",r,!0,{sourceMap:!1,shadowMode:!1})},d2c0:function(e,t,n){"use strict";n.r(t);var r=n("74d9"),i=n("27ae");for(var o in i)"default"!==o&&function(e){n.d(t,e,(function(){return i[e]}))}(o);n("72bc");var a,c=n("f0c5"),s=Object(c["a"])(i["default"],r["b"],r["c"],!1,null,"1da01357",null,!1,r["a"],a);t["default"]=s.exports}}]);