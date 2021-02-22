package com.company;

import java.util.ArrayList;
import java.util.List;

public class ThirdYear extends Student{

    String [] vakken = {
            "Engels",
            "Nederlands",
            "Wiskunde"
    };

    Number [] cijfers = {
            5,
            6,
            8
    };

    List<String> notitiesStudent = new ArrayList<String>();


    public void addNotitie () {
        String notitie = "test";
        notitiesStudent.add(notitie);
    };

    public void changeCijfers (Number cijfer1, Number cijfer2, Number cijfer3) {
        cijfers[0] = cijfer1;
        cijfers[1] = cijfer2;
        cijfers[2] = cijfer3;
    };

    public void changeVakken (String vak1, String vak2, String vak3) {
        vakken[0] = vak1;
        vakken[1] = vak2;
        vakken[2] = vak3;
    };
    @Override
    public void passYear() {
        System.out.println("FirstYear Passed");
    }
}
