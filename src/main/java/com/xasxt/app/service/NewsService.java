package com.xasxt.app.service;

import com.xasxt.app.bean.News;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xasxt
 * @since 2019-06-28
 */
public interface NewsService extends IService<News> {

	List<News> listPage(Integer page, Integer size);
	
	
	

}
