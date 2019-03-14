/**
 * Copyright 2019 VMware, Inc.
 * SPDX-License-Identifier: BSD-2-Clause
*/
package com.vmware.wormhole.aggregator.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.vmware.wormhole.common.model.redis.message.MessagePublisher;

@Component
public class RedisMessagePublisher implements MessagePublisher {

   @Autowired
   private StringRedisTemplate template;

   @Override
   public void publish(String topic, String message) {
      template.convertAndSend(topic, message);
   }
}
