package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongpingjiaView;


/**
 * 员工评价
 *
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
public interface YuangongpingjiaService extends IService<YuangongpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongpingjiaVO> selectListVO(Wrapper<YuangongpingjiaEntity> wrapper);
   	
   	YuangongpingjiaVO selectVO(@Param("ew") Wrapper<YuangongpingjiaEntity> wrapper);
   	
   	List<YuangongpingjiaView> selectListView(Wrapper<YuangongpingjiaEntity> wrapper);
   	
   	YuangongpingjiaView selectView(@Param("ew") Wrapper<YuangongpingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongpingjiaEntity> wrapper);
   	

}

