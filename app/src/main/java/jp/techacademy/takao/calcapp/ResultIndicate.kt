package jp.techacademy.takao.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_indicate.*
import android.util.Log

class ResultIndicate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_indicate)

        var num_value=intent.getDoubleExtra("VALUE1",0.0)
       // val value2=intent.getDoubleExtra("VALUE2",0.0)

        //Log.d("CalcAPP",num_value)
        textView.text = num_value.toString()
    }
}