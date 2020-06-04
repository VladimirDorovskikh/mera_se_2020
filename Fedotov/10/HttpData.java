package com.mera.training.task10;

public class HttpData {
    private final String name;
    private long timeToLoad;
    private long sizeInBytes;

    public HttpData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getTimeToLoad() {
        return timeToLoad;
    }

    public void setTimeToLoad(long timeToLoad) {
        this.timeToLoad = timeToLoad;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
}
