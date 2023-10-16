package TestSecurity.TestSecurity.controller;

import TestSecurity.TestSecurity.models.FileEntity;
import TestSecurity.TestSecurity.rep.FileEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping (value = "/chapterOne")
public class ChapterOneController {

    @Autowired
    FileEntityRepository fileEntityRepository;

    @GetMapping ("/add")
    public String uploadFile (Model model){
        return "chapterOne";
    }


    @PostMapping("/add")
    public String uploadFile (@RequestParam("file") MultipartFile file, Model model){
        FileEntity fileEntity = new FileEntity(file.getOriginalFilename(), file.getContentType(), file.getSize());
        fileEntityRepository.save(fileEntity);

        model.addAttribute("file", file);

        return "redirect:/chapterOne";

    }


}
