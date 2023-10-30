// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.keyvault.secrets.sample.single.property.source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertySourceApplication implements CommandLineRunner {

    @Value("${secret1}")
    private String secret1;
    @Value("${secret2}")
    private String secret2;

    public static void main(String[] args) {
        SpringApplication.run(PropertySourceApplication.class, args);
    }

    public void run(String[] args) {
        System.out.println("secret1: " + secret1);
        System.out.println("secret2: " + secret2);
    }

}
