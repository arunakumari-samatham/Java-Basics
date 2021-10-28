package streams;

public class FileOutputStream1 {
          public FileOutputStream1(String string) {
		// TODO Auto-generated constructor stub
	}





		public static void main(String[] args) {
			try {
				
				FileOutputStream1 fout=new FileOutputStream1("D:\\testout.txt");    
	             String s="Welcome to javaTpoint.";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");
	             System.out.println("Welcome to javaTpoint");
	            }catch(Exception e){System.out.println(e);}    
	      }    
	
				
				
				
				
			private void write(byte[] b) {
			// TODO Auto-generated method stub
			
		}





			private void close() {
			// TODO Auto-generated method stub
			
		}





			// TODO Auto-generated method stub
			
		





			}
		

