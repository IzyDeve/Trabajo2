package com.example.trabajo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnX,btnO;
    TextView menu;
    private List<Button> buttons;
    Boolean playerX = true;
    private static final int[] BUTTON_IDS = {
            R.id.btn_1,
            R.id.btn_2,
            R.id.btn_3,
            R.id.btn_4,
            R.id.btn_5,
            R.id.btn_6,
            R.id.btn_7,
            R.id.btn_8,
            R.id.btn_9,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new ArrayList<>();


        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            buttons.add(button);
        }

       buttons.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(0);
            }
        });
       buttons.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(1);
            }
        });
       buttons.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(2);
            }
        });
       buttons.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(3);
            }
        });
       buttons.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(4);
            }
        });
       buttons.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(5);
            }
        });
       buttons.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(6);
            }
        });
       buttons.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(7);
            }
        });
       buttons.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                empty(8);
            }
        });

       main();
    }

    public void main(){
        btnX = (Button) findViewById(R.id.btnX);
        btnO = (Button) findViewById(R.id.btnO);
        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            button.setVisibility(View.INVISIBLE);

        }

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerX = true;
                btnX.setVisibility(View.INVISIBLE);
                btnO.setVisibility(View.INVISIBLE);
                Toast txt = Toast.makeText(getApplicationContext(),"X",Toast.LENGTH_SHORT);
                txt.show();
                game();
                player(playerX);

            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerX = false;
                btnX.setVisibility(View.INVISIBLE);
                btnO.setVisibility(View.INVISIBLE);
                Toast txt = Toast.makeText(getApplicationContext(),"O",Toast.LENGTH_SHORT);
                txt.show();
                game();
                player(playerX);
            }
        });

    }

    public void game(){
        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            button.setVisibility(View.VISIBLE);
        }
    }

    public void empty(int i){   
        if(buttons.get(i).getText().toString().equals("")){
            System.out.println(playerX);
            if(playerX==true){
                buttons.get(i).setText("X");
                playerX=false;
                player(playerX);

            }else{
                buttons.get(i).setText("0");
                playerX=true;
                player(playerX);

            }
        }else{
            Toast txt = Toast.makeText(getApplicationContext(),"No-Empty",Toast.LENGTH_SHORT);
            txt.show();
        }
        System.out.println(playerX);

    }

    public void player(Boolean player){
        TextView menu = (TextView) findViewById(R.id.textView);

        if(player==true){
            menu.setText("Player 1 play");
        }else{
            menu.setText("Player 2 play");
        }
    }
}