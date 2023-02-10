package com.simplon.service;


import com.simplon.dto.AdminRequest;
import com.simplon.dto.AdminResponse;
import com.simplon.model.Admin;
import com.simplon.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;

    public Admin addAdmin(AdminRequest adminRequest) {
          Admin admin = Admin.builder()
                .name(adminRequest.getName())
                .email(adminRequest.getEmail())
                .password(adminRequest.getPassword()).build();
          return adminRepository.save(admin);
    }


    public AdminResponse getAdmin(Long id) {
        Admin admin = adminRepository.findById(id).orElseThrow();
        return AdminResponse.builder()
                .id(admin.getId())
                .name(admin.getName())
                .email(admin.getEmail())
                .phone(admin.getPhone())
                .address(admin.getAddress()).build();
    }
}
