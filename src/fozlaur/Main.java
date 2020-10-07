package fozlaur;

import outside.outPackage;
import outside.outPackageExtendsInPackage;

public class Main {

    public static void main(String[] args) {
        //Commented lines will cause errors
        System.out.println("Accessing variables from class in same package");
        inPackage ip = new inPackage();
        System.out.println("Default Variable: "+ip.defaultNum);
        System.out.println("Public Variable: "+ip.publicNum);
        //System.out.println("Private Variable: "+ip.privateNum);
        System.out.println("Protected Variable: "+ip.protectedNum);
        System.out.println();

        System.out.println("Accessing variables from class in another package");
        outPackage op = new outPackage();
        //System.out.println("Default Variable: "+op.defaultNum);
        System.out.println("Public Variable: "+op.publicNum);
        //System.out.println("Private Variable: "+op.privateNum);
        //System.out.println("Protected Variable: "+op.protectedNum);
        System.out.println();

        System.out.println("Accessing variables from class in another package but extends a class from the same package");
        outPackageExtendsInPackage opeip = new outPackageExtendsInPackage();
        //System.out.println("Default Variable: "+opeip.defaultNum);
        System.out.println("Public Variable: "+opeip.publicNum);
        //System.out.println("Private Variable: "+opeip.privateNum);
        System.out.println("Protected Variable: "+opeip.protectedNum);
        System.out.println();

        System.out.println("Accessing private variables via public function");
        System.out.println("Private Variable (outside package): "+op.getPrivateNum());
        System.out.println("Private Variable (same package): "+ip.getPrivateNum());
        System.out.println("Private Variable (outside package but extends inPackage): "+opeip.getPrivateNum());
    }
}
