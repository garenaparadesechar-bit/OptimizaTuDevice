package com.optimizatudevice.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setPadding(48, 70, 48, 48);
        root.setBackgroundColor(Color.rgb(16, 16, 16));

        TextView title = new TextView(this);
        title.setText("OptimizaTuDevice");
        title.setTextColor(Color.WHITE);
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);

        root.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText(
            "Herramientas de optimización\\n" +
            "para tu dispositivo Android"
        );
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(17);
        subtitle.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams subtitleParams =
            new LinearLayout.LayoutParams(-1, -2);

        subtitleParams.topMargin = 24;
        root.addView(subtitle, subtitleParams);

        Button button = new Button(this);
        button.setText("COMPROBAR DISPOSITIVO");

        LinearLayout.LayoutParams buttonParams =
            new LinearLayout.LayoutParams(-1, -2);

        buttonParams.topMargin = 40;
        root.addView(button, buttonParams);

        status = new TextView(this);
        status.setText("Estado: listo");
        status.setTextColor(Color.WHITE);
        status.setTextSize(16);
        status.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams statusParams =
            new LinearLayout.LayoutParams(-1, -2);

        statusParams.topMargin = 24;
        root.addView(status, statusParams);

        button.setOnClickListener(v -> {
            status.setText("Estado: dispositivo comprobado");

            Toast.makeText(
                this,
                "Comprobación completada",
                Toast.LENGTH_SHORT
            ).show();
        });

        setContentView(root);
    }
}
