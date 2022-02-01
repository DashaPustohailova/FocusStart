//package com.example.focusstart.model.room
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import com.example.focusstart.model.room_model.CurrencyInfo
//
//@Database(entities = [CurrencyInfo::class], version = 1, exportSchema = false)
//abstract  class AppRoomDatabase: RoomDatabase() {
//
//    abstract fun getAppRoomDao():AppRoomDao
//
//    companion object {
//        @Volatile
//        private var database:AppRoomDatabase?=null
//
//        @Synchronized
//        fun getInstance(context: Context):AppRoomDatabase{
//            return if(database == null){
//                database = Room.databaseBuilder(
//                    context,
//                    AppRoomDatabase::class.java,
//                    "database"
//                ).build()
//                database as AppRoomDatabase
//            } else
//                database as AppRoomDatabase
//        }
//    }
//}