package com.example.storage;

public class CloudStorage implements IStorageFactory {

	@Override
	public void ingestDataToStorage(String data) {
		System.out.println("CloudStorage : " + data);
	}

}
