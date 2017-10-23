package com.elyeproj.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity(), MainView {

    private val presenter by lazy {
        MainPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.fetchData()
    }

    override fun showData(data: String) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }

}
