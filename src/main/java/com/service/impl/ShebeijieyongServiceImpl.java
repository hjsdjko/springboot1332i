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


import com.dao.ShebeijieyongDao;
import com.entity.ShebeijieyongEntity;
import com.service.ShebeijieyongService;
import com.entity.vo.ShebeijieyongVO;
import com.entity.view.ShebeijieyongView;

@Service("shebeijieyongService")
public class ShebeijieyongServiceImpl extends ServiceImpl<ShebeijieyongDao, ShebeijieyongEntity> implements ShebeijieyongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeijieyongEntity> page = this.selectPage(
                new Query<ShebeijieyongEntity>(params).getPage(),
                new EntityWrapper<ShebeijieyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeijieyongEntity> wrapper) {
		  Page<ShebeijieyongView> page =new Query<ShebeijieyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeijieyongVO> selectListVO(Wrapper<ShebeijieyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeijieyongVO selectVO(Wrapper<ShebeijieyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeijieyongView> selectListView(Wrapper<ShebeijieyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeijieyongView selectView(Wrapper<ShebeijieyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
