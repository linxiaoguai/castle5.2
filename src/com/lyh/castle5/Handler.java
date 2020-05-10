package com.lyh.castle5;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/4/18 23:48
 * @version: v1.0
 */
public class Handler {
    protected Game game;//protected

    public Handler(Game game){
        this.game=game;
    }

    public void doCmd(String word){
    }

    public boolean isBye(){
        return false;
    }
}
