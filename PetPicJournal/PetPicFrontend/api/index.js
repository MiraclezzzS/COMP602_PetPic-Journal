import http from './http'
import base from './base'

/**
 * Login Verification
 */
export const auth = () => {
	let token = uni.getStorageSync("token");
	if (!uni.getStorageSync("token")) {
		uni.navigateTo({
			url: '../login/login'
		})
		return
	}
}
/**
 * Login
 */
export const login = (tableName, data) => {
	return http.request({
		url: `${tableName}/login`,
		method: 'GET',
		data
	})
}

export const faceLogin = (tableName, data) => {
    return http.request({
        url: `${tableName}/faceLogin`,
        method: 'GET',
        data
    })
}

export const sendemail = (tableName, email) => {
	return http.request({
		url: `${tableName}/sendemail?email=${email}`,
		method: 'GET'
	});
}

export const sendsms = (tableName, mobile) => {
	return http.request({
		url: `${tableName}/sendsms?mobile=${mobile}`,
		method: 'GET'
	});
}
/**
 *  * register
 *   */
export const register = (tableName, data) => {
	let url = `${tableName}/register`;
	return http.request({
		url: url,
		method: 'POST',
		data
	})
}
/**
 *  * Email register
 *   */
export const registerEmail = (tableName, data, emailcode) => {
    let url = `${tableName}/register?emailcode=${emailcode}`;
	return http.request({
		url: url,
		method: 'POST',
		data
	})
}

export const registerSms = (tableName, data, smscode) => {
    let url = `${tableName}/register?smscode=${smscode}`;
	return http.request({
		url: url,
		method: 'POST',
		data
	})
}
/**
 * Reset PassWord
 */
export const resetPass = (tableName, username) => {
	let data = {
		username: username
	}
	return http.request({
		url: `${tableName}/resetPass`,
		method: 'GET',
		data
	})
}

/**
 * update PassWord
 */
export const updatePass = (tableName, password,userid) => {
	let data = {
		password: password,
		userid:userid
	}
	return http.request({
		url: `${tableName}/updatePass`,
		method: 'GET',
		data
	})
}

export const deleteUser = (tableName, id) =>{
	let data = {
		id: id
	}
	return http.request({
		url: `${tableName}/deleteById`,
		method: 'GET',
		data
	})
}
/**
 * Get User Information
 */
export const session = (tableName) => {
	return http.request({
		url: `${tableName}/session`,
		method: 'GET'
	})
}
/**
 * Search
 */
export const list = (tableName, data) => {
	return http.request({
		url: `${tableName}/list`,
		method: 'GET',
		data
	});
}
/**
 * Search page
 */
export const page = (tableName, data) => {
	return http.request({
		url: `${tableName}/page`,
		method: 'GET',
		data
	});
}
/**
 * save
 */
export const add = (tableName, data) => {
	return http.request({
		url: `${tableName}/add`,
		method: 'POST',
		data
	});
}
// save
export const save = (tableName, data) => {
	return http.request({
		url: `${tableName}/save`,
		method: 'POST',
		data
	});
}
/**
 * update
 */
export const update = (tableName, data) => {
	return http.request({
		url: `${tableName}/update`,
		method: 'POST',
		data
	});
}
export const updateBrowseDuration = (tableName, id, duration, data) => {
    return http.request({
        url: `${tableName}/updateBrowseDuration/`+id+"?duration="+duration,
        method: 'POST',
        data
    });
}
/**
 * Delete
 */
export const del = (tableName, data) => {
	return http.request({
		url: `${tableName}/delete`,
		method: 'POST',
		data
	});
}
/**
 * Search
 */
export const info = (tableName, id) => {
	return http.request({
		url: `${tableName}/detail/${id}`,
		method: 'GET'
	});
}

export const recommend = (tableName,data) => {
	return http.request({
		url: `${tableName}/autoSort`,
		method: 'get',
		data
	});
}

export const recommend2 = (tableName,data) => {
	return http.request({
		url: `${tableName}/autoSort2`,
		method: 'get',
		data
	});
}
/**
 * upload
 */
export const upload = (callback) => {
	uni.chooseImage({
		count: 4, //默认9
		sizeType: ['original', 'compressed'], 
		//sourceType: ['album'], //Select from Album
		success: (res) => {
			uni.uploadFile({
				url: `${base.url}file/upload`, 
				filePath: res.tempFilePaths[0],
				name: 'file',
				header: {
					'Token': uni.getStorageSync("token")
				},
				success: (uploadFileRes) => {
					// console.log(uploadFileRes)
					let result = JSON.parse(uploadFileRes.data);
					if (result.code == 0) {
						callback(result);
					} else {
						uni.showToast({
							title: result.msg,
							icon: 'none',
							duration: 2000
						});
					}
				}
			});
		}
	});
}

export const rubbish = (tableName, fileName) => {
    return http.request({
        url: `${tableName}/aliyun/rubbish?fileName=`+fileName,
        method: 'GET'
    });
}

export const baiduIdentify = (tableName, type, fileName) => {
    return http.request({
        url: `${tableName}/baidu/${type}?fileName=`+fileName,
        method: 'GET'
    });
}
export const uploadMedia = (callback) => {
	uni.chooseVideo({
		count: 1,
		sourceType: ['camera', 'album'],
		success: function(res) {
			console.log(res)
			uni.uploadFile({
				url: `${base.url}file/upload`, 
				filePath: res.tempFilePath,
				name: 'file',
				header: {
					'Token': uni.getStorageSync("token")
				},
				success: (uploadFileRes) => {
					// console.log(uploadFileRes)
					let result = JSON.parse(uploadFileRes.data);
					if (result.code == 0) {
						callback(result);
					} else {
						uni.showToast({
							title: result.msg,
							icon: 'none',
							duration: 2000
						});
					}
				}
			});
		}
	});
}

/**
 * Get Default Address
 */
export const defaultAddress = (userid) => {
	return http.request({
		url: `address/default?userid=${userid}`,
		method: 'GET'
	});
}
/**
 * Search
 * @param {*} tableName 
 * @param {*} columnName 
 * @param {*} data 
 */
export const option = (tableName, columnName, data) => {
	return http.request({
		url: `option/${tableName}/${columnName}`,
		method: 'GET',
		data
	});
}
/**
 * 
 * @param {*} tableName 
 * @param {*} columnName 
 * @param {*} data 
 */
export const follow = (tableName, columnName, data) => {
	return http.request({
		url: `follow/${tableName}/${columnName}`,
		method: 'GET',
		data
	});
}
// interface
export const allPublicForm = (page = 1, limit = 10, title='%%') => {
	let data = {
		page: page,
		limit: limit,
		title: title
	}
	return http.request({
		url: `forum/flist?parentid=0&isdone=开放&sort=addtime&order=desc`,
		method: 'GET',
		data
	});
}
// my forum
export const myForum = (page = 1, limit = 10) => {
	let data = {
		page: page,
		limit: limit
	}
	return http.request({
		url: `forum/page?parentid=0&sort=addtime&order=desc`,
		method: 'GET',
		data
	});
}
export const forumDetail = (id) => {
	return http.request({
		url: `forum/list/${id}`,
		method: 'GET',
	});
}
export const groupby = () => {
	return http.request({
		url: `examrecord/groupby`,
		method: 'GET',
	});
}
export const deleteRecords = (userid, paperid) => {
	return http.request({
		url: `examrecord/deleteRecords?userid=${userid}&paperid=${paperid}`,
		method: 'POST',
	});
}
export const faceMatch = (data) => {
    return http.request({
        url: `matchFace`,
        method: 'GET',
        data
    });
}
export const security = (tableName, data) => {
    return http.request({
        url: `${tableName}/security`,
        method: 'GET',
        data
    });
}
export default {
	login, 
	sendemail, 
	sendsms, 
	register, 
	registerEmail, 
	registerSms, 
	resetPass, 
	auth, 
	session, 
	list, 
	page, 
	add, 
	update, 
    updateBrowseDuration,
	del, 
	info, 
	recommend, 
	recommend2, 
	defaultAddress, 
	save, 
	upload, 
    rubbish,
    baiduIdentify,
	option, 
	follow, 
	allPublicForm,
	myForum,
	forumDetail,
	groupby,
	deleteRecords,
    faceMatch,
	uploadMedia,
    faceLogin,
    security,
	updatePass,
	deleteUser
}
