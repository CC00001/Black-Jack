#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

//Just made some changes here!

int dealercard(int &Dcard)//Dealer get cards 
{
srand(time(NULL));
Dcard = rand() % 10 + 1;
//unsigned seed = time(NULL);
return Dcard;
}

int dealerTotal(int &dealerscore, int &Dcard) //Sum Dealer total 
{
  dealerscore += Dcard;
  return dealerscore;
}

int playercard(int &card)//Player get cards 
{
  card = rand() % 10 + 1;
  unsigned seed = time(0);
  srand(seed);
  return card;
}
int playerTotal(int &playerscore, int &card)//Sum Player total 
{
  playerscore += card;
  return playerscore;
}

int determination(char &x, int &dealerscore, int &playerscore)//Making descion who wins
{
  if(dealerscore == playerscore)
  {
    cout << "Push!" << endl;
    cout << "Do you want to play again?(y/n):";
    cin >> x;
    return x;
  }
  else if(dealerscore > playerscore)
  {
    cout << "Dealer wins!" << endl;
    cout << "Do you want to play again?(y/n):";
    cin >> x;
    return x;
  }
  else if(dealerscore < playerscore)
  {
    cout << "Player wins!" << endl;
    cout << "Do you want to play again?(y/n):";
    cin >> x;
    return x;
  }
}

int main()
{ 
char x = 'y' || 'n'; 
char k = 'c'; 
int dealcard; 
int dealerscore; 
int playerscore; 
int Dcard; 
int card; 

do 
{
srand(time(NULL)); 
int first = rand() % 10 + 1; 
int second = rand() % 10 + 1; 
int Dcard = rand() % 10 + 1; 
//unsigned seed = time(NULL); 
//srand(seed); 

//Initializing rand cards for Dealer and player

cout << "The dealer starts with a " << Dcard << endl; 
cout << "Your first cards: " << first << ',' << second << endl; 
cout << "Total: " << first + second << endl; 
playerscore = first + second; 
 while(playerscore <= 21)
 {
  cout << "hit?(y/n):"; 
  cin >> x;
 
  if(toupper(x = 'Y'))//Asking player if wants cards 
  {
   cout << "Card:" << playercard(card) << endl; 
   cout << "Total:" << playerTotal(playerscore, card) << endl;
  }
 
  else if(toupper(x = 'N'))//If player doesn't want a card, Dealer get cards
  {
   cout << "Dealer has a " << Dcard << endl;
   cout << "(c to contuine):";
   cin >> k;
   dealerTotal(dealerscore, Dcard);
  
     while(k == 'c')
     {
      if(dealerscore <= 17)//Caluate Dealer score
      {
        cout << "Dealer got a " << dealercard(Dcard) << endl;
        cout << "Total:" << dealerTotal(dealerscore, Dcard) << endl;
        cout << "(c to contuine:)";
        cin >> k;
      }
      else if(dealerscore > 17)
      {
       determination(x, dealerscore, playerscore);//Making decision who wins
       break;
      }
     }  
   } 
  } 
  if(playerscore > 0 && playerscore < 21)//Caluate Player score
  { 
   cout << "hit?(y/n):"; 
   cin >> x;
 
     if(toupper(x = 'Y')) 
     { 
       cout << "Card:" << playercard(card) << endl; 
       cout << "Total:" << playerTotal(playerscore, card) << endl;
     }
     else if(toupper(x = 'N'))
     {
       cout << "Dealer has a " << Dcard << endl;
       cout << "Total:" << dealerTotal(dealerscore, Dcard) << endl;
       cout << "(c to contuine):";
       cin >> k;

         while(k != 'c')
         {
            if(dealerscore <= 17)//Caulate Dealer score
            {
              cout << "Dealer got a " << dealercard(Dcard) << endl;
              cout << "Total:" << dealerTotal(dealerscore, Dcard) << endl;
              cout << "(c to contuine:)";
              cin >> k;
            }
     else if(dealerscore > 17 && dealerscore <= 21)
     {
        determination(x, dealerscore, playerscore);//Making decision who wins
        break;
     }
    }  
   }
  }

  if(playerscore > 21) //If Player score larager than 21
  { 
    cout << "Bust! Dealer wins!" << endl; 
    cout << "Would you like to play again?(y/n):"; 
    cin >> x;
    if(toupper(x = 'N'))
    {
      break;
    }
  }
  continue;
  }
 
 
  while(toupper(x = 'Y')); 
  return 0;//close program
}
