package com.example.storage;

public class OnPremiseStorage implements IStorageFactory {

	@Override
	public void ingestDataToStorage(String data) {
		System.out.println("OnPremiseStorage : " + data);
	}

}
