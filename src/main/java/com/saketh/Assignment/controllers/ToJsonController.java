
package com.saketh.Assignment.controllers;

import com.saketh.Assignment.models.Request;
import com.saketh.Assignment.models.Response;

import com.saketh.Assignment.services.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ToJsonController {

    @Autowired
    ConvertService convertService;

    @PostMapping(value = "/convert", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Response> convert(@RequestBody final Request request) {
        String filePath = request.getFile_path();
        String fileName = request.getFile_name();
        Boolean prettyPrinting = request.getPrettyPrinting();
        String outputDirectory = request.getResult_directory();
        List<String> outputFiles = convertService.convert(filePath + "/" + fileName, outputDirectory, prettyPrinting);
        Response response = new Response(outputFiles, outputDirectory, prettyPrinting);
        ResponseEntity<Response> responseEntity;
        if (outputFiles.size() > 0) {

            responseEntity = ResponseEntity.ok()
                    .body(response);
        } else {
            responseEntity = ResponseEntity.badRequest()
                    .build();
        }
        return responseEntity;
    }
}