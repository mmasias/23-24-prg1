class Cosas {
    public static void main(String[] args) {

        int unaVariable = 10;
        int otraVariable = 5;

        System.out.println(unaVariable);

        {
            int unaVariableMas = 15 + unaVariable;
            System.out.println("A ver si funciona?");
            System.out.println(unaVariableMas);
        }
        int unaVariableMas;
        unaVariableMas = 10;
        System.out.println(unaVariableMas);

        unaVariable++;
        otraVariable = unaVariable * 2;
        System.out.println(otraVariable);
    }
}