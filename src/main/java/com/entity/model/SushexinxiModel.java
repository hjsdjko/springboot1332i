package com.entity.model;

import com.entity.SushexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 宿舍信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public class SushexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
