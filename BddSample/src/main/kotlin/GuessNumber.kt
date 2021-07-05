class GuessNumber(val answer: String) {
    fun check(input: String): String {
        return "${getA(input)}A${getB(input, answer.toHashSet()) - getA(input)}B"
    }

    private fun getA(input: String): Int {
        var a = 0
        input.forEachIndexed { index, c ->
            if (answer[index] == c) {
                a++
            }
        }
        return a
    }

    private fun getB(input: String, answerSet: HashSet<Char>): Int {
        var b = 0
        input.forEach {
            if (answerSet.contains(it)) {
                b++
            }
        }
        return b
    }
}
