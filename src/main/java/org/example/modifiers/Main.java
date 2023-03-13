package org.example.modifiers;

import org.example.modifiers.private_package.PrivatePackage;
import org.example.modifiers.protected_.ProtectedParent;

public class Main {

    //  public | protected | private-package | private
    //  public | protected |                 | private

    public static void main(String[] args) {
        Public p1 = new Public();
        p1.aMethod();
        int someInt = p1.someInt;
        Public.PublicInnerClass publicInnerClass = new Public.PublicInnerClass();

        ProtectedParent protectedParent = new ProtectedParent();
//        protectedParent.protectedMethod();    //  это невозможно

        PrivatePackage privatePackage = new PrivatePackage();
//        privatePackage.privatePackageMethod();

        Private privateObject = new Private();
//        privateObject.privateMethod();
//        privateObject.someInt;
//        Private.PrivateInnerClass privateInnerClass = new Private.PrivateInnerClass();
    }
}
