package TestSecurity.TestSecurity.Service.FileService;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


public class GetBytesFromPDFService {

    public GetBytesFromPDFService(MultipartFile fileUpload) throws IOException {

        File file = new File ("C:/Users/itimofeev/IdeaProjects/TestSecurity/file/newFile.docx");

        FileInputStream fileInputStream =new FileInputStream(file);

        PDDocument documentPDF =  PDDocument.load(file);


    }
}
