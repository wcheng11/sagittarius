package com.sagittarius.read;


import com.sagittarius.bean.query.*;
import com.sagittarius.bean.result.*;

import java.util.List;
import java.util.Map;

public interface Reader {
    Map<String, List<IntPoint>> getIntPoint(List<String> hosts, List<String> metrics, long time, Shift shift);

    Map<String, List<LongPoint>> getLongPoint(List<String> hosts, List<String> metrics, long time, Shift shift);

    Map<String, List<FloatPoint>> getFloatPoint(List<String> hosts, List<String> metrics, long time, Shift shift);

    Map<String, List<DoublePoint>> getDoublePoint(List<String> hosts, List<String> metrics, long time, Shift shift);

    Map<String, List<BooleanPoint>> getBooleanPoint(List<String> hosts, List<String> metrics, long time, Shift shift);

    Map<String, List<StringPoint>> getStringPoint(List<String> hosts, List<String> metrics, long time, Shift shift);

    Map<String, List<GeoPoint>> getGeoPoint(List<String> hosts, List<String> metrics, long time, Shift shift);

    Map<String, List<IntPoint>> getIntLatest(List<String> hosts, List<String> metrics);

    Map<String, List<LongPoint>> getLongLatest(List<String> hosts, List<String> metrics);

    Map<String, List<FloatPoint>> getFloatLatest(List<String> hosts, List<String> metrics);

    Map<String, List<DoublePoint>> getDoubleLatest(List<String> hosts, List<String> metrics);

    Map<String, List<BooleanPoint>> getBooleanLatest(List<String> hosts, List<String> metrics);

    Map<String, List<StringPoint>> getStringLatest(List<String> hosts, List<String> metrics);

    Map<String, List<GeoPoint>> getGeoLatest(List<String> hosts, List<String> metrics);

    Map<String, List<IntPoint>> getIntRange(List<String> hosts, List<String> metrics, long startTime, long endTime);

    Map<String, List<LongPoint>> getLongRange(List<String> hosts, List<String> metrics, long startTime, long endTime);

    Map<String, List<FloatPoint>> getFloatRange(List<String> hosts, List<String> metrics, long startTime, long endTime);

    Map<String, List<DoublePoint>> getDoubleRange(List<String> hosts, List<String> metrics, long startTime, long endTime);

    Map<String, List<BooleanPoint>> getBooleanRange(List<String> hosts, List<String> metrics, long startTime, long endTime);

    Map<String, List<StringPoint>> getStringRange(List<String> hosts, List<String> metrics, long startTime, long endTime);

    Map<String, List<GeoPoint>> getGeoRange(List<String> hosts, List<String> metrics, long startTime, long endTime);
}
