package chapter2;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods goods = new Goods();
//		goods.setName("nikon");
//		goods.setPrice(2000);
//		goods.setCountStock(20);
//		goods.setCountSold(20);
		Goods goods = new Goods("nikon", 2000, 20, 20);
		
		goods.showInfo();
		System.out.println(goods.calcDiscountPrice(0.4f));
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		System.out.println(Goods.countOfGoods);		
	}

}
