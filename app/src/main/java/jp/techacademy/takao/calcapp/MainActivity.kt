package jp.techacademy.takao.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log



import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() ,View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        val intent = Intent(this, ResultIndicate::class.java)

        //val operator = 0
        var num_Edit1:Double=0.0
        var num_Edit2:Double=0.0
        var result_num:Double = 0.0

        if( editText1.text != null ){
            num_Edit1 = editText1.text.toString().toDouble()
        }else{


        }

        if( editText2.text != null ){
            num_Edit2 = editText2.text.toString().toDouble()
        }else{


        }
        Log.d("CalcAPP","入力した値は"+editText1.text + " "+ editText2.text)


        if (v != null) {
            if(v.id  == R.id.button1){
                result_num = num_Edit1 + num_Edit2
                intent.putExtra("VALUE1", result_num)
            }else if(v.id== R.id.button2){
                result_num = num_Edit1 - num_Edit2
                intent.putExtra("VALUE1", result_num)
            }else if(v.id == R.id.button3){
                result_num = num_Edit1 * num_Edit2
                intent.putExtra("VALUE1", result_num)
            }else if(v.id == R.id.button4) {
                result_num = num_Edit1 / num_Edit2
                intent.putExtra("VALUE1", result_num)
            }
        }
        startActivity(intent)



    }


}


