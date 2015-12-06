package com.marflo.kafkaservice;

import com.marflo.kafkamodel.document.KafkaConsumerDocument;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface KafkaConsumerService {
    Response getAllConsumers();
    Response getConsumer(@PathParam("consumerId") Long consumerId);
    Response addConsumer(KafkaConsumerDocument consumer);
    Response removeConsumer(@PathParam("consumerId") Long consumerId);
}
