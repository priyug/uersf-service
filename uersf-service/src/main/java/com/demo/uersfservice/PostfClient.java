package com.demo.uersfservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "postfservice")

public interface PostfClient {

    @GetMapping("/post/uersf/{userid}")
    public Postf getPostMicro(@PathVariable("userid") String userid);
}
