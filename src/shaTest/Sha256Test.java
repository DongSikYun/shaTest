package shaTest;


public class Sha256Test {
	public static void main(String[] args) throws Exception {
		System.out.println(AES256Util.encrypt("KUMCDB"));
		System.out.println(AES256Util.decrypt("e3d9094187a54e485a93b9c8538d808a"));
		//ee791bcfcd8924d7b7e465eeb4cdc23ec0715254fac86f5f5ae99c0393d34dce
		//77d6a6f70eec03921c6d64217e611553788d0979e543c59530b76ba5d067b446
	}
}
