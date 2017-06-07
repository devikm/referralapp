package com.cc.referralapp.user.dao;
import org.springframework.data.repository.CrudRepository;

import com.cc.referralapp.user.model.UserLogin;

public interface UserLoginRepository extends CrudRepository<UserLogin, Integer>{

}
