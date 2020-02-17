package tree;

public interface PositionList<E> {
	public int size();
	
	public boolean isEmpty();
	
	public Position<E> first();
	
	public Position<E> last();
	
	public Position<E> next(Position<E> p)
		throws InvalidPositionException, BoundraryViolationException;
	
	public Position<E> prev(Position<E> p)
			throws InvalidPositionException, BoundraryViolationException;
	
	
}
