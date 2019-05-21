package com.lisek.abstractfactorymethod;

public class ActionMovieFactory implements MovieFactory {

    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    public BollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
