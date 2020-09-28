package com.example.pdffiles;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfShow extends AppCompatActivity {
PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_show);
        pdfView=findViewById(R.id.pdflist);
        String item = getIntent().getStringExtra("pdf");
        if (item.equals("Android Development"))
        {
            pdfView.fromAsset("Head_First_Android_Development_2015.pdf").load();
        }
        if (item.equals("C Programming"))
        {
            pdfView.fromAsset("computer_programming.pdf").load();
        }
        if (item.equals("Compiler Design"))
        {
            pdfView.fromAsset("Compiler_Design_by_Aho_Ullman.pdf").load();
        }
        if (item.equals("Java"))
        {
            pdfView.fromAsset("Head_First_Java_2nd_Edition.pdf").load();
        }
        if (item.equals("Microeconomics"))
        {
            pdfView.fromAsset("microeconomics.pdf").load();
        }
    }
}
