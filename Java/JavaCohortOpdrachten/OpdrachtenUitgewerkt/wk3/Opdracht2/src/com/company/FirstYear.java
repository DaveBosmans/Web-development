package com.company;

import java.util.ArrayList;
import java.util.List;

public class FirstYear extends Student{


   private String [] vakken = {
            "Engels",
            "Nederlands",
            "Wiskunde"
    };

    private Number [] cijfers = {
            5,
            6,
            8
    };

    private List<String> notitiesStudent = new ArrayList<String>();

    public String[] getVakken() {
        return vakken;
    }

    public void setVakken(String[] vakken) {
        this.vakken = vakken;
    }

    public Number[] getCijfers() {
        return cijfers;
    }

    public void setCijfers(Number[] cijfers) {
        this.cijfers = cijfers;
    }

    public List<String> getNotitiesStudent() {
        return notitiesStudent;
    }

    public void setNotitiesStudent(List<String> notitiesStudent) {
        this.notitiesStudent = notitiesStudent;
    }

    public void addNotitie (String notitie) {
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
