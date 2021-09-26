package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
class MainActivity : AppCompatActivity() {
    var bt1 :Button =  findViewById(R.id.bt1);
    var bt2 :Button =  findViewById(R.id.bt2);
    var bt3 :Button =  findViewById(R.id.bt3);
    var bt4 :Button =  findViewById(R.id.bt4);
    var bt5 :Button =  findViewById(R.id.bt5);
    var bt6 :Button =  findViewById(R.id.bt6);
    var bt7 :Button =  findViewById(R.id.bt7);
    var bt8 :Button =  findViewById(R.id.bt8);
    var bt9 :Button =  findViewById(R.id.bt9);
    lateinit var board:Array<Array<Button>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      board[0] = arrayOf(btn1,);
        board[1] = arrayOf(bt4,bt5,bt6);
        board[2] = arrayOf(bt7,bt8,bt9);
        bt1.setOnClickListener(){
            board[0][0].text = "X"
        }
        print(bt1)

    }
}