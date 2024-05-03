package com.dao;

import com.entity.YuangongpingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongpingjiaVO;
import com.entity.view.YuangongpingjiaView;


/**
 * 员工评价
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface YuangongpingjiaDao extends BaseMapper<YuangongpingjiaEntity> {
	
	List<YuangongpingjiaVO> selectListVO(@Param("ew") Wrapper<YuangongpingjiaEntity> wrapper);
	
	YuangongpingjiaVO selectVO(@Param("ew") Wrapper<YuangongpingjiaEntity> wrapper);
	
	List<YuangongpingjiaView> selectListView(@Param("ew") Wrapper<YuangongpingjiaEntity> wrapper);

	List<YuangongpingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongpingjiaEntity> wrapper);
	
	YuangongpingjiaView selectView(@Param("ew") Wrapper<YuangongpingjiaEntity> wrapper);
	

}
