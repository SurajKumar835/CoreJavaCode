package suraj_pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookPriceDetails {

	public static void main(String[] args) {
		List<BookPrice> l=new ArrayList<BookPrice>();
		l.add(new BookPrice(200,"Daniel"));
		l.add(new BookPrice(100,"jesus"));
		List<BookPrice> al=new ArrayList<BookPrice>();
		al.add(new BookPrice(150,"st. paul"));
		al.add(new BookPrice(130,"Rating"));
		List<List<BookPrice>> l2=new ArrayList<List<BookPrice>> ();
		l2.add(al);
		l2.add(l);
		for(List<BookPrice> t:l2)
		{
			for(BookPrice te: t)
			{
				System.out.println(te.getName()+":"+te.getPrice());
			}
		}
		//use flatmap()
		List<BookPrice> lb = l2.stream().flatMap(n->n.stream()).filter(n->n.getPrice()<150).collect(Collectors.toList());
		for(BookPrice bp:lb) {
			System.out.println(bp.getName()+":"+bp.getPrice());
		}
	}

}
