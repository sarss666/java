package child;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String encryptStr , String fileNameDes) {
        System.out.println("�������ģ�д���ļ�");
        try {
            FileOutputStream outFs = new FileOutputStream(fileNameDes);
            outFs.write(encryptStr.getBytes());
            outFs.close();
        } catch (FileNotFoundException e) {
            System.out.println("�ļ������ڣ�");
        }catch (IOException e) {
            System.out.println("�ļ���������");
        }
    }
}
