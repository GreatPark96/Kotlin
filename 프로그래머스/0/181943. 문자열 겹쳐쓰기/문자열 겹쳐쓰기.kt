class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length+s)
        return answer
    }
}