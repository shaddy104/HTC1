package com.example.shadrach.htc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Special_events extends Activity {

    private ImageView pdf_iv;
    private int currentPage = 0;
    private Button next, previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_special_events);

        //TextView txtContent=(TextView)findViewById(R.id.tv1);
        //TextView txtFileName=(TextView)findViewById(R.id.tv2);
        next = (Button)findViewById(R.id.next);
        previous = (Button)findViewById(R.id.previous);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPage++;
                render();
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPage--;
                render();
            }
        });
        render();
        /*AssetManager assetManager=getAssets();

        try {
            String[] files = assetManager.list("Files");
            for (int i = 0; i < files.length; i++) {
                txtContent.append("\n Files=>"+i+"Name"+files);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        InputStream input;
        try {
            input=assetManager.open("text.txt");
            int size=input.available();
            byte[] buffer=new byte[size];
            input.read(buffer);
            input.close();
            String text=new String(buffer);
            txtFileName.setText(text);
        }catch (Exception e) {
            e.printStackTrace();
        }*/

        copyAssets();
    }

    private void copyAssets() {
        AssetManager assetManager = getAssets();
        String[] files = null;
        try {
            files = assetManager.list("Files");
        }catch (Exception e){
            e.printStackTrace();
        }

        for (String fileName : files){
            System.out.println("Files => "+fileName);
            InputStream in = null;
            OutputStream out = null;

            try {
                in = assetManager.open("Files/"+fileName);
                out = new FileOutputStream(Environment.getExternalStorageDirectory().toString()+"/"+fileName);
                copyFiles(in,out);
                in.close();
                in = null;
                out.flush();
                out.close();
                out = null;
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    private void copyFiles(InputStream in,OutputStream out) throws IOException{
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer))!=-1) {
            out.write(buffer, 0, read);
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void render() {
        AssetManager assetManager=getAssets();
        InputStream input;
        try {
            pdf_iv = (ImageView)findViewById(R.id.pdf_iv);
            int REQ_WIDTH = pdf_iv.getWidth();
            int REQ_HEIGHT = pdf_iv.getHeight();
            input=assetManager.open("akk_aradhana.pdf");
            Bitmap bitmap = Bitmap.createBitmap(REQ_WIDTH, REQ_HEIGHT, Bitmap.Config.ARGB_4444);
            File file = new File(String.valueOf(input));
            PdfRenderer renderer = new PdfRenderer(ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY));
            if (currentPage < 0) {
                currentPage = 0;
            }else if (currentPage > renderer.getPageCount()) {
                currentPage = renderer.getPageCount() - 1;
            }
            Matrix m = pdf_iv.getImageMatrix();
            Rect rect = new Rect(0,0,REQ_WIDTH,REQ_HEIGHT);
            renderer.openPage(currentPage).render(bitmap, rect, m, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY);
            pdf_iv.setImageMatrix(m);
            pdf_iv.setImageBitmap(bitmap);
            pdf_iv.invalidate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_special_events, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
