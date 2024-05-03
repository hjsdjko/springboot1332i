package com.entity.vo;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工工资
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public class YuangonggongziVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 岗位
	 */
	
	private String gangwei;
		
	/**
	 * 底薪
	 */
	
	private Float dixin;
		
	/**
	 * 全勤奖
	 */
	
	private Float quanqinjiang;
		
	/**
	 * 加班费
	 */
	
	private Float jiabanfei;
		
	/**
	 * 其它扣款
	 */
	
	private Float qitakoukuan;
		
	/**
	 * 金额
	 */
	
	private Float jine;
		
	/**
	 * 工资备注
	 */
	
	private String gongzibeizhu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
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
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：岗位
	 */
	 
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	
	/**
	 * 获取：岗位
	 */
	public String getGangwei() {
		return gangwei;
	}
				
	
	/**
	 * 设置：底薪
	 */
	 
	public void setDixin(Float dixin) {
		this.dixin = dixin;
	}
	
	/**
	 * 获取：底薪
	 */
	public Float getDixin() {
		return dixin;
	}
				
	
	/**
	 * 设置：全勤奖
	 */
	 
	public void setQuanqinjiang(Float quanqinjiang) {
		this.quanqinjiang = quanqinjiang;
	}
	
	/**
	 * 获取：全勤奖
	 */
	public Float getQuanqinjiang() {
		return quanqinjiang;
	}
				
	
	/**
	 * 设置：加班费
	 */
	 
	public void setJiabanfei(Float jiabanfei) {
		this.jiabanfei = jiabanfei;
	}
	
	/**
	 * 获取：加班费
	 */
	public Float getJiabanfei() {
		return jiabanfei;
	}
				
	
	/**
	 * 设置：其它扣款
	 */
	 
	public void setQitakoukuan(Float qitakoukuan) {
		this.qitakoukuan = qitakoukuan;
	}
	
	/**
	 * 获取：其它扣款
	 */
	public Float getQitakoukuan() {
		return qitakoukuan;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Float getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：工资备注
	 */
	 
	public void setGongzibeizhu(String gongzibeizhu) {
		this.gongzibeizhu = gongzibeizhu;
	}
	
	/**
	 * 获取：工资备注
	 */
	public String getGongzibeizhu() {
		return gongzibeizhu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
