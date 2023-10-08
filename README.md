# Login-CleanArchitecture
CleanArchitecture Multi Module Login App


## Architecture
Using MVVM + Clean architecture


## Language
- Kotlin


## Libraries
* [Kotlin](https://kotlinlang.org/)
* [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) + [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/) for aynsc
* [Hilt](https://dagger.dev/hilt/) for dependency injection.
* [JetPack](https://developer.android.com/jetpack)
  - compose, lifecycle, hilt, navigation, room, paging, dataStore, palette


## Gradle Dependency
[Gradle Version Catalog](https://docs.gradle.org/current/userguide/platforms.html) 를 활용하여 종속성과 플러그인을 관리하고 있습니다.


## Layer
본 프로젝트는 Layered Architecture 형태로 설계되어 있습니다. 현재 Presentation/Domain/Data 레이어 구조를 띄고 있습니다.
![image](https://github.com/Iwillbeagood/Login-CleanArchitecture/assets/106158445/3b3b5539-bfbb-4dc7-8909-53cba6bab5fd)


## UI Layer
상태는 아래로 이동하고 이벤트는 위로 이동하는 단방향 데이터 흐름(UDF)으로 구성되어 있습니다.
![img](https://lh5.googleusercontent.com/Cy5hT9u87lJ9w4mKtGOvyWIaHAUMXQJakV_1RVdjeHGeAUFMnTS1P33yan05Sw5AcPbfkI6DiXt4SupBVnziDjl-ylvNqhTb0u1uZWTgp0saetrqFYhjH0LrxTocOFIKOvOSZ26wYSJDJi6nrRUrUJg)


## Module
본 프로젝트는 Multi-module 구조이며 각 Feature마다 모듈 형태로 구성되어 있습니다.
<img src="arts/project-denpendency-graph.png" />
