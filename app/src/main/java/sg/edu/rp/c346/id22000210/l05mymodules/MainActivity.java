package sg.edu.rp.c346.id22000210.l05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvModuleDisplay1;
    TextView tvModuleDisplay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModuleDisplay1 = findViewById(R.id.textViewModule1);
        tvModuleDisplay2 = findViewById(R.id.textViewModule2);

        tvModuleDisplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is to link MainActivity to Fourth Activity by using Intent
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "C346");
                startActivity(intent);
            }
        });

        tvModuleDisplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this is to link MainActivity to Fourth Activity by using Intent
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C203");
                startActivity(intent);
            }
        });

    }
}