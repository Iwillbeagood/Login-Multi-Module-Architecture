package com.jun.data.di

import com.jun.data.repository.DefaultUserRepository
import com.jun.data.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsUserRepository(
        userRepository: DefaultUserRepository
    ): UserRepository
}