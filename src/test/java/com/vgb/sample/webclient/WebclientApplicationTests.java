package com.vgb.sample.webclient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class WebclientApplicationTests {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private SampleClientService sampleClientService = new SampleClientService();

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testService() {
        Mockito.when(
                restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", String.class))
                .thenReturn("mock answer");
        final String response = sampleClientService.getSomething();
        Assertions.assertEquals("mock answer", response);
    }

}
