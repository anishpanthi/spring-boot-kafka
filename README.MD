**Spring Boot Kafka Demo Application**

In this demo application, Kafka Topic Configuration, Producer Configuration and Consumer Configuration is achieved both by using Configuration classes and just by using Spring Kafka Properties.

Make sure you have configured Apache Kafka in your system. Please follow steps defined here: `https://kafka.apache.org/quickstart`

**1. Through Props Configurations (Which is very simple)**
1. Comment all the code under `KafkaConsumerConfig, KafkaProducerConfig and KafkaTopicConfig`.
2. Comment Line 1 - 5 in `application.yml`
3. Run your application and you should be good.

**2. Using Java Bean Configurations**
1. Make sure all code are uncommented under `KafkaConsumerConfig, KafkaProducerConfig and KafkaTopicConfig`.
2. Make sure Line 12-21 is commented and 1-5 are uncommented in `application.yml`.
3. Run your application and you should be good.
