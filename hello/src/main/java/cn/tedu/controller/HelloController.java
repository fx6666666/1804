package cn.tedu.controller;

import org.jboss.logging.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //打印hello，返回json格式
	@RequestMapping("/hello/{name}")
	//@ResponseBody
	public String hello(@PathVariable String name){
		return "hello SpringBoot:"+name;
	}
}
