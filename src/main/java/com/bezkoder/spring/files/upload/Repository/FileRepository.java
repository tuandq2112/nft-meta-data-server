package com.bezkoder.spring.files.upload.Repository;

import com.bezkoder.spring.files.upload.model.FileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<FileEntity,Long> {
}
