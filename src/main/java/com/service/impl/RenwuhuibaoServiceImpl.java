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


import com.dao.RenwuhuibaoDao;
import com.entity.RenwuhuibaoEntity;
import com.service.RenwuhuibaoService;
import com.entity.vo.RenwuhuibaoVO;
import com.entity.view.RenwuhuibaoView;

@Service("renwuhuibaoService")
public class RenwuhuibaoServiceImpl extends ServiceImpl<RenwuhuibaoDao, RenwuhuibaoEntity> implements RenwuhuibaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwuhuibaoEntity> page = this.selectPage(
                new Query<RenwuhuibaoEntity>(params).getPage(),
                new EntityWrapper<RenwuhuibaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwuhuibaoEntity> wrapper) {
		  Page<RenwuhuibaoView> page =new Query<RenwuhuibaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwuhuibaoVO> selectListVO(Wrapper<RenwuhuibaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwuhuibaoVO selectVO(Wrapper<RenwuhuibaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwuhuibaoView> selectListView(Wrapper<RenwuhuibaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwuhuibaoView selectView(Wrapper<RenwuhuibaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
