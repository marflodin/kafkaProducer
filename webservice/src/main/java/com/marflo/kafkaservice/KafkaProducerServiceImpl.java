package com.marflo.kafkaservice;

import com.marflo.kafkamodel.document.KafkaProducerDocument;
import com.marflo.kafkamodel.exception.ErrorMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/producer-service/producers")
public class KafkaProducerServiceImpl implements KafkaProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerServiceImpl.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllProducers() {
        try {
            LOGGER.info("getAllProducers");
            return null;
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @GET
    @Path("{producerId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getProducer(@PathParam("producerId") Long producerId) {
        try {
            LOGGER.info("getProducer: {}", producerId);
            return null;
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addProducer(KafkaProducerDocument producer) {
        try {
            LOGGER.info("addProducer: {}", producer);
            return null;
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }

    @DELETE
    @Path("{producerId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response removeProducer(@PathParam("producerId") Long producerId) {
        try {
            LOGGER.info("removeProducer: {}", producerId);
            return null;
        } catch (Exception e) {
            LOGGER.error("Unexpected exception, error: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ErrorMessage.UNEXPECTED_EXCEPTION.getDescription()).build();
        }
    }
}
