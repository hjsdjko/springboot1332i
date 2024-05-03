package com.dao;

import com.entity.RenwuhuibaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwuhuibaoVO;
import com.entity.view.RenwuhuibaoView;


/**
 * 任务汇报
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface RenwuhuibaoDao extends BaseMapper<RenwuhuibaoEntity> {
	
	List<RenwuhuibaoVO> selectListVO(@Param("ew") Wrapper<RenwuhuibaoEntity> wrapper);
	
	RenwuhuibaoVO selectVO(@Param("ew") Wrapper<RenwuhuibaoEntity> wrapper);
	
	List<RenwuhuibaoView> selectListView(@Param("ew") Wrapper<RenwuhuibaoEntity> wrapper);

	List<RenwuhuibaoView> selectListView(Pagination page,@Param("ew") Wrapper<RenwuhuibaoEntity> wrapper);
	
	RenwuhuibaoView selectView(@Param("ew") Wrapper<RenwuhuibaoEntity> wrapper);
	

}
