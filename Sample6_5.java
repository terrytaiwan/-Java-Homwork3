class Sample6_5 {                                           // 範例類別 Sample6_5，負責啟動與控制執行緒

    public static void main(String[] args) {                // main 方法：Java 程式進入點
        Car car1 = new Car("1號車");                        // 建立一個 Car 執行緒物件，名稱設定為「1號車」
        car1.start();                                       // 呼叫 start() 啟動 car1 執行緒，系統會在背景呼叫 car1.run()

        try {                                               // 使用 try 區塊包住可能拋出例外的程式碼
            car1.join();                                    // 呼叫 join()，讓目前的主執行緒等待 car1 執行緒結束後才往下執行
        } catch (InterruptedException e) {                  // 捕捉 join() 可能拋出的 InterruptedException 例外
            System.out.println("等待 car1 時執行緒被中斷："    // 印出訊息說明主執行緒等待時被中斷
                               + e.getMessage());           // 顯示例外物件的詳細訊息，方便除錯
        }                                                   // 結束 catch 區塊

        System.out.println("結束 main() 的處理工作。");       // 當 car1 執行緒結束後，才會印出這行，表示主程式收尾完成
    }                                                       // 結束 main 方法

}                                                           // 結束 Sample6_5 類別定義


class Car extends Thread {                                  // 宣告類別 Car，繼承 Thread，代表這是一個可獨立執行的執行緒

    private String name;                                    // 私有成員變數 name，用來儲存這個執行緒（車）的名稱

    public Car(String nm) {                                 // 建構子，接收一個字串參數 nm，建立 Car 物件時會被呼叫
        this.name = nm;                                     // 將傳入的參數 nm 指派給成員變數 name（this 用來區分成員與參數）
    }                                                       // 結束建構子區塊

    @Override                                               // 標註此方法覆寫（override）自 Thread 類別的 run() 方法
    public void run() {                                     // run 方法：Car 執行緒啟動後實際要執行的程式碼寫在這裡
        for (int i = 0; i < 5; i++) {                       // 使用 for 迴圈，讓這個執行緒的工作重複執行 5 次
            System.out.println("正在進行 " + name           // 每次迴圈時印出目前是哪一台車在處理工作
                               + " 的處理工作");            // 將 name 串接到訊息中，方便分辨是哪一個執行緒
        }                                                   // 結束 for 迴圈區塊
    }                                                       // 結束 run 方法區塊

}                                                           // 結束 Car 類別定義
