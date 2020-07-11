package kr.co.tjoeun.listviewpractive_20200711

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() { // 상속을 내려주기 위한 개념일뿐 실제로 등장할 액티비티가 아님.

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}