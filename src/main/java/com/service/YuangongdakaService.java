package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongdakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongdakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongdakaView;


/**
 * 员工打卡
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface YuangongdakaService extends IService<YuangongdakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongdakaVO> selectListVO(Wrapper<YuangongdakaEntity> wrapper);
   	
   	YuangongdakaVO selectVO(@Param("ew") Wrapper<YuangongdakaEntity> wrapper);
   	
   	List<YuangongdakaView> selectListView(Wrapper<YuangongdakaEntity> wrapper);
   	
   	YuangongdakaView selectView(@Param("ew") Wrapper<YuangongdakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongdakaEntity> wrapper);
   	

}

