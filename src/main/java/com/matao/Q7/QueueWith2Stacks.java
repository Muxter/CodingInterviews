package com.matao.Q7;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * <p>
 * Author: matao
 */
public class QueueWith2Stacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void enqueque(int node) {
        stack1.push(node);
    }

    public int dequeue() {
//        if (!stack2.isEmpty()) {
//            return stack2.pop();
//        } else {
//            while(!stack1.isEmpty()) {
//                stack2.push(stack1.pop());
//            }
//            return stack2.pop();
//        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueWith2Stacks q = new QueueWith2Stacks();
        q.enqueque(2);
        q.enqueque(3);
        q.enqueque(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueque(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}