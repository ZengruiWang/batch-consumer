package com.example.consumer;
import java.util.UUID;

public class SimpleEntity {
    private String date;
    private String uuid;
    private String source;

    public SimpleEntity() {}

    public SimpleEntity(String date, UUID uuid, String source) {
        this.date = date;
        this.uuid = uuid.toString();
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "SimpleEntity{" +
                "date='" + date + '\'' +
                ", uuid='" + uuid + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
