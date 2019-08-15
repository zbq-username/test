package com.xasxt.app.bean;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

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
@ApiModel(value = "News对象", description = "")
public class News extends Model<News> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "新闻ID")
	@TableId(value = "newid", type = IdType.AUTO)
	private Integer newid;

	@ApiModelProperty(value = "新闻内容")
	private String content;

	@ApiModelProperty(value = "来源")
	private String author;

	@ApiModelProperty(value = "发布时间")
	private String sendtime;

	@ApiModelProperty(value = "标题")
	private String title;

	@ApiModelProperty(value = "类别外键")
	private Integer cateid;

	@ApiModelProperty(value = "类别名称")
	@TableField(exist = false)
	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getNewid() {
		return newid;
	}

	public void setNewid(Integer newid) {
		this.newid = newid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSendtime() {
		return sendtime;
	}

	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCateid() {
		return cateid;
	}

	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}

	@Override
	protected Serializable pkVal() {
		return this.newid;
	}

	@Override
	public String toString() {
		return "News{" + "newid=" + newid + ", content=" + content + ", author=" + author + ", sendtime=" + sendtime
				+ ", title=" + title + ", cateid=" + cateid + "}";
	}
}
