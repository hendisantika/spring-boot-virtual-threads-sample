package id.my.hendisantika.virtualthreads.controller;

import id.my.hendisantika.virtualthreads.service.RequestProcessingService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-virtual-threads-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/10/24
 * Time: 09.44
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
public class SpringBootVirtualThreadsController {

    private final Logger log = LoggerFactory.getLogger(SpringBootVirtualThreadsController.class);

    private final RequestProcessingService requestProcessingService;
}
