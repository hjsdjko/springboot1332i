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


import com.dao.ShebeibaoxiuDao;
import com.entity.ShebeibaoxiuEntity;
import com.service.ShebeibaoxiuService;
import com.entity.vo.ShebeibaoxiuVO;
import com.entity.view.ShebeibaoxiuView;

@Service("shebeibaoxiuService")
public class ShebeibaoxiuServiceImpl extends ServiceImpl<ShebeibaoxiuDao, ShebeibaoxiuEntity> implements ShebeibaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeibaoxiuEntity> page = this.selectPage(
                new Query<ShebeibaoxiuEntity>(params).getPage(),
                new EntityWrapper<ShebeibaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeibaoxiuEntity> wrapper) {
		  Page<ShebeibaoxiuView> page =new Query<ShebeibaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeibaoxiuVO> selectListVO(Wrapper<ShebeibaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeibaoxiuVO selectVO(Wrapper<ShebeibaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeibaoxiuView> selectListView(Wrapper<ShebeibaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeibaoxiuView selectView(Wrapper<ShebeibaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
