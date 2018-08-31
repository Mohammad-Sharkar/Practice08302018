package staticvariable;

public class TestDriveWay2 {

	public static void main(String[] args) {
		DriveWay2 rifat = new DriveWay2();
		rifat.driveWaySize = 15;
		System.out.println(rifat.driveWaySize);
		
		DriveWay2 shams = new DriveWay2();
		shams.driveWaySize = 19;
		System.out.println(shams.driveWaySize);
	
		System.out.println(rifat.driveWaySize);
	}
}
