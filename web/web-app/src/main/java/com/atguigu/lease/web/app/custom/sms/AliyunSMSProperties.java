package com.atguigu.lease.web.app.custom.sms;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliyunSMSProperties {

    private String accessKeyId;
    private String accessKeySecret;
    private String endpoint;
}
