package com.jun.data.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/jun/data/di/DataModule;", "", "bindsUserRepository", "Lcom/jun/data/repository/UserRepository;", "userRepository", "Lcom/jun/data/repository/DefaultUserRepository;", "data_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface DataModule {
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.jun.data.repository.UserRepository bindsUserRepository(@org.jetbrains.annotations.NotNull
    com.jun.data.repository.DefaultUserRepository userRepository);
}