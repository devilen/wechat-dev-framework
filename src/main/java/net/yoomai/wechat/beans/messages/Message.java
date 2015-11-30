/**
 * Copyright (c) 2014, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.wechat.beans.messages;

/**
 * 消息基础模块
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)Message.java 1.0 28/11/2015
 */
public class Message {
    private String type;

    /**
     * 文本消息
     */
    public static final String TEXT = "text";

    /**
     * 图片消息
     */
    public static final String IMAGE = "image";

    /**
     * 语音消息
     */
    public static final String VOICE = "voice";

    /**
     * 视频消息
     */
    public static final String VIDEO = "video";

    /**
     * 短视频消息
     */
    public static final String SHORTVIDEO = "shortvideo";

    /**
     * 位置消息
     */
    public static final String LOCATION = "location";

    /**
     * 链接消息
     */
    public static final String LINK = "link";

    /**
     * 图文消息
     */
    public static final String NEWS = "news";

    /**
     * 事件
     */
    public static final String EVENT = "event";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
