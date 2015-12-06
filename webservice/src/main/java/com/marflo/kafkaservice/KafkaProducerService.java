package com.marflo.kafkaservice;

import com.marflo.kafkamodel.document.KafkaProducerDocument;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface KafkaProducerService {
    Response getAllProducers();
    Response getProducer(@PathParam("producerId") Long producerId);
    Response addProducer(KafkaProducerDocument producer);
    Response removeProducer(@PathParam("producerId") Long producerId);
}
