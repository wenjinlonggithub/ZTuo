package cn.ztuo.bitrade.apns.model;

import java.io.InputStream;

/**
 * @description: ApnsConfig
 * @author: MrGao
 * @create: 2019/09/04 11:22
 */
public class ApnsConfig {
    private String name;
    private InputStream keyStore;
    private String password;
    private boolean isDevEnv = false;
    private int poolSize = 3;
    private int cacheLength = 100;
    private int retries = 1;
    private int intervalTime = 1800000;
    private int timeout = 10000;
    private String topic;

    public ApnsConfig() {
    }

    public InputStream getKeyStore() {
        return this.keyStore;
    }

    public void setKeyStore(InputStream keyStore) {
        this.keyStore = keyStore;
    }

    public void setKeyStore(String keystore) {
        InputStream is = ApnsConfig.class.getClassLoader().getResourceAsStream(keystore);
        if (is == null) {
            throw new IllegalArgumentException("Keystore file not found. " + keystore);
        } else {
            this.setKeyStore(is);
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDevEnv() {
        return this.isDevEnv;
    }

    public void setDevEnv(boolean isDevEnv) {
        this.isDevEnv = isDevEnv;
    }

    public int getPoolSize() {
        return this.poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public int getCacheLength() {
        return this.cacheLength;
    }

    public void setCacheLength(int cacheLength) {
        this.cacheLength = cacheLength;
    }

    public int getRetries() {
        return this.retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntervalTime() {
        return this.intervalTime;
    }

    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
