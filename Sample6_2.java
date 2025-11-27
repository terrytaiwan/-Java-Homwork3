class Sample6_2 {                                            // 定義類別 Sample6_2，這支檔案的主類別

    public static void main(String[] args) {                 // main 方法：Java 程式進入點

        Car car1 = new Car("1號車");                         // 建立第一個 Car 執行緒物件 car1，名稱為「1號車」
        car1.start();                                        // 啟動 car1 執行緒（JVM 會去呼叫 car1.run()）

        Car car2 = new Car("2號車");                         // 建立第二個 Car 執行緒物件 car2，名稱為「2號車」
        car2.start();                                        // 啟動 car2 執行緒

        for (int i = 0; i < 5; i++) {                        // 在 main 執行緒裡也跑 5 次迴圈
            System.out.println("正在進行 main() 的處理工作");  // 每次印出 main 執行緒正在處理的訊息
        }                                                     // for 迴圈結束
    }                                                         // main 方法結束
}                                                             // Sample6_2 類別定義結束

class Car extends Thread {                                    // 定義 Car 類別並繼承 Thread，代表這是一個執行緒類別

    private String name;                                      // 用來記錄這台車（執行緒）的名稱

    public Car(String nm) {                                   // 建構子：建立 Car 物件時傳入名稱 nm
        name = nm;                                            // 把參數 nm 存到成員變數 name
    }                                                         // 建構子結束

    @Override                                                 // 標示此方法覆寫自父類別 Thread 的 run()
    public void run() {                                       // run 方法：執行緒啟動後實際執行的內容
        for (int i = 0; i < 5; i++) {                         // 跑 5 次迴圈
            System.out.println("正在進行 " + name + " 的處理工作"); // 每次印出是哪一台車正在工作
        }                                                     // for 迴圈結束
    }                                                         // run 方法結束
}                                                             // Car 類別定義結束
