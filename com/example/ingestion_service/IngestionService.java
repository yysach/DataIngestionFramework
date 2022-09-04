package com.example.ingestion_service;

import com.example.source.ISourceObject;
import com.example.storage.IStorageFactory;

public class IngestionService {
	private IStorageFactory factory;
	private ISourceObject sourceObject;

	public IngestionService(final IStorageFactory factory, final ISourceObject sourceObject) {
		this.factory = factory;
		this.sourceObject = sourceObject;
	}
	
	public void ingestDataToStorage() {
		factory.ingestDataToStorage(sourceObject.readFromSource());
	}
}
