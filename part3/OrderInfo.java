class OrderInfo {
    String name;
    int quantity;

    void show(){
        System.out.println(name + "を" + quantity + "コ");
    }

    OrderInfo(String iname,int iquantity){
        name = iname;
        quantity = iquantity;
    }
}

class OrderInfoMain {
    public static void main (String[] args){
        OrderInfo o = new OrderInfo("リンゴ",10);
        o.show();
    }
}