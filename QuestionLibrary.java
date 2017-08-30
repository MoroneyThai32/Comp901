package com.moroneyr.compt;

/**
 * Created by MoroneyR on 30/08/2017.
 */

public class QuestionLibrary {

    private String mQuestions [] = {
            "A computer technician is responding to a call about a printer that is causing streaks to appear on every printout. Which of the following is the MOST likely cause?",
            "A technician has connected a laptop to a television via HDMI cable. The entire display cannot be seen on the television. Which of the following settings should the technician modify?",
            "A small workgroup inherits a second-hand printer without networking capabilities. Which of the following is the BEST method of sharing this resource among the workgroup?",
            "Which of the following display technologies provides the BEST range of visible colors?",
            "Which of the following adapters converts an analog signal to a digital signal?",
            "Under normal circumstances, which of the following wireless standards provides the slowest transfer speed at 2.4GHz?",
            "A technician connects a second monitor to a desktop. It is physically located to the right of the existing monitor, but the mouse pointer can only get to the second monitor by moving to the left edge of the screen of the first monitor. Which of following display settings needs to be adjusted to get the pointer to move with the physical placement of the monitor?",
            "A technician upgrades an older computer to Windows 8. The computer is running unusually slow, but the hardware has no problems and is adequate for the OS. Which of the following is the MOST likely solution?",
            "For which of the following types of printers should a technician obtain a maintenance kit containing a fuser, transfer roller, and pickup rollers?",
            "A technician is building a new PC and notices that it has 8 DIMM sockets labeled 0 through to 8. Four are white and four are blue. Which of the following should the technician do FIRST?",
            "A technician needs to run a diagnostic DVD on a laptop running Windows 8.1. After setting the boot order in the UEFI BIOS to the internal DVD-RW drive, the laptop still boots into Windows. Which of the following settings needs to be adjusted in order for the laptop to boot from the DVD-RW drive?",
            "A user is searching for a piano keyboard to connect to a PC. The user would like the keyboard to communicate with the PC. Which of the following features should the user look for on a piano keyboard to BEST facilitate this?",
            "Which of the following cable connection types is an example of a mini DIN?",
            "Which of the following protocols would be used for file sharing between MAC OS and Windows OS workstations on a LAN?",
            "A technician is installing Hyper-V and is getting an error that the software is not able to be installed. Which of the following processor characteristics should be checked?",
            "A technician is troubleshooting an expansion card in a computer that allows the computer to receive faxes over a VoIP line. The line connected to the expansion card is MOST likely which of the following cable types?",
            "Which of the following RAM types can continue working if there is corrupt data?",
            "A user wants to reduce the amount of paper consumed on a multi-function printer. Which of the following settings should be configured to achieve this outcome?",
            "An IT Director wants to increase security on the company website to prevent man-in-the- middle attacks. Which of the following Internet protocols should be implemented to meet the requirement?",
            "Which of the following MUST be the same when replacing a hard drive in a laptop?",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",




    };


    private String mChoices [] [] = {
            {"Duplex unit", "Toner cartridge", "Imaging Drum", "Pickup rollers"},
            {"Keystone", "Resolution", "Privacy filter", "Frame rate"},
            {"Connect the printer to a Bluetooth adapter in order for the users to print", "Connect the printer by using the onboard Infrared port", "Connect the printer to a user’s workstation and share the device", "Connect the printer to a parallel switch box"},
            {"CRT", "LCD", "Plasma", "OLED"},
            {"S-Video to RCA", "HDMI to VGA", "VGA to DVI-D", "DVI-D to HDMI" },
            {"802.11a", "802.11b", "802.11g", "802.11n"},
            {"Scaling", "Rotation", "Position", "Resolution",},
            {"Change the boot sequence", "Switch the BIOS to UEFI", "Defragment the hard drive", "Enable virtualization"},
            {"Thermal", "Impact", "Inkjet", "Laser"},
            {"Install the memory in the four white slots", "Install the memory in the four blue slots", "Consult the motherboard documentation", "Install the memory in slots 0 through 3", "Fill all slots with memory"},
            {"TPM", "Virtualization", "Secure Boot", "UEFI BIOS password"},
            {"MIDI", "USB", "TCP", "HDMI",},
            {"BNC", "PS/2", "RCA", "DB9"},
            {"IMAP", "SMB", "SSH", "RDP"},
            {"Cache size", "Virtualization support", "Number of cores", "Hyperthreading"},
            {"Coaxil", "CAT3", "CAT6", "Multi-mode fiber", "Single-mode fiber"},
            {"Non-parity", "Dual channel", "Buffered", "ECC"},
            {"Orientation", "Duplex", "Collate", "Economy ink"},
            {"HTTPS", "IMAP", "TELENET", "SMTP"},
            {"The interface type of the existing drive", "The speed of the new drive", "The total data capacity of the PC", "The cache size of the new drive"},


    };

    private String mCorrectAnswers[] = {"Imaging Drum", "Resolution",
            "Connect the printer to a user’s workstation and share the device",
            "OLED",
            "VGA to DVI-D",
            "802.11b",
            "Position",
            "Defragment the hard drive",
            "Laser",
            "Consult the motherboard documentation",
            "Secure Boot",
            "MIDI",
            "PS/2",
            "SMB",
            "Virtualization support",
            "Multi-mode fiber",
            "ECC",
            "Duplex",
            "HTTPS",
            "The interface type of the existing drive",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",




    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
