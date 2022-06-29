package com.bgrent.library.service;

import com.bgrent.library.dto.AdminDto;
import com.bgrent.library.model.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
