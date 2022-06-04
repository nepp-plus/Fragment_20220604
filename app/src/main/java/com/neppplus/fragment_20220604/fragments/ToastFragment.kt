package com.neppplus.fragment_20220604.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragment_20220604.R
import kotlinx.android.synthetic.main.fragment_log.*
import kotlinx.android.synthetic.main.fragment_toast.*

class ToastFragment : Fragment() {

//    이 프래그먼트 클래스가, 어떤 xml을 내용물로 ? 전용 함수.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        fragment_toast를 이 클래스의 내용물로 설정.
        return inflater.inflate( R.layout.fragment_toast, container, false )

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnToastInFragment.setOnClickListener {

//            이 클래스에서의 this : 화면이 아니라 부품이다.
//            토스트의 첫 재료 : 화면을 넣어야 함. => requireContext() 로 화면 불러내기.

            Toast.makeText(requireContext(), "프래그먼트에서 토스트 띄우기", Toast.LENGTH_SHORT).show()

        }

    }

}