class addOverloading {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        addOverloading calc = new addOverloading();
        System.out.println(calc.add(5, 3));          
        System.out.println(calc.add(5.5, 3.3));      
        System.out.println(calc.add("Hello", "World"));  
    }
}
