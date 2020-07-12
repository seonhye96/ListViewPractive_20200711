package kr.co.tjoeun.listviewpractive_20200711

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kr.co.tjoeun.listviewpractive_20200711.datas.Room

class ViewRoomDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        val roomData = intent.getSerializableExtra("room") as Room//intent 너가 가지고 있는걸 가져와라 -> serializable로 받아옴 -> 캐스팅 해야함 (as Room)

        priceTxt.text = roomData.getFormattedPrice()
        descriptionTxt.text = roomData.description

        addressTxt.text = roomData.address
        floorTxt.text = roomData.getFormattedFloor()

    }
}