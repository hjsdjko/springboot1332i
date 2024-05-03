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


import com.dao.HuishoujiageDao;
import com.entity.HuishoujiageEntity;
import com.service.HuishoujiageService;
import com.entity.vo.HuishoujiageVO;
import com.entity.view.HuishoujiageView;

@Service("huishoujiageService")
public class HuishoujiageServiceImpl extends ServiceImpl<HuishoujiageDao, HuishoujiageEntity> implements HuishoujiageService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuishoujiageEntity> page = this.selectPage(
                new Query<HuishoujiageEntity>(params).getPage(),
                new EntityWrapper<HuishoujiageEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuishoujiageEntity> wrapper) {
		  Page<HuishoujiageView> page =new Query<HuishoujiageView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuishoujiageVO> selectListVO(Wrapper<HuishoujiageEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuishoujiageVO selectVO(Wrapper<HuishoujiageEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuishoujiageView> selectListView(Wrapper<HuishoujiageEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuishoujiageView selectView(Wrapper<HuishoujiageEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
