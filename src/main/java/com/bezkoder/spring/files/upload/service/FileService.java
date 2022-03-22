package com.bezkoder.spring.files.upload.service;

import com.bezkoder.spring.files.upload.Repository.FileRepository;
import com.bezkoder.spring.files.upload.model.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
    @Autowired
    private FilesStorageService storageService;

    @Autowired
    private FileRepository repository;

    public FileEntity create(MultipartFile multipartFile) {
        String fileName = storageService.save(multipartFile);
        FileEntity file = new FileEntity(fileName);
        repository.save(file);
        return file;
    }
}
