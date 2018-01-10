import java.io.File;
public class DriveSpace{
	public static void main(String... args){
		File[] roots=File.listRoots();
		long I=1024*1024*1024;
		for(int i=0; i<roots.length; i++){
			System.out.println(roots[i]);
			System.out.println(roots[i].getFreeSpace()/I);
			System.out.println(roots[i].getUsableSpace()/I);
			System.out.println(roots[i].getTotalSpace()/I);
		}
	}	
}
