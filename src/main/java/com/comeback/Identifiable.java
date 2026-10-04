package com.comeback;

public interface Identifiable {
    String id();

    default String describe(){
        return "ID: " + id();
    }

    static boolean isValidId(String id) {
        return id != null && !id.isBlank();
    }
}
