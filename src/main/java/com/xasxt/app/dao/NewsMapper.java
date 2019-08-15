package com.xasxt.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xasxt.app.bean.News;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xasxt
 * @since 2019-06-28
 */
@Repository
@Mapper
public interface NewsMapper extends BaseMapper<News> {

	List<News> listPage(@Param("page")Integer page, @Param("size")Integer size);

}
