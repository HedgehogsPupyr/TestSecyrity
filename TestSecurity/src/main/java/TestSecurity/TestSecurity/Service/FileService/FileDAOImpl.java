package TestSecurity.TestSecurity.Service.FileService;

import TestSecurity.TestSecurity.models.FileEntity;
import TestSecurity.TestSecurity.rep.FileEntityRepository;
import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

public class FileDAOImpl implements FileDAOService{

    @Autowired
    FileEntityRepository fileEntityRepository;


    @Override
    public MultipartFile createFile(MultipartFile file) {
        String pathFile = "/uploadDir";
        FileEntity fileEntity = new FileEntity(file.getOriginalFilename(),file.getContentType(), file.getSize(), pathFile, file.hashCode());
        fileEntityRepository.save(fileEntity);

        return null;
    }
}
