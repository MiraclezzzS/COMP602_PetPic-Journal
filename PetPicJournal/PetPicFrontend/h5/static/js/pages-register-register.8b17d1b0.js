(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-register-register"],{2327:function(e,t,i){var n=i("58d7");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var a=i("4f06").default;a("6903598e",n,!0,{sourceMap:!1,shadowMode:!1})},3532:function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-ff92289c]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=t},3735:function(e,t,i){"use strict";i.r(t);var n=i("db67"),a=i("48c7");for(var r in a)"default"!==r&&function(e){i.d(t,e,(function(){return a[e]}))}(r);i("c12c");var o,s=i("f0c5"),l=Object(s["a"])(a["default"],n["b"],n["c"],!1,null,"ff92289c",null,!1,n["a"],o);t["default"]=l.exports},"48c7":function(e,t,i){"use strict";i.r(t);var n=i("4e2d"),a=i.n(n);for(var r in n)"default"!==r&&function(e){i.d(t,e,(function(){return n[e]}))}(r);t["default"]=a.a},"4e2d":function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("28a5"),i("96cf");var a=n(i("3b8d")),r=n(i("bd56")),o={data:function(){return{yonghuxingbieOptions:[],yonghuxingbieIndex:0,ruleForm:{yonghuming:"",xingming:"",mima:"",xingbie:"",lianxidianhua:"",touxiang:""},tableName:""}},components:{multipleSelect:r.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:[],t=uni.getStorageSync("loginTable"),this.tableName=t,"yonghu"==this.tableName&&(this.yonghuxingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.yonghuxingbieOptions[0]),this.styleChange();case 5:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{yonghuxingbieChange:function(e){this.yonghuxingbieIndex=e.target.value,this.ruleForm.xingbie=this.yonghuxingbieOptions[this.yonghuxingbieIndex]},yonghutouxiangTap:function(){var e=this;this.$api.upload((function(t){e.ruleForm.touxiang="upload/"+t.file,e.$forceUpdate()}))},toggleTab:function(e){this.$refs[e].show()},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.yonghuming||"yonghu"!=this.tableName){e.next=3;break}return this.$utils.msg("UserName not null"),e.abrupt("return");case 3:if(this.ruleForm.xingming||"yonghu"!=this.tableName){e.next=6;break}return this.$utils.msg("Full Name not null"),e.abrupt("return");case 6:if(this.ruleForm.mima||"yonghu"!=this.tableName){e.next=9;break}return this.$utils.msg("PassWord not null"),e.abrupt("return");case 9:if("yonghu"!=this.tableName||this.ruleForm.mima==this.ruleForm.mima2){e.next=12;break}return this.$utils.msg("The two password inputs are inconsistent"),e.abrupt("return");case 12:if("yonghu"!=this.tableName||!this.ruleForm.lianxidianhua||this.$validate.isMobile(this.ruleForm.lianxidianhua)){e.next=15;break}return this.$utils.msg("Phone应输入手机格式"),e.abrupt("return");case 15:return e.next=17,this.$api.register("".concat(this.tableName),this.ruleForm);case 17:this.$utils.msgBack("Registration successful");case 19:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()}};t.default=o},"58d7":function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便User通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过Modify这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.select-container[data-v-19a2c7ee]{width:100vw;height:100vh;position:fixed;left:0;top:0;z-index:999}.select-container .mask[data-v-19a2c7ee]{width:100%;height:100%;background-color:rgba(0,0,0,.4);opacity:0;-webkit-transition:opacity .3s;transition:opacity .3s}.select-container .mask.mask-show[data-v-19a2c7ee]{opacity:1}.select-container .select-box[data-v-19a2c7ee]{width:100%;position:absolute;bottom:0;left:0;-webkit-transform:translate3d(0,100%,0);transform:translate3d(0,100%,0);background-color:#fff;-webkit-transition:all .3s;transition:all .3s}.select-container .select-box.select-box-show[data-v-19a2c7ee]{-webkit-transform:translateZ(0);transform:translateZ(0)}.select-container .select-box .header[data-v-19a2c7ee]{display:-webkit-box;display:-webkit-flex;display:flex;box-sizing:border-box;width:100%;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;border-bottom:1px solid #c8c7cc;line-height:%?76?%;font-size:%?30?%;padding:0 %?18?%}.select-container .select-box .header .cancel[data-v-19a2c7ee]{color:#999}.select-container .select-box .header .all[data-v-19a2c7ee]{color:#4cd964}.select-container .select-box .header .all .all-active[data-v-19a2c7ee]::after{display:inline-block;content:"✔";padding-left:%?8?%}.select-container .select-box .header .confirm[data-v-19a2c7ee]{color:#007aff}.select-container .select-box .body-warp[data-v-19a2c7ee]{width:100%;height:30vh;box-sizing:border-box;padding:%?20?% %?18?%}.select-container .select-box .body[data-v-19a2c7ee]{width:100%;height:100%;overflow-y:auto}.select-container .select-box .body .empty-tips[data-v-19a2c7ee]{margin-top:25%;text-align:center;font-size:%?26?%;color:#dd524d}.select-container .select-box .body .select-item[data-v-19a2c7ee]{display:-webkit-box;display:-webkit-flex;display:flex;font-size:%?26?%;line-height:%?58?%;color:#303133;position:relative;-webkit-transition:all .3s;transition:all .3s}.select-container .select-box .body .select-item.selected[data-v-19a2c7ee]{color:#007aff}.select-container .select-box .body .select-item.disabled[data-v-19a2c7ee]{color:silver}.select-container .select-box .body .select-item > .label[data-v-19a2c7ee]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:center}.select-container .select-box .body .select-item > .selected-icon[data-v-19a2c7ee]{position:absolute;right:0;top:50%;-webkit-transform:translateY(-50%);transform:translateY(-50%)}',""]),e.exports=t},7645:function(e,t,i){"use strict";var n=i("2327"),a=i.n(n);a.a},"7ec0":function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("ac6a"),i("96cf");var a=n(i("3b8d"));i("6762"),i("2fdb");var r={model:{prop:"value",event:["input"]},data:function(){return{show:!1,activeClass:!1,selectedArr:[],selectedArrOld:[]}},onShow:function(){this.show=this.value},computed:{isAll:function(){var e=this.returnWipeDisabledList();return!!e.length&&!e.includes(!1)}},props:{value:{type:Boolean,default:!1},cancelText:{type:String,default:"cancel"},confirmText:{type:String,default:"确认"},labelName:{type:String,default:"label"},valueName:{type:String,default:"value"},maskCloseAble:{type:Boolean,default:!0},allShow:{type:Boolean,default:!0},mode:{type:String,default:"multiple"},defaultSelected:{type:Array,default:function(){return[]}},data:{type:Array,required:!0,default:function(){return[]}}},watch:{value:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(t){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.show=t,e.next=3,this.$nextTick();case 3:this.activeClass=t,t&&(this.selectedArrOld=JSON.parse(JSON.stringify(this.selectedArr)));case 5:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),show:function(e){this.$emit("input",e),this.$emit("change",e)},data:{handler:function(e){this.selectedArr=e.map((function(e){return!1})),this.setItemActiveState()},deep:!0,immediate:!0},defaultSelected:{handler:function(){this.setItemActiveState()},deep:!0,immediate:!0}},methods:{setItemActiveState:function(){var e=this;this.data.length&&this.defaultSelected.length&&this.data.forEach((function(t,i){for(var n=0;n<e.defaultSelected.length;n++)if(!t.disabled&&t[e.valueName]===e.defaultSelected[n]){e.selectedArr.splice(i,1,!0);break}}))},onSelected:function(e){if(!this.data[e].disabled){var t=this.selectedArr[e];this.selectedArr.splice(e,1,!t)}},onCancel:function(e){e&&!this.maskCloseAble||(this.show=!1,this.selectedArr=JSON.parse(JSON.stringify(this.selectedArrOld)),this.$emit("cancel"))},returnWipeDisabledList:function(){var e=this,t=[];return this.selectedArr.forEach((function(i,n){e.data[n].disabled||t.push(i)})),t},onAllToggle:function(){var e=this,t=this.returnWipeDisabledList();t.includes(!1)?this.selectedArr.forEach((function(t,i){e.data[i].disabled||e.selectedArr.splice(i,1,!0)})):this.selectedArr.forEach((function(t,i){e.data[i].disabled||e.selectedArr.splice(i,1,!1)}))},onConfirm:function(){var e=this;this.show=!1;var t=[];if(this.selectedArr.forEach((function(i,n){i&&t.push(e.data[n])})),"multiple"===this.mode)this.$emit("confirm",t);else{var i=t[0]||{};this.$emit("confirm",i)}}}};t.default=r},"83b0":function(e,t,i){"use strict";i.r(t);var n=i("7ec0"),a=i.n(n);for(var r in n)"default"!==r&&function(e){i.d(t,e,(function(){return n[e]}))}(r);t["default"]=a.a},bd56:function(e,t,i){"use strict";i.r(t);var n=i("f64d"),a=i("83b0");for(var r in a)"default"!==r&&function(e){i.d(t,e,(function(){return a[e]}))}(r);i("7645");var o,s=i("f0c5"),l=Object(s["a"])(a["default"],n["b"],n["c"],!1,null,"19a2c7ee",null,!1,n["a"],o);t["default"]=l.exports},c12c:function(e,t,i){"use strict";var n=i("c6ab"),a=i.n(n);a.a},c6ab:function(e,t,i){var n=i("3532");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var a=i("4f06").default;a("7f038a0e",n,!0,{sourceMap:!1,shadowMode:!1})},db67:function(e,t,i){"use strict";var n,a=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{staticClass:"box",style:{minHeight:"100vh",width:"100%",padding:"120rpx 40rpx 80rpx",background:"url(http://codegen.caihongy.cn/20230411/8618bc1c31c743f7810277b59089c976.jpg) no-repeat center top / 100% 100%,#fff",height:"100%"}},[i("v-uni-view",{style:{padding:"40rpx 80rpx",boxShadow:"0px 0px 0px #aaa",borderColor:"#e9be70",borderRadius:"40rpx",background:"none",borderWidth:"0px",display:"block",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-image",{style:{width:"160rpx",margin:"0 auto 24rpx auto",borderRadius:"40rpx",display:"none",height:"160rpx"},attrs:{src:"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg",mode:"aspectFill"}}),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 20rpx 0",height:"auto"}},[i("v-uni-input",{staticClass:"uni-input",style:{padding:"0px 24rpx",boxShadow:"0px 0px 0px #2c77cb",margin:"0px",borderColor:"#b5eacb",color:"#333",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"UserName"},model:{value:e.ruleForm.yonghuming,callback:function(t){e.$set(e.ruleForm,"yonghuming",t)},expression:"ruleForm.yonghuming"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 20rpx 0",height:"auto"}},[i("v-uni-input",{staticClass:"uni-input",style:{padding:"0px 24rpx",boxShadow:"0px 0px 0px #2c77cb",margin:"0px",borderColor:"#b5eacb",color:"#333",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"Full Name"},model:{value:e.ruleForm.xingming,callback:function(t){e.$set(e.ruleForm,"xingming",t)},expression:"ruleForm.xingming"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 20rpx 0",height:"auto"}},[i("v-uni-input",{staticClass:"uni-input",style:{padding:"0px 24rpx",boxShadow:"0px 0px 0px #2c77cb",margin:"0px",borderColor:"#b5eacb",color:"#333",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"password",name:"",placeholder:"PassWord"},model:{value:e.ruleForm.mima,callback:function(t){e.$set(e.ruleForm,"mima",t)},expression:"ruleForm.mima"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 20rpx 0",height:"auto"}},[i("v-uni-input",{staticClass:"uni-input",style:{padding:"0px 24rpx",boxShadow:"0px 0px 0px #2c77cb",margin:"0px",borderColor:"#b5eacb",color:"#333",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"password",name:"",placeholder:" Confirm Password"},model:{value:e.ruleForm.mima2,callback:function(t){e.$set(e.ruleForm,"mima2",t)},expression:"ruleForm.mima2"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-picker",{style:{boxShadow:"0px 0px 0px #2c77cb",margin:"20rpx 0 20rpx 0",borderColor:"#b5eacb",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",borderStyle:"solid",height:"auto"},attrs:{value:e.yonghuxingbieIndex,range:e.yonghuxingbieOptions},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.yonghuxingbieChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{width:"100%",padding:"0 24rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#767676"}},[e._v(e._s(e.ruleForm.xingbie?e.ruleForm.xingbie:"Please select Gender"))])],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column",style:{width:"100%",margin:"0 0 20rpx 0",height:"auto"}},[i("v-uni-input",{staticClass:"uni-input",style:{padding:"0px 24rpx",boxShadow:"0px 0px 0px #2c77cb",margin:"0px",borderColor:"#b5eacb",color:"#333",borderRadius:"0px",background:"linear-gradient(270deg, rgba(255,255,255,1) 0%, rgba(245,253,248,1) 100%)",borderWidth:"2rpx",width:"100%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"text",name:"",placeholder:"Phone"},model:{value:e.ruleForm.lianxidianhua,callback:function(t){e.$set(e.ruleForm,"lianxidianhua",t)},expression:"ruleForm.lianxidianhua"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{style:{width:"100%",margin:"0 0 20rpx 0",height:"auto"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.yonghutouxiangTap.apply(void 0,arguments)}}},[i("v-uni-view",[e._v("请上传Head Sculpture")]),e.ruleForm.touxiang?i("v-uni-image",{staticClass:"avator",style:{border:"0px solid #ccc",width:"200rpx",borderRadius:"0px",objectFit:"cover",display:"block",height:"120rpx"},attrs:{src:e.baseUrl+e.ruleForm.touxiang,mode:""}}):i("v-uni-image",{staticClass:"avator",style:{border:"0px solid #ccc",width:"200rpx",borderRadius:"0px",objectFit:"cover",display:"block",height:"120rpx"},attrs:{src:"../../static/gen/upload.png",mode:""}})],1):e._e(),i("v-uni-button",{staticClass:"btn-submit",style:{padding:"0px",boxShadow:"0px 0px 0px #ccc",margin:"32rpx auto 204rpx",borderColor:"#b5eacb",color:"#333",display:"block",borderRadius:"0px",background:"linear-gradient(180deg, rgba(255,255,255,1) 0%, rgba(226,247,234,1) 100%)",borderWidth:"2rpx",width:"100%",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},attrs:{type:"primary"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.register.apply(void 0,arguments)}}},[e._v("register")])],1)],1)],1)},r=[];i.d(t,"b",(function(){return a})),i.d(t,"c",(function(){return r})),i.d(t,"a",(function(){return n}))},f64d:function(e,t,i){"use strict";var n,a=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{directives:[{name:"show",rawName:"v-show",value:e.show,expression:"show"}],staticClass:"select-container",on:{touchmove:function(t){t.stopPropagation(),t.preventDefault(),arguments[0]=t=e.$handleEvent(t)}}},[i("v-uni-view",{staticClass:"mask",class:e.activeClass?"mask-show":"",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onCancel(!0)}}}),i("v-uni-view",{staticClass:"select-box",class:e.activeClass?"select-box-show":""},[i("v-uni-view",{staticClass:"header"},[i("v-uni-text",{staticClass:"cancel",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onCancel.apply(void 0,arguments)}}},[e._v(e._s(e.cancelText))]),e.allShow?i("v-uni-view",{staticClass:"all",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onAllToggle.apply(void 0,arguments)}}},[i("v-uni-text",{class:e.isAll?"all-active":""},[e._v("全选")])],1):e._e(),i("v-uni-text",{staticClass:"confirm",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onConfirm.apply(void 0,arguments)}}},[e._v(e._s(e.confirmText))])],1),i("v-uni-view",{staticClass:"body-warp"},[i("v-uni-scroll-view",{staticClass:"body",attrs:{"scroll-y":"true"}},[e.data.length?e._e():e._t("tips",[i("v-uni-view",{staticClass:"empty-tips"},[e._v("暂无数据~")])]),e._l(e.data,(function(t,n){return i("v-uni-view",{key:t[e.valueName],staticClass:"select-item",class:[t.disabled?"disabled":"",e.selectedArr[n]?"selected":""],on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onSelected(n)}}},[i("v-uni-view",{staticClass:"label"},[e._v(e._s(t[e.labelName]))]),i("v-uni-text",{directives:[{name:"show",rawName:"v-show",value:e.selectedArr[n],expression:"selectedArr[index]"}],staticClass:"selected-icon"},[e._v("✔")])],1)}))],2)],1)],1)],1)},r=[];i.d(t,"b",(function(){return a})),i.d(t,"c",(function(){return r})),i.d(t,"a",(function(){return n}))}}]);