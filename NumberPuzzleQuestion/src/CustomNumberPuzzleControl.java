import java.awt.*;
import java.util.*;
class CustomNumberPuzzleControl extends NumberPuzzleControl {
	public int getWidth() {
		return 200;
	}
	public int getHeight() {
		return 250;
	}
	public int getXPosition() {
		return 200;
	}
	public int getYPosition() {
		return 200;
	}
	public String getTitle(){
		return "Number Puzzle";
	}
	public int getShuffleButtonFontSize() {
		return 12;
	}
	public int getNumbersFontSize() {
		return 12;
	}
	public Color getEmptyButtonColor() {
		return Color.WHITE;
	}
	public String getWinnerMessage() {
		return "Congrats, you have won!";
	}

	// The following three methods have to be written by the participants...

	public int handleButtonClicked(NumberPuzzleGame game){
		int emptyCellId = game.getEmptyCellId();
		Button buttonClicked = game.getButtonClicked();
		Button[] buttons = game.getButtons();
		
		//Your logic here		
			//Your logic here		
        int buttonid;
        for(int i=0;i<buttons.length;i++)
        {
            if(buttons[i]==buttonClicked)
            {
                buttonid=i;
                break;
            }
        }
        if(emptyCellId==(buttonId+1) || emptyCellId==(buttonId-1) || emptyCellId==(buttonId+4) || buttonClicked==(buttonId-4))
          { swapButton(buttons[emptyCellId],buttonClicked);
			emptyCellId = buttonId;
        }
		return emptyCellId;

	}
	public int[] getRandomNumbersForGrid() {
		int arr[] = new int[15];
		
		//Your logic here
		//int a = getRandomNumber();
		boolean[] isRepeated=new boolean[15];
        for(int i=0;i<15;i++)
        isRepeated[i]=false;
		for(int i=0;i<arr.size();i++)
		{
			Random ran = new Random();
			int number= ran.nextInt(15)+1;
			while(isRepeated[number-1]==true)
			{
				number=ran.nextInt(15)+1;		
		}
		arr[i]=number;
		isRepeated[number-1]=true;
		}
		return arr;
	}
	public boolean checkForWinner(Button[] buttons)
	{
		boolean winner = true;

		// Your Logic here

		int[] buttonid=getIntegerArrayOfButtonIds(buttons);
        for(int i=0;i<buttonid.length;i++)
        {
            if(buttonid[i]!=i+1)
            {
                winner=false;
                break;
            }
        }
		return winner;
}
}