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

import com.entity.SusheruzhuEntity;
import com.entity.view.SusheruzhuView;

import com.service.SusheruzhuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 宿舍入住
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-27 11:46:08
 */
@RestController
@RequestMapping("/susheruzhu")
public class SusheruzhuController {
    @Autowired
    private SusheruzhuService susheruzhuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SusheruzhuEntity susheruzhu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			susheruzhu.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SusheruzhuEntity> ew = new EntityWrapper<SusheruzhuEntity>();
		PageUtils page = susheruzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susheruzhu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SusheruzhuEntity susheruzhu, 
		HttpServletRequest request){
        EntityWrapper<SusheruzhuEntity> ew = new EntityWrapper<SusheruzhuEntity>();
		PageUtils page = susheruzhuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, susheruzhu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SusheruzhuEntity susheruzhu){
       	EntityWrapper<SusheruzhuEntity> ew = new EntityWrapper<SusheruzhuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( susheruzhu, "susheruzhu")); 
        return R.ok().put("data", susheruzhuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SusheruzhuEntity susheruzhu){
        EntityWrapper< SusheruzhuEntity> ew = new EntityWrapper< SusheruzhuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( susheruzhu, "susheruzhu")); 
		SusheruzhuView susheruzhuView =  susheruzhuService.selectView(ew);
		return R.ok("查询宿舍入住成功").put("data", susheruzhuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SusheruzhuEntity susheruzhu = susheruzhuService.selectById(id);
        return R.ok().put("data", susheruzhu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SusheruzhuEntity susheruzhu = susheruzhuService.selectById(id);
        return R.ok().put("data", susheruzhu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SusheruzhuEntity susheruzhu, HttpServletRequest request){
    	susheruzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susheruzhu);
        susheruzhuService.insert(susheruzhu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SusheruzhuEntity susheruzhu, HttpServletRequest request){
    	susheruzhu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(susheruzhu);
        susheruzhuService.insert(susheruzhu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SusheruzhuEntity susheruzhu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(susheruzhu);
        susheruzhuService.updateById(susheruzhu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        susheruzhuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<SusheruzhuEntity> wrapper = new EntityWrapper<SusheruzhuEntity>();
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

		int count = susheruzhuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
