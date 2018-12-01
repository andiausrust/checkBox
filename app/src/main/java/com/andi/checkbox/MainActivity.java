package com.andi.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox momCheckbox;
    private CheckBox dadCheckbox;
    private CheckBox grandpaCheckbox;
    private Button showButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckbox = findViewById(R.id.momCheckBoxId);
        dadCheckbox = findViewById(R.id.dadCheckBoxId);
        grandpaCheckbox = findViewById(R.id.grandpaCheckBoxId);

        showButton = findViewById(R.id.showButton);
        textView = findViewById(R.id.resultId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckbox.getText().toString() + "status is: " +
                    momCheckbox.isChecked() + "\n");
                stringBuilder.append(dadCheckbox.getText().toString() + "status is: " +
                    dadCheckbox.isChecked() + "\n");
                stringBuilder.append(grandpaCheckbox.getText().toString() + "status is: " +
                    grandpaCheckbox.isChecked() + "\n");

                textView.setText(stringBuilder);
            }
        });
    }
}
