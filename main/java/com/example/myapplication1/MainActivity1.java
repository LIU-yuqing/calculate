package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Stack;


public class MainActivity1 extends AppCompatActivity {
    EditText input;
    TextView _drg;
    Button div;
    Button mul;
    Button sub;
    Button add;
    Button equal;
    Button sin;
    Button cos;
    Button log;
    Button square;
    Button left;
    Button right;
    Button dot;
    Button drg;
    Button c;
    Button Switch_button;
    Button del;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Stack<Double> numberStack = null;
    Stack<Character> symbolStack = null;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.input = (EditText)findViewById(R.id.input);
        this._drg = (TextView)findViewById(R.id._drg);
        this.btn0 = (Button)findViewById(R.id.zero);
        this.btn1 = (Button)findViewById(R.id.one);
        this.btn2 = (Button)findViewById(R.id.two);
        this.btn3 = (Button)findViewById(R.id.three);
        this.btn4 = (Button)findViewById(R.id.four);
        this.btn5 = (Button)findViewById(R.id.five);
        this.btn6 = (Button)findViewById(R.id.six);
        this.btn7 = (Button)findViewById(R.id.seven);
        this.btn8 = (Button)findViewById(R.id.eight);
        this.btn9 = (Button)findViewById(R.id.nine);
        this.div = (Button)findViewById(R.id.divide);
        this.mul = (Button)findViewById(R.id.mul);
        this.sub = (Button)findViewById(R.id.sub);
        this.add = (Button)findViewById(R.id.add);
        this.equal = (Button)findViewById(R.id.equal);
        this.sin = (Button)findViewById(R.id.sin);
        this.cos = (Button)findViewById(R.id.cos);
        this.log = (Button)findViewById(R.id.log);
        this.square = (Button)findViewById(R.id.square);
        this.left = (Button)findViewById(R.id.left);
        this.right = (Button)findViewById(R.id.right);
        this.dot = (Button)findViewById(R.id.dot);
        this.drg = (Button)findViewById(R.id.drg);
        this.c = (Button)findViewById(R.id.c);
        this.Switch_button=(Button)findViewById(R.id.switch_button);
        this.del = (Button) findViewById(R.id.del);

        textView = (TextView) findViewById(R.id.textView);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "9");
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = textView.getText().toString();
                double num = Double.parseDouble(a);
                double b = Math.toRadians(num);
                double c = Math.sin(b);
                textView.setText(String.valueOf(c));
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Integer.parseInt(textView.getText().toString());
                double b = Math.toRadians(num);
                double a = Math.cos(b);
                textView.setText(String.valueOf(a));
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Integer.parseInt(textView.getText().toString());
                double a = Math.log(num);
                textView.setText(String.valueOf(a));
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = textView.getText().toString();
                if (a == null || a.equals("")) {
                    a = "";
                } else {
                    a = a.substring(0, a.length() - 1);
                }
                textView.setText(a);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "/");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getResult();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "(");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "-");
            }
        });
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + ")");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "*");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "+");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + ".");
            }
        });
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "^");
            }
        });
        //弹出转换界面
        Switch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity1.this, SwitchActivity.class);
                startActivity(intent);
            }
        });


    }

    private boolean isNumber(char n) {
        if (n >= '0' && n <= '9' || n == 'Π' || n == '.') {
            return true;
        }
        return false;
    }

    private boolean comparePri(char symbol) {
        if (symbolStack.empty()) {
            return true;
        }
        char top = (char) symbolStack.peek(); // 查看堆栈顶部的对象，注意不是出栈
        if (top == '(') {
            return true;
        }
        // 比较优先级
        switch (symbol) {
            case '(': // 优先级最高
                return true;
            case '*': {
                if (top == '+' || top == '-') // 优先级比+和-高
                    return true;
                else
                    return false;
            }
            case '²': {
                if (top == '+' || top == '-')
                    return true;
                else
                    return false;
            }
            case '/': {
                if (top == '+' || top == '-') // 优先级比+和-高
                    return true;
                else
                    return false;
            }
            case '+':
                return false;
            case '-':
                return false;
            case ')': // 优先级最低
                return false;
            case '=': // 结束符
                return false;
            default:
                break;
        }
        return true;
    }


    private void getResult() throws Exception {
        String s = textView.getText().toString();//获取文本框的内容
        s = s + "=";
        numberStack = new Stack<Double>();
        symbolStack = new Stack<Character>();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isNumber(ch)) {
                temp.append(ch);
            } else {
                String tempStr = temp.toString();
                if (!tempStr.isEmpty()) {
                    if (tempStr.equals("Π")) {
                        double num = 3.14;
                        numberStack.push(num);
                        temp = new StringBuffer();
                    } else {
                        double num = Double.parseDouble(tempStr);
                        numberStack.push(num);
                        temp = new StringBuffer();
                    }
                }
                while (!comparePri(ch) && !symbolStack.empty()) {
                    Double b = numberStack.pop(); // 出栈，取出数字，后进先出
                    Double a = numberStack.pop();
                    // 取出运算符进行相应运算，并把结果压栈进行下一次运算
                    switch ((char) symbolStack.pop()) {
                        case '+':
                            numberStack.push(a + b);
                            break;
                        case '-':
                            numberStack.push(a - b);
                            break;
                        case '*':
                            numberStack.push(a * b);
                            break;
                        case '/':
                            numberStack.push(a / b);
                            break;
                        case '²':
                            numberStack.push(a * a);
                            break;
                        default:
                            break;
                    }
                } // while循环结束
                if (ch != '=') {
                    symbolStack.push(new Character(ch)); // 符号入栈
                    if (ch == ')') { // 去括号
                        symbolStack.pop();
                        symbolStack.pop();
                    }
                }
            }
        }
        String a = String.valueOf(numberStack.pop());
        textView.setText(a);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_item:
                Toast.makeText(this, "you clicked help", Toast.LENGTH_SHORT).show();
                break;
            /*case R.id.exit_item:
                Toast.makeText(this, "you clicked exit", Toast.LENGTH_SHORT).show();
                break;*/
            default:
        }
        return true;
    }

}