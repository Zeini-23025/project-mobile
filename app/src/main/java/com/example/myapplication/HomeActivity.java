package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView employeeCount, departmentCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toast.makeText(this, "Bienvenue dans HomeActivity", Toast.LENGTH_SHORT).show();

        employeeCount = findViewById(R.id.employee_count);
        departmentCount = findViewById(R.id.department_count);

        employeeCount.setText("Nombre d'employés : 223");
        departmentCount.setText("Nombre de départements : 6");
    }
}
