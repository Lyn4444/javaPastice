public class MonteCarloSimulation {
    public static void main(String[] args) {
        int num_1 = 0 , num_2 = 0;
        double probability;

        for(int i = 0 ; i < 1000000 ; i ++){
            double x = Math.random() * 4;
            double y = Math.random() * 4;

            if(x < 2)
                num_1 ++;
            if(x >= 2 && x < 4 && (x + y <= 6) && y >= 2)
                num_2 ++;

        }
        probability = (num_1 + num_2) / 1000000.0;

        System.out.println(probability);
    }
}
