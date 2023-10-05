package com.jun.data.repository;

import com.jun.database.UserDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DefaultUserRepository_Factory implements Factory<DefaultUserRepository> {
  private final Provider<UserDao> userDaoProvider;

  public DefaultUserRepository_Factory(Provider<UserDao> userDaoProvider) {
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public DefaultUserRepository get() {
    return newInstance(userDaoProvider.get());
  }

  public static DefaultUserRepository_Factory create(Provider<UserDao> userDaoProvider) {
    return new DefaultUserRepository_Factory(userDaoProvider);
  }

  public static DefaultUserRepository newInstance(UserDao userDao) {
    return new DefaultUserRepository(userDao);
  }
}
