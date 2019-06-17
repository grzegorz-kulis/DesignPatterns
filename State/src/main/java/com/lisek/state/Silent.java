package com.lisek.state;

public class Silent implements State {

    @Override
    public void alert(Context context) {
        System.out.println("Phone is going into Vibration mode");
        context.setState(new Vibration());
    }
}
