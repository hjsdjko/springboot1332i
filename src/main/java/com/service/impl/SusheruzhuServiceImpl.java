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


import com.dao.SusheruzhuDao;
import com.entity.SusheruzhuEntity;
import com.service.SusheruzhuService;
import com.entity.vo.SusheruzhuVO;
import com.entity.view.SusheruzhuView;

@Service("susheruzhuService")
public class SusheruzhuServiceImpl extends ServiceImpl<SusheruzhuDao, SusheruzhuEntity> implements SusheruzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SusheruzhuEntity> page = this.selectPage(
                new Query<SusheruzhuEntity>(params).getPage(),
                new EntityWrapper<SusheruzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SusheruzhuEntity> wrapper) {
		  Page<SusheruzhuView> page =new Query<SusheruzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SusheruzhuVO> selectListVO(Wrapper<SusheruzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SusheruzhuVO selectVO(Wrapper<SusheruzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SusheruzhuView> selectListView(Wrapper<SusheruzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SusheruzhuView selectView(Wrapper<SusheruzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
