package com.example.demo.controller;

import com.example.demo.dao.TaskRepository;
import com.example.demo.entity.Task;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * Created by Administrator on 2017/8/9 0009.
 */
@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping(value="/")
    public String index(Task task, BindingResult bindingResult, Model model) {
        model.addAttribute("tasks", taskRepository.findAll());
        return "index";//返回index.html页面
    }

    @PostMapping(value = "/task")
    public String addNewTask(@Valid Task task, BindingResult bindingResult, Model model) {
        System.out.println("this is addNewTask");
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
            return "index";
        }
        if(task.getIsFinished() == null){
            task.setIsFinished(true);
        }
        taskRepository.save(new Task(task));
        model.addAttribute("tasks", taskRepository.findAll());
        return "index";
    }

    @GetMapping(value="/task")
    public String getTask(@RequestParam(value="id",required=true)Long id, Task task, BindingResult bindingResult, Model model) {
        System.out.println("this is getTask");
        model.addAttribute("currentTask", taskRepository.findById(id));
        return "index";
    }

    @DeleteMapping(value="/task/{id}")
    @ResponseBody
    public List<Task> deleteTask(@PathVariable(value="id",required=true)Long id) {
        System.out.println("this is deleteTask");
        taskRepository.deleteById(id);
        return taskRepository.findAll();
    }
}
