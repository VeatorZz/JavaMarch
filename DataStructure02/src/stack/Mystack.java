package stack;

import java.util.Arrays;


    public class Mystack{
        public  int[] elem ;
        public  int usedSize;
        public Mystack() {
            this.elem =new int[5];
        }

        public void push(int val){
            if(isFull()) {
                this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
            }
            this.elem[this.usedSize] =val;
            this.usedSize++;
        }

        public  boolean isFull(){
            return usedSize== elem.length;
        }

        public boolean empty(){
            return usedSize==0;
        }

        public int pop(){
            if(empty()) throw new RuntimeException("栈为空");
            int ret =elem[usedSize-1];
            usedSize--;
            return ret;
        }

        public int peek(){
            if(empty()) throw new RuntimeException();
            return elem[usedSize-1];
        }

    }

