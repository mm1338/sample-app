package sample.app.ui.top

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import butterknife.bindView
import sample.app.R


class TopActivity : AppCompatActivity() {

    val toolbar : Toolbar by bindView<Toolbar>(R.id.toolBar)
    val viewPager : ViewPager by bindView<ViewPager>(R.id.viewPager)
    val tabLayout : TabLayout by bindView<TabLayout>(R.id.tabLayout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
        setViews()
    }

    private fun setViews() {
        setSupportActionBar(toolbar)
        val manager = supportFragmentManager
        val adapter = TopPagerAdapter(manager)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}