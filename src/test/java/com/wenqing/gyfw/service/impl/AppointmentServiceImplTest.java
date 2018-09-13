package com.wenqing.gyfw.service.impl;

import com.wenqing.gyfw.dataobject.Appointment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentServiceImplTest {

    @Autowired
    private  AppointmentServiceImpl  appointmentService;

    @Test
    public void getById() {
        Appointment appointment =appointmentService.getById(1);

        Assert.assertEquals(new Integer(1),appointment.getId());
    }

    @Test
    public void getAll() throws Exception{
        PageRequest request=new PageRequest(0,1);
        Page<Appointment> appointmentList =appointmentService.getAll(request);

        Assert.assertNotEquals(0,appointmentList.getSize());
    }

    @Test
    public void save() {
        Appointment appointment =new Appointment();
        appointment.setServiceName("家政服务1");
        appointment.setCreateTime(new Date());
        appointment.setCreateUser("wenqing");
        appointment.setDetail("家政服务1");
        appointment.setPhoneNum("15659284668");
       Appointment result= appointmentService.save(appointment);

        Assert.assertNotNull(result);

    }
}