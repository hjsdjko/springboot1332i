package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongrenwuView;


/**
 * 员工任务
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface YuangongrenwuService extends IService<YuangongrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongrenwuVO> selectListVO(Wrapper<YuangongrenwuEntity> wrapper);
   	
   	YuangongrenwuVO selectVO(@Param("ew") Wrapper<YuangongrenwuEntity> wrapper);
   	
   	List<YuangongrenwuView> selectListView(Wrapper<YuangongrenwuEntity> wrapper);
   	
   	YuangongrenwuView selectView(@Param("ew") Wrapper<YuangongrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongrenwuEntity> wrapper);
   	

}

