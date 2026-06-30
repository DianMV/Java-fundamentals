public class Teatro {
    public double getDesc(int n, int op){
double desc=0;

switch (op){
case 1:if (n>15){desc= (23.50*n*0.02);}
break;
case 2: if (n>15){desc=(33.50*n*0.02);}
break;
case 3:if (n>15){desc= (38.50*n*0.02);}
break;
}
return desc;
}

    public void getTotal(double desc, int n, int op) {
        double total = 0;
        switch (op) {
            case 1:
                total = (23.50 * n) - desc;
                break;
            case 2:
                total = (33.50 * n) - desc;
                break;
            case 3:
                total = (37.50 * n) - desc;
                break;
        }

        System.out.printf("el descuento es %.2f y el monto total a pagar es %.2f", desc, total);

    }
}
