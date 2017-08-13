package com.example.demo;

import com.example.demo.Entity.task;
import com.example.demo.repository.taskRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private taskRepository tr;

	@Test
	public void contextLoads() {
		System.out.println(tr.findByManagerMobile("123123").getManagerName());
	}

}