 /* Let us start a quiz contest*/
    import java.util.*;
    class test
    {
    void drawLine()
    {
    System.out.println("--------------------------------------------------------------------------------------------");
    }//draw a line 
    void correctAns()
    {
    System.out.println("Yes , your answer is absolutely right !!!!");
    }//to display
    void wrongAns()
    {
    System.out.println("No , your answer is wrong !!!!");
    }//to display
    void tryThis()
    {
    System.out.println("Now , answer this question .");
    }//to display 
    void myAns()
    {
    System.out.println("My answer is - ");
    }//to display 
    void quizRules()
    {
        System.out.println("\n Quiz Rules\n");
        drawLine();
    System.out.println("1. 10 questions related to Science would be put up before you .");
    System.out.println("2. Only one answer is correct"); 
    System.out.println("3. You have only one attempt to answer the question . ");
    System.out.println("4. Each right answer carries four marks .");
    System.out.println("5. There will be a negative marking of 1 mark");
    drawLine();
    System.out.println("Go ahead and enjoy answering ,All the best !!!!");
    drawLine();
    }// to display rules 
        void main()
    {
    int c = 0;
    int cor=0;
    int inc=0;
    Scanner sc =new Scanner (System.in);
    System.out.println("#Welcome  in  the Science quiz contest#  ");
    drawLine();
    drawLine();
    System.out.println("Please tell me you name -") ;
    drawLine();
    String S=sc.nextLine();
    drawLine();
    System.out.println("Press 1 – to know the rules  \n  Press any other number to start answering  ");
    int pch=sc.nextInt();
    drawLine();
    drawLine();
    switch (pch)
    {
    case  1 :quizRules();
                   drawLine();
    default : 
    System.out.println("Q 1 : Generally , Leaves are green in colour due to the presence of -");
    drawLine();
    System.out.println("1. Pectin \n 2.Stomata \n 3.Chloroplast  \n 4. Chromoplast");
    drawLine();
    myAns();
    int ch1=sc.nextInt();
    drawLine();
    switch (ch1)
    {
    case 3 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println("Chloroplast in leaves contains a pigment called Chlorophyll which imparts green colour to leaves .");
    drawLine();
    tryThis();
    drawLine();
    System.out.println("Q 2 : Oxide of which element is primarily responsible for acid rain?");
    drawLine();
    System.out.println("1.Oxygen  \n 2.Phosphorus \n 3.Carbon  \n 4.Sulphur");
    drawLine();
    myAns();
    int ch2=sc.nextInt();
    drawLine();
    switch (ch2)
    {
    case 4 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println("Oxides of Sulphur such as sulphur dioxide and sulphur trioxide which form sulphurous and sulphuric acid respectively in the atmosphere cause acid rain ");
    drawLine();
    tryThis();
    drawLine();
    System.out.println("Q 3. Who put forward the \"General theory of Relativity\"  ?");
    drawLine();
    System.out.println("1.Max Planck \n 2.Albert Einstein  \n 3.Michael Faraday  \n 4.Isaac Newton  ");
    drawLine();
    myAns();
    int ch3=sc.nextInt();
    drawLine();
    switch (ch3)
    {
    case 2 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println("Einstein's 1915 general theory of relativity holds that what we perceive as the force of gravity arises from the curvature of space and time. The scientist proposed that objects such as the sun and the Earth change this geometry ");
    drawLine();
    tryThis();
    drawLine();
    System.out.println("Q 4 :How many bones are in the human body? ?");
    drawLine();
    System.out.println("1.306 \n 2.266  \n 3.206 \n 4.200  ");
    drawLine();
    myAns();
    int ch4=sc.nextInt();
    drawLine();
    switch (ch4)
    {
    case 3 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println(" The adult human skeleton is made up of 206 bones. These include the bones of the skull, spine (vertebrae), ribs, arms and legs. Bones are made of connective tissue reinforced with calcium and specialised bone cells. Most bones also contain bone marrow, where blood cells are made.");
    drawLine();
    tryThis();
    drawLine();
    System.out.println("Q 5 :Which is the main gas that makes up the Earth's atmosphere? ");
    drawLine();
    System.out.println("1.Oxygen\n 2.Carbon Dioxide \n 3.Nitrogen \n 4.Hydrogen");
    drawLine();
    myAns();
    int ch5=sc.nextInt();
    drawLine();
    switch (ch5)
    {
    case 3 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println(" The air in Earth's atmosphere is made up of approximately 78 percent nitrogen and 21 percent oxygen. Air also has small amounts of lots of other gases, too, such as carbon dioxide, neon, and hydrogen.");
    drawLine();
    tryThis();
    drawLine();
    System.out.println("Q 6 :At what temperature are Celsius and Fahrenheit equal? ?");
    drawLine();
    System.out.println("1. 36\u00B0\n 2.42\u00B0  \n 3.0\u00B0 \n 4.-40\u00B0  ");
    drawLine();
    myAns();
    int ch6=sc.nextInt();
    drawLine();
    switch (ch6)
    {
    case 4 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    
    System.out.println("Celsius and Fahrenheit are two temperature scales. The Fahrenheit and Celsius scales have one point at which they intersect. They are equal at -40 °C and -40 °F.");
    drawLine();
    
    
    tryThis();
    drawLine();
    System.out.println("Q 7 : What is the biggest planet in our solar system?");
    drawLine();
    System.out.println("1.Jupiter  \n 2.Saturn \n 3.Earth  \n 4.Mercury ");
    drawLine();
    myAns();
    int ch7=sc.nextInt();
    drawLine();
    switch (ch7)
    {
    case 1 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println("Fifth in line from the Sun, Jupiter is, by far, the largest planet in the solar system – more than twice as massive as all the other planets combined.");
    drawLine();
    
    tryThis();
    drawLine();
    System.out.println("Q 8 :What is the hardest natural substance on Earth?");
    drawLine();
    System.out.println("1.Tooth Enamel  \n 2.Diamond \n 3.Iron  \n 4.Cement ");
    drawLine();
    myAns();
    int ch8=sc.nextInt();
    drawLine();
    switch (ch8)
    {
    case 2 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println("Diamond is currently thought to be the hardest natural material on Earth, having a hardness of ten out of ten on the Mohs scale of mineral hardness. Diamond is made up of carbon atoms which share strong covalent bonds (where electrons are shared between atoms) and are equally spaced in a lattice arrangement.");
    drawLine();
    
    tryThis();
    drawLine();
    System.out.println("Q 9 :Which famous British physicist wrote A Brief History of Time?");
    drawLine();
    System.out.println("1.Paul Dirac  \n 2.Stephen Hawking \n 3.John Dalton  \n 4. Michael Faraday");
    drawLine();
    myAns();
    int ch9=sc.nextInt();
    drawLine();
    switch (ch9)
    {
    case 2 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println("A Brief History of Time: From the Big Bang to Black Holes is a book on theoretical cosmology by English physicist Stephen Hawking. It was first published in 1988. Hawking wrote the book for readers who had no prior knowledge of physics and people who are interested in learning something new about interesting subjects.");
    drawLine();
    
    
    tryThis();
    drawLine();
    System.out.println("Q 10 :What is a material that will not carry an electrical charge called?");
    drawLine();
    System.out.println("1.Insulator \n 2.Conductor \n 3.Semi-conductor  \n 4.fluid ");
    drawLine();
    myAns();
    int ch10=sc.nextInt();
    drawLine();
    switch (ch10)
    {
    case 1 : correctAns();
                   drawLine();
                  c=c+4;
                  cor++;
                   break;
    default : wrongAns();
                    drawLine();
                    c=c-1;
                    inc++;
    }
    System.out.println("The materials that does not carry an electric current are known insulators.");
    drawLine();
    System.out.println("Thanks for giving the Quiz") ;
    drawLine();
    System.out.println("To see your result answer this Question:");
      drawLine();
    System.out.println("Only even prime number is");
      drawLine();
      myAns();
      int even=sc.nextInt();
      switch(even)
      { 
          case 2:
          correctAns();
          drawLine();
          break;
          default:
          wrongAns();
          drawLine();
        }
    System.out.println(S + ", your score is "+c+"/40") ;
    drawLine();
    System.out.println("Correctly attempted - " +cor+ " Questions");
    System.out.println("Incorrectly attempted - " +inc+ " Questions");
    drawLine();
    switch (c)
    {
    case 21 :
    case 22 :
    case 23 :
    case 24 :
     System.out.println("Grade – E , unsatisfactory ");
                  break;
    case 25 :
    case 26 :
    case 27 :
    case 28 :
     System.out.println("Grade –D , satisfactory") ;
                  break;
    case 29 :
    case 30 :
    case 31 :
    case 32 :
     System.out.println("Grade –C ,Good ") ;
                   break;
    case 33 :
    case 34 :
    case 35 :
    case 36 :
     System.out.println("Grade –B ,Very Good ") ;
                   break;
    case 37 :
    case 38 :               
    case 39 :
    case 40 :
     System.out.println("Grade –A,Excellent") ;
                    break;
    default:
     System.out.println("Sorry , you need to work hard ") ;
     break;
    
    }//switch case to give grade 
    drawLine();
    System.out.println("Do you like the quiz ?-Y/N") ;
    char php = sc.next().charAt(0);
    switch (php)
    {
    case 'Y' : System.out.println("Thank you !!!!!!") ;
                  break;
    case 'N': System.out.println("We would try our best to make it good next time ") ;
                   break;
    default : System.out.println("Sorry , we could not read your feedback ") ;
    }
    drawLine();
    System.out.println("Write your comments below");
    String sug=sc.nextLine();
    sug=sc.nextLine();
    System.out.println("Thanks for your comments and suggestions ... GOOD LUCK !!!");
     
    }//switch case for feedback
    }//main
    }//class



