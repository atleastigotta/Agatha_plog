//package com.example.agatha_plog
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//
////calender연동
//
//class RecruitFragment : Fragment() {
//
//    private lateinit var viewModel: RecruitViewModel
//
//    companion object {
//        fun newInstance() = RecruitFragment()
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        //해당 클래스와 연결될 xml레이아웃을 넣어준다
//        return inflater.inflate(R.layout.recruit_fragment, container, false)
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//        val recyclerView = RecruitFragment_RecyclerView_view
//
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        viewModel.getAll().observe(this.viewLifecycleOwner, Observer { diary ->
//            recyclerView.adapter=MainDiaryAdaper(diary)
//        })
//    }
//
//}