package br.edu.aulaseis.aulaseis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by welder on 01/09/16.
 */
public class SecondActivity extends Activity{

    private Button voltar;

    public void onCreate(final Bundle stateActivity){
        super.onCreate(stateActivity);
        setContentView(R.layout.activity_second);
        voltar = (Button) findViewById(R.id.buttonVoltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}
