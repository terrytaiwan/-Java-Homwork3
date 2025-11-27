class Sample5_3 {                                              // 定義類別 Sample5_3

    public static void main(String[] args) {                   // main 方法：程式進入點

        try {                                                  // try 區塊：放可能丟出例外的程式碼

            int[] test = new int[5];                           // 在 try 裡建立一個長度為 5 的 int 陣列 test
            System.out.println("準備將 80 指定給 test[10]");   // 提示接下來要對 test[10] 指派

            test[10] = 80;                                    // 對 test[10] 指派，因超出索引範圍會丟出例外

            System.out.println("成功將 80 指定給 test[10]");   // 若沒例外才會執行這行（實務上不會跑到）
        } catch (ArrayIndexOutOfBoundsException e) {           // 捕捉陣列索引超出範圍的例外

            System.out.println("超過陣列的範圍了！");             // 顯示簡單錯誤訊息
        } finally {                                            // finally 區塊：不管有沒有例外都一定會執行

            System.out.println("finally：一定會做的收尾動作");    // 顯示 finally 一定會執行
        }                                                      // try-catch-finally 結束

        System.out.println("順利地執行完畢");                    // 表示程式有好好跑到最後
    }                                                          // main 方法結束
}                                                              // 類別 Sample5_3 結束
