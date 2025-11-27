public class Car {                                         // 宣告公開類別 Car，代表「汽車」物件

    private int num;                                       // 私有成員變數 num，用來記錄車號（整數）
    private double gas;                                    // 私有成員變數 gas，用來記錄汽油量（小數）

    public Car() {                                         // 無參數建構子，在建立 Car 物件時自動呼叫
        num = 0;                                           // 將車號預設為 0（想改預設值可改這裡）
        gas = 0.0;                                         // 將汽油量預設為 0.0（想改預設值可改這裡）
        System.out.println("已生產了汽車");                 // 在主控台印出訊息表示汽車物件已建立
    }                                                      // Car 建構子結束

    public void setCar(int n, double g) throws CarException { // 宣告 setCar 方法，並標示此方法可能拋出 CarException

        if (g < 0) {                                       // 如果傳入的汽油量 g 小於 0（不合理的值）
            throw new CarException();                      // 直接建立一個 CarException 物件並拋出，交給呼叫端處理
        } else {                                           // 否則（汽油量 g 合理）
            num = n;                                       // 將傳入的車號 n 指定給成員變數 num
            gas = g;                                       // 將傳入的汽油量 g 指定給成員變數 gas
            System.out.println("將車號設為 " + num         // 在主控台印出設定後的車號與汽油量
                               + "，汽油量設為 " + gas);
        }                                                  // if-else 判斷結束
    }                                                      // setCar 方法結束

    public void show() {                                   // 公開方法 show，用來顯示車子目前狀態
        System.out.println("車號是 " + num);               // 印出目前的車號
        System.out.println("汽油量是 " + gas);             // 印出目前的汽油量
    }                                                      // show 方法結束
}                                                          // Car 類別定義結束
