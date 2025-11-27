class Sample6_4 {                                                    // 定義類別 Sample6_4，這支檔案的主類別

    public static void main(String[] args) {                         // main 方法：程式進入點

        Car car1 = new Car("1號車");                                 // 建立 Car 執行緒物件 car1，名稱為「1號車」
        car1.start();                                                // 啟動 car1 執行緒

        for (int i = 0; i < 5; i++) {                                // 主執行緒跑 5 次迴圈
            try {                                                    // 可能會被 sleep 拋出例外，所以放在 try 裡
                Thread.sleep(1000);                                  // main 執行緒睡 1 秒（1000 毫秒）
            } catch (InterruptedException e) {                       // 捕捉睡眠期間被中斷的情況
                System.out.println("main 執行緒被中斷：" + e);       // 印出錯誤訊息
            }                                                        // try-catch 結束

            System.out.println("正在進行 main() 的處理工作");         // 睡醒後印出 main 執行緒正在處理工作的訊息
        }                                                            // for 迴圈結束
    }                                                                // main 方法結束
}                                                                    // Sample6_4 類別定義結束

class Car extends Thread {                                           // 定義 Car 類別，繼承 Thread

    private String name;                                             // 成員變數 name，記錄這台車的名稱

    public Car(String nm) {                                          // 建構子，接收車名 nm
        name = nm;                                                   // 把參數 nm 存到成員變數 name
    }                                                                // 建構子結束

    @Override                                                        // 覆寫父類別 Thread 的 run 方法
    public void run() {                                              // run：Car 執行緒啟動後實際執行的程式碼
        for (int i = 0; i < 5; i++) {                                // 跑 5 次迴圈
            try {                                                    // Car 執行緒自己的 sleep 也要放在 try 裡
                Thread.sleep(1000);                                  // 這個執行緒睡 1 秒
            } catch (InterruptedException e) {                       // 捕捉可能的中斷例外
                System.out.println(name + " 執行緒被中斷：" + e);    // 印出是哪一台車被中斷
            }                                                        // try-catch 結束

            System.out.println("正在進行 " + name + " 的處理工作");  // 每次醒來就印出這台車正在工作的訊息
        }                                                            // for 迴圈結束
    }                                                                // run 方法結束
}                                                                    // Car 類別定義結束
