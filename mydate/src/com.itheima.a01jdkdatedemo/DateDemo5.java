package com.itheima.a01jdkdatedemo;

import java.time.ZoneId;
import java.util.Set;

public class DateDemo5 {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());

        System.out.println(zoneIds);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }
}
