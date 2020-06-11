package leetcode.challenge.april

import kotlin.math.min

class MinimumPathSum {

    private var result = Int.MAX_VALUE
    fun minPathSum(grid: Array<IntArray>): Int {
        for (i in 1..grid.lastIndex) {
            grid[i][0] = grid[i - 1][0] + grid[i][0]
        }
        for (j in 1..grid.last().lastIndex) {
            grid[0][j] = grid[0][j - 1] + grid[0][j]
        }

        for (i in 1..grid.lastIndex) {
            for (j in 1..grid.last().lastIndex) {
                grid[i][j] = minOf(grid[i - 1][j], grid[i][j - 1]) + grid[i][j]
            }
        }
        return grid.last().last()
    }

    /*
    [1,3,1],
    [1,5,1],
    [4,2,1]

    [1,2],
    [1,1]

    [1,2,5]
    [3,2,1]
     */
    private fun dfs(grid: Array<IntArray>, i: Int, j: Int, sum: Int = 0): Int {
        if (i >= grid.size || j >= grid[0].size) {
            return sum
        }

        var sum2 = sum + grid[i][j]
        dfs(grid, i, j + 1, sum2)
        sum2 = dfs(grid, i + 1, j, sum2)

        if (i == grid.lastIndex && j == grid[0].lastIndex) {
            result = min(result, sum2)
        }
        return sum2
    }
}