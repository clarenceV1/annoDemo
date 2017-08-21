package anno.meetyou.com.annopro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.Bind;
import com.example.JPHelloWorld;

import anno.meetyou.com.annoapi.ViewInjector;

@JPHelloWorld
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.textView2)
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjector.injectView(this);
        textView2.setText("sldjfsldf");
    }
}
