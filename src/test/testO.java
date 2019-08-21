import com.SSH.dao.UserDao;
import com.SSH.pojo.User;

import java.util.List;

public class testO {
    public static void main(String[] args) {
//        System.out.println("sfsd");
//        User user = new User();
//        Role role = new Role();
//        role.setRoleName("管理员");
//        role.setCreateDate(new Date());
//        RoleDao roleDao=new RoleDao();
//        roleDao.addRole(role);
//        user.setName("LiMing");
//        user.setSex("box");
//        user.setRole(role);
//        UserDao userDao = new UserDao();
//        userDao.addUser(user);
        List<User> list = null;
        UserDao userDao = new UserDao();
        list = userDao.getAll();
        for (User user : list)
            System.out.println(user.getRole().getId());
    }
}