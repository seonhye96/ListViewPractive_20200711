package kr.co.tjoeun.listviewpractive_20200711

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listviewpractive_20200711.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

//    이벤트 처리 코드
    override fun setupEvents() {

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


    }
}