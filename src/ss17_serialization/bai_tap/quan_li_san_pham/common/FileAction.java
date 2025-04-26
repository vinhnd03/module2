package ss17_serialization.bai_tap.quan_li_san_pham.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileAction {
    public static <T> void writeBinaryFile(String path, List<T> objectList) {
        File file = new File(path);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
            outputStream.writeObject(objectList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static <T> List<T> readBinaryFile(String path) {
        File file = new File(path);
        List<T> list = new ArrayList<>();
        if (file.length() == 0) {
            return list;
        }
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
            list = (List<T>) inputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
