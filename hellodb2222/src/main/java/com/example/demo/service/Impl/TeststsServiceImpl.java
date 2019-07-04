package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TeststsDao;
import com.example.demo.model.TeststsModel;
import com.example.demo.service.TeststsService;

@Service
public class TeststsServiceImpl implements TeststsService {
	@Autowired
	private TeststsDao dao;
	
	public List<TeststsModel> printTeststs() {
		List<TeststsModel> teststs = dao.getTeststs();
		return teststs;
	}

}
