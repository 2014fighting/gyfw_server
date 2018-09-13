package com.wenqing.gyfw.repository;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.wenqing.gyfw.dataobject.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by vicky
 * 2018/8/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRepositoryTest {

      @Autowired
    private  UserInfoRepository  userInfoRepository;

      @Test
      public void save(){
          UserInfo user=new UserInfo();
          user.setCreateTime(new Date());
          user.setGender(1);
          user.setHeadImg("http://img.siyouku.cn/img24.jpg");
          user.setIntroduction("不惧将来，不畏过往");
          user.setPhoneNumber("15659284668");
          user.setUserName("文清");
          user.setUserAdress("福建厦门思明区");
          UserInfo result  =userInfoRepository.save(user);
          Assert.assertNotNull(result);
      }


      @Test
      public  void findByUserName()throws Exception {
          UserInfo  user=userInfoRepository.findByUserName("wenqing");
          Assert.assertNotNull(user);
      }
}