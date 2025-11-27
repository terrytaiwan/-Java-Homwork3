class Sample6_7 {                                                   // 宣告範例類別 Sample6_7，放主程式 main

    public static void main(String[] args) {                        // main 方法：Java 程式進入點
        Company cmp = new Company();                                // 建立一個 Company 物件 cmp，代表同一家公司（共享的帳戶）

        Driver drv1 = new Driver(cmp);                              // 建立第一位駕駛執行緒 drv1，並把公司物件傳進去
        drv1.start();                                               // 啟動 drv1 執行緒，開始在背景執行其 run() 方法

        Driver drv2 = new Driver(cmp);                              // 建立第二位駕駛執行緒 drv2，同樣使用同一個公司物件
        drv2.start();                                               // 啟動 drv2 執行緒，兩個駕駛會同時對公司雇入金額
    }                                                               // main 方法結束

}                                                                   // Sample6_7 類別定義結束


class Company {                                                     // 宣告 Company 類別，負責管理公司雇入金額

    private int sum = 0;                                            // 私有成員變數 sum，紀錄目前累積的合計金額，初值為 0

    // 加上 synchronized 關鍵字，確保同一時間只有一個執行緒可以進入此方法，避免同時修改 sum 造成錯誤
    public synchronized void add(int a) {                           // 公開方法 add：雇入金額 a 並更新合計金額
        int tmp = sum;                                              // 先把目前的合計金額 sum 存到區域變數 tmp 中
        System.out.println("目前的合計金額是 " + tmp + " 元。");      // 顯示呼叫 add 前的合計金額
        System.out.println("賺到 " + a + " 元了。");                 // 顯示這次增加的金額 a
        tmp = tmp + a;                                              // 將本次賺到的金額加到 tmp，得到新的合計金額
        System.out.println("合計金額更新為 " + tmp + " 元。");        // 顯示更新後的合計金額
        sum = tmp;                                                  // 再把 tmp 指回成員變數 sum，真正更新公司帳戶
    }                                                               // add 方法結束

}                                                                   // Company 類別定義結束


class Driver extends Thread {                                       // 宣告 Driver 類別，繼承 Thread，代表一位駕駛（執行緒）

    private Company comp;                                           // 私有成員變數 comp，指向這位駕駛所服務的公司物件

    public Driver(Company c) {                                      // 建構子，接收一個 Company 物件參數 c
        this.comp = c;                                              // 將傳入的公司物件存到成員變數 comp（this 用來區分成員與參數）
    }                                                               // 建構子結束

    @Override                                                       // 標示此方法是覆寫父類別 Thread 的 run() 方法
    public void run() {                                             // run 方法：啟動執行緒後要做的工作寫在這裡
        for (int i = 0; i < 3; i++) {                               // 用 for 迴圈重複 3 次，模擬駕駛三次雇入金額
            comp.add(50);                                           // 每一次呼叫公司物件的 add(50)，表示這次賺到 50 元
        }                                                           // for 迴圈結束
    }                                                               // run 方法結束

}                                                                   // Driver 類別定義結束
