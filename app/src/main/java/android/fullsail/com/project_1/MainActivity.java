package android.fullsail.com.project_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // TAG
    String TAG = "Employee Project";

    // Employees
    Employee president = new Employee("Jack", "Bonner");
    Employee vicePresident = new Employee("Kenn", "Williams");
    Employee socialManager = new Employee("Britney", "Elbert");
    Employee graphicDesigner = new Employee("Rick","Wallace");
    Employee webDeveloper = new Employee("Elena","Martinez");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add to Array List for Employees
        ArrayList<Employee> employeeArray = new ArrayList<>();
        employeeArray.add(president);
        employeeArray.add(vicePresident);
        employeeArray.add(socialManager);
        employeeArray.add(graphicDesigner);
        employeeArray.add(webDeveloper);

        // Verified Employees are in Array List
        for(Employee employees : employeeArray){
            Log.i(TAG, employees.getFirstName() + " " + employees.getLastName());
        }


        // Setup for Number Of Employees
        TextView numberOfEmployees = (TextView) findViewById(R.id.numberEmployee);
        String number = Integer.toString(employeeArray.size());
        numberOfEmployees.setText(number);

        // Setup for Average Length
        TextView averageLength = (TextView) findViewById(R.id.averageNumber);
        averageLength.setText("0");

        // Add & Find BUTTON SETUP
        View theAddButton = findViewById(R.id.addButton);
        theAddButton.setOnClickListener(?);
        View theFindButton = findViewById(R.id.findButton);
        theFindButton.setOnClickListener(?);






    } // End of onCreate





}
