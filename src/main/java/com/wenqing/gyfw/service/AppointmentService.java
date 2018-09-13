package com.wenqing.gyfw.service;

import com.wenqing.gyfw.dataobject.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AppointmentService {
    Appointment  getById(Integer id);

    Page<Appointment> getAll(Pageable pageable) throws Exception;

    Appointment save(Appointment appointment);

}
