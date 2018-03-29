package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.Role;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "/listRole")
	public List<Role> listRole() {
		List<Role> roles = new ArrayList<>();
		String preId = "test";
		for (int i = 0; i < 10; ++i) {
			Role role = new Role();
			role.setRname("角色" + i);
			role.setId(preId + i);
			if (i != 0) {
				role.setParentId(preId + "0");
			}
			roles.add(role);
		}
		return roles;
	}

}
