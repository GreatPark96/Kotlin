class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        for(interval in intervals){
            answer += arr.sliceArray(interval[0]..interval[1])
        }
        return answer
    }
}