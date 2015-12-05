package com.marflo.kafkaservice;

import com.marflo.kafkamodel.exception.ErrorMessage;
import org.apache.log4j.Logger;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/consumer-service/consumers")
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    private static final Logger LOGGER = Logger.getLogger(KafkaConsumerServiceImpl.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllConsumers() {
        try {
            LOGGER.info("getAllConsumers");
            return null;
        } catch (Exception e) {
                LOGGER.error("Unexpected exception, error: " + e.getMessage());
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @GET
    @Path("{consumerId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getConsumer(@PathParam("consumerId") Long consumerId) {
        try {
            LOGGER.info("getConsumer: " + consumerId);
            return null;
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addConsumer() {
        try {
            LOGGER.info("addConsumer");
            return null;
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @DELETE
    @Path("{consumerId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response removeConsumer(@PathParam("consumerId") Long consumerId) {
        try {
            LOGGER.info("removeConsumer: " + consumerId);
            return null;
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }
}
