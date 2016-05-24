package tk.jingzing.service;

import org.springframework.stereotype.Service;
import tk.jingzing.model.User;

import java.util.List;

/**
 * Created by wangyunjing on 16/5/24.
 */
@Service
public interface UserService {

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);
}
