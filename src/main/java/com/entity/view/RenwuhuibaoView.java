package com.entity.view;

import com.entity.RenwuhuibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 任务汇报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@TableName("renwuhuibao")
public class RenwuhuibaoView  extends RenwuhuibaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwuhuibaoView(){
	}
 
 	public RenwuhuibaoView(RenwuhuibaoEntity renwuhuibaoEntity){
 	try {
			BeanUtils.copyProperties(this, renwuhuibaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
