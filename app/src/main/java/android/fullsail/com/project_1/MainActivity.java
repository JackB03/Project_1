package android.fullsail.com.project_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String TAG = "Employee Project";

        // Employees
        Employee president = new Employee("Jack", "Bonner");
        Employee vicePresident = new Employee("Kenn", "Williams");
        Employee socialManager = new Employee("Britney", "Elbert");
        Employee graphicDesigner = new Employee("Rick","Wallace");
        Employee webDeveloper = new Employee("Elena","Martinez");

        //Add to Array List for Employees
        ArrayList<Employee> employeeArray = new ArrayList<>();
        employeeArray.add(president);
        employeeArray.add(vicePresident);
        employeeArray.add(socialManager);
        employeeArray.add(graphicDesigner);
        employeeArray.add(webDeveloper);

        for(Employee employees : employeeArray){
            Log.i(TAG, employees.getFirstName() + " " + employees.getLastName());
        }






    } // End of onCreate





}
