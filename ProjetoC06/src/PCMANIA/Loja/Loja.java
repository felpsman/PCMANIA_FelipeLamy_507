package PCMANIA.Loja;
import PCMANIA.COMPUTADOR.Computador;
import PCMANIA.COMPUTADOR.HardwareBasico;
import PCMANIA.COMPUTADOR.SistemaOperacional;
import PCMANIA.COMPUTADOR.MemoriaUsb;
public class Loja {
    //Classe para colocar os valores estaticos dos parametros
    public static Computador oferta1(float matricula) {
        Computador pc1 = new Computador("Apple", matricula);
        pc1.hardwareBasicos[0] = new HardwareBasico("Pentium Core i3", 2200);
        pc1.hardwareBasicos[1] = new HardwareBasico("Memoria RAM", 8);
        pc1.hardwareBasicos[2] = new HardwareBasico("HD", 500);
        pc1.SistOp = new SistemaOperacional("Windows 8",64);
        pc1.addMemoriaUSB(new MemoriaUsb("Pen-Drive",32));
        return pc1;
    }
    public static Computador oferta2(float matricula) {
        Computador pc2 = new Computador("Samsung", matricula+1234);
        pc2.hardwareBasicos[0] = new HardwareBasico("Pentium Core i3", 2200);
        pc2.hardwareBasicos[1] = new HardwareBasico("Memoria RAM", 15);
        pc2.hardwareBasicos[2] = new HardwareBasico("HD", 1);
        pc2.SistOp = new SistemaOperacional("MacOS Sequoia",64);
        pc2.addMemoriaUSB(new MemoriaUsb("Pen-Drive",32));
        return pc2;
    }
    public static Computador oferta3(float matricula) {
        Computador pc3 = new Computador("Dell", matricula+5678);
        pc3.hardwareBasicos[0] = new HardwareBasico("Pentium Core i7", 4500);
        pc3.hardwareBasicos[1] = new HardwareBasico("Memoria RAM", 32);
        pc3.hardwareBasicos[2] = new HardwareBasico("HD", 2);
        pc3.SistOp = new SistemaOperacional("Windows 10",64);
        pc3.addMemoriaUSB(new MemoriaUsb("Pen-Drive",32));
        return pc3;
    }

}
