package com.file.upload.managment.model;

import lombok.Data;

@Data
public class UploadResponse {
	   private String fileName;
	    private String fileDownloadUri;
	    private String fileType;
	    private long size;

	    public UploadResponse(String fileName, String fileDownloadUri, String fileType, long size) {
	        this.fileName = fileName;
	        this.fileDownloadUri = fileDownloadUri;
	        this.fileType = fileType;
	        this.size = size;
	    }
}
