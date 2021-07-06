package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.practice.filehandler.FileUploadHelper;

@RestController
public class FileUploadController {
@Autowired
	private FileUploadHelper fileUploadHelper;
	
	
	@PostMapping("/upload-file")
	public ResponseEntity<String>uploadFile(@RequestParam("file") MultipartFile file){
		
		
		try {
		if(file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
		}
		if(!file.getContentType().equals("image/jpeg")) {
			
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only jpeg content are allow");
		}
		//file upload code
		boolean f=fileUploadHelper.uploadFile(file);
		if(f) {
			return ResponseEntity.ok("File upload Successfully");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong! Try Again");
	}
}

