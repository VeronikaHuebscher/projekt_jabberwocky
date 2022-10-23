package fileReader;
import java.util.ArrayList;
import java.io.*;
public class TextToArray {


    /**
     * readFile dient dazu, einen .txt File einzulesen
     *
     * @param fileName
     * @param data
     */
    public static void readFile(String fileName, ArrayList<String> data){
            try{
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while((line = br.readLine()) != null){
                    data.add(line);

                }

            } catch (IOException ex) {
                System.out.println("Error - Cannot read from file " + fileName);


            }
        }

        //TEST
        public static void main(String[] args){
            ArrayList<String> datei = new ArrayList<>();

            readFile("Text.txt", datei);
            //Output to screen
            for(int i = 0; i< datei.size(); i++){
                System.out.println(datei.get(i));
            }


        }
    }


