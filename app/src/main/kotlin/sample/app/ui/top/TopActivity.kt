package sample.app.ui.top

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import sample.app.R

class TopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)

        val fragment = TopFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.containerLayout, fragment)
        transaction.commit()
    }
}