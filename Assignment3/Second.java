import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
public class Second {
//Write a Java method that repeatedly selects and removes a random entry
//from an array until the array holds no more entries.
    private GameEntry[] board;
    private int numOfEntries;

    public Second(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e){
        int newScore=e.getScore();
        if (numOfEntries< board.length||newScore>board[numOfEntries-1].getScore())
        {
            if (numOfEntries< board.length)
                numOfEntries++;
            int j=numOfEntries-1;
            while (j>0&&newScore>board[j-1].getScore())
            {
                board[j]=board[j-1];
                j--;
            }
            board[j]=e;
        }
    }
    public GameEntry remove(int index) throws IndexOutOfBoundsException
    {
        if(index<0||index>numOfEntries-1)
            throw new IndexOutOfBoundsException("invalid index");
        GameEntry deleted=board[index];
        for (int i = index; i <numOfEntries ; i++) {
            board[i]=board[i+1];

        }
        board[numOfEntries-1]=null;
        numOfEntries--;
        return deleted;
    }
    public static void deleteAll(GameEntry[] board)
    {
        ArrayList<GameEntry> list=new ArrayList<>(board.length);
        for (GameEntry g:board
             ) {
            list.add(g);
        }
        Random random=new Random();
        while (!list.isEmpty())
        {
            int s=random.nextInt(list.size());
            GameEntry r=list.remove(s);
            System.out.println(r);
        }
    }
    public void view(){
        System.out.print("[");
        for (GameEntry g:board
        ) {
            System.out.print(g+"\t");
        }
        System.out.println("]");

    }
}


