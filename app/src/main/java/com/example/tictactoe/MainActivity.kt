package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var board:Array<Array<Char>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        board = arrayOf(
            arrayOf(' ',' ',' '),
            arrayOf(' ',' ',' '),
            arrayOf(' ',' ',' '),
        )
        val bt1 :Button =  findViewById(R.id.bt1);
        val bt2 :Button =  findViewById(R.id.bt2);
        val bt3 :Button =  findViewById(R.id.bt3);
        val bt4 :Button =  findViewById(R.id.bt4);
        val bt5 :Button =  findViewById(R.id.bt5);
        val bt6 :Button =  findViewById(R.id.bt6);
        val bt7 :Button =  findViewById(R.id.bt7);
        val bt8 :Button =  findViewById(R.id.bt8);
        val bt9 :Button =  findViewById(R.id.bt9)
        val bt10 :Button =  findViewById(R.id.bt10);
        val txt1 :TextView =  findViewById(R.id.txt1);
        bt1.setOnClickListener {
            bt1.setText("${constants.variable}")
            board[0][0] = constants.variable;
            bt1.isEnabled = false
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else {
                    constants.variable = 'O'
                    txt1.setText("Player ${constants.variable} turn")
                }
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }

        }
        bt2.setOnClickListener {
            bt2.setText("${constants.variable}")
            bt2.isEnabled = false
            board[0][1] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;

            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }
        }
        bt3.setOnClickListener {
            bt3.setText("${constants.variable}")
            bt3.isEnabled = false
            board[0][2] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {


                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }
        }
        bt4.setOnClickListener {
            bt4.setText("${constants.variable}")
            bt4.isEnabled = false
            board[1][0] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }
        }
        bt5.setOnClickListener {
            bt5.setText("${constants.variable}")
            bt5.isEnabled = false
            board[1][1] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }
        }
        bt6.setOnClickListener {
            bt6.setText("${constants.variable}")
            bt6.isEnabled = false
            board[1][2] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }
        }
        bt7.setOnClickListener {
            bt7.setText("${constants.variable}")
            bt7.isEnabled = false
            board[2][0] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }

        }
        bt8.setOnClickListener {
            bt8.setText("${constants.variable}")
            bt8.isEnabled = false
            board[2][1] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;
                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }
        }
        bt9.setOnClickListener {
            bt9.setText("${constants.variable}")
            bt9.isEnabled = false
            board[2][2] = constants.variable;
            var cc = results();
            if(cc != "NULL"){
                txt1.text = cc;

                bt1.isEnabled = false;
                bt2.isEnabled = false;
                bt3.isEnabled = false;
                bt4.isEnabled = false;
                bt5.isEnabled = false;
                bt6.isEnabled = false;
                bt7.isEnabled = false;
                bt8.isEnabled = false;
                bt9.isEnabled = false;
            }
            else {
                constants.chance++
                if (constants.chance % 2 == 0)
                    constants.variable = 'X'
                else
                    constants.variable = 'O'
                txt1.setText("Player ${constants.variable} turn")
                if(constants.chance == 9){
                    txt1.setText("Its a Draw")
                }
            }

        }
        bt10.setOnClickListener {
            constants.chance  = 0 ;
            constants.variable = 'X'
            finish();
            startActivity(intent)

        }

    }
    private fun results():String {
        if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
            (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
            (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||
            (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') ||
            (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
            (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
            (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
            (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
        ) {
            return "X is the Winner"
        }
        else if((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
            (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
            (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||
            (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') ||
            (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') ||
            (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
            (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
            (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')){
            return "O is the Winner"
        }
        else{
            return "NULL"
        }
    }
}