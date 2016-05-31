package br.com.mec.fies.util;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import br.com.mec.fies.domain.Domain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class EngineJson {

	private static Gson gson;
	private static EngineJson engJson;
	
	private EngineJson() {
		super();
		if (gson == null){
			gson = new Gson();
		}
	}
	
	public static EngineJson getInstancia() {
		if (engJson == null){
			engJson = new EngineJson();
		}
		
		return engJson;
	}
	
	public String serializarObjeto(Object objeto) {
		return gson.toJson(objeto);
	}
	
	public String serializarColecao(Collection<Domain> colecao) {
		return gson.toJson(colecao);
	}
	
	public String serializarLista(List lista) {
		return gson.toJson(lista);
	}
	
	public Collection<Domain> deSerializarColecao(String json) {
		Type collectionType = new TypeToken<Collection<Domain>>(){}.getType();
		Collection<Domain> colecao = gson.fromJson(json, collectionType);
		return colecao;
	}
	
	public Domain deSerializarObjeto(String json) {
		Type collectionType = new TypeToken<Domain>(){}.getType();
		Domain colecao = gson.fromJson(json, collectionType);
		return colecao;
	}
	
	public Domain deSerializarObjeto2(String json) {
		Gson gson2 = new GsonBuilder().registerTypeAdapter(Domain.class, new InterfaceAdapter<Domain>()).create();
		Type type = new TypeToken<Domain>(){}.getType();
		Domain colecao = gson2.fromJson(json, type);
		
		return colecao;
	}

	
//	
//	Collections Examples
//	Collection<Integer> ints = Lists.immutableList(1,2,3,4,5);
//	(Serialization)
//	String json = gson.toJson(ints); ==> json is [1,2,3,4,5]
//	(Deserialization)
//	Gson User Guide - gson https://sites.google.com/site/gson/gson-user-guide
//	6 de 17 19/11/2012 16:00
//	Type collectionType = new TypeToken<Collection<Integer>>(){}.getType();
//	Collection<Integer> ints2 = gson.fromJson(json, collectionType);
//	ints2 is same as ints
//	Fairly hideous: note how we define the type of collection
//	Unfortunately, no way to get around this in Java
}
