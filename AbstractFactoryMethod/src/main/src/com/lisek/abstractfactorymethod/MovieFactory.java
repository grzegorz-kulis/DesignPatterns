package com.lisek.abstractfactorymethod;

public interface MovieFactory {
    HollywoodMovie getHollywoodMovie();
    BollywoodMovie getBollywoodMovie();
}
