package com.wenqing.gyfw.service.impl;

import com.wenqing.gyfw.dataobject.Appointment;
import com.wenqing.gyfw.enums.ResultEnum;
import com.wenqing.gyfw.exception.GyfwException;
import com.wenqing.gyfw.repository.AppointmentRepository;
import com.wenqing.gyfw.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment getById(Integer id) {
        return appointmentRepository.findById(id).get();
    }

    @Override
    public Page<Appointment> getAll(Pageable pageable) throws Exception{
//        throw new GyfwException(ResultEnum.TEST_ERROR);

       return appointmentRepository.findAll(pageable);
    }

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
}
