/**
 * Copyright (c) 2014, wolaiyee.com. All rights reserved.
 * wolaiyee.com. Use is subject to license terms.
 */
package net.yoomai.wechat.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

/**
 * 各类字符串拼接相关的辅助工具
 *
 * @author Ray & coffeefoam@126.com & http://github.com/coffeefoam
 * @(#)StringUtils.java 1.0 27/11/2015
 */
public class StringUtils {
    /**
     * 不重复的参数进行拼装，返回查询条件字符串
     *
     * @param parameters 参数map
     * @param sort       是否按照字典排序
     * @return
     */
    public static String generateQueryString(Map<String, Object> parameters, boolean sort) {
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            // log.debug("参数：{}", entry.getKey());
            if (!"".equals(entry.getValue())) {
                list.add(entry.getKey() + "=" + entry.getValue());
            }
        }

        String[] arrayToSort = list.toArray(new String[list.size()]);
        if (sort) {
            Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            buffer.append(arrayToSort[i]);
            if (i < (list.size() - 1)) {
                buffer.append("&");
            }
        }
        // log.debug("排列好的字符串: {}", buffer.toString());
        return buffer.toString();
    }

    /**
     * 生成随机字符串
     *
     * @param length
     * @return
     */
    public static String randomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();
        StringBuffer buffer = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            buffer.append(base.charAt(random.nextInt(base.length())));
        }

        return buffer.toString();
    }

}