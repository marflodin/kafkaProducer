package com.marflo.kafkaservice;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface KafkaConsumerService {
    Response getAllConsumers();
    Response getConsumer(@PathParam("consumerId") Long consumerId);
    Response addConsumer();
    Response removeConsumer(@PathParam("consumerId") Long consumerId);
}
