package com.example.manik.alertdialogalltypes;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.but1);
    }

    public void showAlert(View v)
    {

        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("My initial Alert Dialog");
        ad.setMessage("My first Mesage");
        //   ad.setIcon(R.mipmap.ic_launcher);

        ad.setCancelable(false);

        ad.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Ok Clicked",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder ad1 = new AlertDialog.Builder(MainActivity.this);


                ad1.setTitle("My first Alert Dialog on positive button");
                //ad1.setMessage("My Mesage");
                //list
                CharSequence [] ch = {"One", "Two", "Three"};
                ad1.setItems(ch, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }});
                ad1.setCancelable(false);

                ad1.show();
            }
        });


        ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Cancel Clicked",Toast.LENGTH_SHORT).show();

                AlertDialog.Builder ad2 = new AlertDialog.Builder(MainActivity.this);


                ad2.setTitle("My second alert Dialog on negative button");
                //radio button
                ad2.setSingleChoiceItems(R.array.laguages,2, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {


                    }
                });
                ad2.show();

                //dialogInterface.dismiss();
            }
        });


        ad.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(MainActivity.this,"Neutral Clicked",Toast.LENGTH_SHORT).show();

                AlertDialog.Builder ad2 = new AlertDialog.Builder(MainActivity.this);


                ad2.setTitle("My Third Dialog on neutral button");
                //check box
                ad2.setMultiChoiceItems(R.array.laguages,null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {


                    }
                });
                ad2.show();


            }
        });

        ad.show();


        AlertDialog.Builder adb = new AlertDialog.Builder(this);

        View v1 = getLayoutInflater().inflate(R.layout.nested_ad_textview,null);

        adb.setView(v1);


        adb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }

        });
        adb.setCancelable(false);
        adb.show();

    }
}



