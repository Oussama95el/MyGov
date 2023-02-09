package com.simplon.ministry.financeandeconomy.controller;

import com.simplon.ministry.financeandeconomy.dto.AdminRequest;
import com.simplon.ministry.financeandeconomy.dto.AdminResponse;
import com.simplon.ministry.financeandeconomy.model.Admin;
import com.simplon.ministry.financeandeconomy.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/finance&economy/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;



    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Admin> createAdmin(@RequestBody AdminRequest admin){
        return ResponseEntity.ok(adminService.addAdmin(admin));
    }

    @GetMapping("/get")
    public ResponseEntity<AdminResponse> getAdmin(@RequestParam Long id){
        return ResponseEntity.ok(adminService.getAdmin(id));
    }

}
