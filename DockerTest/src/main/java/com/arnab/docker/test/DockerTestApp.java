/**
 * 
 */
package com.arnab.docker.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arnab
 *
 */
@SpringBootApplication
@RestController
public class DockerTestApp {
	
	@RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerTestApp.class, args);
    }

}
