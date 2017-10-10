package javaplay.symboltable;

public interface SymbolTable {
	String get(String key);
	SymbolTable put(String key, String value);
	String remove(String key);
	String successor(String key);
	String predecessor(String key);
	int size();
}
