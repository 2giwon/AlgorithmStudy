package leetcode.challenge.june

class SurroundedRegions {

    private val dxy = arrayOf(0 to -1, -1 to 0, 0 to 1, 1 to 0)

    fun solve(board: Array<CharArray>) {
        if (board.isEmpty()) return

        for (i in board.indices) {
            if (board[i].first() == 'O') dfs(board, i, 0)
            if (board[i].last() == 'O') dfs(board, i, board[0].lastIndex)
        }

        for (i in board[0].indices) {
            if (board.first()[i] == 'O') dfs(board, 0, i)
            if (board.last()[i] == 'O') dfs(board, board.lastIndex, i)
        }

        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == '1') board[i][j] = 'O'
                else if (board[i][j] == 'O') board[i][j] = 'X'
            }
        }
    }

    private fun dfs(board: Array<CharArray>, i: Int, j: Int) {
        if (i in board.indices && j in board[i].indices && board[i][j] != 'X' && board[i][j] != '1') {
            board[i][j] = '1'

            dxy.forEach {
                dfs(board, i + it.first, j + it.second)
            }
        }
    }
}

class SurroundedRegions2 {
    private val dxy = arrayOf(0 to -1, -1 to 0, 0 to 1, 1 to 0)
    private var history = listOf<Pair<Int, Int>>()
    fun solve(board: Array<CharArray>) {
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == 'O') {
                    if (req(board, i, j)) {
                        board[i][j] = 'X'
                        for (h in history) {
                            board[h.first][h.second] = 'X'
                        }
                    }

                    history = emptyList()
                }
            }
        }
    }

    private fun req(board: Array<CharArray>, i: Int, j: Int): Boolean {
        tailrec fun req(board: Array<CharArray>, i: Int, j: Int): Boolean {
            if (board[i][j] == 'X') return true
            history = history + (i to j)
            for (d in dxy) {
                val x = i + d.first
                val y = j + d.second
                if (history.find { x == it.first && y == it.second } != null) continue

                return if (x !in 0..board.lastIndex || y !in 0..board[x].lastIndex) {
                    false
                } else {
                    req(board, x, y)
                }
            }

            return true
        }

        return req(board, i, j)
    }
}