package sample.app.ui.top

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import sample.app.R


class TopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
        setViews()
    }

    private fun setViews() {
        val toolbar = findViewById<View>(R.id.toolBar) as Toolbar
        setSupportActionBar(toolbar)
        val manager = supportFragmentManager
        val viewPager = findViewById<View>(R.id.viewPager) as ViewPager
        val adapter = TopPagerAdapter(manager)
        viewPager.adapter = adapter
        val tabLayout = findViewById<View>(R.id.tabLayout) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
    }
}