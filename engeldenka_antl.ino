const int sol_i=2;
const int sol_g=3;
const int sag_i=4;
const int sag_g=5;
const int echo=8;
const int trig=9;
int sure=0;
int mesafe=0;
void setup() {
  pinMode(sol_i,OUTPUT);
  pinMode(sol_g,OUTPUT);
  pinMode(sag_i,OUTPUT);
  pinMode(sag_g,OUTPUT);
  pinMode(trig, OUTPUT);
  pinMode(echo, INPUT);

  Serial.begin(9600);
}

void loop() {
  digitalWrite(trig, HIGH);
  delayMicroseconds(1000);
  digitalWrite(trig,LOW);

  sure= pulseIn(echo, HIGH);
  mesafe=(sure/2) / 28.5;
  Serial.println(mesafe);

  if(mesafe<30) {
    digitalWrite(sol_i,HIGH);
    digitalWrite(sol_g, LOW);
    digitalWrite(sag_i,LOW);
    digitalWrite(sag_g, HIGH);
    delay(250);
    
   
  }else{
    digitalWrite(sol_i,HIGH);
    digitalWrite(sol_g, LOW);
    digitalWrite(sag_i,HIGH);
    digitalWrite(sag_g, LOW);
  }
  
  
}
