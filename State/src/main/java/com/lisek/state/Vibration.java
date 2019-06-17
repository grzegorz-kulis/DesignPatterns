package com.lisek.state;

public class Vibration implements State {

    @Override
    public void alert(Context context) {
        System.out.println("Phone is going into Silent mode");
        context.setState(new Silent());
    }
}
