package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuangongrenwuEntity;
import com.entity.view.YuangongrenwuView;

import com.service.YuangongrenwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 员工任务
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@RestController
@RequestMapping("/yuangongrenwu")
public class YuangongrenwuController {
    @Autowired
    private YuangongrenwuService yuangongrenwuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuangongrenwuEntity yuangongrenwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			yuangongrenwu.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuangongrenwuEntity> ew = new EntityWrapper<YuangongrenwuEntity>();
		PageUtils page = yuangongrenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongrenwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuangongrenwuEntity yuangongrenwu, 
		HttpServletRequest request){
        EntityWrapper<YuangongrenwuEntity> ew = new EntityWrapper<YuangongrenwuEntity>();
		PageUtils page = yuangongrenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuangongrenwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuangongrenwuEntity yuangongrenwu){
       	EntityWrapper<YuangongrenwuEntity> ew = new EntityWrapper<YuangongrenwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuangongrenwu, "yuangongrenwu")); 
        return R.ok().put("data", yuangongrenwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuangongrenwuEntity yuangongrenwu){
        EntityWrapper< YuangongrenwuEntity> ew = new EntityWrapper< YuangongrenwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuangongrenwu, "yuangongrenwu")); 
		YuangongrenwuView yuangongrenwuView =  yuangongrenwuService.selectView(ew);
		return R.ok("查询员工任务成功").put("data", yuangongrenwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuangongrenwuEntity yuangongrenwu = yuangongrenwuService.selectById(id);
        return R.ok().put("data", yuangongrenwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuangongrenwuEntity yuangongrenwu = yuangongrenwuService.selectById(id);
        return R.ok().put("data", yuangongrenwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuangongrenwuEntity yuangongrenwu, HttpServletRequest request){
    	yuangongrenwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongrenwu);
        yuangongrenwuService.insert(yuangongrenwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuangongrenwuEntity yuangongrenwu, HttpServletRequest request){
    	yuangongrenwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuangongrenwu);
        yuangongrenwuService.insert(yuangongrenwu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuangongrenwuEntity yuangongrenwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuangongrenwu);
        yuangongrenwuService.updateById(yuangongrenwu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuangongrenwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YuangongrenwuEntity> wrapper = new EntityWrapper<YuangongrenwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuangongrenwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
