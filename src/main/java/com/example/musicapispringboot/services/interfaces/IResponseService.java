package com.example.musicapispringboot.services.interfaces;

import java.util.Map;

public interface IResponseService {
    public abstract Map<String, Object> generateResponse(String message, String error);
}
