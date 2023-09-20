import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import discusschongwuxiangce from '@/views/modules/discusschongwuxiangce/list'
    import chongwuxiangce from '@/views/modules/chongwuxiangce/list'
    import storeup from '@/views/modules/storeup/list'
    import imageclass from '@/views/modules/imageclass/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: 'System homepage',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: 'System homepage',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: 'ModifyPassWord',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: 'Personal Information',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: 'Rotation Chart Management',
        component: news
      }
      ,{
	path: '/aboutus',
        name: 'About us',
        component: aboutus
      }
      ,{
	path: '/systemintro',
        name: 'System Introduction',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: 'User',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: 'Feedback suggestions',
        component: chat
      }
      ,{
	path: '/discusschongwuxiangce',
        name: 'Pet Album Comment',
        component: discusschongwuxiangce
      }
      ,{
	path: '/chongwuxiangce',
        name: 'Pet Album',
        component: chongwuxiangce
      }
      ,{
	path: '/storeup',
        name: 'My Collection Management',
        component: storeup
      }
      ,{
	path: '/imageclass',
        name: 'Album Category',
        component: imageclass
      }
      ,{
	path: '/config',
        name: 'Rotation Chart Management',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: 'System homepage',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//Modify原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
