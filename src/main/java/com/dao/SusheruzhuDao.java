package com.dao;

import com.entity.SusheruzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SusheruzhuVO;
import com.entity.view.SusheruzhuView;


/**
 * 宿舍入住
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface SusheruzhuDao extends BaseMapper<SusheruzhuEntity> {
	
	List<SusheruzhuVO> selectListVO(@Param("ew") Wrapper<SusheruzhuEntity> wrapper);
	
	SusheruzhuVO selectVO(@Param("ew") Wrapper<SusheruzhuEntity> wrapper);
	
	List<SusheruzhuView> selectListView(@Param("ew") Wrapper<SusheruzhuEntity> wrapper);

	List<SusheruzhuView> selectListView(Pagination page,@Param("ew") Wrapper<SusheruzhuEntity> wrapper);
	
	SusheruzhuView selectView(@Param("ew") Wrapper<SusheruzhuEntity> wrapper);
	

}
