package com.example.musicapispringboot.services;

import com.example.musicapispringboot.services.interfaces.IResponseService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ResponseService implements IResponseService {
    @Override
    public Map<String, Object> generateResponse(String message, String error) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("error", error);

        return response;
    }
}
