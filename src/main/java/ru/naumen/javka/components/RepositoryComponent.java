package ru.naumen.javka.components;

import ru.naumen.javka.repositories.UserRepository;
import ru.naumen.javka.repositories.UserRepositoryImpl;

import javax.persistence.EntityManager;

public class RepositoryComponent {
    private UserRepository userRepository;

    public RepositoryComponent(DbComponent db) {
        EntityManager em = db.getEm();
        userRepository = new UserRepositoryImpl(em);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
