package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    List<User> getAllUsers();

    User updateUser(User user);
}
