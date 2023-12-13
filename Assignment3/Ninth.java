public class Ninth {
//Give Java code for performing add(e) and remove(i) methods for
// the Scoreboard class, as in Code Fragments 3.3 and 3.4,
// except this time, don’t maintain the game entries in order.
// Assume that we still need to keep n entries stored in
// indices 0 to n−1. You should be able to implement the methods
// without using any loops, so that the number of steps they perform
// does not depend on n.
//     public GameEntry remove(int index) throws IndexOutOfBoundsException
//    {
//        if(index<0||index>numOfEntries-1)
//            throw new IndexOutOfBoundsException("invalid index");
//        GameEntry deleted=board[index];
//        for (int i = index; i <numOfEntries ; i++) {
//            board[i]=board[i+1];
//
//        }
//        board[numOfEntries-1]=null;
//        numOfEntries--;
//        return deleted;
//    }
//     public void add(GameEntry e){
//        int newScore=e.getScore();
//        if (numOfEntries< board.length||newScore>board[numOfEntries-1].getScore())
//        {
//            if (numOfEntries< board.length)
//                numOfEntries++;
//            int j=numOfEntries-1;
//            while (j>0&&newScore>board[j-1].getScore())
//            {
//                board[j]=board[j-1];
//                j--;
//            }
//            board[j]=e;
//        }
//    }
}
