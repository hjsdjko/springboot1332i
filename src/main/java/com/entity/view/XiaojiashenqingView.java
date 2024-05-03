package com.entity.view;

import com.entity.XiaojiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销假申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@TableName("xiaojiashenqing")
public class XiaojiashenqingView  extends XiaojiashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaojiashenqingView(){
	}
 
 	public XiaojiashenqingView(XiaojiashenqingEntity xiaojiashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, xiaojiashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
