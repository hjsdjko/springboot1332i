package com.dao;

import com.entity.YuangongrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongrenwuVO;
import com.entity.view.YuangongrenwuView;


/**
 * 员工任务
 * 
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface YuangongrenwuDao extends BaseMapper<YuangongrenwuEntity> {
	
	List<YuangongrenwuVO> selectListVO(@Param("ew") Wrapper<YuangongrenwuEntity> wrapper);
	
	YuangongrenwuVO selectVO(@Param("ew") Wrapper<YuangongrenwuEntity> wrapper);
	
	List<YuangongrenwuView> selectListView(@Param("ew") Wrapper<YuangongrenwuEntity> wrapper);

	List<YuangongrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongrenwuEntity> wrapper);
	
	YuangongrenwuView selectView(@Param("ew") Wrapper<YuangongrenwuEntity> wrapper);
	

}
