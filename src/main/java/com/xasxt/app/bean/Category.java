package com.xasxt.app.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author xasxt
 * @since 2019-06-28
 */
@ApiModel(value="Category对象", description="")
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类别ID")
    @TableId(value = "cateid", type = IdType.AUTO)
    private Integer cateid;

    @ApiModelProperty(value = "类别名称")
    private String cname;


    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    protected Serializable pkVal() {
        return this.cateid;
    }

    @Override
    public String toString() {
        return "Category{" +
        "cateid=" + cateid +
        ", cname=" + cname +
        "}";
    }
}
