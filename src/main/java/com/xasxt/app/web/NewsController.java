package com.xasxt.app.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xasxt.app.bean.News;
import com.xasxt.app.service.NewsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api("新闻API")
@RestController
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsService newsService;
	

	
	
	
	@CrossOrigin
	@ApiOperation("查询新闻")
	@RequestMapping("/listNews")
	public List<News>listNews(){
		return newsService.list(null);
		
	}
	
	
	@CrossOrigin   //跨服务器操作
	@ApiOperation("查询一条新闻")
	@RequestMapping("/getNewsById")
	public News getNewsById(String  newsid){
		return newsService.getById(newsid);
		
	}

}

