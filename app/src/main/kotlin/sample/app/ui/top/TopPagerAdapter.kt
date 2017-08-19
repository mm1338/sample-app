package sample.app.ui.top

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TopPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return TopFragment.newInstance(position)
            1 -> return TopFragment.newInstance(position)
            2 -> return TopFragment.newInstance(position)
        }
        return null
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        when (position) {
            0 -> return "マンガ"
            1 -> return "ゲーム"
            2 -> return "サッカー"
        }
        return ""
    }

}