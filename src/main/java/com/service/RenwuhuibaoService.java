package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwuhuibaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwuhuibaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwuhuibaoView;


/**
 * 任务汇报
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface RenwuhuibaoService extends IService<RenwuhuibaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwuhuibaoVO> selectListVO(Wrapper<RenwuhuibaoEntity> wrapper);
   	
   	RenwuhuibaoVO selectVO(@Param("ew") Wrapper<RenwuhuibaoEntity> wrapper);
   	
   	List<RenwuhuibaoView> selectListView(Wrapper<RenwuhuibaoEntity> wrapper);
   	
   	RenwuhuibaoView selectView(@Param("ew") Wrapper<RenwuhuibaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwuhuibaoEntity> wrapper);
   	

}

