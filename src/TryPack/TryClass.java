package TryPack;

import java.io.FileInputStream;
import java.io.IOException;

public class TryClass {
    public static void main(String[] args) {
        int i;
        if(args.length!=1)
        {
            System.out.println("Использование класса Try");
        return;
        }
        try (FileInputStream inputStream = new FileInputStream(args[0])){
            do {
                i=inputStream.read();
                if (i!=-1)
                    System.out.println((char)i);
            }while (i!=-1);
        }
        catch (IOException e)
        {
            System.out.println("Ошибка чтения из файла "+e);
        }
    }
}
