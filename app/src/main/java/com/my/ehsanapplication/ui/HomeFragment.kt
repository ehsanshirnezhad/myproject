package com.my.ehsanapplication.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.my.ehsanapplication.R
import com.my.ehsanapplication.databinding.FragmentHomeBinding
import com.my.ehsanapplication.viewModel.ViewModelHome
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val homeViewModel: ViewModelHome by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.homeData.observe(viewLifecycleOwner) { data ->
            Glide.with(this@HomeFragment)
                .load(data.meals[0].strMealThumb)
                .into(binding.imageRandom)
        }

        homeViewModel.homeDataListError.observe(viewLifecycleOwner) { error ->
            Toast.makeText(requireContext(), "Error occurred ${error.message}", Toast.LENGTH_LONG).show()
        }

        binding.imageRandom.setOnClickListener {
//            val nextFrag = MielFragment()
//            requireActivity().supportFragmentManager.beginTransaction()
//                .replace(R.id.container, nextFrag, "findThisFragment")
//                .addToBackStack(null)
//                .commit()
//            findNavController().navigate(R.id.action_homeFragment_to_miel_fragment)


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}