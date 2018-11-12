package javaapplication;
import java.util.ArrayList;
import java.util.Random;
public class Logic {
    int win, start, timer, index, solvable, movesCount;
    int shuffle[] = new int [16];
    Random random = new Random();
    String number[] = new String [2];
    float inversions;
    public int[] Shuffle(){
        start = 1;
        ArrayList<Integer> myNumbers = new ArrayList<>();
        solvable = 0;
        movesCount = 0;
        inversions = 0;
        while(solvable == 0) {
            myNumbers.add(1); myNumbers.add(2); myNumbers.add(3); myNumbers.add(4); myNumbers.add(5); myNumbers.add(6); myNumbers.add(7); myNumbers.add(8); myNumbers.add(9); myNumbers.add(10); myNumbers.add(11); myNumbers.add(12); myNumbers.add(13); myNumbers.add(14); myNumbers.add(15);
            for (int i = 1; i < 16; i++) {
                index = random.nextInt(myNumbers.size());
                shuffle[i] = myNumbers.get(index);
                myNumbers.remove(index);
            }
            inversions = 0;
            for (int ii = 1; ii < 16; ii++)
                for (int iii = ii; iii < 16; iii++)
                    if (shuffle[ii] > shuffle[iii])
                        inversions++;
            if ((inversions % 2) == 0)
                solvable = 1;
        }
        return shuffle;
    }
    public String[] CheckButton(String Button1, String Button2) {
        if("".equals(Button2)){
            Button2 = Button1;
            Button1 = "";
            movesCount++;
        }
        number[0] = Button1;
        number[1] = Button2;
        return number; 
    }
    public int CheckWin(String Button1, String Button2, String Button3, String Button4, String Button5, String Button6, String Button7, String Button8, String Button9, String Button10, String Button11, String Button12, String Button13, String Button14, String Button15, String Button16) {
        win = 0;
        if("1".equals(Button1) && "2".equals(Button2) && "3".equals(Button3) && "4".equals(Button4) && "5".equals(Button5) && "6".equals(Button6) && "7".equals(Button7) && "8".equals(Button8) && "9".equals(Button9) && "10".equals(Button10) && "11".equals(Button11) && "12".equals(Button12) && "13".equals(Button13) && "14".equals(Button14) && "15".equals(Button15) && "".equals(Button16))
            win = 1;
        return win;
    }
}