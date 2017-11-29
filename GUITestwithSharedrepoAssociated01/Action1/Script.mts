Dialog("Login").WinEdit("Agent Name:").Set "mercury"
Dialog("Login").WinEdit("Password:").Set "mercury"
Dialog("Login").WinButton("OK").Click

Window("Flight Reservation").WinObject("Date of Flight:").Type "020318"
Window("Flight Reservation").WinComboBox("Fly From:").Select "Denver"
Window("Flight Reservation").WinComboBox("Fly To:").Select "London"
Window("Flight Reservation").WinButton("FLIGHT").Click


Window("Flight Reservation").Dialog("Flights Table").WinButton("OK").Click

Window("Flight Reservation").WinEdit("Name:").Set "mohon"
Window("Flight Reservation").WinRadioButton("First").Click
Window("Flight Reservation").WinButton("Insert Order").Click

Window("Flight Reservation").Close