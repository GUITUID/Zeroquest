package com.zeroquest.ZeroquestEntities;

public class EntityInventory {

//Les 10 variables de l'inventaire sont stockées dans un tableau
int equipment_durability;
int equipment_atq_bonus;
int equipment_def_bonus;
boolean equipment_equiped;
int equipment_type;
String equipment_name;
String equipment_desc;
String equipment_quality;
int equipment_price;
int equipment_quantity;

public String [][] equipment_list = {
    {/* Nom de l'équipement */},
    {/* Description de l'équipement */},
    {/* Qualité de l'équipement*/},
    {/* Bonus d'attaque */},
    {/* Bonus de défense */},
    {/* Type d'équipement (torse, tête, jambes, objet de quête, nourriture...) */},
    {/* Equipé o/n */},
    {/* Durabilité */},
    {/* Prix de l'équipement */},
    {/* Quantité de l'équipement*/}
   };
}
