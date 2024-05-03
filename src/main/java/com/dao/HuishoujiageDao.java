package com.dao;

import com.entity.HuishoujiageEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuishoujiageVO;
import com.entity.view.HuishoujiageView;


/**
 * 回收价格
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface HuishoujiageDao extends BaseMapper<HuishoujiageEntity> {
	
	List<HuishoujiageVO> selectListVO(@Param("ew") Wrapper<HuishoujiageEntity> wrapper);
	
	HuishoujiageVO selectVO(@Param("ew") Wrapper<HuishoujiageEntity> wrapper);
	
	List<HuishoujiageView> selectListView(@Param("ew") Wrapper<HuishoujiageEntity> wrapper);

	List<HuishoujiageView> selectListView(Pagination page,@Param("ew") Wrapper<HuishoujiageEntity> wrapper);
	
	HuishoujiageView selectView(@Param("ew") Wrapper<HuishoujiageEntity> wrapper);
	

}
