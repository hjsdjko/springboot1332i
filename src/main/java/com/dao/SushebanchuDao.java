package com.dao;

import com.entity.SushebanchuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushebanchuVO;
import com.entity.view.SushebanchuView;


/**
 * 宿舍搬出
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface SushebanchuDao extends BaseMapper<SushebanchuEntity> {
	
	List<SushebanchuVO> selectListVO(@Param("ew") Wrapper<SushebanchuEntity> wrapper);
	
	SushebanchuVO selectVO(@Param("ew") Wrapper<SushebanchuEntity> wrapper);
	
	List<SushebanchuView> selectListView(@Param("ew") Wrapper<SushebanchuEntity> wrapper);

	List<SushebanchuView> selectListView(Pagination page,@Param("ew") Wrapper<SushebanchuEntity> wrapper);
	
	SushebanchuView selectView(@Param("ew") Wrapper<SushebanchuEntity> wrapper);
	

}
