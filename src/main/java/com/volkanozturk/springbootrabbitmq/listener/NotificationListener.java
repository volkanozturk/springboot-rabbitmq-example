package com.volkanozturk.springbootrabbitmq.listener;

import com.volkanozturk.springbootrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author volkanozturk
 */
@Service
public class NotificationListener {

  @RabbitListener(queues = "test-queue")
  public void handleMessage(Notification notification) {
    System.out.println("Message received..");
    System.out.println(notification.toString());
  }
}
