package com.star.demo2017120501;

/**
 * Created by Star on 2017/12/5.
 */

public class Elevation {
    public MyResult[] results;
    public String status;
}
class MyLocation
{
    public double lat;
    public double lng;
}
class MyResult
{
    public double elevation;
    public MyLocation location;
    public double resolution;
}
