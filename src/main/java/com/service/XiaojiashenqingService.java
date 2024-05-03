package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaojiashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaojiashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaojiashenqingView;


/**
 * 销假申请
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface XiaojiashenqingService extends IService<XiaojiashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaojiashenqingVO> selectListVO(Wrapper<XiaojiashenqingEntity> wrapper);
   	
   	XiaojiashenqingVO selectVO(@Param("ew") Wrapper<XiaojiashenqingEntity> wrapper);
   	
   	List<XiaojiashenqingView> selectListView(Wrapper<XiaojiashenqingEntity> wrapper);
   	
   	XiaojiashenqingView selectView(@Param("ew") Wrapper<XiaojiashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaojiashenqingEntity> wrapper);
   	

}

