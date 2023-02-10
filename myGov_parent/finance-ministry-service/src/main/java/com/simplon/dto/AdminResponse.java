package com.simplon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AdminResponse {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
}
