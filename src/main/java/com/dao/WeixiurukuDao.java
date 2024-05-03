package com.dao;

import com.entity.WeixiurukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiurukuVO;
import com.entity.view.WeixiurukuView;


/**
 * 维修入库
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface WeixiurukuDao extends BaseMapper<WeixiurukuEntity> {
	
	List<WeixiurukuVO> selectListVO(@Param("ew") Wrapper<WeixiurukuEntity> wrapper);
	
	WeixiurukuVO selectVO(@Param("ew") Wrapper<WeixiurukuEntity> wrapper);
	
	List<WeixiurukuView> selectListView(@Param("ew") Wrapper<WeixiurukuEntity> wrapper);

	List<WeixiurukuView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiurukuEntity> wrapper);
	
	WeixiurukuView selectView(@Param("ew") Wrapper<WeixiurukuEntity> wrapper);
	

}
