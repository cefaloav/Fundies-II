import java.awt.Color;

interface IPaint{};
interface IMixture{};

class Solid {
  String name;
  String Color;
}

class Combo{
  String name;
  IMixture operation; //describes how the recipe for the combo was made 
}

//darkens a paint color 
class Darken implements IMixture{
  
}


//brightens a paint color 
class Brighten implements IMixture{
  
}

//bl
class Blend implements IMixture{
  
}