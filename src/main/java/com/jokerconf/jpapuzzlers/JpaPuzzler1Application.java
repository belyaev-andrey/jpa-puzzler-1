package com.jokerconf.jpapuzzlers;

import com.jokerconf.jpapuzzlers.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaPuzzler1Application implements CommandLineRunner {

    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaPuzzler1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ownerRepository.findById(1L).ifPresent(System.out::println);
    }




}