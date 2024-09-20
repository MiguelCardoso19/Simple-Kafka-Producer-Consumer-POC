# Simple Kafka Producer-Consumer POC

This project is a Proof of Concept (POC) that demonstrates the integration of Kafka producers and consumers in a simple event-driven architecture. The application consists of one producer, two Kafka topics, and two consumers. The main goal is to simulate an order-processing workflow, where the producer sends order data to Kafka topics, and the consumers process the data and save the order details to a MongoDB database.

## Tech Stack

- **Java 21**
- **Maven**
- **Spring Boot**
- **Apache Kafka**
- **MongoDB**
- **Docker**

## Architecture Overview

1. **Producer**: 
    - Sends order-related messages to Kafka topics.
    - The producer interacts with two Kafka topics.

2. **Consumers**:
    - Two consumers that listen to the Kafka topics.
    - Once the message is consumed, the consumers process the message and save it into MongoDB.
