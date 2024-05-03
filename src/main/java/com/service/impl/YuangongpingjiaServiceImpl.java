package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongpingjiaDao;
import com.entity.YuangongpingjiaEntity;
import com.service.YuangongpingjiaService;
import com.entity.vo.YuangongpingjiaVO;
import com.entity.view.YuangongpingjiaView;

@Service("yuangongpingjiaService")
public class YuangongpingjiaServiceImpl extends ServiceImpl<YuangongpingjiaDao, YuangongpingjiaEntity> implements YuangongpingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongpingjiaEntity> page = this.selectPage(
                new Query<YuangongpingjiaEntity>(params).getPage(),
                new EntityWrapper<YuangongpingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongpingjiaEntity> wrapper) {
		  Page<YuangongpingjiaView> page =new Query<YuangongpingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongpingjiaVO> selectListVO(Wrapper<YuangongpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongpingjiaVO selectVO(Wrapper<YuangongpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongpingjiaView> selectListView(Wrapper<YuangongpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongpingjiaView selectView(Wrapper<YuangongpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
