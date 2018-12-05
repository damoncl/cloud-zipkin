package com.damon.cloudzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class CloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZipkinApplication.class, args);
    }
}
