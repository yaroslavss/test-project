import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Loader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/file.txt");
        File zipFile = new File("src/output.zip");

        InputStream input = new FileInputStream(file);
        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));

        zipOut.putNextEntry(new ZipEntry(file.getName()));
        zipOut.setComment("This is a zip file.");
        int temp;
        while ((temp = input.read()) != -1) {
            zipOut.write(temp);
        }

        input.close();
        zipOut.close();
    }
}
