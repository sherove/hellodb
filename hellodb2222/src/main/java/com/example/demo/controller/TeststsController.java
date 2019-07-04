package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.TeststsModel;
import com.example.demo.service.TeststsService;

@Controller
public class TeststsController {
	@Autowired
	TeststsService teststsService;
	
	@RequestMapping("/list") 
	public String list(Model model) {
		List<TeststsModel> list = teststsService.printTeststs();
		model.addAttribute("list",list);
		return "list";
		
	}
}
