package staticvariable;

public class TestDriveWay {

	public static void main(String[] args) {
		DriveWay kiran = new DriveWay();
		kiran.driveWaySize = 9;
		System.out.println(kiran.driveWaySize);
		
		DriveWay tofael = new DriveWay();
		tofael.driveWaySize = 13;
		
		System.out.println(kiran.driveWaySize);
		System.out.println(tofael.driveWaySize);
	}
}