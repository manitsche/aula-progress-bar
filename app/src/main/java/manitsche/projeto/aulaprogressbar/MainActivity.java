package manitsche.projeto.aulaprogressbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal;
    private ProgressBar progressBarCircular;
    private int progresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        progressBarCircular = findViewById(R.id.progressBarCircular);

        // ProgressBar Circular
        progressBarCircular.setVisibility(View.GONE);

    }

    public void carregarProgressBar(View v) {
        this.progresso = this.progresso + 1;
        progressBarHorizontal.setProgress(this.progresso);

        // ProgressBar Circular
        progressBarCircular.setVisibility(View.VISIBLE);

        if (this.progresso >= 10) {
            progressBarCircular.setVisibility(View.GONE);
        }
    }
}