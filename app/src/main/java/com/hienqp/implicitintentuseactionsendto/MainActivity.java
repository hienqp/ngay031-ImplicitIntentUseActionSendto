package com.hienqp.implicitintentuseactionsendto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewSendMessageTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewSendMessageTo = (ImageView) findViewById(R.id.imageView_send_message_to);
        imageViewSendMessageTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.setAction(Intent.ACTION_SENDTO);
                // có thể set nội dung sẵn mẫu sms hoặc không
//                intent.putExtra("sms_body", "Chào bạn....");
                intent.setData(Uri.parse("sms:9999999999"));

                startActivity(intent);
            }
        });

    }
}