package com.guicai.web.vertx;

import com.guicai.web.manager.CacheManager;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @Author ${雷电影}
 * @Version 1.0
 */
@Component
public class VertxManager {

    @Resource
    private CacheManager cacheManager;

    @PostConstruct
    public void init() {
        Vertx vertx = Vertx.vertx();
        Verticle myVerticle = new MainVerticle(cacheManager);
        vertx.deployVerticle(myVerticle);
    }

}
