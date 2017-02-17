package lygo.timeoptimizer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity implements View.OnClickListener{

    Button aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Button aboutus = (Button) findViewById(R.id.aboutus);
        aboutus.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.aboutus:
                Intent intent = new Intent(this, MainActivity.class);  // ссылку на какой класс будет переходить по кнопке
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
