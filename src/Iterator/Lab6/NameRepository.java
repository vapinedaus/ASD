package Iterator.Lab6;

//Concrete Aggregate
public class NameRepository implements IContainer {

	public String names[][] = { { "Robert", "Downy" }, { "-", "-" }, { "Victor", "Pineda" }, { "Mark", "Yu" } };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {

			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {

			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

		@Override
		public Functor item(String[] i) {
			
		  return new Functor()
				  {

					@Override
					public boolean isNotBlank() {
						// TODO Auto-generated method stub
						if (!i[0].equals("-") && !i[1].equals("-"))
						{
						  return true;
						}
						return false;
					}
			  
				  };
			
		}

		
	}

}
