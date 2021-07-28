package child;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String encryptStr , String fileNameDes) {
        System.out.println("保存密文，写入文件");
        try {
            FileOutputStream outFs = new FileOutputStream(fileNameDes);
            outFs.write(encryptStr.getBytes());
            outFs.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }catch (IOException e) {
            System.out.println("文件操作错误！");
        }
    }
}
