package com.example.monitoringandfeedback1;

public interface ChangeFragment {
    enum FRAGMENT {
        FIRST,
        SECOND
    }
    void changeFragment(FRAGMENT fragment);

}
