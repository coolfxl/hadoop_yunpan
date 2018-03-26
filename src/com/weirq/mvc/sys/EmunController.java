package com.weirq.mvc.sys;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weirq.mvc.BaseController;
import com.weirq.vo.Menu;

@Controller
@RequestMapping("/emun")
public class EmunController extends BaseController{

	@ResponseBody
	@RequestMapping("/list")
	public List<Menu> list() throws Exception {
		return db.qureyAllEmun();
	}
}
