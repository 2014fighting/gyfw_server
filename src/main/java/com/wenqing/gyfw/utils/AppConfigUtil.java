package com.wenqing.gyfw.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by vicky
 * 2018/8/31
 * 用于批量获取配置文件属性
 */
@Component
@ConfigurationProperties(prefix="app")
public class AppConfigUtil {
    private String name;

    private String version;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
