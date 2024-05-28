public class MylinkedListQueue<T> {
    private Node head;
    private Node tail;

    public MylinkedListQueue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(T key) {
//        khởi tạo 1 Node giá trị là key
        Node temp = new Node(key);
//        thêm 1 node khi chưa có node nào
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
//        them 1 node vào sau node cuối cùng và gán nút cuối cùng là nút vừa thêm
        this.tail.next = temp;
        this.tail = temp;
    }


    public Node dequeue() {
//        xét trường hợp không có Node nào
        if (this.head == null)
            return null;
//        Xóa bằng cách đổi vị trí đầu lên trước biến temp
        Node temp = this.head;
        this.head = this.head.next;
//        xét trường hợp Node ở vị trí cuối cùng
        if (this.head == null)
            this.tail = null;

        return temp;
    }
}
