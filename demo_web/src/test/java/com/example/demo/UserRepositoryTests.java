package com.example.demo;

import com.example.demo.dao.TaskRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2017/8/9 0009.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private TaskRepository taskRepository;

//    @Test
//    public void test() throws Exception {
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//        String formattedDate = dateFormat.format(date);
//        System.out.println(formattedDate);
//
//        taskRepository.save(new Task("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
//        taskRepository.save(new Task("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
//        taskRepository.save(new Task("cc3", "cc@126.com", "cc", "cc123456",formattedDate));
//
//        Assert.assertEquals(3, taskRepository.findAll().size());
//        Assert.assertEquals("bb123456", taskRepository.findByUserName("bb2").getNickName());
//    }

    @Test
    public void testBaseQuery() throws Exception {
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//        String formattedDate = dateFormat.format(date);
//        Task user=new Task("aa1", "aa@126.com", "aa", "aa123456",formattedDate);
//        taskRepository.save(user);
//        System.out.println(taskRepository.findAll());
//        System.out.println(taskRepository.findOne(1l));
//        taskRepository.delete(user);
//        System.out.println(taskRepository.count());
//        System.out.println(taskRepository.exists(1l));
//        // ...
    }

    @After
    public void tearDown() throws Exception {
//        System.out.println("this is tearDown...");
//        taskRepository.delete(taskRepository.findByUserName("aa1"));
//        taskRepository.delete(taskRepository.findByUserName("bb2"));
//        taskRepository.delete(taskRepository.findByUserName("cc3"));
    }
}
