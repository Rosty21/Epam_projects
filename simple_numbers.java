public class MyClass {
    public static void main(String args[]) {
        int num, dil; //num - число яке розглядаємо; dil - кільк дільників 
        for (num = 1; num <= 199; num++){
            dil = 0;
            for (int i = 1; i <= num; i++){
                if (num % i == 0){
                    dil++;
                }  
            }
            if (dil == 2){ //оскільки просте число ділиться на 1 і на самого себе, тому умова про 2 дільника
                System.out.print(num + " ");
            }
        }
    }
}
