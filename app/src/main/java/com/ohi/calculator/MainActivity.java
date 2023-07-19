package com.ohi.calculator;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Stack;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView topDisplay, bottomDisplay;
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button dot;
    Button add, sub, mul, div, mod;
    Button equal, ac, del;
    boolean validCheck = false;
    String data="";

    int clickMath = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // for take button response
        topDisplay = findViewById(R.id.tv1);
        bottomDisplay = findViewById(R.id.tv2);

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);

        equal = findViewById(R.id.equal);
        ac = findViewById(R.id.ac);
        del = findViewById(R.id.del);

        dot = findViewById(R.id.dot);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                topDisplay.setText(data + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMath++;
                data = topDisplay.getText().toString();
                if(data.length()!=0 && (data.charAt(data.length()-1) == '+' || data.charAt(data.length()-1) == '-' || data.charAt(data.length()-1) == '*' || data.charAt(data.length()-1) == '/' || data.charAt(data.length()-1) == '%' || data.charAt(data.length()-1) == '.'))
                {
                    data = data.substring(0,data.length()-1);
                    topDisplay.setText(data+"+");
                }
                if(data.length() !=0 && isNum(data.charAt(data.length()-1))==true)
                {
                    topDisplay.setText(data + "+");
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMath++;
                data = topDisplay.getText().toString();
                if(data.length()!=0 && (data.charAt(data.length()-1) == '+' || data.charAt(data.length()-1) == '-' || data.charAt(data.length()-1) == '*' || data.charAt(data.length()-1) == '/' || data.charAt(data.length()-1) == '%' || data.charAt(data.length()-1) == '.'))
                {
                    data = data.substring(0,data.length()-1);
                    topDisplay.setText(data+"-");
                }
                else {
                    topDisplay.setText(data + "-");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMath++;
                data = topDisplay.getText().toString();
                if(data.length()!=0 && (data.charAt(data.length()-1) == '+' || data.charAt(data.length()-1) == '-' || data.charAt(data.length()-1) == '*' || data.charAt(data.length()-1) == '/' || data.charAt(data.length()-1) == '%' || data.charAt(data.length()-1) == '.'))
                {
                    data = data.substring(0,data.length()-1);
                    topDisplay.setText(data+"*");
                }
                if(data.length() !=0 && isNum(data.charAt(data.length()-1))==true) {
                    topDisplay.setText(data + "*");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                clickMath++;
                data = topDisplay.getText().toString();
                if(data.length()!=0 && (data.charAt(data.length()-1) == '+' || data.charAt(data.length()-1) == '-' || data.charAt(data.length()-1) == '*' || data.charAt(data.length()-1) == '/' || data.charAt(data.length()-1) == '%' || data.charAt(data.length()-1) == '.'))
                {
                    data = data.substring(0,data.length()-1);
                    topDisplay.setText(data+"/");
                }
                if(data.length() !=0 && isNum(data.charAt(data.length()-1))==true) {
                    topDisplay.setText(data + "/");
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMath++;
                data = topDisplay.getText().toString();
                if(data.length()!=0 && (data.charAt(data.length()-1) == '+' || data.charAt(data.length()-1) == '-' || data.charAt(data.length()-1) == '*' || data.charAt(data.length()-1) == '/' || data.charAt(data.length()-1) == '%' || data.charAt(data.length()-1) == '.'))
                {
                    data = data.substring(0,data.length()-1);
                    topDisplay.setText(data+"%");
                }
                if(data.length() !=0 && isNum(data.charAt(data.length()-1))==true) {
                    topDisplay.setText(data + "%");
                }

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                if(data.length()!=0) {
                    topDisplay.setText(data + ".");
                }
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topDisplay.setText("");
                bottomDisplay.setText("");
                data = "";
                clickMath=0;
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = topDisplay.getText().toString();
                if (data.length() != 0) {
                    if(clickMath>0){
                        clickMath--;
                    }
                    data = data.substring(0, data.length() - 1);
                    topDisplay.setText(data);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(data.length()!=0) {
                    data = topDisplay.getText().toString();
                    if (data.charAt(data.length() - 1) == '+' || data.charAt(data.length() - 1) == '-' || data.charAt(data.length() - 1) == '*' || data.charAt(data.length() - 1) == '/' || data.charAt(data.length() - 1) == '%') {
                        validCheck = true;
                    }
                    if (clickMath==0||validCheck == true || data.charAt(0)=='+' || data.charAt(0)=='*' || data.charAt(0)=='/' || data.charAt(0)=='%' || data.charAt(0)=='.'  ) {
                        String temp = "Invalid";
                        bottomDisplay.setText(temp);
                        validCheck = false;
                    } else {
                        double ans = getResult(data);
                        String temp = String.valueOf(ans);
                        int dotIndex = temp.indexOf('.');
                        String tempAns = temp.substring(dotIndex+1,temp.length());
                        if(Double.parseDouble(tempAns)==0.0){
                            temp = temp.substring(0,dotIndex);
                        }
                        bottomDisplay.setText(temp);
                    }
                }

            }
        });
    }
    double getResult(String data)
    {
        int start = 0, i = -1;
        boolean flag = false;
        Stack<String> st = new Stack<>();
        if (data.charAt(0) == '-') {
            i = 0;
        }
        for (i = i+1; i < data.length(); ++i) {
            if (data.charAt(i) == '+' || data.charAt(i) == '-' || data.charAt(i) == '*' || data.charAt(i) == '/' || data.charAt(i) == '%')
            {
                if(i==0){
                    String temp="-";
                    temp += data.substring(start,i);
                    start = i+1;
                    st.push(temp);
                    st.push(String.valueOf(data.charAt(i)) + String.valueOf(data.charAt(i)));
                }
                else {
                    String temp = data.substring(start, i);
                    start = i + 1;
                    st.push(temp);
                    st.push(String.valueOf(data.charAt(i)) + String.valueOf(data.charAt(i)));
                }
            }
        }
        st.push(data.substring(start, data.length()));

        int n = st.size();
        String[] arr = new String[st.size()];
        i = 0;
        while (!st.isEmpty()) {
            arr[i] = st.pop();
            i++;
        }
        double first = Double.parseDouble(arr[n - 1]);
        char smb = arr[n - 2].charAt(0);
        double second = Double.parseDouble(arr[n - 3]);
        double ans = ans(first, smb, second);
        for (i = n - 4; i > 0; i -= 2) {
            double temp = Double.parseDouble(arr[i - 1]);
            ans = ans(ans, arr[i].charAt(0), temp);
        }
        return ans;
    }
    public static double ans(double first, char smb, double second) {
        double result = 0.0;
        if (smb == '+') {
            result = first + second;
        } else if (smb == '-') {
            result = first - second;
        } else if (smb == '*') {
            result = first * second;
        } else if (smb == '/') {
            result = first / second;
        } else if (smb == '%'){
            result = first % second;
        }
        return result;
    }
    public static boolean isNum(char ch){
        if(ch>='0' && ch<='9'){
            return true;
        }
        return false;
    }
}
