package com.example.chirath.day1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button decrementButton;
    private Button incrementButton;
    private TextView counterText;
    private int counter = 0;
    private ProgressBar P;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListeners();
    }

    private void initListeners() {
        decrementButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counterText.setText(Integer.toString(--counter));
                        P.setProgress(counter);
                    }
                }
        );
        incrementButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counterText.setText(Integer.toString(++counter));
                        P.setProgress(counter);
                    }
                }
        );
    }

    private void initView() {
        decrementButton = (Button) findViewById(R.id.decrementButton);
        incrementButton = (Button) findViewById(R.id.incrementButton);
        counterText = (TextView) findViewById(R.id.textView);
        P = (ProgressBar) findViewById(R.id.progressBar);

    }
}
