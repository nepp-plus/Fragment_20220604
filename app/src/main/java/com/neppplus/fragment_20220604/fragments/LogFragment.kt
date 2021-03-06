package com.neppplus.fragment_20220604.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.fragment_20220604.R
import kotlinx.android.synthetic.main.fragment_log.*

class LogFragment : Fragment() {

//    이 프래그먼트 클래스가, 어떤 xml을 내용물로 ? 전용 함수.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        fragment_log를 이 클래스의 내용물로 설정.
        return inflater.inflate( R.layout.fragment_log, container, false )

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnLogInFragment.setOnClickListener {

            Log.d("로그프래그먼트", "프래그먼트에서 실행되는 로그 코드")

        }

    }

}