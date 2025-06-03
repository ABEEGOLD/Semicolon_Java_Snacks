import java.util.Scanner;
public class Nokia{
    public static void main(String[] args){

	nokiaMenu();
    }

	public static void nokiaMenu(){
	Scanner input = new Scanner(System.in);
    String Menu = """

	list of menu functions
	1: phone book
	2: messages
	3: chat
	4: call register
	5: tones
	6: settings
	7: call divert
	8: games
	9: calculator
	10: reminders
	11: clocks
	12: profiles
	13: sim services
	

	""";

		String phoneBook = """
			1: search
			2: service Nos
			3: add name
			4: erase
			5: edit
			6: assign tone
			7: send b'card
			8: options
			   1: type of view
			   2: memory status
			9: speed dials
			10: voice tags
			-1: to go back to menu


		""";
		
						String messages = """
						1: write messages
						2: inbox
						3: outbox
						4: picture messages
						5: templates
						6: simleys
						7: message settings
						1: set 1
						   1. messages centre number
						   2. messages sent as
						   3. message validity
						2: common 3
						   1. delivery reports
						   2. reply via same centre
						   3. character support
						8: info service
						9: voice mailbox number
						10: service command editor 
						 -1: to exit  	

		""";
						
				String Chat = """
					chatting.....
						-1: to exit
		""";

			        
				String callRegister = """
				1: missed calls
				2: recieved calls
				3: dialled numbers
				4: erase recent call lists
				5: show call duration
				   1. last call duration
				   2. all calls' duration
				   3. received calls' duration
				   4. dialled calls' duration
				   5. ciear timers
			        6: show call costs
				   1: last call cost
				   2: all calls'cost
				   3. clear counters
				7: call cost settings
				   1. call cost limit
				   2. show costs in
				8: prepaid credit
				 -1: to exit

              """;

				String Tones = """
			
				1: ringing tone
				2: ringing volume
				3: incoming call alert
				4: composer
				5: message alert tone
				6: keypad tones
				7: warning and game tones
				8: vibrating alert
				9: screen saver
				 -1: to exit

             """;

				String Settings = """
				
				1: call settings
				   1. automatic redial
				   2. speed dailling
				   3. call waiting options
				   4. own number sending
				   5. phone line in use
				   6. automatic answer
			        2: phone settings
				   1. language
				   2. cell info display
				   3. welcome note
				   4. network selection
			           5. lights
				   6. confirm sim service actions
				3: security settings
				   1. pin code request
				   2. call barring service
				   3. fixed dailling
				   4. closed user group
				   5. phone security
				   6. change access codes
				 4: restore factory settings
				 -1: to exit
		""";
   
		             String callDivert = """ 
			     Call divert....
			     -1: to exit
		""";

			     String Game = """
			     Gaming....
			      -1: to exit


		""";

			    String Calculators = """
			    Calculating....
			     -1: to exit


		""";

		
			   String Reminders = """
			   Remindering....
			    -1: to exit


		""";

			   String Clock = """
			   1: alarm clock
			   2: clock settings
			   3: date settings
			   4: stopwatch
			   5: countdown timer
			   6: auto update of date and time
			    -1: to exit


		""";

			   String Profiles = """
			   profiling....
			    -1: to exit


		""";

			   String simServices = """
			   Sim services....
			    -1: to exit


		""";

		

		System.out.print("Enter -1 to exit or a right value to continue: ");
		int flagValue = input.nextInt();
		

		int flag = -1;	
				
				 

	while(flag != flagValue)
			break;
		System.out.println(Menu);
	
		int userInput = input.nextInt();
		switch(userInput){

		case 1: System.out.println("phone book1");
			System.out.println(phoneBook);

			System.out.print("Enter your value: ");
			int phoneBookEntry = input.nextInt();
			
			switch(phoneBookEntry){

				case 1: System.out.println("search");
					phoneBookEntry = input.nextInt();
					break;
				case 2: System.out.println("service Nos");
					break;
				case 3: System.out.println("add name");
					break;
				case 4: System.out.println("erase");
					break;
				case 5: System.out.println("edit");
					break;
				case 6: System.out.println("assign tone");
					break;
				case 7: System.out.println("send b'card");
					break;
				case 8: System.out.println("options");
					System.out.print("Enter option value: ");
					int optionEntry = input.nextInt();
					switch(optionEntry){
					case 1: System.out.println("type of view");
					break;
					case 2: System.out.println("memory status");	
					break;
					}
					break;
				case 9: System.out.println("speed dials");
					break;
				case 10: System.out.println(" voice tags");
					break;
			}
			nokiaMenu();
					
			case 2: System.out.println("messages");
				System.out.print(messages);

				System.out.print("Enter message option: ");
				int messagesEntry = input.nextInt();

					switch(messagesEntry){


					case 1: System.out.println("write messages");
			                        break;
					case 2: System.out.println("inbox");
						break;
					case 3: System.out.println("outbox");
						break;
					case 4: System.out.println("picture messages");
						break;
					case 5: System.out.println("templates");
						break;
					case 6: System.out.println("smileys");
						break;
					case 7: System.out.println("messages settings");
                                                System.out.print("Enter set value: ");
						int setSeven = input.nextInt();

						switch(setSeven){
							case 1: System.out.println("set 1");
								System.out.print("Enter set value: ");
								int setSevenCase1Value = input.nextInt();
								
								switch(setSevenCase1Value){
									case 1: System.out.println("1. message centre number");	
					        				break;
									case 2: System.out.println("2. messages sent as");
										break;
									case 3: System.out.println("3. message validity");
										break;
								}
								nokiaMenu();
		


							case 2: System.out.println("common 3");
								System.out.print("Enter set value: ");
								int setSevenCase2Value = input.nextInt();
								
								switch(setSevenCase2Value){
									case  1: System.out.println("1. delivery reports");	
					        				break;
									case 2: System.out.println("2. reply via same centre");
										break;
									case 3: System.out.println("3. character support");
										break;
								}
								nokiaMenu();

						}
						break;
									
					case 8: System.out.println("info service");
						break;
					case 9: System.out.println("voice mailbox number");
						break;
					case 10: System.out.println("service command editor");
					break;
					}
		       			nokiaMenu();

                	case 3: System.out.println("chat");
				System.out.println(Chat);
				break;
				

			case 4: System.out.println("call register");
				System.out.print(callRegister);
				int checkerBox = input.nextInt();

				switch(checkerBox){
					case 1: System.out.println("missed calls");
						break;
					case 2: System.out.println("received calls");
						break;
					case 3: System.out.println("dialled numbers");
						break;
					case 4: System.out.println("erase recent call lists");
						break;
					case 5: System.out.println("show call duration");
						break;
					case 6: System.out.println("1. last call duration");
						break;
					case 7: System.out.println("2. all calls' duration");
						break;
					case 8: System.out.println("3. received calls' duration");
						break;
					case 9: System.out.println("4. dialled calls' duration");
						break;
					case 10: System.out.println("5. clear timers");
						break;
                                        case 11: System.out.println("show call costs");
						break;
					case 12: System.out.println("1. last call cost");
						break;
					case 13: System.out.println("2. all calls' cost");
						break;
					case 14: System.out.println("3. clear counters");
						break;
					case 15: System.out.println("call cost settings");
						break;
					case 16: System.out.println("1. call cost limit");
						break;
					case 17: System.out.println("2. show costs in");
						break;
					case 18: System.out.println("prepaid credit");
						break; 
				       }
				    nokiaMenu();

			                case 5: System.out.println("tones");
						System.out.print(Tones);
     						System.out.print("Enter your tones: ");
			                        int atTones = input.nextInt();
						

						switch(atTones){
					case 1: System.out.println("ringing tone");
						break;
					case 2: System.out.println("ringing volume");
						break;
					case 3: System.out.println("incoming call alert");
						break;
					case 4: System.out.println("composer");
						break;
					case 5: System.out.println("message alert tone");
						break;
					case 6: System.out.println("keypad tones");
						break;
					case 7: System.out.println("warning and game tones");
						break;
					case 8: System.out.println("vibrating alert");
						break;
					case 9: System.out.println("screen saver");
						break;
					}
			                break;
		
					case 6: System.out.println("settings");
						System.out.print(Settings);
						System.out.print("Enter settings: ");
						int goSettings = input.nextInt();

						switch(goSettings){
					case 1: System.out.println("call settings");
					case 2: System.out.println("1. automatic redial");
						break;
					case 3: System.out.println("2. speed dailling");
						break;
					case 4: System.out.println("3. call waiting options");
						break;
					case 5: System.out.println("4. own number sending");
						break;
					case 6: System.out.println("5. phone line in use");
						break;
					case 7: System.out.println("6. automatic answer");
						break;
					case 8: System.out.println("phone settings");
						break;
					case 9: System.out.println("1. language");
						break;
					case 10: System.out.println("2. cell info display");
						break;
					case 11: System.out.println("3. welcome note");
						break;
					case 12: System.out.println("4. network selection");
						break;
					case 13: System.out.println("5. lights");
						break;
					case 14: System.out.println("6. confirm sim service actions");
						break;
					case 15: System.out.println("security settings");
						break;
					case 16: System.out.println("1. pin code request");
						break;
					case 17: System.out.println("2. call barring service");
						break;
					case 18: System.out.println("3. fixed dialling");
						break;
					case 19: System.out.println("4. closed user group");
						break;
					case 20: System.out.println("5. phone security");
						break;
					case 21: System.out.println("6. change access code");
						break;
					case 22: System.out.println("restore factory settings");
						break;

					}
				      nokiaMenu();


					case 7: System.out.println("call divert");
						System.out.println(callDivert);
						break;

					
					case 8: System.out.println("games");
						System.out.println(Game);
						break;
							

					case 9: System.out.println("calculator");
						System.out.println(Calculators);
						break;
	
					case 10: System.out.println("reminders");
						 System.out.print(Reminders);
				 		 break;
		
					case 11: System.out.println("clocks");
						 System.out.print(Clock);
						 System.out.print("Enter settings: ");
						 int clocky  = input.nextInt();

						 switch(clocky){
					case 1: System.out.println("alarm clock");
					case 2: System.out.println("clock settings");
					case 3: System.out.println("date setting");
					case 4: System.out.println("stopwatch");
					case 5: System.out.println("countdown timer");
					case 6: System.out.println("auto update of date and time");

					}
			       	        break;

					case 12: System.out.println("profiles");
						 System.out.print(Profiles);
						 break;

					case 13: System.out.println("sim services");
						 System.out.print(simServices);
						 break;
             
				        case 14: System.out.println("invalid");
							break;
		            	



	} 
 
	
   	
	}

}