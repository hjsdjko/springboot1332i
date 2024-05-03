package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 回收价格
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@TableName("huishoujiage")
public class HuishoujiageEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuishoujiageEntity() {
		
	}
	
	public HuishoujiageEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 回收地点
	 */
					
	private String huishoudidian;
	
	/**
	 * 回收物品
	 */
					
	private String huishouwupin;
	
	/**
	 * 回收价格
	 */
					
	private Integer huishoujiage;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：回收地点
	 */
	public void setHuishoudidian(String huishoudidian) {
		this.huishoudidian = huishoudidian;
	}
	/**
	 * 获取：回收地点
	 */
	public String getHuishoudidian() {
		return huishoudidian;
	}
	/**
	 * 设置：回收物品
	 */
	public void setHuishouwupin(String huishouwupin) {
		this.huishouwupin = huishouwupin;
	}
	/**
	 * 获取：回收物品
	 */
	public String getHuishouwupin() {
		return huishouwupin;
	}
	/**
	 * 设置：回收价格
	 */
	public void setHuishoujiage(Integer huishoujiage) {
		this.huishoujiage = huishoujiage;
	}
	/**
	 * 获取：回收价格
	 */
	public Integer getHuishoujiage() {
		return huishoujiage;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
