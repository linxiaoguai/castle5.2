package com.lyh.castle5;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/4/19 0:42
 * @version: v1.0
 */
public class HandlerGo extends Handler{
    public HandlerGo(Game game){
        super(game);
    }
    @Override
    public void doCmd(String word) {
        this.game.goRoom(word);
    }
}
