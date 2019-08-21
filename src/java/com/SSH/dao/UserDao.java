package com.SSH.dao;


import com.SSH.pojo.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import javax.annotation.Resource;
import java.util.List;

//@Component
public class UserDao {

    public List<User> getAll() {
        List<User> list = null;
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        /*
        User u = (User) session.get(User.class, 1);
        User u = (User) session.load(User.class, 1);//支持懒加载
        //SQL查询
        list = session.createSQLQuery("select * from t_user").addEntity(User.class).list();
        //HQL查询
        list = session.createQuery("from User user where user.id=1 or user.id=2 ").list();
         */
        Criteria criteria = session.createCriteria(User.class);
        //添加条件
//        criteria.add(Restrictions.eq("id", 1));
        //查询全部，没有sql语句
        list = criteria.list();
        session.close();
        return list;
    }

    public boolean addUser(User user) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        session.flush();
        session.close();
        return true;
    }

    public boolean updataUser(User user) {

        return true;
    }

    public boolean deleteUser(String id) {

        return true;
    }

}
