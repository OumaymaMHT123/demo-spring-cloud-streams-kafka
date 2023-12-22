package org.sid.demospringcloudstreamskafka.web;

import org.sid.demospringcloudstreamskafka.entities.PageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class PageEventRestController {
    @Autowired
    private StreamBridge streamBridge;
@GetMapping("/publish/{topic}/{name}")
    public PageEvent publish(@PathVariable String name, @PathVariable String topic){
    streamBridge.send(topic,PageEvent);

    return null;
}
}
