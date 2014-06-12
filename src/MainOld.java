import java.util.ArrayList;

public class MainOld {

    private static final String TEAM_FILE = "newTeam";

    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();

        MakeNew makeNew = new MakeNew();

        /**
         * (1) STEP
         *
         * We make new 'teams' array,
         * Player class should not have 'number' field,
         * this field is now commented by default
         */
        ArrayList<Team> teams = makeNew.teams();
        System.out.println(teams);
        /**
         * Output with players without 'int number' field
         */
        outputStream.serialize(TEAM_FILE, teams);
        /**
         * (2) STEP
         *
         * Now you can build project by run MainOld.main(), so teams are serialized to 'newTeam' file
         */

        /**
         * (3) STEP
         *
         * Now we change some fields in Player class (for example, add 'number' field'),
         * delete comment in this lines:
         *
         * Player.class : 9, end of 19 line in Player constructor, 24, 36
         *
         * and we should ignore 'MakeNew.class' to avoid errors and warnings,
         * so delete only '//' comment type in:
         *
         * MakeNew.class : 11, 21
         *
         * now generating players, and inserting to list should be grayed out
         *
         * NOTE: We can not change serialVersionUID!
         *
         */

        /**
         * (4) STEP
         *
         * After changing 'Player.class', build project by run MainNew.main(),
         * to deserialize file with new fields
         *
         * New fields will be printed in console with default values:
         * int -> 0, boolean -> false etc...
         *
         * At this point, Players have field named 'number',
         * so we can serialized them back to file.
         */
    }
}
