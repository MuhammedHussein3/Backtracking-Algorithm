public class WordSearch79 {
    class Solution {
        public boolean exist(char[][] board, String word) {
            path = "";
            for (int i = 0;i < board.length;i++)
            {
                for (int j = 0;j < board[i].length;j++)
                {
                    if (board[i][j]==word.charAt(0)) {
                        vis = new boolean[board.length][board[0].length];
                        if (backtrack(i, j, board.length, board[0].length, board, word, 0))
                            return true;
                    }
                }
            }
            return false;
        }
        String path;
        boolean[][] vis;
        boolean backtrack(int i,int j,int n,int m,char[][] board,String word,int idx)
        {

            if (path.length()==word.length())
                return path.equals(word);
            if(isValid(i,j,n,m)||vis[i][j])
                return false;

            if (board[i][j]!=word.charAt(idx))
                return false;
            path+=board[i][j];
            vis[i][j] = true;
            boolean d0 = backtrack(i+1,j,n,m,board,word,idx+1);
            boolean d1 = backtrack(i-1,j,n,m,board,word,idx+1);
            boolean d2 = backtrack(i,j+1,n,m,board,word,idx+1);
            boolean d3 = backtrack(i,j-1,n,m,board,word,idx+1);
            vis[i][j] = false;
            path=path.substring(0,path.length()-1);

            return d0 | d1 | d2 | d3;
        }
        boolean isValid(int i,int j,int n,int m){
            return i<0||i>=n||j<0||j>=m;
        }

    }
}

