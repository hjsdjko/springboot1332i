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


import com.dao.YuangongrenwuDao;
import com.entity.YuangongrenwuEntity;
import com.service.YuangongrenwuService;
import com.entity.vo.YuangongrenwuVO;
import com.entity.view.YuangongrenwuView;

@Service("yuangongrenwuService")
public class YuangongrenwuServiceImpl extends ServiceImpl<YuangongrenwuDao, YuangongrenwuEntity> implements YuangongrenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongrenwuEntity> page = this.selectPage(
                new Query<YuangongrenwuEntity>(params).getPage(),
                new EntityWrapper<YuangongrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongrenwuEntity> wrapper) {
		  Page<YuangongrenwuView> page =new Query<YuangongrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongrenwuVO> selectListVO(Wrapper<YuangongrenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongrenwuVO selectVO(Wrapper<YuangongrenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongrenwuView> selectListView(Wrapper<YuangongrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongrenwuView selectView(Wrapper<YuangongrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
