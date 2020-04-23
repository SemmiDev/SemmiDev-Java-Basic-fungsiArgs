public class Main {
    public static void main(String[] args) {
    //     System.out.println("Argumen yg diberikan: ");
    //     for(int i = 0; i < args.length; i++){
    //         System.out.println(args[i]);
    //     }
    // }



	if(args.length > 0){
		switch(args[0]){
			case "version":
				System.out.println("SamDev Version 1.1.1");
				break;
			case "help":
				System.out.println("GUNAKAN PERINTAH BERIKUT:");
				System.out.println("Main version \t\t untuk mengecek veri");
				System.out.println("Main help \t\t untuk menampilkan bantuan ini");
				System.out.println("Main hello \t\t untuk menampilkan pesan hello world");
				System.out.println("Main hello  [nama] \t\t untuk menampilkan hello world [nama]");
				break;
			case "hello":
				if(args.length > 1) {
					System.out.println("Hello " + args[1]);
				}else{
					System.out.println("Hello World");
				}
				break;
			default:
				System.out.println("Argumen tidak dikenali");	
			}
		}
	}
}
