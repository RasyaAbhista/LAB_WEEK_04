package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CafeDetailFragment : Fragment() {

    companion object {
        private const val ARG_DESCRIPTION = "description"

        fun newInstance(description: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putString(ARG_DESCRIPTION, description)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val description = arguments?.getString(ARG_DESCRIPTION) ?: ""
        val textView = view.findViewById<TextView>(R.id.content_description)
        textView.text = description
    }
}
