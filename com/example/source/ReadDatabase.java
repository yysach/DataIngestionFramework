package com.example.source;

public class ReadDatabase implements ISourceObject {

	@Override
	public String readFromSource() {
		return new String("reading source from Database...");
	}

}
