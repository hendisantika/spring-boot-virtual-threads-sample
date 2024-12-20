package id.my.hendisantika.virtualthreads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SpringBootVirtualThreadsSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVirtualThreadsSampleApplication.class, args);
    }

}
