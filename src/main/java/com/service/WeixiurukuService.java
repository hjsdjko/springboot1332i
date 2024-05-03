package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiurukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiurukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiurukuView;


/**
 * 维修入库
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface WeixiurukuService extends IService<WeixiurukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiurukuVO> selectListVO(Wrapper<WeixiurukuEntity> wrapper);
   	
   	WeixiurukuVO selectVO(@Param("ew") Wrapper<WeixiurukuEntity> wrapper);
   	
   	List<WeixiurukuView> selectListView(Wrapper<WeixiurukuEntity> wrapper);
   	
   	WeixiurukuView selectView(@Param("ew") Wrapper<WeixiurukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiurukuEntity> wrapper);
   	

}

