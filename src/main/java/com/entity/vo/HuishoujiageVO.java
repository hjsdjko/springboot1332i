package com.entity.vo;

import com.entity.HuishoujiageEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 回收价格
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public class HuishoujiageVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
