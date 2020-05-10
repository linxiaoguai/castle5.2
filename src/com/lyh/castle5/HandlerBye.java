package com.lyh.castle5;

/**
 * @description:
 * @author: xiaolin
 * @date: Created in 2020/4/18 23:56
 * @version: v1.0
 */
public class HandlerBye extends Handler{
    public HandlerBye(Game game){
        super(game);
    }
    @Override
    public boolean isBye() {
        return true;
    }
}
