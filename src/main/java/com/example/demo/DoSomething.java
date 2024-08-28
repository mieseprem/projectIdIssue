package com.example.demo;

import com.google.cloud.spring.core.GcpProjectIdProvider;
import org.springframework.stereotype.Component;

@Component
public class DoSomething {
    final private GcpProjectIdProvider gcpProjectIdProvider;

    public DoSomething(final GcpProjectIdProvider gcpProjectIdProvider) {
        this.gcpProjectIdProvider = gcpProjectIdProvider;
    }

    public void engage() {
        System.out.println("Project ID: " + gcpProjectIdProvider.getProjectId());
    }
}
