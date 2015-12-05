package com.marflo.kafkamodel.document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name="KafkaApiCallEvent")
public class KafkaApiCallEventDocument {

    @XmlElement(name="callId")
    private String callId;
    @XmlElement(name="callName")
    private String callName;
    @XmlElement(name="correlationId")
    private String correlationId;
    @XmlElement(name="requestTimestamp")
    private Date requestTimestamp;
    @XmlElement(name="responseTimestamp")
    private Date responseTimestamp;
    @XmlElement(name="responseCode")
    private Integer responseCode;

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public Date getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(Date requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }

    public Date getResponseTimestamp() {
        return responseTimestamp;
    }

    public void setResponseTimestamp(Date responseTimestamp) {
        this.responseTimestamp = responseTimestamp;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }
}
