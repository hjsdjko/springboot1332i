package com.entity.view;

import com.entity.YuangongpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@TableName("yuangongpingjia")
public class YuangongpingjiaView  extends YuangongpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongpingjiaView(){
	}
 
 	public YuangongpingjiaView(YuangongpingjiaEntity yuangongpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
