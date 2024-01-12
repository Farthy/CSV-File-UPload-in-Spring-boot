package com.farthy.csvfileupload.StudentPackage;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface StudentService {
  Integer uploadStudent(MultipartFile file) throws IOException;
}
