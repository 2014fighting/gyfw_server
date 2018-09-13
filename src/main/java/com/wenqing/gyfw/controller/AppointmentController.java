package com.wenqing.gyfw.controller;


import com.wenqing.gyfw.aspect.AuthorizeAspect;
import com.wenqing.gyfw.dataobject.Appointment;
import com.wenqing.gyfw.service.impl.AppointmentServiceImpl;
import com.wenqing.gyfw.utils.AppConfigUtil;
import com.wenqing.gyfw.viewobject.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("appoint")
public class AppointmentController {

    public  final  static Logger _logger=LoggerFactory.getLogger(AppointmentController.class);


    @Autowired
    private AppointmentServiceImpl appointmentService;

    @Autowired
    private AppConfigUtil appConfigUtil;
    @GetMapping(value = "list")
    public ResultVO getList()throws Exception{

        _logger.info(appConfigUtil.getName());
        _logger.info("logInfo测试222222222222");
        _logger.error("logError测试111111111111");
        ResultVO resultVO =new ResultVO();
        PageRequest pageRequest=new PageRequest(0,2);
        Page<Appointment> appointments=appointmentService.getAll(pageRequest);
        if(StringUtils.isEmpty(appointments.getSize()==0))
            resultVO.setCode(101);
        else
            resultVO.setCode(100);

        resultVO.setMsg("成功！");
        resultVO.setData(appointments.getContent());
              return resultVO;
    }

    @GetMapping(value = "hello1")
    public String getListOne(){
        return "666666666666666";
    }
}
