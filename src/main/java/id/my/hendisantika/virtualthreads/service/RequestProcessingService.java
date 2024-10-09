package id.my.hendisantika.virtualthreads.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-virtual-threads-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/10/24
 * Time: 09.42
 * To change this template use File | Settings | File Templates.
 */

@Service
public class RequestProcessingService {

    private final Logger log = LoggerFactory.getLogger(RequestProcessingService.class);

    @Async
    public CompletableFuture<String> greetingsWithAsyncProcessing() {
        log.info("Async request processing. current thread: {}", Thread.currentThread());
        return CompletableFuture.completedFuture("Hello, World!");
    }
}
