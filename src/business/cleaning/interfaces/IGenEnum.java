package business.cleaning.interfaces;

public interface IGenEnum<E> {

	public E getUndefined() ;

	public E valOf(String key) ;
}
