package com.dao;

import com.entity.ShebeiguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeiguihaiVO;
import com.entity.view.ShebeiguihaiView;


/**
 * 设备归还
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface ShebeiguihaiDao extends BaseMapper<ShebeiguihaiEntity> {
	
	List<ShebeiguihaiVO> selectListVO(@Param("ew") Wrapper<ShebeiguihaiEntity> wrapper);
	
	ShebeiguihaiVO selectVO(@Param("ew") Wrapper<ShebeiguihaiEntity> wrapper);
	
	List<ShebeiguihaiView> selectListView(@Param("ew") Wrapper<ShebeiguihaiEntity> wrapper);

	List<ShebeiguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeiguihaiEntity> wrapper);
	
	ShebeiguihaiView selectView(@Param("ew") Wrapper<ShebeiguihaiEntity> wrapper);
	

}
