class Sample6_8 {                                           // 定義 Sample6_8 類別，主程式所在的類別

    public static void main(String[] args) {                // main 方法：程式進入點

        Company cmp = new Company();                        // 建立一個 Company 物件 cmp，代表共用的公司帳戶

        Driver drv1 = new Driver(cmp);                      // 建立第一位司機執行緒 drv1，傳入同一個公司物件
        drv1.start();                                       // 啟動 drv1 執行緒

        Driver drv2 = new Driver(cmp);                      // 建立第二位司機執行緒 drv2，一樣使用同一個公司物件
        drv2.start();                                       // 啟動 drv2 執行緒
    }                                                       // main 方法結束
}                                                           // Sample6_8 類別定義結束


class Company {                                             // 定義 Company 類別，管理合計金額

    private int sum = 0;                                    // 成員變數 sum，紀錄目前公司總金額，初始為 0

    public synchronized void add(int a) {                   // 同步化方法 add，一次只允許一個執行緒進入

        int tmp = sum;                                      // 先把目前合計金額存到暫存變數 tmp
        System.out.println("目前的合計金額是 " + tmp + " 元"); // 顯示目前金額
        System.out.println("賺到 " + a + " 元了");           // 顯示這次賺到多少

        tmp = tmp + a;                                      // 將本次賺到的金額加到 tmp
        System.out.println("合計金額更新為 " + tmp + " 元");  // 顯示更新後的合計金額

        sum = tmp;                                          // 把新的金額寫回成員變數 sum
    }                                                       // add 方法結束
}                                                           // Company 類別定義結束


class Driver extends Thread {                               // 定義 Driver 類別，繼承 Thread，代表一位司機執行緒

    private Company comp;                                   // 成員變數 comp，指向共用的 Company 物件

    public Driver(Company c) {                              // 建構子，接收一個 Company 物件參數 c
        comp = c;                                           // 把參數 c 存到成員變數 comp
    }                                                       // 建構子結束

    @Override                                               // 覆寫 Thread 的 run 方法
    public void run() {                                     // run：司機執行緒被啟動後要做的事
        for (int i = 0; i < 3; i++) {                       // 迴圈跑 3 次，模擬賺錢 3 次
            comp.add(50);                                   // 每次呼叫 add(50)，表示這次賺 50 元
        }                                                   // for 迴圈結束
    }                                                       // run 方法結束
}                                                           // Driver 類別定義結束
