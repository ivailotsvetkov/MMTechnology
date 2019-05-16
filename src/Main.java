public class Main
{

   public static class MMLogo
   {
      private int widthOfM;
      private int countOfCharM;

      // Default constructor for two Ms
      public MMLogo(int widthOfM)
      {
         this.widthOfM = widthOfM;
         countOfCharM = 2;
      }

      // Constructor for many Ms
      public MMLogo(int widthOfM, int countOfCharM)
      {
         this.widthOfM = widthOfM;
         this.countOfCharM = countOfCharM;
      }

      public void printTheLogo()
      {
         if (widthOfM > 2 && widthOfM < 10000 && widthOfM % 2 == 1)
         {
            if (countOfCharM > 0)
            {
               for (int i = 0; i < (widthOfM + 1) / 2; i++)
               {
                  for (int k = 0; k < countOfCharM; k++)
                  {
                     for (int j = 0; j < widthOfM - i; j++)
                     {
                        System.out.print('-');
                     }
                     for (int j = 0; j < widthOfM + (2 * i); j++)
                     {
                        System.out.print('*');
                     }
                     for (int j = 0; j < widthOfM - (2 * i); j++)
                     {
                        System.out.print('-');
                     }
                     for (int j = 0; j < widthOfM + (2 * i); j++)
                     {
                        System.out.print('*');
                     }
                     for (int j = 0; j < widthOfM - i; j++)
                     {
                        System.out.print('-');
                     }
                  }
                  System.out.println();
               }

               // second part
               for (int i = 0; i < (widthOfM + 1) / 2; i++)
               {

                  for (int k = 0; k < countOfCharM; k++)
                  {
                     for (int j = 0; j < (widthOfM / 2) - i; j++)
                     {
                        System.out.print('-');
                     }
                     for (int j = 0; j < widthOfM; j++)
                     {
                        System.out.print('*');
                     }
                     for (int j = 0; j < 1 + (2 * i); j++)
                     {
                        System.out.print('-');
                     }
                     for (int j = 0; j < (2 * widthOfM - 1) - (2 * i); j++)
                     {
                        System.out.print('*');
                     }
                     for (int j = 0; j < 1 + (2 * i); j++)
                     {
                        System.out.print('-');
                     }
                     for (int j = 0; j < widthOfM; j++)
                     {
                        System.out.print('*');
                     }
                     for (int j = 0; j < (widthOfM / 2) - i; j++)
                     {
                        System.out.print('-');
                     }
                  }
                  System.out.println();
               }
            }
            else
            {
               System.out.println("Count of Ms should be a positive number.");
            }
         }
         else
         {
            System.out
                  .println("Width should be an odd number with range: 2 < Width < 10 000");
         }
      }
   }

   public static void main(String args[])
   {
      MMLogo logo1 = new MMLogo(3);
      MMLogo logo2 = new MMLogo(5);
      MMLogo logo3 = new MMLogo(7);
      MMLogo logoWith4Ms = new MMLogo(7, 4);
      MMLogo logoWithNegativeCountOfMNumber = new MMLogo(7, -3);
      MMLogo logoWithEvenRowNumber = new MMLogo(6);

      // Testing
      logo1.printTheLogo();
      logo2.printTheLogo();
      logo3.printTheLogo();
      logoWith4Ms.printTheLogo();
      logoWithNegativeCountOfMNumber.printTheLogo();
      logoWithEvenRowNumber.printTheLogo();
   }

}
