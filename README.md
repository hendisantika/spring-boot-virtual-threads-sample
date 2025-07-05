## Spring Boot Virtual Threads Explained: Easy Configuration & Examples

A simple app demonstrating how we can use virtual threads in Spring Boot application for enhanced concurrency and
performance

## App Overview

This is a simple app containing three endpoints: **/hello** for basic greetings, **/hello-with-delay** to simulate
response delays, and **/hello-async** for asynchronous processing.

## Platform Threads vs Virtual Threads

### Platform Threads

Platform threads (also known as OS or kernel threads) are the traditional Java threads that are directly mapped to
operating system threads. Key characteristics include:

- **Resource Intensive**: Each platform thread consumes approximately 1-2MB of memory.
- **Limited Scalability**: Applications typically can only create thousands of platform threads before running into
  resource limitations.
- **Context Switching Overhead**: Switching between platform threads is expensive as it involves OS kernel operations.
- **Thread Pool Management**: Requires careful tuning of thread pools to avoid resource exhaustion.
- **Implementation**: In Java, created using `Thread.ofPlatform().start()` or the traditional `new Thread().start()`.

### Virtual Threads

Virtual threads (introduced in Java 21 as Project Loom) are lightweight threads managed by the JVM. Key characteristics
include:

- **Lightweight**: Consume only a few kilobytes of memory each.
- **Highly Scalable**: Applications can create millions of virtual threads.
- **Efficient Scheduling**: Managed by the JVM scheduler, not the OS scheduler.
- **Reduced Context Switching Overhead**: Switching between virtual threads is much cheaper.
- **Thread-Per-Request Model**: Enables a simpler programming model without complex thread pool management.
- **Implementation**: Created using `Thread.ofVirtual().start()` or `Thread.startVirtualThread()`.

### Benefits in Spring Boot Applications

- **Improved Throughput**: Handle more concurrent requests with the same hardware.
- **Simplified Code**: Write straightforward blocking code that performs like non-blocking code.
- **Better Resource Utilization**: More efficient use of CPU and memory resources.
- **Reduced Latency**: Less time spent waiting for thread availability in high-concurrency scenarios.

In this application, virtual threads are enabled via the `spring.threads.virtual.enabled=true` property, allowing Spring
Boot to use virtual threads for request processing, significantly improving the application's ability to handle
concurrent requests.

## JMeter Test Plan

To test the performance of Spring Boot application with and without virtual threads:
<br/>**1.** Enable or disable virtual threads in the application properties.
<br/>**2** Run the JMeter test plan and analyze the output in the response time graph to compare the performance under
different configurations.

The JMeter Test Plan is available under the resources folder.
<br/>[src > main > resources > jmeter > Spring-Boot-Virtual-Threads.jmx]

## Postman Collection

Additionally, the Postman collection is available under the resources folder containing all the requests.
<br/>[src > main > resources > postman > Spring-Boot-Virtual-Threads.postman_collection.json]
