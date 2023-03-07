package com.kotlin.lec01

import com.lannstark.lec01.Person

class Lec01Main {

    fun main() {
        var number1 = 10L; // 바꿀 수 있음 (variable, 발)
        number1 = 5L;

        val number2 = 20L; // 바꿀 수 없음 (= final) (value, 벨)
//        number2 = 5L; (X)

        // 코틀린은 타입을 컴파일러가 추론해줌 (의무적으로 작성해줄 필요는 x)
        // 타입 명시 방법
        var number3: Long = 5L;

        // 초기화 방법
        var number4: Long // 선언시에 초기화 하지 않는다면 타입을 명시해줘야함
        val number5: Long // val의 경우도 마찬가지로 최초 1번은 값을 나중에 초기화할 수 있음 (final 과 다른 점)

        // 클린 코드 TIP
        // 모든 변수는 val (불변)으로 만들고, 꼭 필요한 경우에만 var로 선언

        // long (primitive) - Long (reference) 같음
        // 표기는 Long으로 하지만, 연산시에는 코틀린이 알아서 long으로 변경해줌
        var number6 = 10L // long
        var number7 = 1000L // Long

        // nullable
//        number3 = null; // 이렇게 함부로 null을 넣어주려고 하면 에러 발생
        var number8: Long? = null; // 이렇게 선언시에 null이 들어갈 수 있음을 선언해줘야 함

        // 객체 인스턴스화
        var person = Person("최태현"); // new를 붙이지 않아야 함
    }
}