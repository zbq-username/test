package com.xasxt.app.service.impl;

import com.xasxt.app.bean.News;
import com.xasxt.app.dao.NewsMapper;
import com.xasxt.app.service.NewsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xasxt
 * @since 2019-06-28
 */
@Service
@Transactional
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

	@Autowired
	private NewsMapper newsMapper;
	public List<News> listPage(Integer page, Integer size) {
		// TODO Auto-generated method stub
		return newsMapper.listPage(page,size);
	}

}
