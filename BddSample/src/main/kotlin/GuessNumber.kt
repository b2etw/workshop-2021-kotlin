class GuessNumber(private val password: Int?) {
    fun check(arg0: Int): String {
        if (password != arg0) {
            return "0A0B"
        }
        return "4A0B"
    }
}
