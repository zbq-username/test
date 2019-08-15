package com.xasxt.app.dao;

import com.xasxt.app.bean.Category;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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
public interface CategoryMapper extends BaseMapper<Category> {

}
