package com.example.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;
import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button bb1, bb2, bb3, bb4, bb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bb1 = findViewById(R.id.Success);
        bb2 = findViewById(R.id.Error);
        bb3 = findViewById(R.id.Warning);
        bb4 = findViewById(R.id.Normal);
        bb5 = findViewById(R.id.Information);


        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(MainActivity.this, "Success!", Toast.LENGTH_SHORT, true).show();
                showSuccessDialog();
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
                showErrorDialog();
            }
        });
        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.warning(MainActivity.this, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
                showWarningDialog();
            }
        });
        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.normal(MainActivity.this, "Normal toast w/o icon").show();
            }
        });
        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.info(MainActivity.this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
                showNormalDialog();
            }
        });

    }
    private void showErrorDialog() {
        SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Ops");
        pDialog.setContentText("Something Went Wrong");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("ok");
        pDialog.setCancelText("Cancel");

        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                pDialog.dismiss();
            }
        });

        pDialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                pDialog.dismiss();
            }
        });

        pDialog.show();
    }

    private void showSuccessDialog() {
        SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Done");
        pDialog.setContentText("Nothing Happen Wrong");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("ok");
        pDialog.setCancelText("Cancel");

        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                pDialog.dismiss();
            }
        });

        pDialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                pDialog.dismiss();
            }
        });

        pDialog.show();
    }

    private void showWarningDialog() {
        SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Hey Hey");
        pDialog.setContentText("Warning!!!!!!!!!!");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("ok");
        pDialog.setCancelText("Cancel");

        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                pDialog.dismiss();
            }
        });

        pDialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                pDialog.dismiss();
            }
        });

        pDialog.show();
    }

    private void showNormalDialog() {
        SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.NORMAL_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText("Congratulation");
        pDialog.setContentText("You Have pass the Assignment HAHAHAHa");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("ok");
        pDialog.setCancelText("Cancel");

        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                pDialog.dismiss();
            }
        });

        pDialog.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                pDialog.dismiss();
            }
        });

        pDialog.show();
    }


}