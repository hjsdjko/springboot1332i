package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeijieyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeijieyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeijieyongView;


/**
 * 设备借用
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface ShebeijieyongService extends IService<ShebeijieyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeijieyongVO> selectListVO(Wrapper<ShebeijieyongEntity> wrapper);
   	
   	ShebeijieyongVO selectVO(@Param("ew") Wrapper<ShebeijieyongEntity> wrapper);
   	
   	List<ShebeijieyongView> selectListView(Wrapper<ShebeijieyongEntity> wrapper);
   	
   	ShebeijieyongView selectView(@Param("ew") Wrapper<ShebeijieyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeijieyongEntity> wrapper);
   	

}

