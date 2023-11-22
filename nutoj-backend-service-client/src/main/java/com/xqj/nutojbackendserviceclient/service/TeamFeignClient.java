package com.xqj.nutojbackendserviceclient.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 判题服务
 */
@FeignClient(name = "nutoj-backend-team-service", path = "/api/team/inner")
public interface TeamFeignClient {

}

