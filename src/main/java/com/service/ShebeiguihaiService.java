package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeiguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeiguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeiguihaiView;


/**
 * 设备归还
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface ShebeiguihaiService extends IService<ShebeiguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeiguihaiVO> selectListVO(Wrapper<ShebeiguihaiEntity> wrapper);
   	
   	ShebeiguihaiVO selectVO(@Param("ew") Wrapper<ShebeiguihaiEntity> wrapper);
   	
   	List<ShebeiguihaiView> selectListView(Wrapper<ShebeiguihaiEntity> wrapper);
   	
   	ShebeiguihaiView selectView(@Param("ew") Wrapper<ShebeiguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeiguihaiEntity> wrapper);
   	

}

