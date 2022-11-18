package com.example.programaticamente2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    TableLayout tableLayout;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout=findViewById(R.id.tableLayout);

        n=4;
        tableLayout.setGravity(Gravity.CENTER);
         anadehijos();
    }

    private void anadehijos() {
        Button b;
        TableRow tr;

        for (int i = 0; i < n; i++) {

            //Creamos una fila nueva
            tr=new TableRow(this);
            tr.setLayoutParams(new TableLayout.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.MATCH_PARENT));
            tr.setId(View.generateViewId());

            //Añadimos los botones/celdas

            for (int j = 0; j < n; j++) {
                //creamos nuevo boton
                b= new Button(this);
                b.setLayoutParams(new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT));

                b.setText("btn"+i+"-"+j);
                b.setId(View.generateViewId());
                tr.addView(b);
            }
            tableLayout.addView(tr);
        }

    }
}