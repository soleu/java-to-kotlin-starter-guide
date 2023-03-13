package com.kotlin.lec02

class Lec02Main {
    fun main() {

    }

    fun startsWithA1(str: String?): Boolean {
        if (str == null) {
            throw IllegalArgumentException("null이 들어왔습니다.")
        }
        return str.startsWith("A");
    }

    fun startWithA2(str: String?): Boolean? {
        if (str == null)
            return null;
        return str.startsWith("A");
    }

    fun startWithA3(str: String?): Boolean {
        if (str == null)
            return false // 위에서 널체크를 하면 컴파일러가 널이 아님을 인식하게됨
        return str.startsWith("A")
    }
// 널이 가능한 타입들을 위한 연산
    // 1. Safe Call
    // str?.length // 널이 아닐때만 해당 함수 실행 / 널이면 그냥 널

    fun safeCall() {
        val str: String? = "ABC"
        println(str?.length) // null 이면 그냥 null
    }

    // 2. Elvis 연산자
    fun elvis() {
        val str: String? = null
        println(str?.length ?: 0) // ?:를 붙여서 써야함 Null이 라면 0 반환
    }

    // 최종
    fun startWithAF1(str: String?): Boolean {
        return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다.")
    }

    fun startWithAF2(str: String?): Boolean? {
        return str?.startsWith("A");
    }

    fun startWithAF3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }

    // nullable 이지만 아무리 생각해도 null이 될 수 없는 경우
    fun startWith(str:String?): Boolean{
        return str!!.startsWith("A") // 강제로 null이 아님을 명시

        // 혹시나 null이 들어온다면 런타임 에러 발생
    }
}