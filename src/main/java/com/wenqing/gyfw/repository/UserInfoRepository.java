package com.wenqing.gyfw.repository;

import com.wenqing.gyfw.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vicky
 * 2018/8/2
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
   UserInfo findByUserName(String username);
}
