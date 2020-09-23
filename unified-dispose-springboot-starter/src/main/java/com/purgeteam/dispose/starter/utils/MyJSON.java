package com.purgeteam.dispose.starter.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyJSON {
    public static String JSON2Str(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
