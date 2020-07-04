package com.dreamworld.tradingsystem.services;

import com.dreamworld.tradingsystem.client.AuthServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthServiceClient authClient;


    public String create(String user) {
        authClient.createUser(user);
        return user + "Created";
    }


}
