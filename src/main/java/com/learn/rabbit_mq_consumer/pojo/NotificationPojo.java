package com.learn.rabbit_mq_consumer.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class NotificationPojo {

    private Long primaryKey;
    private String detailNp;
    private List<String> receiver;
    private String sender;
    private String subject;
    private Long moduleId;
    private String module;
    private Boolean seen;
    private String remarks;
    private String receiverOfficeCode;
    private String receiverSectionCode;

    private NotificationType notificationType;

    private Boolean pushNotification;

    private Boolean  read;

    private String detailEn;

}