package kr.co.tjoeun.listviewpractive_20200711

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractive_20200711.adapters.RoomAdapter
import kr.co.tjoeun.listviewpractive_20200711.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()
    lateinit var mRoomAdapter: RoomAdapter // 1.종이 만들었다!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
    }

//    이벤트 처리 코드
    override fun setupEvents() {

        roomListView.setOnItemClickListener { parent, view, position, id ->

//            어떤 방을 선택했는지  mRoomList에 있는 것에서 position 위치를 가져와라
            val clickedRoom = mRoomList[position]

//            상세화면으로 진입
            val myIntent = Intent(mContext, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("room", clickedRoom) // room이란걸로 다 넘겨주면 안되나?
            startActivity(myIntent)

        }

    }

//    데이터 설정
    override fun setValues() {

        mRoomList.add(Room(26700, "서울시 은평구", 4, "서울시 은평구의 4층 방입니다."))
        mRoomList.add(Room(7500, "서울시 도봉구", 5, "서울시 도봉구의 5층 방입니다."))
        mRoomList.add(Room(53100, "서울시 동대문구", -1, "서울시 동대문구의 지하 1층 방입니다."))
        mRoomList.add(Room(9400, "서울시 서대문구", 8, "서울시 서대문구의 8층 방입니다."))
        mRoomList.add(Room(18000, "서울시 송파구", 12, "서울시 송파구의 12층 방입니다."))
        mRoomList.add(Room(25000, "서울시 양천구", -2, "서울시 양천구의 지하 2층 방입니다."))
        mRoomList.add(Room(45000, "서울시 용산구", 0, "서울시 용산구의 반지하 방입니다."))
        mRoomList.add(Room(3800, "서울시 종로구", 4, "서울시 종로구의 4층 방입니다."))
        mRoomList.add(Room(16000, "서울시 강서구", 2, "서울시 강서구의 2층 방입니다."))
        mRoomList.add(Room(8900, "서울시 금천구", 13, "서울시 금천구의 13층 방입니다."))

        mRoomAdapter = RoomAdapter(mContext, R.layout.room_list_item, mRoomList) // 2.도장을 찍을거다!  여기에다가 R.레이아웃에 있는 room_dfd에  mRoomList 값을 넣어라

        roomListView.adapter = mRoomAdapter // 3. 2에서 만든 어댑터 변수를 적용

    }

}