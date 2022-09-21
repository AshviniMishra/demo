package com.example.demo.util;

import com.example.demo.model.Station;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Route {
    public static Map<String, List<Station>> routeMap = new HashMap<>();

    static {
        //delhi - mathura - agra - gwalior - shivpuri
        List<Station> route1 = new ArrayList<>();
        route1.add(new Station("delhi", 0));
        route1.add(new Station("mathura", 100));
        route1.add(new Station("agra", 200));
        route1.add(new Station("gwalior", 300));
        route1.add(new Station("shivpur", 400));

        routeMap.put("delhi-shivpur", route1 );
    }
}
