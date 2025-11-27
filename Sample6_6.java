class Sample6_6 {                                              // 定義類別 Sample6_6，主程式所在的類別

    public static void main(String[] args) {                   // main 方法：程式進入點

        Car car1 = new Car("1號車");                           // 建立一個 Car 物件 car1（這個類別實作 Runnable）

        Thread th1 = new Thread(car1);                         // 用 car1 當作 Runnable，建立 Thread 物件 th1
        th1.start();                                           // 啟動 th1 執行緒，JVM 會呼叫 car1.run()

        for (int i = 0; i < 5; i++) {                          // main 執行緒一樣跑 5 次迴圈
            System.out.println("正在進行 main() 的處理工作");   // 每次迴圈印出 main 的工作
        }                                                       // for 迴圈結束
    }                                                           // main 方法結束
}                                                               // Sample6_6 類別定義結束

class Car implements Runnable {                                 // 定義 Car 類別，實作 Runnable 介面

    private String name;                                       // 成員變數 name，用來記錄這台車的名稱

    public Car(String nm) {                                    // 建構子，接收一個名稱字串 nm
        name = nm;                                             // 把 nm 存到成員變數 name
    }                                                          // 建構子結束

    @Override                                                  // 標示這個 run() 是實作自 Runnable 介面
    public void run() {                                        // run 方法：Thread 會呼叫這裡的程式碼
        for (int i = 0; i < 5; i++) {                          // 跑 5 次迴圈
            System.out.println("正在進行 " + name + " 的處理"); // 每次迴圈印出是哪一台車在處理工作
        }                                                      // for 迴圈結束
    }                                                          // run 方法結束
}                                                              // Car 類別定義結束
