class Bank{
String name;
long accountNum;
String accountType;
int balance;
 
void inti(String a, String b , long c , int d){
name=a;
accountNum=c;
accountType=b;
balance=d;}

void deposit(int amount){
balance =balance + amount;
}

void withdraw(int amount){
if (amount<=balance)
{
balance=balance-amount;
}
else 
System.out.println("insiffencet balance");
}

void display (){
System.out.println(name);
System.out.println(balance);
}

public static void main (String [] abc){
Bank b=new Bank();
System.out.println(b);
b.display();}}