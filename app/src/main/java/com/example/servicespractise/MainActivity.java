package com.example.servicespractise;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnFirst, btnSecond;
    NotificationManagerCompat notificationManagerCompat;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnFirst=findViewById(R.id.btnFirst);
        btnSecond=findViewById(R.id.btnSecond);
        
        notificationManagerCompat=NotificationManagerCompat.from(this);
        
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();
            }
        });
        
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification2();
            }
        });
    }



    private void DisplayNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, "channel1")
                .setSmallIcon(R.drawable.ic_group_work_black_24dp)
                .setContentTitle("First Message")
                .setContentText("This is First Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(1, builder.build());

    }

    private void DisplayNotification2() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "channel2")
                .setSmallIcon(R.drawable.ic_healing_black_24dp)
                .setContentTitle("Second Message")
                .setContentText("This is Second Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(2, builder.build());

    }
    
}
