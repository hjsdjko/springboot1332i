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
 * 宿舍信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@TableName("sushexinxi")
public class SushexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SushexinxiEntity() {
		
	}
	
	public SushexinxiEntity(T t) {
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
	 * 宿舍号
	 */
					
	private String sushehao;
	
	/**
	 * 楼层
	 */
					
	private String louceng;
	
	/**
	 * 楼栋号
	 */
					
	private String loudonghao;
	
	/**
	 * 宿舍位置
	 */
					
	private String susheweizhi;
	
	/**
	 * 宿舍类型
	 */
					
	private String susheleixing;
	
	/**
	 * 宿舍状态
	 */
					
	private String sushezhuangtai;
	
	/**
	 * 人数
	 */
					
	private Integer renshu;
	
	/**
	 * 可住人数
	 */
					
	private Integer kezhurenshu;
	
	
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
	 * 设置：宿舍号
	 */
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
	/**
	 * 设置：楼层
	 */
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
	/**
	 * 设置：楼栋号
	 */
	public void setLoudonghao(String loudonghao) {
		this.loudonghao = loudonghao;
	}
	/**
	 * 获取：楼栋号
	 */
	public String getLoudonghao() {
		return loudonghao;
	}
	/**
	 * 设置：宿舍位置
	 */
	public void setSusheweizhi(String susheweizhi) {
		this.susheweizhi = susheweizhi;
	}
	/**
	 * 获取：宿舍位置
	 */
	public String getSusheweizhi() {
		return susheweizhi;
	}
	/**
	 * 设置：宿舍类型
	 */
	public void setSusheleixing(String susheleixing) {
		this.susheleixing = susheleixing;
	}
	/**
	 * 获取：宿舍类型
	 */
	public String getSusheleixing() {
		return susheleixing;
	}
	/**
	 * 设置：宿舍状态
	 */
	public void setSushezhuangtai(String sushezhuangtai) {
		this.sushezhuangtai = sushezhuangtai;
	}
	/**
	 * 获取：宿舍状态
	 */
	public String getSushezhuangtai() {
		return sushezhuangtai;
	}
	/**
	 * 设置：人数
	 */
	public void setRenshu(Integer renshu) {
		this.renshu = renshu;
	}
	/**
	 * 获取：人数
	 */
	public Integer getRenshu() {
		return renshu;
	}
	/**
	 * 设置：可住人数
	 */
	public void setKezhurenshu(Integer kezhurenshu) {
		this.kezhurenshu = kezhurenshu;
	}
	/**
	 * 获取：可住人数
	 */
	public Integer getKezhurenshu() {
		return kezhurenshu;
	}

}
