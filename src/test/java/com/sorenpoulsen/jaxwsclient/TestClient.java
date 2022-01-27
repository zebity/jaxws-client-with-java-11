package com.sorenpoulsen.jaxwsclient;

import jakarta.xml.ws.BindingProvider;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.tempuri.TestPortType;
import org.tempuri.TestService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {

    @Test
    @Disabled
    public void test() {
        TestService testService = new TestService();
        TestPortType testPort = testService.getTestPort();
        BindingProvider binding = (BindingProvider) testPort;
        binding.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8088/mockTestBinding");
        String response = testPort.sendMessage("hello");
        assertEquals("and hello to you", response);
    }
}
