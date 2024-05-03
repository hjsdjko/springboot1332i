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


import com.dao.XiaojiashenqingDao;
import com.entity.XiaojiashenqingEntity;
import com.service.XiaojiashenqingService;
import com.entity.vo.XiaojiashenqingVO;
import com.entity.view.XiaojiashenqingView;

@Service("xiaojiashenqingService")
public class XiaojiashenqingServiceImpl extends ServiceImpl<XiaojiashenqingDao, XiaojiashenqingEntity> implements XiaojiashenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaojiashenqingEntity> page = this.selectPage(
                new Query<XiaojiashenqingEntity>(params).getPage(),
                new EntityWrapper<XiaojiashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaojiashenqingEntity> wrapper) {
		  Page<XiaojiashenqingView> page =new Query<XiaojiashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaojiashenqingVO> selectListVO(Wrapper<XiaojiashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaojiashenqingVO selectVO(Wrapper<XiaojiashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaojiashenqingView> selectListView(Wrapper<XiaojiashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaojiashenqingView selectView(Wrapper<XiaojiashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
