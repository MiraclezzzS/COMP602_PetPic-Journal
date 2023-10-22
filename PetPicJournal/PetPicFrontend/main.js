import uView from "uview-ui"
import Vue from 'vue'
import App from './App'
import utils from './utils/utils.js'
import api from './api/index.js'
import base from './api/base.js'
import * as validate from 'utils/validate.js'

import { isAuth } from '@/utils/system'
import { isAuthFront } from '@/utils/system'

import uniPopup from "./components/uni-popup/uni-popup.vue"

import MescrollUni from "./components/mescroll-uni/mescroll-uni.vue";

import uniLoadMore from "./components/uni-load-more/uni-load-more.vue"
import {VueJsonp} from './components/vue-jsonp'

import zSwiperItem from "./components/zebra-swiper/components/z-swiper-item/z-swiper-item.vue";
import zSwiper from "./components/zebra-swiper/components/z-swiper/z-swiper.vue";

import musicPlay from "./components/musicPlay/musicPlay";

Vue.use(VueJsonp)
Vue.use(uView)
Vue.prototype.$utils = utils
Vue.prototype.$base = base
Vue.prototype.$api = api
Vue.prototype.$validate = validate

Vue.prototype.isAuth = isAuth
Vue.prototype.isAuthFront = isAuthFront


Vue.component('uniLoadMore', MescrollUni)
Vue.component('mescroll-uni', MescrollUni)
Vue.component('uni-popup',uniPopup)

Vue.component('z-swiper-item',zSwiperItem)
Vue.component('z-swiper',zSwiper)

Vue.component('musicPlay', musicPlay)

Vue.config.productionTip = false
App.mpType = 'app'
const app = new Vue({
	...App
})
app.$mount()
