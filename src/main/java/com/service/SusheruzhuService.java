package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SusheruzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SusheruzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SusheruzhuView;


/**
 * 宿舍入住
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface SusheruzhuService extends IService<SusheruzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SusheruzhuVO> selectListVO(Wrapper<SusheruzhuEntity> wrapper);
   	
   	SusheruzhuVO selectVO(@Param("ew") Wrapper<SusheruzhuEntity> wrapper);
   	
   	List<SusheruzhuView> selectListView(Wrapper<SusheruzhuEntity> wrapper);
   	
   	SusheruzhuView selectView(@Param("ew") Wrapper<SusheruzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SusheruzhuEntity> wrapper);
   	

}

