package com.mbl.tablayoutexercise_v1.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mbl.tablayoutexercise_v1.fragments.EconomicFragment
import com.mbl.tablayoutexercise_v1.fragments.MagazineFragment
import com.mbl.tablayoutexercise_v1.fragments.PoliticFragment
import com.mbl.tablayoutexercise_v1.fragments.SportFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager,lifecycle) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PoliticFragment()
            1 -> EconomicFragment()
            2 -> SportFragment()
            3 -> MagazineFragment()

            else -> throw IllegalArgumentException("Geçersiz konum: $position")
        }
    }

}