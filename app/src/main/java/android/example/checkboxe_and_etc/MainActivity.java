package android.example.checkboxe_and_etc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    CheckBox chocolate_syrup, sprinkles, crushed_nuts, cherries, orio_cookies_crumbles;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chocolate_syrup = (CheckBox) findViewById(R.id.chkccs);
        sprinkles = (CheckBox) findViewById(R.id.chksprin);
        crushed_nuts = (CheckBox) findViewById(R.id.chkcn);
        cherries = (CheckBox) findViewById(R.id.chkcherr);
        orio_cookies_crumbles = (CheckBox) findViewById(R.id.chkooc);
        Button btn = (Button) findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Toppings:";
                if (chocolate_syrup.isChecked()) {
                    result += "\nChocolate syrup";
                }
                if (sprinkles.isChecked()) {
                    result += "\nSprinkles";
                }
                if (crushed_nuts.isChecked()) {
                    result += "\nCrushed nuts";
                }
                if (cherries.isChecked()) {
                    result += "\nCherries";
                }
                if (orio_cookies_crumbles.isChecked()) {
                    result += "\nOrio cookies crumbles ";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }

        });


    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";
        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.chkccs:
                str = checked ? "Chocolate Syrup Selected" : "Chocolate Syrup Deselected";
                break;
            case R.id.chksprin:
                str = checked ? "Sprinkles Selected" : "Sprinkles Deselected";
                break;
            case R.id.chkcn:
                str = checked ? "Crushed nuts Selected" : "Crushed nuts Deselected";
                break;
            case R.id.chkcherr:
                str = checked ? "Cherries Selected" : "Cherries Deselected";
                break;
            case R.id.chkooc:
                str = checked ? "Ories cookies crumbles Selected" : "Orio cookies crumbles Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();

    }
}