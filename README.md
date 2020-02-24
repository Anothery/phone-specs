# Compare phones app

Приложение для сравнения характеристик мобильных устройств


Архитектура: MVP, Clean Architecture


Используемые технологии:

Kotlin

Retrofit

SQLite (Room)

RxJava 2, RxBinding

Dagger 2



## TODO
- получать фотографию устройства с внешнего источника и выводить на экран (апи, которое используется сейчас выдает только характеристики устройств без фотографий)


Перед сборкой проекта необходимо в gradle.properties указать токен к fonoapi:
THE_FONO_API_KEY = "your_token"
Получить его можно тут: https://fonoapi.freshpixl.com/
