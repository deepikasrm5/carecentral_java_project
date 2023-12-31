package in.deepikasriram.carecentral.interfaceFiles;

import java.util.Set;
public interface Base<T> {
	
	public abstract Set<T> findAll();
	public abstract void update(int id , T newT);
	public abstract void delete(int id);
	public abstract  <T>T findById(int id);
	public abstract void create(T newT);
	
}
