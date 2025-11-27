class Sample6_1 {                                         // 宣告類別 Sample6_1，作為這個範例程式的主類別

    public static void main(String[] args) {              // Java 程式進入點 main() 方法，程式由此開始執行
        Car car1 = new Car("1號車");                      // 建立一個 Car 物件 car1，並傳入字串 "1號車" 作為車名
        car1.start();                                     // 呼叫 start() 啟動 car1 執行緒，系統會在背景呼叫 car1.run()

        for (int i = 0; i < 5; i++) {                     // 使用 for 迴圈，讓主執行緒的工作重複執行 5 次
            System.out.println("正在進行 main() 的處理工作"); // 在主控台輸出訊息，表示目前是 main 執行緒在作業
        }                                                 // 結束 for 迴圈區塊
    }                                                     // 結束 main() 方法區塊

}                                                         // 結束 Sample6_1 類別定義

class Car extends Thread {                                // 宣告類別 Car，並繼承 Thread 類別，代表 Car 也是一個執行緒

    private String name;                                  // 宣告私有成員變數 name，用來儲存這個執行緒（車）的名稱

    public Car(String nm) {                               // 建構子，接收一個字串參數 nm，建立 Car 物件時會被呼叫
        this.name = nm;                                   // 將參數 nm 指派給成員變數 name，使用 this 區分成員與參數
    }                                                     // 結束建構子區塊

    @Override                                             // 標註這個方法覆寫（override）了父類別 Thread 的 run() 方法
    public void run() {                                   // run() 方法：執行緒啟動後實際要執行的程式碼寫在這裡
        for (int i = 0; i < 5; i++) {                     // 使用 for 迴圈，讓這個執行緒的工作重複執行 5 次
            System.out.println("正在進行 " + name + " 的處理工作"); // 在主控台輸出目前是哪一台車（哪一個執行緒）在處理工作
        }                                                 // 結束 for 迴圈區塊
    }                                                     // 結束 run() 方法區塊

}                                                         // 結束 Car 類別定義
