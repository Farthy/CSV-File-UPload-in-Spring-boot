package com.farthy.csvfileupload.StudentPackage;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentCsvRepresentation {
    @CsvBindByName(column = "firstName")
    private String fname;
    @CsvBindByName(column = "lastName")
    private  String lname;
    @CsvBindByName(column = "email")
    private String email;
}
