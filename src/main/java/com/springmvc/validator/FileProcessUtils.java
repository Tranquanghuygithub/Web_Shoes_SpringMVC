package com.springmvc.validator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileProcessUtils {
	private static File getFolderUpload() {
        File folderUpload = new File("F:/upload");
        if (!folderUpload.exists()) {
            folderUpload.mkdir();
        }
        return folderUpload;
    }

    public static String processUploadFile(MultipartFile multipartFile) {
        String fileName = multipartFile.getOriginalFilename();
        try {
            String fileExtension = FilenameUtils.getExtension(fileName);
            fileName = System.currentTimeMillis() + "." + fileExtension;
            File file = new File(FileProcessUtils.getFolderUpload(), fileName);
            multipartFile.transferTo(file);
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
//	MultipartFile file = productDTO.getFileData();
//	File newfile = new File("F:\\HDV\\Project\\src\\main\\webapp\\resources\\images\\" + file.getOriginalFilename());
//	System.out.println(file.getOriginalFilename());
//	FileOutputStream fileOutputStream;
//	try {
//
//		fileOutputStream = new FileOutputStream(newfile);
//		fileOutputStream.write(file.getBytes());
//		
//	
//	}catch(FileNotFoundException e1) {
//			System.out.println(e1.getMessage());			
//	} catch (IOException e) {
//		System.out.println(e.getMessage());
//	
//	} 
//	productDTO.setImage(file.getOriginalFilename());//set image
}

