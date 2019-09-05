package gastelucondori.luisangel.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView prom_practice;
    TextView prom_calificate;
    TextView result_view;
    EditText NT1_app;
    EditText NT2_app;
    EditText NP1_app;
    EditText NP2_app;
    EditText NP3_app;
    EditText NP4_app;
    Button Calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NT1_app=(EditText) findViewById(R.id.NT1_app);
        NT2_app=(EditText) findViewById(R.id.NT2_app);
        NP1_app=(EditText) findViewById(R.id.NP1_app);
        NP2_app=(EditText) findViewById(R.id.NP2_app);
        NP3_app=(EditText) findViewById(R.id.NP3_app);
        NP4_app=(EditText) findViewById(R.id.NP4_app);
        prom_calificate=(TextView) findViewById(R.id.prom_calificate);
        prom_practice=(TextView) findViewById(R.id.prom_practice);
        result_view=(TextView) findViewById(R.id.result_view);

    }

    public void calculator(View view){
        String calc1=NT1_app.getText().toString();
        String calc2=NT2_app.getText().toString();
        int calification1=Integer.parseInt(calc1);
        int calification2=Integer.parseInt(calc2);

        double promedios=calification1+calification2;
        prom_practice.setText("Prom: "+promedios);

        String calt1=NP1_app.getText().toString();
        String calt2=NP2_app.getText().toString();
        String calt3=NP3_app.getText().toString();
        String calt4=NP4_app.getText().toString();

        int calificationt1=Integer.parseInt(calt1);
        int calificationt2=Integer.parseInt(calt2);
        int calificationt3=Integer.parseInt(calt3);
        int calificationt4=Integer.parseInt(calt4);

        double promedio=(calificationt1+calificationt2+calificationt3+calificationt4)/4;
        prom_calificate.setText("Prom: "+ promedio);
        double promediof=(0.3*promedios)+(0.7*promedio);
        result_view.setText(""+promediof);


    }

}
