package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    void deleteUser(long id);

    User getUser (long id);

    User updateUser(User user);
}

