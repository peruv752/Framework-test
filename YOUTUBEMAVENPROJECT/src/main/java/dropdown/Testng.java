package dropdown;

import org.testng.annotations.Test;

public class Testng {
           @Test
           public void Startapp(){
	        System.out.println("starting the application");
}
  @Test (dependsOnMethods="Startapp")
public void Loginapp() {
	System.out.println("log in the application");
}
@Test  (dependsOnMethods="Logoutapp")
public void Logoutapp (){
	System.out.println("Logging out of the application");
}
}
