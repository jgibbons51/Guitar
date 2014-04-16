public class GuitarHeroLite {
      public static void main(String[] args) {

          // create two guitar strings, for concert A and C
          double CONCERT_A = 440.0; //A4
          double CONCERT_C = CONCERT_A * Math.pow(1.05956, 3.0);  //C5
          GuitarString stringA = new GuitarString(CONCERT_A);
          GuitarString stringC = new GuitarString(CONCERT_C);
          double CONCERT_S = CONCERT_A * Math.pow(1.05956, 2.0);  
          double CONCERT_D = CONCERT_A * Math.pow(1.05956, 4.0);
          double CONCERT_F = CONCERT_A * Math.pow(1.05956, 5.0);
          double CONCERT_G = CONCERT_A * Math.pow(1.05956, 7.0);
          double CONCERT_H = CONCERT_A * Math.pow(1.05956, 9.0);
          double CONCERT_J = CONCERT_A * Math.pow(1.05956, 11.0);
          double CONCERT_K = CONCERT_A * Math.pow(1.05956, 12.0);
          GuitarString stringS = new GuitarString(CONCERT_S);
          GuitarString stringD = new GuitarString(CONCERT_D);
          GuitarString stringF = new GuitarString(CONCERT_F);
          GuitarString stringG = new GuitarString(CONCERT_G);
          GuitarString stringH = new GuitarString(CONCERT_H);
          GuitarString stringJ = new GuitarString(CONCERT_J);
          GuitarString stringK = new GuitarString(CONCERT_K);

          while (true) {

              // check if the user has typed a key; if so, process it   
              if (StdDraw.hasNextKeyTyped()) {
                  char key = StdDraw.nextKeyTyped();
                  if      (key == 'a') { stringA.pluck(); }
                  else if (key == 'c') { stringC.pluck(); }
                  else if (key == 's') { stringS.pluck(); }
                  else if (key == 'd') { stringD.pluck(); }
                  else if (key == 'f') { stringF.pluck(); }
                  else if (key == 'g') { stringG.pluck(); }
                  else if (key == 'k') { stringK.pluck(); }
                  else if (key == 'h') { stringH.pluck(); }
                  else if (key == 'j') { stringJ.pluck(); }
              }
              // compute the superposition of samples
              double sample = stringA.sample() + stringC.sample() + stringS.sample() + stringD.sample() + stringF.sample() + stringG.sample() + stringH.sample() + stringJ.sample() + stringK.sample();
  
              // play the sample on standard audio
              StdAudio.play(sample);
  
              // advance the simulation of each guitar string by one step   
              stringA.tic();//stringA.tic();
              stringS.tic();
              stringD.tic();
              stringF.tic();
              stringG.tic();
              stringH.tic();
              stringJ.tic();
              stringK.tic();
              stringC.tic();
          }
       }
}
