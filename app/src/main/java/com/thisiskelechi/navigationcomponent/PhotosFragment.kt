package com.thisiskelechi.navigationcomponent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_photos.*

/**
 * A simple [Fragment] subclass.
 */
class PhotosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photos, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }

        arguments?.let {
            val safeargs = PhotosFragmentArgs.fromBundle(it)
            numPhoto.text = "Number of Photos is ${safeargs.numOfPhotos}"
        }
    }
}
