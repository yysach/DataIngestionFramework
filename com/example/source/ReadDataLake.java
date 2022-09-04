package com.example.source;

public class ReadDataLake implements ISourceObject {

	@Override
	public String readFromSource() {
		return new String("reading source from datalake...");
	}

}
