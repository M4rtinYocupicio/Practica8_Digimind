package com.example.mydigimind_yocupiciomartin.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mydigimind_yocupiciomartin.R
import com.example.mydigimind_yocupiciomartin.databinding.FragmentDashboardBinding
import com.example.mydigimind_yocupiciomartin.ui.home.HomeViewModel

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInsanceState: Bundle?
    ): View? {
        dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        dashboardViewModel.text.observe(viewLifecycleOwner, {

        })
        return root
    }
}