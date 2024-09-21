package com.gjy.xfg.frame.trigger.http;

import com.gjy.types.common.Constants;
import com.gjy.types.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
@RestController
public class Controller {

    @Resource
    private ThreadPoolExecutor threadPoolExecutor;


}
