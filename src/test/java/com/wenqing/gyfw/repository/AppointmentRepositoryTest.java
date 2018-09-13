package com.wenqing.gyfw.repository;

import com.wenqing.gyfw.dataobject.Appointment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentRepositoryTest {

    @Autowired
    private AppointmentRepository appointmentRepository;

     @Test
    public void findFirstTest() {

       Appointment appointment =appointmentRepository.findById(1).get();

        System.out.println(appointment.getCreateUser());
    }

    @Test
    public void savaTest(){

        List<Appointment> list=new ArrayList<Appointment>();
        for (int i = 0; i < 10; i++) {
            Appointment appointment =new Appointment();
            appointment.setServiceName("家i政服务"+i);
            appointment.setCreateUser("wenqing"+i);
            appointment.setDetail("家政服务嗯");
            appointment.setPhoneNum("1565928466"+i);
            list.add(appointment);
        }
       List<Appointment> appointmentList= appointmentRepository.saveAll(list);

        Assert.assertNotNull(appointmentList);
    }

    @Test
    public void updateTest(){
         Appointment appointment=appointmentRepository.findById(50).get();

        appointment.setDetail("修改测试1122222111");

       Appointment appointment1= appointmentRepository.save(appointment);
        Assert.assertNotNull(appointment1);
    }

}