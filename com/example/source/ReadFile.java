package com.example.source;

public class ReadFile implements ISourceObject {

	@Override
	public String readFromSource() {
		return new String("reading source from File...");
	}

}
