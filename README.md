Problem solving
Leetcode, Codeforces , AtCoder, HackerRank  
========
### BackTracking Algorithm
| # | Title | Solution | Difficulty | Explained | 
|---| ----- | -------- | ---------- | --------------------------------------------|
|79|[Word Search](https://leetcode.com/problems/word-search/description/)| [Java code] (https://github.com/MuhammedHussein3/Backtracking-Algorithm/blob/main/BackTracking-Algorithm/src/WordSearch79.java), [C++ code], [Python code]  | Medium | Algo BackTracking():

Perform a BackTrack/Recursion on the grid starting from each cell.
At Each Cell (i, j) in the Grid:

Check if the character at (i, j) matches the first character of the word.
If it matches:
Proceed to search for the remaining characters of the word recursively by exploring adjacent cells.
Continue this process until all characters of the word are found or until reaching the end of the grid.
During the DFS:

Use a recursive DFS function that takes the current cell (i, j), the word to search for, and the index of the current character being searched in the word.
Update the index to search for the next character in the word as traversing the grid.
Backtrack if the character at the current cell does not match the expected character in the word.
If All Characters of the Word Are Found:

Return true.
If the Word Is Not Found in the Grid:

Return false. |
