package com.marflo.kafkamodel.document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="KafkaConsumer")
public class KafkaConsumerDocument {

    @XmlElement(name="groupId")
    private String groupId;
    @XmlElement(name="topic")
    private String topic;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
