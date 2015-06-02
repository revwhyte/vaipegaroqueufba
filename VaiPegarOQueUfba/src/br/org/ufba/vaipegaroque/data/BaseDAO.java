package br.org.ufba.vaipegaroque.data;

import java.util.ArrayList;

public abstract class BaseDAO<TEntity, TId> {

	public abstract ArrayList<TEntity> getAll();

	public abstract TEntity getById(TId id);

	public abstract void create(TEntity entity);

	public abstract void update(TId id, TEntity entity);

	public abstract void delete(TId id);
}
