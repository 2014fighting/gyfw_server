package com.wenqing.gyfw.repository;

import com.wenqing.gyfw.dataobject.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

}
