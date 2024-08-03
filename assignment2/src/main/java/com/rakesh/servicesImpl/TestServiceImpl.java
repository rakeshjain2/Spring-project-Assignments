package com.rakesh.servicesImpl;

import org.springframework.stereotype.Service;

import com.rakesh.services.TestService;


@Service
public class TestServiceImpl implements TestService{

	@Override
	public String add() {

		return "This is Endpoint for add method";
	}

	@Override
	public String update() {
		return "This is Endpoint for update method";
	}

	@Override
	public String delete() {
		return "This is Endpoint for delete method";
	}

	@Override
	public String get() {
		return "This is Endpoint for get method";
	}

	@Override
	public String getAll() {
		return "This is Endpoint for getAll method";
	}

}
