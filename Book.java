ipublic class Book extends TangibleAseet{
	private String isbn;
	public Book(String name,int price,String color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	 }
	public String getlsbn(){return this.isbn;}
       }
