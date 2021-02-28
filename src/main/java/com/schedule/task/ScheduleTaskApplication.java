package com.schedule.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.schedule.task.mapper")  //扫描Mapper接口
public class ScheduleTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleTaskApplication.class, args);
	}

}
