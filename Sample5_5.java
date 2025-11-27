class Sample5_5 {                                          // 定義類別 Sample5_5，主程式所在類別

    public static void main(String[] args) {               // main 方法：程式進入點

        Car car1 = new Car();                              // 建立一個 Car 物件 car1

        try {                                              // 使用 try 包住可能拋出 CarException 的程式碼
            car1.setCar(1234, -10.0);                      // 嘗試設定車號 1234、汽油量 -10.0（會拋出 CarException）
        } catch (CarException e) {                         // 捕捉從 setCar 拋出的 CarException
            System.out.println("拋出了例外：" + e);         // 印出訊息與例外物件內容
        }                                                  // try-catch 結束

        car1.show();                                       // 呼叫 show()，觀察當發生例外時車號與汽油量是否仍為初始值
    }                                                      // main 方法結束
}                                                          // Sample5_5 類別定義結束
