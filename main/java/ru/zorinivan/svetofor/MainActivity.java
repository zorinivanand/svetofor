package ru.zorinivan.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.root_layout);
        mInfoTextView = findViewById(R.id.textView);
        Button yellowButton = findViewById(R.id.yellow_button);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
            }
        });

    }
        public void onRedButtonClick (View view){
            mInfoTextView.setText(R.string.red);
            mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        }
        public void onGreenButtonClick (View view){
            mInfoTextView.setText(R.string.green);
            mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }

    public void setmConstraintLayout(ConstraintLayout mConstraintLayout) {
        this.mConstraintLayout = mConstraintLayout;
    }

    public void onClick(View view) {
        mInfoTextView.setText(R.string.yellow);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
    }
}

