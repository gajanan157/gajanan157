package com.practice.filehandler;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	public final  String UPLOAD_DIR="C:\\Users\\USER\\Documents\\workspace-spring-tool-suite-4-4.11.0.RELEASE\\mntpractice\\src\\main\\resources\\static\\images";

	public  boolean uploadFile(MultipartFile multipartFile) {
		boolean f=false;
		try {
			//old api
         	InputStream is=multipartFile.getInputStream();
			byte data[] =new byte[is.available()];		
			is.read(data);
			
		//	write
			FileOutputStream fos =new FileOutputStream(UPLOAD_DIR+java.io.File.separator+multipartFile.getOriginalFilename());
		
			fos.write(data);
			fos.flush();
			fos.close();
		
		
			f=true;
			
	}
		catch(Exception e) {
			e.printStackTrace();
		}
return f;
}
}