package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String pre_cal;
    private Float result_cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pre_cal = new String();

        final TextView waiting = (TextView) findViewById(R.id.calculating);
        final TextView result = (TextView) findViewById(R.id.result);


        Button num0 = (Button) findViewById(R.id.num0);
        Button num1 = (Button) findViewById(R.id.num1);
        Button num2 = (Button) findViewById(R.id.num2);
        Button num3 = (Button) findViewById(R.id.num3);
        Button num4 = (Button) findViewById(R.id.num4);
        Button num5 = (Button) findViewById(R.id.num5);
        Button num6 = (Button) findViewById(R.id.num6);
        Button num7 = (Button) findViewById(R.id.num7);
        Button num8 = (Button) findViewById(R.id.num8);
        Button num9 = (Button) findViewById(R.id.num9);
        Button dot = (Button) findViewById(R.id.dot);

        Button plus = (Button) findViewById(R.id.plus);
        Button minus = (Button) findViewById(R.id.minus);
        Button multiple = (Button) findViewById(R.id.mul);
        Button divide = (Button) findViewById(R.id.div);
        Button mod = (Button) findViewById(R.id.mod);

        Button leftPare = (Button) findViewById(R.id.pare1);
        Button rightPare = (Button) findViewById(R.id.pare2);

        Button cal = (Button) findViewById(R.id.cal);

        Button clear = (Button) findViewById(R.id.eraseAll);
        Button backspace = (Button) findViewById(R.id.backspace);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "0";
                waiting.setText(pre_cal);
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "1";
                waiting.setText(pre_cal);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "2";
                waiting.setText(pre_cal);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "3";
                waiting.setText(pre_cal);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "4";
                waiting.setText(pre_cal);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "5";
                waiting.setText(pre_cal);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "6";
                waiting.setText(pre_cal);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "7";
                waiting.setText(pre_cal);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "8";
                waiting.setText(pre_cal);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "9";
                waiting.setText(pre_cal);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += ".";
                waiting.setText(pre_cal);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += " + ";
                waiting.setText(pre_cal);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += " - ";
                waiting.setText(pre_cal);
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += " X ";
                waiting.setText(pre_cal);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += " / ";
                waiting.setText(pre_cal);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += " % ";
                waiting.setText(pre_cal);
            }
        });


        leftPare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += "(";
                waiting.setText(pre_cal);
            }
        });
        rightPare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal += ")";
                waiting.setText(pre_cal);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pre_cal = "";
                result.setText("");
                waiting.setText(pre_cal);
                result_cal= 0.0f;
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pre_cal.length() > 0) {
                    pre_cal = pre_cal.substring(0, pre_cal.length() - 1);
                    waiting.setText(pre_cal);
                }
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] expression = pre_cal.split(" ");

                Float a = Float.parseFloat(expression[0]);
                String operator = expression[1];
                Float b = Float.parseFloat(expression[2]);

                if (operator.equals("+"))
                {
                    result_cal = a + b;
                    result.setText("" + result_cal);
                }
                else if (operator.equals("-"))
                {
                    result_cal = a - b;
                    result.setText("" + result_cal);
                }
                else if (operator.equals("X"))
                {
                    result_cal = a * b;
                    result.setText("" + result_cal);
                }

                else if (operator.equals("/"))
                {
                    if (b.equals(0.0f))
                    {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        result_cal = a / b;
                        result.setText("" + result_cal);
                    }
                }
                else if (operator.equals("%"))
                {
                    if (b.equals(0.0f))
                    {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        result_cal = a % b;
                        result.setText("" + result_cal);
                    }

                }
            }
        });
    }
}
/*
class MiddletoPost
{
    String postfix;

    public MiddletoPost()
    {
        postfix = new String();
    }

    public String convert(String middle)
    {




        return postfix;
    }
}

class PostfixCalculator
{

    Stack<Integer> is;

    public PostfixCalculator()
    {
        is = new Stack<Integer>();
    }

    public int evaluate(String exp)
    {
        String[] expression = exp.split(" ");

        for (int i=0;i<expression.length;i++)
        {
            String cur = expression[i];
            if (cur.equals("+"))
            {
                int operand2 = is.pop();
                int operand1 = is.pop();
                is.push(operand1 + operand2);
            }
            else if (cur.equals("-"))
            {
                int operand2 = is.pop();
                int operand1 = is.pop();
                is.push(operand1 - operand2);
            }
            else if (cur.equals("X"))
            {
                int operand2 = is.pop();
                int operand1 = is.pop();
                is.push(operand1 * operand2);
            }
            else
            {
                is.push(Integer.parseInt(cur));
            }
        }

        return is.pop();
    }
}

class Stack<T>
{

    private LinkedList<T> ll;

    public Stack()
    {
        ll = new LinkedList<T>();
    }

    public T peek()
    {
        if (ll.getSize() == 0)
            return null;
        else
            return ll.getData(ll.getSize() - 1);
    }

    public T pop()
    {
        T top;
        if (ll.getSize() == 0)
            return null;
        else
        {
            top = ll.getData(ll.getSize() - 1);
            ll.remove(ll.getSize() - 1);
            return top;
        }
    }

    public void push(T data)
    {
        ll.insert(ll.getSize(), data);
    }

    public void clear()
    {
        ll.clear();
    }

    public boolean isEmpty()
    {
        if (ll.getSize() == 0)
            return true;
        else
            return false;
    }

    public int getSize()
    {
        return ll.getSize();
    }

    public String toString()
    {
        return "";
    }
}

class LinkedList<T>
{
    private Node<T> head, tail;
    private int size;

    public LinkedList()
    {
        size = 0;
        head = null;
        tail = null;
    }

    public void insert(int index, T data)
    {
        if(index < 0 || index > size)
            return;

        Node<T> temp = new Node<T>(data);

        if(size == 0)
        {
            head = temp;
            tail = temp;
        }

        else
        {
            if(index == 0)
            {
                temp.setNext(head);
                head = temp;
            }

            else if(index == size)
            {
                tail.setNext(temp);
                tail = temp;
            }

            else
            {
                Node<T> cur = head;

                for(int i = 1; i < index; i++)
                {
                    cur = cur.getNext();
                }

                temp.setNext(cur.getNext());
                cur.setNext(temp);
            }
        }
        size++;
    }

    public void remove(int index)
    {
        if(index < 0 || index >= size)
            return;

        if(size == 1)
        {
            head = null;
            tail = null;
        }

        else
        {
            if(index == 0)
            {
                head = head.getNext();
            }

            else
            {
                Node<T> cur = head;
                for(int i = 1; i < index; i++)
                {
                    cur = cur.getNext();
                }

                cur.setNext(cur.getNext().getNext());

                if(index == size-1)
                    tail = cur;
            }
        }
        size--;
    }

    public void clear()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public T getData(int index)
    {
        if(index < 0 || index >= size)
            return null;

        Node<T> cur = head;

        for(int i = 0; i < index; i++)
        {
            cur = cur.getNext();
        }

        return cur.getData();
    }

    public int getSize()
    {
        return size;
    }

    public String toString()
    {
        String out = "";
        Node<T> cur = head;
        for(int i = 0; i < size; i++)
        {
            out += cur.toString();
            if(i != size-1)
                out += " -> ";
            cur = cur.getNext();
        }
        return out;
    }

    private class Node<T>
    {
        private Node<T> next;
        private T data;

        public Node(T data)
        {
            this.data = data;
        }

        public void setNext(Node<T> next)
        {
            this.next = next;
        }

        public void clearNext()
        {
            next = null;
        }

        public Node<T> getNext()
        {
            return next;
        }

        public T getData()
        {
            return data;
        }

        public String toString()
        {
            return data.toString();
        }
    }
}*/
