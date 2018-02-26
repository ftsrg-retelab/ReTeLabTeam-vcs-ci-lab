package hu.bme.mit.train.controller;


import com.google.common.collect.Table;

import java.util.Date;

/**
 * Created by meres on 2/26/18.
 */
public class tacho{
Table t;

private Date datetime;
private int joyPos;
private int refSpeed;

public tacho()  {
    t.put(datetime, joyPos, refSpeed);
}


}
