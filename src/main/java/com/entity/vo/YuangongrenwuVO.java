package com.entity.vo;

import com.entity.YuangongrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工任务
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public class YuangongrenwuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 工作内容
	 */
	
	private String gongzuoneirong;
		
	/**
	 * 要求时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yaoqiushijian;
		
	/**
	 * 任务汇报
	 */
	
	private String renwuhuibao;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 下发人
	 */
	
	private String xiafaren;
		
	/**
	 * 下发时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiafashijian;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：工作内容
	 */
	 
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
				
	
	/**
	 * 设置：要求时间
	 */
	 
	public void setYaoqiushijian(Date yaoqiushijian) {
		this.yaoqiushijian = yaoqiushijian;
	}
	
	/**
	 * 获取：要求时间
	 */
	public Date getYaoqiushijian() {
		return yaoqiushijian;
	}
				
	
	/**
	 * 设置：任务汇报
	 */
	 
	public void setRenwuhuibao(String renwuhuibao) {
		this.renwuhuibao = renwuhuibao;
	}
	
	/**
	 * 获取：任务汇报
	 */
	public String getRenwuhuibao() {
		return renwuhuibao;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：下发人
	 */
	 
	public void setXiafaren(String xiafaren) {
		this.xiafaren = xiafaren;
	}
	
	/**
	 * 获取：下发人
	 */
	public String getXiafaren() {
		return xiafaren;
	}
				
	
	/**
	 * 设置：下发时间
	 */
	 
	public void setXiafashijian(Date xiafashijian) {
		this.xiafashijian = xiafashijian;
	}
	
	/**
	 * 获取：下发时间
	 */
	public Date getXiafashijian() {
		return xiafashijian;
	}
			
}
