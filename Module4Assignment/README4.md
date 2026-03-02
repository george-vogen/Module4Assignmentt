<p>You will be creating an application that will calculate the number of square feet to be painted in one or more rooms.</p>
<p>Each Room object is composed of four Wall objects. A Room determines its paintable area by summing the area of its Walls.</p>
<p>From the main menu, the user can choose to add a Room to the calculator, write the current Rooms to a file, read Rooms from a file into memory, and print the current Rooms.</p>
<p>&nbsp;</p>
<h3>Requirements</h3>
<p><span>Accept and clone the <span style="font-size: 12pt;">assignment</span> from GitHub Classroom using the following link:&nbsp;</span></p>
<p>Create the following classes.</p>
<h3>Wall</h3>
<p>Fields</p>
<table style="border-collapse: collapse; width: 59.3987%;" border="1">
    <tbody>
        <tr>
            <td style="width: 33.2695%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Data Type</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Name</strong></td>
        </tr>
        <tr>
            <td style="width: 33.2695%;">private</td>
            <td style="width: 33.3333%;">double</td>
            <td style="width: 33.3333%;">width</td>
        </tr>
        <tr>
            <td style="width: 33.2695%;">private</td>
            <td style="width: 33.3333%;">double</td>
            <td style="width: 33.3333%;">height</td>
        </tr>
    </tbody>
</table>
<p>Methods</p>
<table style="border-collapse: collapse; width: 98.6146%;" border="1">
    <tbody>
        <tr>
            <td style="width: 19.9872%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Return Type</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Name</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Parameters</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Purpose</strong></td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Wall</td>
            <td style="width: 19.9872%;">double width, double height</td>
            <td style="width: 19.9872%;">Constructor that initializes width and height fields with its parameters.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">double</td>
            <td style="width: 19.9872%;">getWidth</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Returns the width field.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">double</td>
            <td style="width: 19.9872%;">getHeight</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Returns the height field.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">double</td>
            <td style="width: 19.9872%;">getArea</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Returns the calculated area of the wall.</td>
        </tr>
    </tbody>
</table>
<p>&nbsp;</p>
<h3>Room</h3>
<p>Fields</p>
<table style="border-collapse: collapse; width: 59.3987%;" border="1">
    <tbody>
        <tr>
            <td style="width: 33.2695%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Data Type</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Name</strong></td>
        </tr>
        <tr>
            <td style="width: 33.2695%;">private</td>
            <td style="width: 33.3333%;">List&lt;Wall&gt;</td>
            <td style="width: 33.3333%;">wallList</td>
        </tr>
    </tbody>
</table>
<p>Methods</p>
<table style="border-collapse: collapse; width: 98.6146%;" border="1">
    <tbody>
        <tr>
            <td style="width: 19.9872%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Return Type</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Name</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Parameters</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Purpose</strong></td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Room</td>
            <td style="width: 19.9872%;">double width, double length, double height</td>
            <td style="width: 19.9872%;">Constructor that creates four Wall objects -- two using width and height, and two using length and height -- and adds them to the list of Walls.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">double</td>
            <td style="width: 19.9872%;">getArea</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Returns the calculated area of the room.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">String</td>
            <td style="width: 19.9872%;">toString</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Returns a String containing the room's area.</td>
        </tr>
    </tbody>
</table>
<p>&nbsp;</p>
<h3>PaintCalculator</h3>
<p>Fields</p>
<table style="border-collapse: collapse; width: 59.3987%;" border="1">
    <tbody>
        <tr>
            <td style="width: 33.2695%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Data Type</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Name</strong></td>
        </tr>
        <tr>
            <td style="width: 33.2695%;">private</td>
            <td style="width: 33.3333%;">List&lt;Room&gt;</td>
            <td style="width: 33.3333%;">roomList</td>
        </tr>
    </tbody>
</table>
<p>Methods</p>
<table style="border-collapse: collapse; width: 98.6146%;" border="1">
    <tbody>
        <tr>
            <td style="width: 19.9872%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Return Type</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Name</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Parameters</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Purpose</strong></td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">void</td>
            <td style="width: 19.9872%;">addRoom</td>
            <td style="width: 19.9872%;">double length, double width, double height</td>
            <td style="width: 19.9872%;">Creates a room object and adds it to its list field.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">String</td>
            <td style="width: 19.9872%;">toString</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Returns a String containing the areas of all rooms in the list. If there are no rooms, say so.</td>
        </tr>
    </tbody>
</table>
<p>&nbsp;</p>
<h3>Main</h3>
<p>Fields</p>
<p><strong>Note: All fields in Main are static.</strong></p>
<table style="border-collapse: collapse; width: 59.3987%;" border="1">
    <tbody>
        <tr>
            <td style="width: 33.2695%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Data Type</strong></td>
            <td style="width: 33.3333%; text-align: center;"><strong>Name</strong></td>
        </tr>
        <tr>
            <td style="width: 33.2695%;">private</td>
            <td style="width: 33.3333%;">Scanner</td>
            <td style="width: 33.3333%;">keyboard</td>
        </tr>
        <tr>
            <td style="width: 33.2695%;">private</td>
            <td style="width: 33.3333%;">PaintCalculator</td>
            <td style="width: 33.3333%;">paintCalculator</td>
        </tr>
    </tbody>
</table>
<p><span style="font-family: inherit; font-size: 1rem;"><br />Methods </span></p>
<p><span style="font-family: inherit; font-size: 1rem;"><strong>Note: All methods in Main are static.</strong></span></p>
<table style="border-collapse: collapse; width: 98.6146%;" border="1">
    <tbody>
        <tr>
            <td style="width: 19.9872%; text-align: center;"><strong>Access Specifier</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Return Type</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Name</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Parameters</strong></td>
            <td style="width: 19.9872%; text-align: center;"><strong>Purpose</strong></td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">private</td>
            <td style="width: 19.9872%;">void</td>
            <td style="width: 19.9872%;">printMenu</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">
                <p>Prints the menu options:</p>
                <ul>
                    <li>Add room</li>
                    <li>View rooms</li>
                    <li>Read rooms from file</li>
                    <li>Write rooms to file</li>
                    <li>Exit program</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">private</td>
            <td style="width: 19.9872%;">double</td>
            <td style="width: 19.9872%;">promptForDimension</td>
            <td style="width: 19.9872%;">String dimensionName</td>
            <td style="width: 19.9872%;">Prints a prompt for the user to enter the given dimension and returns their response.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">private</td>
            <td style="width: 19.9872%;">void</td>
            <td style="width: 19.9872%;">createRoom</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Prompts the user to enter length, width, and height. Tells the paint calculator to add a room using given dimensions.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">private</td>
            <td style="width: 19.9872%;">void</td>
            <td style="width: 19.9872%;">readFile</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Reads a paint calculator object from a file and sets it to the field. Using exception handling, prints an error if the file cannot be read.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">private</td>
            <td style="width: 19.9872%;">void</td>
            <td style="width: 19.9872%;">writeFile</td>
            <td style="width: 19.9872%;">--</td>
            <td style="width: 19.9872%;">Writes the paint calculator field to a file. Using exception handling, prints an error if the file cannot be written.</td>
        </tr>
        <tr>
            <td style="width: 19.9872%;">public</td>
            <td style="width: 19.9872%;">void</td>
            <td style="width: 19.9872%;">main</td>
            <td style="width: 19.9872%;">String[] args</td>
            <td style="width: 19.9872%;">
                <p>Contains a loop to:</p>
                <ul>
                    <li>print the menu</li>
                    <li>read user's selection</li>
                    <li>call appropriate method based on selection</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>
<p>&nbsp;</p>
<p>Only the Main class should perform input or output. Do not create Scanners or use System.out anywhere but in Main.</p>