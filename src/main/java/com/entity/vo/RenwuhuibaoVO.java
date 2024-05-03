package com.entity.vo;

import com.entity.RenwuhuibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 任务汇报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public class RenwuhuibaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 订单编号
	 */
	
	private String dingdanbianhao;
		
	/**
	 * 要求时间
	 */
	
	private String yaoqiushijian;
		
	/**
	 * 工作内容
	 */
	
	private String gongzuoneirong;
		
	/**
	 * 回收物
	 */
	
	private String huishouwu;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 汇报时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huibaoshijian;
				
	
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
	 * 设置：订单编号
	 */
	 
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
				
	
	/**
	 * 设置：要求时间
	 */
	 
	public void setYaoqiushijian(String yaoqiushijian) {
		this.yaoqiushijian = yaoqiushijian;
	}
	
	/**
	 * 获取：要求时间
	 */
	public String getYaoqiushijian() {
		return yaoqiushijian;
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
	 * 设置：回收物
	 */
	 
	public void setHuishouwu(String huishouwu) {
		this.huishouwu = huishouwu;
	}
	
	/**
	 * 获取：回收物
	 */
	public String getHuishouwu() {
		return huishouwu;
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
	 * 设置：汇报时间
	 */
	 
	public void setHuibaoshijian(Date huibaoshijian) {
		this.huibaoshijian = huibaoshijian;
	}
	
	/**
	 * 获取：汇报时间
	 */
	public Date getHuibaoshijian() {
		return huibaoshijian;
	}
			
}
