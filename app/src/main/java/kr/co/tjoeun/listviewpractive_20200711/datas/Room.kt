package kr.co.tjoeun.listviewpractive_20200711.datas

import java.io.Serializable

class Room(
    val price:Int,
    val address: String,
    val floor:Int,
    val description:String) : Serializable {
    
//    가격 
    fun getFormattedPrice() : String {
        if(this.price >= 10000){
//            28500 => 2억 8,500 형태로 가공
            /*2억 => 28500 / 10000 => 2*/
            val uk = this.price / 10000

//            8500 분리
            /*28500 % 10000 = 8500*/
            val rest = this.price % 10000

            return String.format("%d억 %,d", uk, rest)
        }else{
//            7500 => 7,500형태로 가공
            return String.format("%,d", this.price)
        }
    }
    
//    층수 계산
    fun getFormattedFloor() : String{
        if(floor > 0){
            return "${this.floor}층"
        }else if(floor == 0) {
            return "반지하"
        }else{
            return "지하 ${-this.floor}층"
        }
    }

}