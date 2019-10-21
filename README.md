# SuperBottomSheet
An easy bottom sheet dialog.

[![](https://jitpack.io/v/qzc0537/SuperBottomSheet.svg)](https://jitpack.io/#qzc0537/SuperBottomSheet)

使用
--
1.project build.gradle下添加：
maven { url 'https://jitpack.io' }

如下：

```
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

2.app build.gradle下添加依赖 ：

```
implementation 'com.github.qzc0537:SuperBottomSheet:latestVersion'
```

3.愉快的使用：
```kotlin
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
