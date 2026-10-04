package com.comeback;

import java.util.List;

public class DeveloperService {
    public List<String> findSeniorDeveloperNames(
            List<Developer> developers) {

        return developers.stream()
                .filter(DeveloperService::isSenior)
                .map(Developer::name)
                .toList();
    }

    static boolean isSenior(Developer developer) {
        return developer.experience() >= 5;
    }

    static Developer findDeveloper(
            List<Developer> developers,
            String name) {

        return developers.stream()
                .filter(developer -> developer.name().equals(name))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Developer not found: " + name));
    }
}
