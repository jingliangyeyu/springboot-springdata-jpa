package com.zs.dao;

import com.zs.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author zhouson
 * @create 2019-07-11 13:38
 */
@Repository
public interface UserDao extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
  public User findByUsernameAndPassword(String username,String password);
}
