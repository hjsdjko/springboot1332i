package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushebanchuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushebanchuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushebanchuView;


/**
 * 宿舍搬出
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface SushebanchuService extends IService<SushebanchuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushebanchuVO> selectListVO(Wrapper<SushebanchuEntity> wrapper);
   	
   	SushebanchuVO selectVO(@Param("ew") Wrapper<SushebanchuEntity> wrapper);
   	
   	List<SushebanchuView> selectListView(Wrapper<SushebanchuEntity> wrapper);
   	
   	SushebanchuView selectView(@Param("ew") Wrapper<SushebanchuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushebanchuEntity> wrapper);
   	

}

