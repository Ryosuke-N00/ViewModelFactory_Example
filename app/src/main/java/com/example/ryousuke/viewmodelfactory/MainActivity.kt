package com.example.ryousuke.viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.ryousuke.viewmodelfactory.viewmodel.MainViewModel
import com.example.ryousuke.viewmodelfactory.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ViewModelFactoryをインスタンス化して、ここに引数を与える
        val viewModelFactory = MainViewModelFactory(34)

        //ここでInt型を与えることができないのでFactoryに渡して、インスタンス化時にコンストラクタで引数を渡す
        /*var viewmodel = */
        //ここで、第二引数でviewModelFactoryを与える→Logを見て動作を確認
        ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
    }
}