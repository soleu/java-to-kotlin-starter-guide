package com.kotlin.lec02

import com.lannstark.lec02.Person

class Main {
    fun main() {
        val person = Person("공부하는 개발자")
        startWithA(person.name) // getName 호출
        // java에서 작성한 코드를 불러올 수 있음
        // @NotNull 또는 @Nullable 어노테이션으로 표시를 해줘야함
        // 어노테이션이 없다면 코틀린이 정보를 알 수 없는 타입
        // 즉 플랫폼 타입으로 이해
        // 런타임 에러 발생 가능

    }

    fun startWithA(str: String): Boolean {
        return str.startsWith("A")
    }

}