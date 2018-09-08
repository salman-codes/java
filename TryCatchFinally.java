class TryCatchFinally {
	public static void main(String []args){
		try{
			int a=args.length;
			int b= 5/a;
			System.out.println("a= " + a + " b= "+b);
			try{
				if(a==1)
					a=a/(a-a);
				if(a==2){
					int c[]={1,2};
					c[10]=3;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array index out of bound exception: "+a);
			}
		}catch(ArithmeticException e){
			System.out.println("Divided by 0: "+e);
		}catch(Exception e){
			System.out.println("ERROR!!!!");
		}finally {
			System.out.println("FINALLY BLOCK......");
		}
	}
}