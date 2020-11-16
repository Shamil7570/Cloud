package com.khizriev.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


/**
 * Класс для передачи с клиента на сервер необходимой операции
 * с файлом в облачном хранилище
 */
@Getter
@Setter
@AllArgsConstructor
public class FileOperationsMessage extends AbstractMessage  {

	public static final long serialVersionUID = 1344774173888738704L;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public FileOperation getFileOperation() {
		return fileOperation;
	}

	public void setFileOperation(FileOperation fileOperation) {
		this.fileOperation = fileOperation;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public enum FileOperation {
		COPY, MOVE, DELETE		
	}
	
	private FileOperation fileOperation;	
	private String fileName;
}
