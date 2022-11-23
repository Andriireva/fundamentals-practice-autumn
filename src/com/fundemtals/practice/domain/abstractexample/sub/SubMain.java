package com.fundemtals.practice.domain.abstractexample.sub;

import com.fundemtals.practice.domain.abstractexample.AbstractClass;
import com.fundemtals.practice.domain.abstractexample.PureNumberSum;

public class SubMain {

    public static void main(String[] args) {
        AbstractClass abstractClass = new PureNumberSum();
        PureNumberSum pureNumberSum = new PureNumberSum();
//        abstractClass.calculate(4, 5); there will be issue
        pureNumberSum.calculate(4, 5);
    }
}
