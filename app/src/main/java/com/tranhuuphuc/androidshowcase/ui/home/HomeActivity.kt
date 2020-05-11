package com.tranhuuphuc.androidshowcase.ui.home

import android.os.Bundle
import com.tranhuuphuc.androidshowcase.R
import com.tranhuuphuc.androidshowcase.base.BaseActivity
import com.tranhuuphuc.androidshowcase.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    override fun initViewBinding(): ActivityHomeBinding =
        ActivityHomeBinding.inflate(layoutInflater)

    override fun onCreateActivity(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment.newInstance())
                .commitNow()
        }
    }

}
