package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="cn.tedu.mapper")//mybatis接口文件扫描
public class RunApp {
	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}
}
