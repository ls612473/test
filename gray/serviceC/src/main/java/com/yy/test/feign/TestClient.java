package com.huayun.test.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by saleson on 2017/11/10.
 */
@FeignClient(name = "service-a")
public interface TestClient {

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    Map<String, String> testGet(@RequestParam(value = "version", required = false) String version);



    @RequestMapping(value = "/api/test/post", method = RequestMethod.POST)
    Map<String, String> testPost(@RequestParam(value = "version") String version, @RequestBody String body);

}
