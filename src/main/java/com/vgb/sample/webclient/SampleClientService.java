package com.vgb.sample.webclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SampleClientService {

    @Autowired
    private RestTemplate restTemplate;

    public String getSomething() {
        return restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", String.class);
    }
}
