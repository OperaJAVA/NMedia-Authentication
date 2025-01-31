package ru.netology.weatherapp.fragment.city

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.netology.weatherapp.ui.theme.ComposeAppTheme
import ru.netology.weatherapp.viewmodel.cities.CitiesViewModelImpl

@AndroidEntryPoint
class CitiesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = ComposeView(requireContext()).apply {
        setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)

        setContent {
            ComposeAppTheme {
                val viewModel by viewModels<CitiesViewModelImpl>()

                CitiesScreen(viewModel)
            }
        }
    }
}
