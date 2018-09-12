package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//启动类
@SpringBootApplication
public class RunApp {
	public static void main(String[] args) {
		//需要spring环境servlet运行环境
		SpringApplication.run(RunApp.class, args);
	}
}
