package com.comeback;

import java.util.Locale;

public record Developer(String name, int experience) implements Identifiable{
    @Override
    public String id() {
        return name.toLowerCase();
    }
}
