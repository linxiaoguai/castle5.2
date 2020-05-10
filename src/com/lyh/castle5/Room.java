package com.lyh.castle5;

import java.util.HashMap;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/4/18 21:34
 * @version: v1.0
 */
public class Room {
    private String description;
    private HashMap<String, Room>exits=new HashMap<String, Room>();

    public Room(String description) {
        this.description = description;
    }

    public void setExit(String dir, Room room){
        exits.put(dir,room);
    }

    public void setExits(String dir, Room room) {
        exits.put(dir,room);
    }

    @Override
    public String toString() {
        return description;
    }

    public String getExitDesc(){
        StringBuffer stringBuffer = new StringBuffer();
        for (String dir:exits.keySet()){
            stringBuffer.append(dir);
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }
    public Room getExit(String direction){
        return  exits.get(direction);
    }
}
