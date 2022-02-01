package com.example.focusstart.di

import com.example.focusstart.model.room.AppRoomDao
import com.example.focusstart.model.room.AppRoomDatabase
import com.example.focusstart.model.room.AppRoomRepository
import org.koin.dsl.module

val roomModule = module {
    single<AppRoomDatabase> {
        AppRoomDatabase.getInstance(get())
    }

    single<AppRoomRepository> {
        AppRoomRepository(get())
    }

    single<AppRoomDao> {
        AppRoomDatabase.getInstance(get()).getAppRoomDao()
    }
}