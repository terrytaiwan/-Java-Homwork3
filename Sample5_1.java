class Sample5_1 {                                             // 定義類別 Sample5_1，程式的主類別
    public static void main(String[] args) {                  // main 方法：Java 程式的進入點

        int[] test;                                           // 宣告 int 陣列變數 test（目前尚未配置記憶體）
        test = new int[5];                                    // 建立一個長度為 5 的 int 陣列並指定給 test（索引 0~4）

        System.out.println("準備將 80 指定給 test[10]");       // 提示訊息：即將把 80 塞進 test[10]

        test[10] = 80;                                       // 直接對 test[10] 指派值，因為超出範圍會拋出例外

        System.out.println("這行實際上不會被執行到");          // 一旦上面那行丟例外，這行就不會被執行（示意用）
    }                                                         // main 方法結束
}                                                             // 類別 Sample5_1 結束
