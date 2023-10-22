<template>
	<view>
		<view>
			
		    <web-view :src="url">
		    </web-view>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				url:""
			}
		},
		onLoad(val) {
			this.url = decodeURIComponent(val.url);
			
			if(this.isNotEmpty(val.title)){
				this.setTitle(val.title);
			}
		},
		methods: {
			isNotEmpty(obj) {
				if (typeof obj == undefined || obj == null || obj == "" || obj == "undefined" || obj.length == 0) {
					return false;
				} else {
					return true;
				}
			},
			
			setTitle(title) {
				uni.setNavigationBarTitle({
					title: title
				})
			},
		}
	}
</script>
