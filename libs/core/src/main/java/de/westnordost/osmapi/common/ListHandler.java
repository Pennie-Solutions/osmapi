package de.westnordost.osmapi.common;

import java.util.ArrayList;
import java.util.List;

/** Puts all the elements into a list*/
public class ListHandler<T> implements Handler<T>
{
	private List<T> list = new ArrayList<>();
	
	@Override
	public void handle(T tea)
	{
		list.add(tea);
	}

	public List<T> get()
	{
		return list;
	}
}
