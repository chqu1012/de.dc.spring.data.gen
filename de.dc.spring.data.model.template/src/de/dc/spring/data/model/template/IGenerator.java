package de.dc.spring.data.model.template;

public interface IGenerator<T> {

	String gen(T data);
}
