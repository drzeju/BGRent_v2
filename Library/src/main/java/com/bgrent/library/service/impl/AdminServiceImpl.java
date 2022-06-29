package com.bgrent.library.service.impl;

import com.bgrent.library.dto.AdminDto;
import com.bgrent.library.model.Admin;
import com.bgrent.library.repository.AdminRepository;
import com.bgrent.library.repository.RoleRepository;
import com.bgrent.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    private final RoleRepository roleRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository, RoleRepository roleRepository) {
        this.adminRepository = adminRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(List.of(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }
}
