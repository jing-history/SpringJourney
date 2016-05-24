package tk.jingzing.service;

import org.springframework.stereotype.Service;
import tk.jingzing.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wangyunjing on 16/5/24.
 */
@Service
public class UserServiceImpl implements UserService{

    private static final AtomicLong counter = new AtomicLong();
    private static List<User> users;

    public User findById(long id) {
        return null;
    }

    public User findByName(String name) {
        return null;
    }

    public void saveUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUserById(long id) {

    }

    public List<User> findAllUsers() {
        return users;
    }

    public void deleteAllUsers() {

    }

    public boolean isUserExist(User user) {
        return false;
    }

    private static List<User> populateDummyUsers(){
        List<User> users = new ArrayList<User>();
        users.add(new User(counter.incrementAndGet(),"Sam",30, 70000));
        users.add(new User(counter.incrementAndGet(),"Tom",40, 50000));
        users.add(new User(counter.incrementAndGet(),"Jerome",45, 30000));
        users.add(new User(counter.incrementAndGet(),"Silvia",50, 40000));
        return users;
    }
}
