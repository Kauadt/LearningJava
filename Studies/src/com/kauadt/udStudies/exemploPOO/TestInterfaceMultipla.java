interface Interface1{
	void metodo1();
}

interface Interface2{
	void metodo2();
}

// Interface3 estende Interface 1 e 2
/*interface Interface3 extends Interface1, Interface2{
	void metodo3();
} */


abstract class ClassExemplo implements Interface1, Interface2{
	public void metodo1(){
		System.out.println("Método 1");
	}

	public void metodo2(){
		System.out.println("Método 2");
	}

	/*public void metodo3(){
		System.out.println("Método 3");
	}*/

}


public class TestInterfaceMultipla extends ClassExemplo{

	public static void main(String[] args) {
		TestInterfaceMultipla test = new TestInterfaceMultipla();
		test.metodo1();
		test.metodo2();
	}
}