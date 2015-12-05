package com.marflo.kafkamodel.document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="KafkaProducer")
public class KafkaProducerDocument {

    @XmlElement(name="topic")
    private String topic;
}
