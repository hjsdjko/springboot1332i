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


import com.dao.YuangongdakaDao;
import com.entity.YuangongdakaEntity;
import com.service.YuangongdakaService;
import com.entity.vo.YuangongdakaVO;
import com.entity.view.YuangongdakaView;

@Service("yuangongdakaService")
public class YuangongdakaServiceImpl extends ServiceImpl<YuangongdakaDao, YuangongdakaEntity> implements YuangongdakaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongdakaEntity> page = this.selectPage(
                new Query<YuangongdakaEntity>(params).getPage(),
                new EntityWrapper<YuangongdakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongdakaEntity> wrapper) {
		  Page<YuangongdakaView> page =new Query<YuangongdakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongdakaVO> selectListVO(Wrapper<YuangongdakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongdakaVO selectVO(Wrapper<YuangongdakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongdakaView> selectListView(Wrapper<YuangongdakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongdakaView selectView(Wrapper<YuangongdakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
