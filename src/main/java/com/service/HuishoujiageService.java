package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuishoujiageEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuishoujiageVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuishoujiageView;


/**
 * 回收价格
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface HuishoujiageService extends IService<HuishoujiageEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuishoujiageVO> selectListVO(Wrapper<HuishoujiageEntity> wrapper);
   	
   	HuishoujiageVO selectVO(@Param("ew") Wrapper<HuishoujiageEntity> wrapper);
   	
   	List<HuishoujiageView> selectListView(Wrapper<HuishoujiageEntity> wrapper);
   	
   	HuishoujiageView selectView(@Param("ew") Wrapper<HuishoujiageEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuishoujiageEntity> wrapper);
   	

}

