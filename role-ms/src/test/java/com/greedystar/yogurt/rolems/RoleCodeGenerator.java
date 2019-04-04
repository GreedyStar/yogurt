package com.greedystar.yogurt.rolems;

import com.greedystar.generator.invoker.SingleInvoker;
import com.greedystar.generator.invoker.base.Invoker;

/**
 * Author GreedyStar
 * Date   2019-03-29
 */
public class RoleCodeGenerator {

    public static void main(String[] args) {
        Invoker invoker = new SingleInvoker.Builder()
                .setTableName("role")
                .setClassName("Role")
                .build();
        invoker.execute();
    }

}
