/**
 * Created by Administrator on 2014-08-17.
 */
import org.junit.Test;
public class TestOrder {
    /*public static void main(String[] args){
        Integer[] nums = {2,1,5,7,3,6,4,0};
        NumOrder numOrder = new NumOrder();
        Integer[] orderNums = numOrder.setOrder(nums);
        for(Integer s:orderNums){
            System.out.println(s);
        }
    }*/

    @Test
    public  void  getOrder(){
        Integer[] nums = {2,1,5,7,3,6,4,0};
        NumOrder numOrder = new NumOrder();
        Integer[] orderNums = numOrder.setOrder(nums);
        for(Integer s:orderNums){
            System.out.println(s);
        }
        System.out.println("远程有更新！");
    }
}
