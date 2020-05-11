package com.tranhuuphuc.androidshowcase.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {
    lateinit var viewBinding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = initViewBinding()
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        onCreateActivity(savedInstanceState)
    }

    abstract fun initViewBinding(): T

    abstract fun onCreateActivity(savedInstanceState: Bundle?)

}