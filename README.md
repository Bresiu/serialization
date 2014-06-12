Java serialization, deserialization and migrating test
======================================================

HOW TO USE Step by step
-----------------------

1. Step
-------

  We make new ```teams``` array,
  ```Player``` class should not have ```number``` field,
  this field is now commented by default
  

  ```
  ArrayList<Team> teams = makeNew.teams();
  System.out.println(teams);
  ```
  
  Output with players without ```int number``` field

  ```
  outputStream.serialize(TEAM_FILE, teams);
  ```
  
2. Step
-------
  
  Now you can build project by run ```MainOld.main()```, so teams are serialized to ```newTeam``` file

3. Step
-------

  Now we change some fields in ```Player``` class (for example, add ```number``` field'),
  delete comment in this lines:

  ```Player.class : 9, end of 19 line in Player constructor, 24, 36```
  
  and we should ignore ```MakeNew.class``` to avoid errors and warnings,
  so delete only ```//``` comment type in:

  ```MakeNew.class : 11, 21```

  now generating players, and inserting to list should be grayed out

  NOTE: We can not change ```serialVersionUID```!

4. Step
-------

  After changing ```Player.class```, build project by run ```MainNew.main()```
  
  New fields will be printed in console with default values:
  ```int -> 0, boolean -> false etc...```
  
  At this point, Players have field named ```number```,
  so we can serialized them back to file.
