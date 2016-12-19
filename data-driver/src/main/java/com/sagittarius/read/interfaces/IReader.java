package com.sagittarius.read.interfaces;


import com.sagittarius.bean.result.*;

import java.util.List;
import java.util.Map;

/**
 * Created by qmm on 2016/12/15.
 */
public interface IReader {
    Map<String, List<IntPoint>> getIntPoint(List<String> hosts, List<String> metrics, long time);

    Map<String, List<LongPoint>> getLongPoint(List<String> hosts, List<String> metrics, long time);

    Map<String, List<FloatPoint>> getFloatPoint(List<String> hosts, List<String> metrics, long time);

    Map<String, List<DoublePoint>> getDoublePoint(List<String> hosts, List<String> metrics, long time);

    Map<String, List<BooleanPoint>> getBooleanPoint(List<String> hosts, List<String> metrics, long time);

    Map<String, List<StringPoint>> getStringPoint(List<String> hosts, List<String> metrics, long time);

    Map<String, List<GeoPoint>> getGeoPoint(List<String> hosts, List<String> metrics, long time);

    Map<String, List<IntPoint>> getIntLatest(List<String> hosts, List<String> metrics);
    Map<String, List<LongPoint>> getLongLatest(List<String> hosts, List<String> metrics);
    Map<String, List<FloatPoint>> getFloatLatest(List<String> hosts, List<String> metrics);
    Map<String, List<DoublePoint>> getDoubleLatest(List<String> hosts, List<String> metrics);
    Map<String, List<BooleanPoint>> getBooleanLatest(List<String> hosts, List<String> metrics);
    Map<String, List<StringPoint>> getStringLatest(List<String> hosts, List<String> metrics);
    Map<String, List<GeoPoint>> getGeoLatest(List<String> hosts, List<String> metrics);
}
