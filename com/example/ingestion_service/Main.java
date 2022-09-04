package com.example.ingestion_service;

import com.example.source.ReadDataLake;
import com.example.storage.OnPremiseStorage;

public class Main {
	public static void main(String[] args) {
		IngestionService ingestionService = new IngestionService(new OnPremiseStorage(), new ReadDataLake());
		ingestionService.ingestDataToStorage();
	}

}
