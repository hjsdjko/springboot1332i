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


import com.dao.WeixiurukuDao;
import com.entity.WeixiurukuEntity;
import com.service.WeixiurukuService;
import com.entity.vo.WeixiurukuVO;
import com.entity.view.WeixiurukuView;

@Service("weixiurukuService")
public class WeixiurukuServiceImpl extends ServiceImpl<WeixiurukuDao, WeixiurukuEntity> implements WeixiurukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiurukuEntity> page = this.selectPage(
                new Query<WeixiurukuEntity>(params).getPage(),
                new EntityWrapper<WeixiurukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiurukuEntity> wrapper) {
		  Page<WeixiurukuView> page =new Query<WeixiurukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiurukuVO> selectListVO(Wrapper<WeixiurukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiurukuVO selectVO(Wrapper<WeixiurukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiurukuView> selectListView(Wrapper<WeixiurukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiurukuView selectView(Wrapper<WeixiurukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
