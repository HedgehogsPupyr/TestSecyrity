package TestSecurity.TestSecurity.Service.FileService;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface FileDAOService {
    MultipartFile createFile (MultipartFile file);
}
