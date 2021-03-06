package org.browsermob.proxy;

import org.directwebremoting.annotations.DataTransferObject;

import java.net.URL;
import java.util.Date;

@DataTransferObject
public class HttpObject {
    private int objectNum;
    private Date start;
    private Date end;
    private long timeToFirstByte;
    private long timeToLastByte;
    private long bytes;
    private String url;
    private int responseCode;
    private String method;
    private String protocol;
    private String host;
    private String path;
    private String queryString;

    public HttpObject() {
    }

    public HttpObject(Date start, URL url, String method) {
        this.start = start;
        this.url = url.toExternalForm();
        this.method = method;
        this.protocol = url.getProtocol();
        this.host = url.getHost();
        this.path = url.getPath();
        this.queryString = url.getQuery();
    }

    public void setObjectNum(int objectNum) {
        this.objectNum = objectNum;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public void setTimeToLastByte(long timeToLastByte) {
        this.timeToLastByte = timeToLastByte;
    }

    public void setTimeToFirstByte(long timeToFirstByte) {
        this.timeToFirstByte = timeToFirstByte;
    }

    public int getObjectNum() {
        return objectNum;
    }

    public Date getStart() {
        return start;
    }

    public long getTimeToFirstByte() {
        return timeToFirstByte;
    }

    public long getTimeToLastByte() {
        return timeToLastByte;
    }

    public long getBytes() {
        return bytes;
    }

    public String getUrl() {
        return url;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getMethod() {
        return method;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getEnd() {
        return end;
    }
}
