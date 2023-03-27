import java.util.*;
class Analysis {
    public static void main(String args[]) throws Exception {
        List<Dat> sales22 = new ArrayList<>();
        sales22.add(new Dat("Tea", 120));
        sales22.add(new Dat("Coffee", 230));
        sales22.add(new Dat("Green Tea", 60));
        sales22.add(new Dat("Orange Soda", 210));
        sales22.add(new Dat("Lemon soda", 205));

        List<Dat> sales21 = new ArrayList<>();
        sales21.add(new Dat("Tea", 100));
        sales21.add(new Dat("Coffee", 250));
        sales21.add(new Dat("Green Tea", 50));
        sales21.add(new Dat("Orange Soda", 180));
        sales21.add(new Dat("Lemon soda", 220));

        List<Dat> variances = new ArrayList<>();
        List<Dat> variancePcts= new ArrayList<>();
	
	for (int i = 0; i < sales22.size(); i++) {
            variances.add(sales21.get(i).getvalue() - sales22.get(i).getvalue());
        }
        System.out.println(variances);

        for (int j = 0; j < sales22.size(); j++) {
            variancePcts.add(Math.abs(variances.get(j) / sales22.get(j).getvalue()) * 100);
        }
        System.out.println(variancePcts);
    }
}