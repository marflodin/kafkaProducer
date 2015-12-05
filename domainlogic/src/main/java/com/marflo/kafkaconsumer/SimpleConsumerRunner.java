package com.marflo.kafkaconsumer;

public class SimpleConsumerRunner {

    public static void main(String[] args) {
        String zooKeeper = "localhost:2181";
        String groupId = "group1";
        String topic = "testTopic";
        int threads = 1;

        KafkaSimpleConsumer consumer = new KafkaSimpleConsumer(zooKeeper, groupId, topic);
        System.out.println("setup made");
        consumer.run(threads);
        System.out.println("Consumer up");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ie) {

        }
        consumer.shutdown();
        System.out.println("Consumer down");
    }
}
