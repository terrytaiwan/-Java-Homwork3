class Sample6_3 {                                                     // 宣告類別 Sample6_3，這個檔案的主程式類別

    public static void main(String[] args) {                          // main 方法：Java 程式進入點，程式從這裡開始執行
        Car car1 = new Car("1號車");                                  // 建立一個 Car 執行緒物件 car1，名稱設定為「1號車」
        car1.start();                                                 // 呼叫 start() 啟動 car1 執行緒，系統會在背景呼叫其 run() 方法

        for (int i = 0; i < 5; i++) {                                 // 使用 for 迴圈，讓主執行緒的工作重複執行 5 次
            System.out.println("正在進行 main() 的處理工作");          // 顯示目前是 main 執行緒在工作（和 Car 執行緒同時進行）
        }                                                             // 結束主執行緒的 for 迴圈
    }                                                                 // 結束 main 方法區塊

}                                                                     // 結束 Sample6_3 類別定義


class Car extends Thread {                                            // 宣告類別 Car，繼承 Thread，代表這是一個可執行的執行緒類別

    private String name;                                              // 私有成員變數 name，用來記錄這個執行緒（車）的名稱

    public Car(String nm) {                                           // 建構子，接收一個字串參數 nm，建立 Car 物件時會被呼叫
        this.name = nm;                                               // 將傳入的參數 nm 指派給成員變數 name（this 用來區分成員與參數）
    }                                                                 // 結束建構子區塊

    @Override                                                         // 標註這個方法是覆寫（override）自父類別 Thread 的 run() 方法
    public void run() {                                               // run 方法：執行緒啟動後實際要執行的程式碼寫在這裡
        for (int i = 0; i < 5; i++) {                                 // 使用 for 迴圈，讓此執行緒的工作重複執行 5 次
            try {                                                     // try 區塊：放可能會丟出 InterruptedException 的程式碼
                Thread.sleep(1000);                                   // 讓目前這個執行緒暫停 1000 毫秒（1 秒），製造出延遲效果
                System.out.println("正在進行 " + name + " 的處理工作"); // 每停 1 秒就輸出一次訊息，表示這台車正在處理工作
            } catch (InterruptedException e) {                        // catch 區塊：捕捉 sleep 可能拋出的 InterruptedException 例外
                System.out.println(name + " 的執行緒被中斷了："         // 如果執行緒在睡眠期間被中斷，就顯示錯誤訊息
                                   + e.getMessage());                 // 把例外物件的訊息印出來，方便除錯
            }                                                         // 結束 catch 區塊
        }                                                             // 結束 for 迴圈區塊
    }                                                                 // 結束 run 方法區塊

}                                                                     // 結束 Car 類別定義
