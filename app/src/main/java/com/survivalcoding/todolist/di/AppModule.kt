package com.survivalcoding.todolist.di

import android.content.Context
import androidx.room.Room
import com.survivalcoding.todolist.data.ToDoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideToDoRoomDB(@ApplicationContext context: Context): ToDoDatabase =
        Room.databaseBuilder(
            context,
            ToDoDatabase::class.java,
            TODO_DB_NAME
        ).build()

    companion object {
        private const val TODO_DB_NAME = "todo-database"
    }
}