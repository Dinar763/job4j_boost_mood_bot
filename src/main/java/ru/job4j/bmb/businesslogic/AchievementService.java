package ru.job4j.bmb.businesslogic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AchievementService {

    @PostConstruct
    public void init() {
        System.out.println("AchievementService initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AchievementService destroyed.");
    }
}


