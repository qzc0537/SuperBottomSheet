package com.qzc.superbottomsheet.sample

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qzc.superbottomsheet.SuperBottomSheetFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sheet.setOnClickListener {
            BottomSheetFragment().show(supportFragmentManager, "BottomSheet")
        }
    }
}

class BottomSheetFragment : SuperBottomSheetFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }

    override fun getCornerRadius() =
        activity!!.resources.getDimension(R.dimen.super_bottom_sheet_radius)

    override fun getStatusBarColor() = ContextCompat.getColor(activity!!, R.color.colorPrimary)

//    override fun getDim(): Float {
//        return 0.5f
//    }
//
//    override fun getPeekHeight(): Int {
//        return 1024
//    }
//
//    override fun getMaxHeight(): Int {
//        return 1024
//    }
}
