public class CPU // outer class
{
int price;
CPU (int price)
{
this.price=price;
}
public void display()
{
System.out.println("\nCPU info");
System.out.println("CPU price is "+price);
}
class Processor /* nested class named "Processor" inside the CPU class. This nested class
will contain properties and behaviors related to the processor of the CPU. */
{
int cores;
String producer;
Processor(int cores, String producer)
{
this.cores=cores;
this.producer=producer;
}
void display()
{
System.out.println("\nProcessor info");
System.out.println("No. of Cores = "+cores);
System.out.println("Manufacturer = "+producer);
}
}
static class RAM /*nested static class named "RAM" inside the CPU class. This nested class will
contain properties & behaviors related to the RAM of the CPU.*/
{
int memory;
String producer;
RAM (int memory, String producer )
{
this.memory=memory;
this.producer=producer;
}
void display()
{
System.out.println("\nRAM info");
System.out.println("Memory = "+memory+" GB");
System.out.println("Manufacturer = "+producer);
}
}
public static void main(String[] args)
{
CPU cpuobj = new CPU(30000);
CPU.Processor probj = cpuobj.new Processor (8,"Samsung"); /*new Processor
object named "probj" using the "new" keyword with the "Processor" class. Processor is a
non-static inner class, it's instantiated using an instance of the outer class */
CPU.RAM ramobj= new CPU.RAM(8,"Intel"); /* creates a new RAM object named
"ramobj" . The syntax CPU.RAM is used because the RAM class is a nested static class.*/
cpuobj.display();
probj.display();
ramobj.display();
}
}
