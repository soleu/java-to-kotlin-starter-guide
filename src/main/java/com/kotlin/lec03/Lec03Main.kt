package com.kotlin.lec03

import com.lannstark.lec03.Person

class Lec03Main {
    // type casting
    // 선언된 기본값을 보고 타입을 추론
    // -> 기본타입간의 변환은 명시적이로 이루어져야함

    // 기본타입 -> .to변환타입()
    val number1 = 3
    val number2: Long = number1.toLong(); // 이렇게 명시적으로 타입을 입력해주어야 함

    // 기본타입 (nullable)
    val number3: Int? = 3
    val number4: Long? = number3?.toLong() ?: 0L // nullable에도 적절한 처리가 되어야함

    // 일반타입
    fun printAgeIfPerson(obj: Any) {
        if (obj is Person) { // java 의 instanceof 와 같음 (반대는 !is 로 구현)
            val person = obj as Person // java의 (Person) obj
            println(obj.age) // 스마트 캐스팅 : if에서 타입 체크를 해줬으므로 해당 타입으로 간주하게 됨
        }
    }

    // 일빈타입(nullable)
    fun printAgeIfPersonOrNull(obj: Any?) {
        if (obj is Person) {
            val person = obj as? Person // nullable 구현 (null이 아니라면 해당 객체로, null이라면 전체가 null로)
            println(person?.age) // ?를 붙여서 호출해야함
        }
    }

    /*
     Any 타입
     1. java의 obj 역할 (모든 객체의 최상위 타입)
     2. 모든 primitive type의 최상의 타입도 any
     3. 자체로 null 표현 불가. any?로 표현
     4. eqauals / hashCode/ toString 사용 가능
    */


    /* Unit 타입
    * 1. java의 void와 동일
    * 2. void와는 다르게 Unit은 그 자체 타입 인자로 사용 가능
    * 3. 코틀린의 Unit은 실제 존재하는 단 하나의 인스턴스만 갖는 타입을 의미
    */

    /* Nothing
    1. 함수가 정상적으로 끝나지 않았음을 표현
    2. 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
    */
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message)
    }

    // String interpolation - 문자열에 변수 집어넣기 용이
    fun StringInterpolationEx() {
        val person = Person("sol", 20)
        // java - String.format 사용
        println("이름 : ${person.name}")
    }


    // String indexing -- 문자열 포맷 변하게 (개행처리 용이)
    fun StringIndexingEx() {
        """
            안냐세요
           문자열 개 꿀
           ㅎㅁㅎ
          변수도 넣을 수 있음
        """.trimIndent()
    }

    fun ExtractStringArr() {
        val str = "ABC"
        println(str[0]) // 문자열도 배열로 하나씩 추출 가능
    }
}