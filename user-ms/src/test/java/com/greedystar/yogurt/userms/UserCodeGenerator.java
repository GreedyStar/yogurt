package com.greedystar.yogurt.userms;

import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;

/**
 * Author GreedyStar
 * Date   2019-03-29
 */
public class UserCodeGenerator {

    public static void main(String[] args) {
        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("user")
                .setClassName("User")
                .build();
        invoker.execute();
    }

}
