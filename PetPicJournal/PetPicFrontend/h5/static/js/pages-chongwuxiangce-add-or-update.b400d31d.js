(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-chongwuxiangce-add-or-update"],{"04bb":function(e,i,t){"use strict";var n=t("4ea4");Object.defineProperty(i,"__esModule",{value:!0}),i.default=void 0,t("a481"),t("c5f6"),t("f559"),t("ac6a"),t("28a5"),t("96cf");var r=n(t("3b8d")),a=n(t("e2b1")),o=n(t("064f")),s=n(t("bd56")),u={data:function(){return{cross:"",ruleForm:{zhaopianbiaoti:"",imageclass:"",imagetime:"",zhaopian:"",username:"",zhaopianmiaoshu:""},imageclassOptions:[],imageclassIndex:0,user:{},ro:{zhaopianbiaoti:!1,imageclass:!1,imagetime:!1,zhaopian:!1,username:!1,zhaopianmiaoshu:!1}}},components:{wPicker:a.default,xiaEditor:o.default,multipleSelect:s.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(i){var t,n,r,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:return n=e.sent,this.user=n.data,this.ruleForm.username=this.user.username,this.ro.username=!0,e.next=9,this.$api.option("imageclass","imageclass",{});case 9:if(n=e.sent,this.imageclassOptions=n.data,this.imageclassOptions.unshift("Please select Album Category"),this.ruleForm.userid=uni.getStorageSync("userid"),i.refid&&(this.ruleForm.refid=i.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!i.id){e.next=20;break}return this.ruleForm.id=i.id,e.next=18,this.$api.info("chongwuxiangce",this.ruleForm.id);case 18:n=e.sent,this.ruleForm=n.data;case 20:if(this.cross=i.cross,!i.cross){e.next=52;break}r=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(r);case 24:if((e.t1=e.t0()).done){e.next=52;break}if(a=e.t1.value,"zhaopianbiaoti"!=a){e.next=30;break}return this.ruleForm.zhaopianbiaoti=r[a],this.ro.zhaopianbiaoti=!0,e.abrupt("continue",24);case 30:if("imageclass"!=a){e.next=34;break}return this.ruleForm.imageclass=r[a],this.ro.imageclass=!0,e.abrupt("continue",24);case 34:if("imagetime"!=a){e.next=38;break}return this.ruleForm.imagetime=r[a],this.ro.imagetime=!0,e.abrupt("continue",24);case 38:if("zhaopian"!=a){e.next=42;break}return this.ruleForm.zhaopian=r[a].split(",")[0],this.ro.zhaopian=!0,e.abrupt("continue",24);case 42:if("username"!=a){e.next=46;break}return this.ruleForm.username=r[a],this.ro.username=!0,e.abrupt("continue",24);case 46:if("zhaopianmiaoshu"!=a){e.next=50;break}return this.ruleForm.zhaopianmiaoshu=r[a],this.ro.zhaopianmiaoshu=!0,e.abrupt("continue",24);case 50:e.next=24;break;case 52:this.styleChange(),this.$forceUpdate();case 54:case"end":return e.stop()}}),e,this)})));function i(i){return e.apply(this,arguments)}return i}(),methods:{zhaopianmiaoshuChange:function(e){this.ruleForm.zhaopianmiaoshu=e},styleChange:function(){this.$nextTick((function(){}))},imagetimeChange:function(e){this.ruleForm.imagetime=e.target.value,this.$forceUpdate()},imageclassChange:function(e){this.imageclassIndex=e.target.value,this.ruleForm.imageclass=this.imageclassOptions[this.imageclassIndex]},zhaopianTap:function(){var e=this;this.$api.upload((function(i){e.ruleForm.zhaopian="upload/"+i.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var i,t,n,r,a,o,s,u,l,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.cross){e.next=17;break}if(uni.setStorageSync("crossCleanType",!0),a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=17;break}if(i||(i=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=13;break}for(s in i)s==a&&(i[s]=o);return u=uni.getStorageSync("crossTable"),e.next=11,this.$api.update("".concat(u),i);case 11:e.next=17;break;case 13:t=Number(uni.getStorageSync("userid")),n=i["id"],r=uni.getStorageSync("statusColumnName"),r=r.replace(/\[/,"").replace(/\]/,"");case 17:if(!n||!t){e.next=40;break}return this.ruleForm.crossuserid=t,this.ruleForm.crossrefid=n,l={page:1,limit:10,crossuserid:t,crossrefid:n},e.next=23,this.$api.list("chongwuxiangce",l);case 23:if(d=e.sent,!(d.data.total>=r)){e.next=30;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 30:if(!this.ruleForm.id){e.next=35;break}return e.next=33,this.$api.update("chongwuxiangce",this.ruleForm);case 33:e.next=37;break;case 35:return e.next=37,this.$api.add("chongwuxiangce",this.ruleForm);case 37:this.$utils.msgBack("Successfully submitted");case 38:e.next=48;break;case 40:if(!this.ruleForm.id){e.next=45;break}return e.next=43,this.$api.update("chongwuxiangce",this.ruleForm);case 43:e.next=47;break;case 45:return e.next=47,this.$api.add("chongwuxiangce",this.ruleForm);case 47:this.$utils.msgBack("Successfully submitted");case 48:case"end":return e.stop()}}),e,this)})));function i(){return e.apply(this,arguments)}return i}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var i=new Date,t=i.getFullYear(),n=i.getMonth()+1,r=i.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),n=n>9?n:"0"+n,r=r>9?r:"0"+r,"".concat(t,"-").concat(n,"-").concat(r)},toggleTab:function(e){this.$refs[e].show()}}};i.default=u},"2d2d":function(e,i,t){"use strict";t.r(i);var n=t("04bb"),r=t.n(n);for(var a in n)"default"!==a&&function(e){t.d(i,e,(function(){return n[e]}))}(a);i["default"]=r.a},"30b8":function(e,i,t){"use strict";var n=t("c4cb"),r=t.n(n);r.a},"4f12":function(e,i,t){"use strict";t.r(i);var n=t("d519"),r=t("2d2d");for(var a in r)"default"!==a&&function(e){t.d(i,e,(function(){return r[e]}))}(a);t("30b8");var o,s=t("f0c5"),u=Object(s["a"])(r["default"],n["b"],n["c"],!1,null,"f177de18",null,!1,n["a"],o);i["default"]=u.exports},"638c":function(e,i,t){var n=t("24fb");i=n(!1),i.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-f177de18]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=i},c4cb:function(e,i,t){var n=t("638c");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var r=t("4f06").default;r("5e24ef90",n,!0,{sourceMap:!1,shadowMode:!1})},d519:function(e,i,t){"use strict";var n={"xia-editor":t("064f").default},r=function(){var e=this,i=e.$createElement,t=e._self._c||i;return t("v-uni-view",{staticClass:"content"},[t("v-uni-view",{style:{minHeight:"100vh",padding:"0px 0 80rpx",borderColor:"#21d5ae",background:"#fff",borderWidth:"0px 0 0",width:"100%",position:"relative",borderStyle:"dashed",height:"auto"}},[t("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"60rpx 40rpx",background:"none",height:"auto"}},[t("v-uni-view",{style:{padding:"0 20rpx 0px",margin:"0 0 20rpx",borderColor:"#e1f9eb",borderRadius:"0px",flexWrap:"wrap",borderWidth:"2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",display:"flex",width:"100%",lineHeight:"100rpx",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 0",fontSize:"28rpx",color:"#369555",textAlign:"right",fontWeight:"600"}},[e._v("Photo Title")]),t("v-uni-input",{style:{border:"0",padding:"0px 20rpx",margin:"0px",color:"#666",borderRadius:"0px",flex:"1",background:"none",fontSize:"28rpx"},attrs:{disabled:e.ro.zhaopianbiaoti,placeholder:"Photo Title"},model:{value:e.ruleForm.zhaopianbiaoti,callback:function(i){e.$set(e.ruleForm,"zhaopianbiaoti",i)},expression:"ruleForm.zhaopianbiaoti"}})],1),t("v-uni-view",{staticClass:" select",style:{padding:"0 20rpx 0px",margin:"0 0 20rpx",borderColor:"#e1f9eb",borderRadius:"0px",flexWrap:"wrap",borderWidth:"2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",display:"flex",width:"100%",lineHeight:"100rpx",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 0",fontSize:"28rpx",color:"#369555",textAlign:"right",fontWeight:"600"}},[e._v("Album Category")]),t("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.imageclassIndex,range:e.imageclassOptions},on:{change:function(i){arguments[0]=i=e.$handleEvent(i),e.imageclassChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{width:"100%",padding:"0 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#666",background:"none"}},[e._v(e._s(e.ruleForm.imageclass?e.ruleForm.imageclass:"Please select Album Category"))])],1)],1),t("v-uni-view",{staticClass:" select",style:{padding:"0 20rpx 0px",margin:"0 0 20rpx",borderColor:"#e1f9eb",borderRadius:"0px",flexWrap:"wrap",borderWidth:"2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",display:"flex",width:"100%",lineHeight:"100rpx",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 0",fontSize:"28rpx",color:"#369555",textAlign:"right",fontWeight:"600"}},[e._v("Shooting time")]),t("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{mode:"date",value:e.ruleForm.imagetime},on:{change:function(i){arguments[0]=i=e.$handleEvent(i),e.imagetimeChange.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"uni-input",style:{width:"100%",padding:"0 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#666",background:"none"}},[e._v(e._s(e.ruleForm.imagetime?e.ruleForm.imagetime:"Please select Shooting time"))])],1)],1),t("v-uni-view",{style:{padding:"0 20rpx 0px",margin:"0 0 20rpx",borderColor:"#e1f9eb",borderRadius:"0px",flexWrap:"wrap",borderWidth:"2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",display:"flex",width:"100%",lineHeight:"100rpx",borderStyle:"solid",height:"auto"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.zhaopianTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 0",fontSize:"28rpx",color:"#369555",textAlign:"right",fontWeight:"600"}},[e._v("照片")]),e.ruleForm.zhaopian?t("v-uni-image",{staticClass:"avator",style:{width:"72rpx",margin:"12rpx 0",borderRadius:"100%",objectFit:"cover",display:"block",height:"72rpx"},attrs:{src:e.baseUrl+e.ruleForm.zhaopian.split(",")[0],mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{width:"72rpx",margin:"12rpx 0",borderRadius:"100%",objectFit:"cover",display:"block",height:"72rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),t("v-uni-view",{style:{padding:"0 20rpx 0px",margin:"0 0 20rpx",borderColor:"#e1f9eb",borderRadius:"0px",flexWrap:"wrap",borderWidth:"2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",display:"flex",width:"100%",lineHeight:"100rpx",borderStyle:"solid",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 0",fontSize:"28rpx",color:"#369555",textAlign:"right",fontWeight:"600"}},[e._v("UserName")]),t("v-uni-input",{style:{border:"0",padding:"0px 20rpx",margin:"0px",color:"#666",borderRadius:"0px",flex:"1",background:"none",fontSize:"28rpx"},attrs:{disabled:e.ro.username,placeholder:"UserName"},model:{value:e.ruleForm.username,callback:function(i){e.$set(e.ruleForm,"username",i)},expression:"ruleForm.username"}})],1),t("v-uni-view",{style:{padding:"20rpx 20rpx",margin:"0 0 24rpx",borderColor:"#d9eff0",borderWidth:"0 0 2rpx",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",width:"100%",borderStyle:"dashed",height:"auto"}},[t("v-uni-view",{staticClass:"title",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#369555",fontWeight:"600"}},[e._v("Photo description")]),t("xia-editor",{ref:"editor",style:{padding:"0px",borderColor:"#f4e5e2",borderRadius:"0px",color:"#666",background:"none",borderWidth:"0px",width:"100%",borderStyle:"solid",height:"auto"},attrs:{placeholder:"Photo description"},on:{editorChange:function(i){arguments[0]=i=e.$handleEvent(i),e.zhaopianmiaoshuChange.apply(void 0,arguments)}},model:{value:e.ruleForm.zhaopianmiaoshu,callback:function(i){e.$set(e.ruleForm,"zhaopianmiaoshu",i)},expression:"ruleForm.zhaopianmiaoshu"}})],1),t("v-uni-view",{staticClass:"btn",style:{padding:"0px",margin:"40rpx 0 0",flexWrap:"wrap",background:"none",display:"flex",width:"100%",justifyContent:"center",height:"auto"}},[t("v-uni-button",{staticClass:"bg-red",style:{padding:"0 40rpx",boxShadow:"0px 0px 0px #ccc",margin:"0 0 40rpx",borderColor:"#d8f5e3",color:"#333",display:"inline",minWidth:"200rpx",borderRadius:"0px",background:"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(226,247,234,1) 100%)",borderWidth:"2rpx",width:"100%",lineHeight:"88rpx",fontSize:"28rpx",borderStyle:"solid",fontWeight:"500",height:"88rpx"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("submitted")])],1)],1)],1)],1)},a=[];t.d(i,"b",(function(){return r})),t.d(i,"c",(function(){return a})),t.d(i,"a",(function(){return n}))}}]);