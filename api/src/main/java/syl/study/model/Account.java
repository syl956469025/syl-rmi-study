package syl.study.model;

import java.io.Serializable;

/**
 * Created by Think on 2016/7/18.
 */
public class Account implements Serializable{

    public String username;

    public double money;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
