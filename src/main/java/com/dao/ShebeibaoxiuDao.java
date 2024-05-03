package com.dao;

import com.entity.ShebeibaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeibaoxiuVO;
import com.entity.view.ShebeibaoxiuView;


/**
 * 设备报修
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface ShebeibaoxiuDao extends BaseMapper<ShebeibaoxiuEntity> {
	
	List<ShebeibaoxiuVO> selectListVO(@Param("ew") Wrapper<ShebeibaoxiuEntity> wrapper);
	
	ShebeibaoxiuVO selectVO(@Param("ew") Wrapper<ShebeibaoxiuEntity> wrapper);
	
	List<ShebeibaoxiuView> selectListView(@Param("ew") Wrapper<ShebeibaoxiuEntity> wrapper);

	List<ShebeibaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeibaoxiuEntity> wrapper);
	
	ShebeibaoxiuView selectView(@Param("ew") Wrapper<ShebeibaoxiuEntity> wrapper);
	

}
