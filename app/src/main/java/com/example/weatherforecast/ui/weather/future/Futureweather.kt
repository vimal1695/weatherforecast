package com.example.weatherforecast.ui.weather.future

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.weatherforecast.R

class Futureweather : Fragment() {

    companion object {
        fun newInstance() = Futureweather()
    }

    private lateinit var viewModel: FutureweatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.futureweather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FutureweatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
