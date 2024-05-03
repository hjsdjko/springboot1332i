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


import com.dao.SushebanchuDao;
import com.entity.SushebanchuEntity;
import com.service.SushebanchuService;
import com.entity.vo.SushebanchuVO;
import com.entity.view.SushebanchuView;

@Service("sushebanchuService")
public class SushebanchuServiceImpl extends ServiceImpl<SushebanchuDao, SushebanchuEntity> implements SushebanchuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushebanchuEntity> page = this.selectPage(
                new Query<SushebanchuEntity>(params).getPage(),
                new EntityWrapper<SushebanchuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushebanchuEntity> wrapper) {
		  Page<SushebanchuView> page =new Query<SushebanchuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushebanchuVO> selectListVO(Wrapper<SushebanchuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushebanchuVO selectVO(Wrapper<SushebanchuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushebanchuView> selectListView(Wrapper<SushebanchuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushebanchuView selectView(Wrapper<SushebanchuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
