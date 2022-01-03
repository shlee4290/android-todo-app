package com.survivalcoding.todolist.di

import com.survivalcoding.todolist.data.datasource.ToDoLocalDataSource
import com.survivalcoding.todolist.data.datasource.ToDoMockDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindsToDoLocalDataSource(toDoMockDataSource: ToDoMockDataSource): ToDoLocalDataSource
}