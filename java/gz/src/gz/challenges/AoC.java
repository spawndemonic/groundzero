package gz.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AoC {
    public void aocday0() throws IOException {
        int [][] test1d = new int[10][12];
        FileReader fileR = new FileReader("puzzleinput.txt");
        BufferedReader reader = new BufferedReader(fileR);
        String readLine="";
        ArrayList numbersFromFile = new ArrayList<String>();
        while((readLine = reader.readLine())!= null){
            numbersFromFile.add(readLine);
        }
        for(int i=-1;i<numbersFromFile.size();i++){
            for(int j=-1;j<numbersFromFile.size();j++) {
                for (int k = -1; k < numbersFromFile.size(); k++) {
                    if ((Integer.parseInt((String) numbersFromFile.get(i)) + Integer.parseInt((String) numbersFromFile.get(j))+Integer.parseInt((String) numbersFromFile.get(k))) == 2019) {
                        System.out.println(numbersFromFile.get(i) + "," + numbersFromFile.get(j)+","+numbersFromFile.get(k));
                        System.out.println(Integer.parseInt((String) numbersFromFile.get(i)) * Integer.parseInt((String) numbersFromFile.get(j))*Integer.parseInt((String) numbersFromFile.get(k)));
                    }
                }
            }
        }

        fileR.close();
    }
}
