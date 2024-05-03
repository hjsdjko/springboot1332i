package com.entity.view;

import com.entity.ShebeiguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@TableName("shebeiguihai")
public class ShebeiguihaiView  extends ShebeiguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeiguihaiView(){
	}
 
 	public ShebeiguihaiView(ShebeiguihaiEntity shebeiguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, shebeiguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
