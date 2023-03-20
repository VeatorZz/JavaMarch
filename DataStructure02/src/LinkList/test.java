package LinkList;

public class test {
    public static void main(String[] args) {
        MysingleList mysingleList=new MysingleList();
        mysingleList.creatlist();
        mysingleList.display();
        mysingleList.contains(34);
//        System.out.println(mysingleList.contains(23));
//        System.out.println();
//        System.out.println(mysingleList.size());
//        mysingleList.addFirst(99);
//        mysingleList.display();
        mysingleList.addLast(5623);
        mysingleList.display();
        mysingleList.addIndex(1,5614156);
        mysingleList.display();
        mysingleList.remove(12);
        mysingleList.display();
    }
}
