package com.devsuperior.user_request_sb.domain;

import com.devsuperior.user_request_sb.dto.UserDTO;

import java.util.List;

public class ResponseUser {
    private List<UserDTO> content;

    public List<UserDTO> getContent() {
        return content;
    }
}
