package streams;

public class FileOutputStream {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream();    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private void write(int i) {
		// TODO Auto-generated method stub
		
	}
}
