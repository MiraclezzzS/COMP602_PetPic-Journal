(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-login-login"],{3285:function(e,t,n){"use strict";n.r(t);var r=n("6263"),i=n.n(r);for(var a in r)"default"!==a&&function(e){n.d(t,e,(function(){return r[e]}))}(a);t["default"]=i.a},6263:function(e,t,n){"use strict";var r=n("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,n("96cf");var i=r(n("3b8d")),a=r(n("2971")),o={data:function(){return{username:"",password:"",loginType:1,codes:[{num:1,color:"#000",rotate:"10deg",size:"16px"},{num:2,color:"#000",rotate:"10deg",size:"16px"},{num:3,color:"#000",rotate:"10deg",size:"16px"},{num:4,color:"#000",rotate:"10deg",size:"16px"}],options:["Please select the login user type"],optionsValues:["","yonghu"],index:0,roleNum:0}},onLoad:function(){var e=["Please select the login user type"],t=a.default.list();this.menuList=t;for(var n=0;n<this.menuList.length;n++)"是"==this.menuList[n].hasFrontLogin&&(e.push(this.menuList[n].roleName),this.roleNum++);1==this.roleNum&&(this.index=1),this.options=e,this.styleChange()},methods:{styleChange:function(){this.$nextTick((function(){}))},onRegisterTap:function(e){uni.setStorageSync("loginTable",e),this.$utils.jump("../register/register")},onLoginTap:function(){var e=(0,i.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.username){e.next=3;break}return this.$utils.msg("enter one user name"),e.abrupt("return");case 3:if(this.password){e.next=6;break}return this.$utils.msg("请输入UserPassWord"),e.abrupt("return");case 6:if(this.optionsValues[this.index]){e.next=9;break}return this.$utils.msg("Please select the login user type"),e.abrupt("return");case 9:return e.next=11,this.$api.login("".concat(this.optionsValues[this.index]),{username:this.username,password:this.password});case 11:return t=e.sent,uni.removeStorageSync("useridTag"),uni.setStorageSync("token",t.token),uni.setStorageSync("nickname",this.username),uni.setStorageSync("nowTable","".concat(this.optionsValues[this.index])),e.next=18,this.$api.session("".concat(this.optionsValues[this.index]));case 18:t=e.sent,t.data.touxiang?uni.setStorageSync("headportrait",t.data.touxiang):t.data.headportrait&&uni.setStorageSync("headportrait",t.data.headportrait),uni.setStorageSync("userid",t.data.id),t.data.vip&&uni.setStorageSync("vip",t.data.vip),uni.setStorageSync("role","".concat(this.options[this.index])),this.$utils.tab("../index/index");case 24:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),optionsChange:function(e){this.index=e.target.value}}};t.default=o},6900:function(e,t,n){var r=n("24fb");t=r(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-c9c78194]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=t},a86a:function(e,t,n){"use strict";n.r(t);var r=n("af4c"),i=n("3285");for(var a in i)"default"!==a&&function(e){n.d(t,e,(function(){return i[e]}))}(a);n("ee4e");var o,s=n("f0c5"),d=Object(s["a"])(i["default"],r["b"],r["c"],!1,null,"c9c78194",null,!1,r["a"],o);t["default"]=d.exports},af4c:function(e,t,n){"use strict";var r,i=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("v-uni-view",{staticClass:"content"},[n("v-uni-view",{staticClass:"box",style:{minHeight:"100vh",width:"100%",padding:"120rpx 40rpx 80rpx",background:"url(http://codegen.caihongy.cn/20230411/8618bc1c31c743f7810277b59089c976.jpg) no-repeat center top / 100% 100%,#fff",height:"100%"}},[n("v-uni-view",{style:{padding:"40rpx 80rpx",boxShadow:"0px 0px 0px #aaa",borderColor:"#f0bebb",borderRadius:"40rpx",background:"none",borderWidth:"0px",display:"block",width:"100%",borderStyle:"solid",height:"auto"}},[n("v-uni-image",{style:{margin:"0 auto",borderRadius:"8rpx",objectFit:"cover",top:"-320rpx",left:"0",display:"none",width:"100%",position:"absolute",opacity:".3",height:"auto"},attrs:{src:"http://codegen.caihongy.cn/20221223/15e44917f9454ced9a9ebc4b2d40acc4.gif",mode:"aspectFill"}}),1==e.loginType?n("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 20rpx",borderRadius:"12rpx",background:"none",height:"auto"}},[n("v-uni-input",{staticClass:"uni-input",style:{padding:"0px 24rpx",boxShadow:"0px 0px 0px #2c77cb",margin:"0px",borderColor:"#b5eacb",color:"#333",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"Please enter an account"},model:{value:e.username,callback:function(t){e.username=t},expression:"username"}})],1):e._e(),1==e.loginType?n("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 20rpx",borderRadius:"12rpx",background:"none",height:"auto"}},[n("v-uni-input",{staticClass:"uni-input",style:{padding:"0px 24rpx",boxShadow:"0px 0px 0px #2c77cb",margin:"0px",borderColor:"#b5eacb",color:"#333",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"Please enter the password"},model:{value:e.password,callback:function(t){e.password=t},expression:"password"}})],1):e._e(),e.roleNum>1?n("v-uni-picker",{style:{boxShadow:"0px 0px 0px #2c77cb",margin:"0 0 32rpx 0",borderColor:"#b5eacb",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",borderStyle:"solid",height:"auto"},attrs:{value:e.index,range:e.options},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.optionsChange.apply(void 0,arguments)}}},[n("v-uni-view",{staticClass:"uni-picker-type",style:{width:"100%",padding:"0 24rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#767676"}},[e._v(e._s(e.options[e.index]))])],1):e._e(),1==e.loginType?n("v-uni-button",{staticClass:"btn-submit",style:{padding:"0 40rpx",boxShadow:"0px 0px 0px #ccc",margin:"20rpx auto 20rpx",borderColor:"#b5eacb",color:"#333",display:"block",borderRadius:"0px",background:"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(226,247,234,1) 100%)",borderWidth:"2rpx",width:"100%",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"primary"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onLoginTap.apply(void 0,arguments)}}},[e._v("Login")]):e._e(),2==e.loginType?n("v-uni-button",{staticClass:"btn-submit",style:{padding:"0 40rpx",boxShadow:"0px 0px 0px #ccc",margin:"20rpx auto 20rpx",borderColor:"#b5eacb",color:"#333",display:"block",borderRadius:"0px",background:"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(226,247,234,1) 100%)",borderWidth:"2rpx",width:"100%",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"primary"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onFaceLoginTap.apply(void 0,arguments)}}},[e._v("Face recognition login")]):e._e(),n("v-uni-view",{staticClass:"links",style:{boxShadow:"0px 0px 0px #eee",padding:"0",margin:"40rpx 0 0",borderRadius:"0px",alignItems:"flex-start",flexWrap:"wrap",textAlign:"center",background:"none",display:"block",width:"100%",justifyContent:"center",height:"auto"}},[n("v-uni-view",{staticClass:"link-highlight",style:{border:"2rpx solid #ddd",padding:"20rpx",margin:"0px 20rpx 20rpx 0",color:"#333",borderRadius:"0px",textAlign:"center",background:"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(238,238,238,1) 100%)",display:"inline-block",width:"100%",fontSize:"28rpx",order:"2"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onRegisterTap("yonghu")}}},[e._v("registerUser")])],1)],1)],1)],1)},a=[];n.d(t,"b",(function(){return i})),n.d(t,"c",(function(){return a})),n.d(t,"a",(function(){return r}))},d5e1:function(e,t,n){var r=n("6900");"string"===typeof r&&(r=[[e.i,r,""]]),r.locals&&(e.exports=r.locals);var i=n("4f06").default;i("17b149ae",r,!0,{sourceMap:!1,shadowMode:!1})},ee4e:function(e,t,n){"use strict";var r=n("d5e1"),i=n.n(r);i.a}}]);