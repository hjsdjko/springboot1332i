package com.dao;

import com.entity.XiaojiashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaojiashenqingVO;
import com.entity.view.XiaojiashenqingView;


/**
 * 销假申请
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface XiaojiashenqingDao extends BaseMapper<XiaojiashenqingEntity> {
	
	List<XiaojiashenqingVO> selectListVO(@Param("ew") Wrapper<XiaojiashenqingEntity> wrapper);
	
	XiaojiashenqingVO selectVO(@Param("ew") Wrapper<XiaojiashenqingEntity> wrapper);
	
	List<XiaojiashenqingView> selectListView(@Param("ew") Wrapper<XiaojiashenqingEntity> wrapper);

	List<XiaojiashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<XiaojiashenqingEntity> wrapper);
	
	XiaojiashenqingView selectView(@Param("ew") Wrapper<XiaojiashenqingEntity> wrapper);
	

}
