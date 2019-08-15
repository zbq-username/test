package com.xasxt.app.service.impl;

import com.xasxt.app.bean.Category;
import com.xasxt.app.dao.CategoryMapper;
import com.xasxt.app.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
