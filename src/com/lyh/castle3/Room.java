package com.lyh.castle3;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/4/18 21:34
 * @version: v1.0
 */
public class Room {
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    public Room(String description) {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) {
        if (north != null)
            northExit = north;
        if (east != null)
            eastExit = east;
        if (south != null)
            southExit = south;
        if (west != null)
            westExit = west;
    }

    @Override
    public String toString() {
        return description;
    }
    public String getExitDesc(){
        StringBuffer stringBuffer = new StringBuffer();
        if(northExit !=null){
            stringBuffer.append("north");
        }
        if(eastExit !=null){
            stringBuffer.append("east");
        }
        if(southExit !=null){
            stringBuffer.append("south");
        }
        if(westExit !=null){
            stringBuffer.append("west");
        }
        return stringBuffer.toString();
    }
    public Room getExit(String direction){
        Room ret=null;
        if(direction.equals("north")) {
            ret = northExit;
        }
        if(direction.equals("east")) {
            ret = eastExit;
        }
        if(direction.equals("south")) {
            ret = southExit;
        }
        if(direction.equals("west")) {
            ret = westExit;
        }
        return  ret;
    }
}
