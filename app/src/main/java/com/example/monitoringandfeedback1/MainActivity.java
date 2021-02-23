package com.example.monitoringandfeedback1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity implements ChangeFragment {
    private static final String TRANSACTION = "transaction";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new FirstFragment())
                .commit();
    }

    @Override
    public void changeFragment(FRAGMENT fragment) {
        Fragment f;
        switch (fragment) {
            case FIRST:
                f = new FirstFragment();
                break;
            case SECOND:
                f = new SecondFragment();
                break;
            default:
                throw new RuntimeException("Unknown Fragment");
        }
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, f)
                .addToBackStack(TRANSACTION)
                .commit();
    }
}
