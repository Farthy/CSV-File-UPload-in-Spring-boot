package com.farthy.csvfileupload.StudentPackage;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @PostMapping(value = "/uploads", consumes = {"multipart/form-data"})
    public ResponseEntity<Integer> uploadStudent(@RequestPart("file")MultipartFile file) throws IOException {
        return ResponseEntity.ok(studentService.uploadStudent(file));
    }
}
