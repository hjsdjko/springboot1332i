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


import com.dao.ShebeiguihaiDao;
import com.entity.ShebeiguihaiEntity;
import com.service.ShebeiguihaiService;
import com.entity.vo.ShebeiguihaiVO;
import com.entity.view.ShebeiguihaiView;

@Service("shebeiguihaiService")
public class ShebeiguihaiServiceImpl extends ServiceImpl<ShebeiguihaiDao, ShebeiguihaiEntity> implements ShebeiguihaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeiguihaiEntity> page = this.selectPage(
                new Query<ShebeiguihaiEntity>(params).getPage(),
                new EntityWrapper<ShebeiguihaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeiguihaiEntity> wrapper) {
		  Page<ShebeiguihaiView> page =new Query<ShebeiguihaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeiguihaiVO> selectListVO(Wrapper<ShebeiguihaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeiguihaiVO selectVO(Wrapper<ShebeiguihaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeiguihaiView> selectListView(Wrapper<ShebeiguihaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeiguihaiView selectView(Wrapper<ShebeiguihaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
