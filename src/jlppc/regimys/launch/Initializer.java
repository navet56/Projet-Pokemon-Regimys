package jlppc.regimys.launch;

import jlppc.regimys.enums.Caractere.Stats;
import jlppc.regimys.enums.Type;
import jlppc.regimys.objects.Espece;
import jlppc.regimys.objects.Typedef;
import jlppc.regimys.objects.Typedef.Null;
import jlppc.regimys.util.text.StringKey;

/**
 * Permet d'initialiser des choses.
 * @author Jlppc
 *
 */
public class Initializer {
	public static Espece[] listePoke = new Espece[152];

	/***
	 * Initialise les pokemon (espèces)
	 */
	 public static void initPokemons(){
		 listePoke[0] = new Espece(136, 0, 1, 1, 29, 33, "MissingNo.", Type.NORMAL, Type.VOL, Espece.EVOLUTION_BY_LEVEL, 80, listePoke[0], null, null, new Stats[]{Stats.ATK}, 0f, 0f, "ERROR : MISSINGNO.", 0);
		 listePoke[1] = new Espece(49, 49, 65, 65, 45, 45, "Bulbizarre", Type.PLANTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[2], null, null, new Stats[]{Stats.ATKSPE}, 0.7f, 6.9f, "Il a une étrange graine plantée sur son dos. Elle grandit avec lui depuis sa naissance.", 64);
		 listePoke[2] = new Espece(62, 63, 80, 80, 60, 60, "Herbizarre",Type.PLANTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 32, listePoke[3], null, null, new Stats[]{Stats.ATKSPE, Stats.DEFSPE}, 1f, 13f, "Lorsque le bourgeon sur son dos éclot, il répand un doux parfum pour célébrer sa floraison.", 141);
		 listePoke[3] = new Espece(82, 83, 100, 100, 80, 80, "Florizarre", Type.PLANTE, Type.POISON, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE, Stats.DEFSPE}, 2f, 100f, "Ses pétales lui servent à capter la lumière du soleil. Il peut ainsi en canaliser l'énergie.", 236);
		 listePoke[4] = new Espece(52, 43, 60, 50, 65, 39, "Salamèche", Type.FEU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[5], null, null, new Stats[]{Stats.VIT}, 0.6f, 8.5f, "La flamme sur sa queue représente l'énergie vitale de Salamèche. Quand il est vigoureux, elle brûle plus fort.", 65);
		 listePoke[5] = new Espece(64, 58, 80, 65, 80, 58, "Reptincel", Type.FEU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 36, listePoke[6], null, null, new Stats[]{Stats.VIT, Stats.ATKSPE}, 1.1f, 19f, "En agitant sa gueue, il peut élever la température à un niveau incroyable", 142);
		 listePoke[6] = new Espece(84, 78, 109, 85, 100, 78, "Dracaufeu", Type.FEU, Type.VOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE, Stats.ATKSPE}, 1.7f, 90.5f, "Quand il crache son souffle brûlant, la flamme au bout de sa queue s'embrase.", 209);
		 listePoke[7] = new Espece(48, 65, 50, 64, 43, 44, "Carapuce", Type.EAU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[8], null, null, new Stats[]{Stats.DEF}, 0.5f, 9f, "Caché sous l'eau, il crache un jet d'eau sur sa proie et se cache à l'intérieur de sa carapace.", 66);
		 listePoke[8] = new Espece(63, 80, 65, 80, 58, 59, "Carabaffe", Type.EAU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 36, listePoke[9],null, null, new Stats[]{Stats.DEF, Stats.DEFSPE}, 1f, 22.5f,"On prétend qu'il vit 10 000 ans. Sa queue duveteuse est un symbole de longévité populaire.", 143 );
		 listePoke[9] = new Espece(83, 100, 85, 105, 78, 79, "Tortank", Type.EAU, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.DEFSPE, Stats.DEFSPE, Stats.DEFSPE}, 1.6f, 85.5f, "Il écrase ses adversaires de tout son poids pour leur faire perdre connaissance. Il rentre dans sa carapace s'il se sent en danger.", 210);
		 listePoke[10] = new Espece(30, 35, 20, 20, 45, 45, "Chenipan", Type.INSECTE, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 7, listePoke[11], null, null, new Stats[]{Stats.PV}, 0.3f, 2.9f, "Ses pattes ont des ventouses lui permettant de grimper sur toute surface, notamment les arbres.", 53);
		 listePoke[11] = new Espece(20, 55, 25, 25, 30, 50, "Chrysacier", Type.INSECTE, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 10, listePoke[12], null, null, new Stats[]{Stats.DEF, Stats.DEF}, 0.7f, 9.9f, "Son corps frêle est protégé par sa carapace d'acier. Il encaisse les coups durs en attendant d'évoluer.", 72);
		 listePoke[12] = new Espece(45, 50, 90, 80, 70, 60, "Papilusion", Type.INSECTE, Type.VOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE, Stats.DEFSPE},1.1f, 32f, "Ses ailes sont recouvertes d'une poudre les protégeant de la pluie. Ce Pokémon peut donc voler pendant de grosses averses.", 160);
		 listePoke[13] = new Espece(35, 30, 20, 20, 50, 40, "Aspicot", Type.INSECTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 7, listePoke[14], null, null, new Stats[]{Stats.VIT}, 0.3f, 3.2f, "Son aiguillon empoisonné est très dangereux. Son corps est coloré afin de repousser ses ennemis.", 52);
		 listePoke[14] = new Espece(25, 50, 25, 25, 35, 45, "Coconfort", Type.INSECTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 10, listePoke[15], null, null, new Stats[]{Stats.DEF, Stats.DEF}, 0.6f, 10f, "Incapable de se déplacer de lui-même, il se défend en durcissant sa carapace.", 71);
		 listePoke[15] = new Espece(80, 40, 45, 80, 75, 65, "Dardargnan", Type.INSECTE, Type.POISON, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATK, Stats.ATK, Stats.DEFSPE}, 1f, 29.5f, "Il se sert de ses trois aiguillons empoisonnés pour attaquer sans relâche ses adversaires.", 159);
		 listePoke[16] = new Espece(45, 40, 35, 35, 56, 40, "Roucool", Type.NORMAL, Type.VOL, Espece.EVOLUTION_BY_LEVEL, 18, listePoke[17], null, null, new Stats[]{Stats.VIT}, 0.3f, 1.8f, "Ce Pokémon docile préfère éviter le combat. Toutefois, il se montre très féroce quand on l'agresse.", 55);
		 listePoke[17] = new Espece(60, 55, 50, 50, 71, 63, "Roucoups", Type.NORMAL, Type.VOL, Espece.EVOLUTION_BY_LEVEL, 36, listePoke[18], null,null, new Stats[]{Stats.VIT, Stats.VIT}, 1.1f, 30f, "Il protège son territoire avec ardeur et repousse à coup de bec tout intrus.", 113);
		 listePoke[18] = new Espece(80, 75, 70, 70, 101, 83, "Roucarnage", Type.NORMAL, Type.VOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.VIT, Stats.VIT, Stats.VIT}, 1.5f, 39.5f, "Roucarnage déploie ses ailes majestueuses pour effrayer ses ennemis. Il peut voler à Mach 2.", 172);
		 listePoke[19] = new Espece(56, 35, 25, 35, 72, 30, "Rattata", Type.NORMAL, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 20, listePoke[20], null, null, new Stats[]{Stats.VIT}, 0.3f, 3.5f, "Vivant là où se trouve la nourriture, ce charognard passe ses journées à la rechercher.", 57);
		 listePoke[20] = new Espece(81, 60, 50, 70, 97, 55, "Rattatac", Type.NORMAL, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.VIT, Stats.VIT}, 0.7f, 18.5f, "Ses pattes arrière lui permettent de traverser les rivières. Il est toujours en quête de nourriture.", 127);
		 listePoke[21] = new Espece(60, 30, 31, 31, 70, 40, "Piafabec", Type.NORMAL, Type.VOL, Espece.EVOLUTION_BY_LEVEL, 20, listePoke[22], null, null, new Stats[]{Stats.VIT}, 0.3f, 2f, "Il chasse les insectes dans les hautes herbes. Ses petites ailes lui permettent de voler très vite.", 58);
		 listePoke[22] = new Espece(90, 65, 31, 31, 100, 65, "Rapasdepic", Type.NORMAL, Type.VOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.VIT, Stats.VIT}, 1.2f, 38f, "Il vole à très grande vitesse et attaque en chargeant son ennemi.", 162);
		 listePoke[23] = new Espece(60, 44, 40, 54, 55, 35, "Abo", Type.POISON, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 22, listePoke[24], null, null, new Stats[]{Stats.ATK}, 2f, 6.9f, "Plus il est âgé, plus son corps est long. Il se love autour des arbres pour se reposer.", 62);
		 listePoke[24] = new Espece(85, 69, 65, 79, 80, 60, "Arbok", Type.POISON, Type.NORMAL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATK, Stats.ATK}, 3.5f, 65f, "Pour apeurer ses ennemis, il gonfle sa poitrine et émet d'étranges sons avec sa bouche.", 147);
		 listePoke[25] = new Espece(55, 40, 50, 50, 90, 35, "Pikachu", Type.ELECTRIQUE, Type.AUCUN, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[26], null, null, new Stats[]{Stats.VIT, Stats.VIT}, 0.4f, 6f, "Il élève sa queue pour surveiller les environs. Elle attire souvent la foudre dans cette position.", 82);
		 listePoke[26] = new Espece(90, 55, 90, 80, 110, 60, "Raichu", Type.ELECTRIQUE, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.VIT, Stats.VIT, Stats.VIT}, 0.8f, 30f, "Il peut terrasser des ennemis bien plus imposants en libérant une décharge de 100 000 V.", 122);
		 listePoke[27] = new Espece(75, 85, 20, 30, 40, 50, "Sabelette", Type.SOL, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 22, listePoke[28], null, null, new Stats[]{Stats.DEF}, 0.6f, 12f, "Il s'enterre et vit dans les sous-sols. S'il se sent menacé, il se met en boule pour se protéger.", 93);
		 listePoke[28] = new Espece(100, 110, 45, 55, 65, 75, "Sablaireau", Type.SOL, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.DEF, Stats.DEF}, 1f, 29.5f, "Il se roule en boule hérissée de piques s'il est menacé, il peut ainsi s'enfuir ou attaquer.", 163);
		 listePoke[29] = new Espece(47, 52, 40, 40, 41, 55, "Nidoran♀", Type.POISON, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[30], null, null, new Stats[]{Stats.PV}, 0.4f, 7f, "Petite et docile, elle se protège avec sa minuscule corne empoisonnée lorsqu'elle est attaquée.", 59);
		 listePoke[30] = new Espece(62, 67, 55, 55, 56, 70, "Nidorina", Type.POISON, Type.AUCUN, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[31], null, null, new Stats[]{Stats.PV, Stats.PV}, 0.8f, 20f, "La femelle a un tempérament doux. Elle émet des cris ultrasoniques capables de déstabiliser ses ennemis.", 117);
		 listePoke[31] = new Espece(92, 87, 75, 85, 76, 90, "Nidoqueen", Type.POISON, Type.SOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.PV, Stats.PV, Stats.PV}, 1.3f, 60f, "Son corps est recouvert d'écailles en forme de pointes. Quand ce Pokémon s'énerve, ses pointes se dressent de façon menaçante.", 194);
		 listePoke[32] = new Espece(57, 40, 40, 40, 50, 46, "Nidoran♂", Type.POISON, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[33], null, null, new Stats[]{Stats.ATK}, 0.5f, 9f, "Il jauge le terrain en laissant ses oreilles dépasser de l'herbe. Il se défend avec sa corne toxique.", 60);
		 listePoke[33] = new Espece(72, 57, 55, 55, 65, 61, "Nidorino", Type.POISON, Type.AUCUN, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[34], null, null, new Stats[]{Stats.ATK, Stats.ATK}, 0.9f, 19.5f, "Très agressif, il est prompt à répondre à la violence. La corne sur sa tête est venimeuse.", 118);
		 listePoke[34] = new Espece(102, 77, 85, 75, 85, 81, "Nidoking", Type.POISON, Type.SOL, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATK, Stats.ATK, Stats.ATK}, 1.4f, 62f, "Un coup de sa puissante queue peut briser un poteau téléphonique comme une allumette.", 195);
		 listePoke[35] = new Espece(45, 48, 60, 65, 35, 70, "Mélofée", Type.FEE, Type.AUCUN, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[36], null, null, new Stats[]{Stats.PV, Stats.PV}, 06f, 7.5f, "La lumière de la lune qu'il emmagasine dans ses ailes dorsales lui permet de flotter dans les airs.", 68);
		 listePoke[36] = new Espece(70, 73, 95, 90, 60, 95, "Mélodelfe", Type.FEE, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.PV, Stats.PV, Stats.PV}, 1.3f, 40f, "Il aime le calme des montagnes. Son ouïe exceptionnelle entendrait une aiguille tomber à 1km.", 129);
		 listePoke[37] = new Espece(41, 40, 50, 65, 65, 38, "Goupix", Type.FEU, Type.AUCUN, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[38], null, null, new Stats[]{Stats.VIT}, 0.6f, 9.9f, "Avec l'âge, la fourrure de ses six queues devient de plus en plus belle et soyeuse. Elle est chaude au toucher.",63);//TROP KAWAII!!!!
		 listePoke[38] = new Espece(76, 75, 81, 100, 100, 73, "Feunard", Type.FEU, Type.AUCUN, Espece.NO_EVOLUTION, -1, null,null, null, new Stats[]{Stats.VIT, Stats.DEFSPE}, 1.1f, 19.9f, "Il a neuf longues queues et une fourrure qui brille comme de l'or. On dit qu'il peut vivre 1 000 ans.", 178);
		 listePoke[39] = new Espece(45, 20, 45, 25, 20, 115, "Rondoudou", Type.NORMAL, Type.FEE, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[40],null, null, new Stats[]{Stats.PV, Stats.PV}, 0.5f, 5.5f, "En se gonflant, il peut chanter une longue berceuse qui endort inévitablement ses adversaires.", 76);
		 listePoke[40] = new Espece(70, 45, 85, 50, 45, 140, "Grodoudou", Type.NORMAL, Type.FEE, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.PV, Stats.PV, Stats.PV}, 1f, 12f, "En cas de danger, il gonfle d'air son corps doux et potelé dans des proportions gigantesques.", 109);
		 listePoke[41] = new Espece(45, 35, 30, 40, 55, 40, "Nosferapti", Type.POISON, Type.VOL, Espece.EVOLUTION_BY_LEVEL, 22, listePoke[42], null, null, new Stats[]{Stats.VIT}, 0.8f, 7.5f, "Ce pokemon est détesté en raison de sa forte présence dans les grottes. Malgré le fait qu'il n'aie pas d'yeux, ce pokemon arrive a voir avec des utltrasons.", 54);
		 listePoke[42] = new Espece(80, 70, 65, 75, 90, 75, "Nosferalto", Type.POISON, Type.VOL, Espece.EVOLUTION_BY_LOVE, 1, listePoke[0], null, null, new Stats[]{Stats.VIT, Stats.VIT}, 1.6f, 55f, "Quand il se met à sucer du sang, il ne s'arrête qu'une fois rassasié. C'est un chasseur nocturne.", 171);
		 listePoke[43] = new Espece(50, 55, 75, 65, 30, 45, "Mystherbe", Type.PLANTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 21, listePoke[44], null, null, new Stats[]{Stats.ATKSPE}, 0.5f, 5.4f, "Le jour, il reste en sous-sol et évite le soleil. Il grandit en se baignant au clair de lune.", 78);
		 listePoke[44] = new Espece(65, 70, 85, 75, 40, 60, "Ortide", Type.PLANTE, Type.POISON, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[45] ,null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE}, 0.8f, 8.6f, "Il sent très mauvais ! Mais une personne sur 1 000 aime la puanteur de son corps nauséabond.", 132);
		 listePoke[45] = new Espece(80, 85, 110, 90, 50, 75, "Rafflesia", Type.PLANTE, Type.POISON, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE, Stats.ATKSPE}, 1.2f, 18.6f, "Il possède des pétales énormes. À chaque pas, ils sèment d'épais nuages de pollen toxique.", 184);
		 listePoke[46] = new Espece(70, 55, 45, 55, 25, 35, "Paras", Type.INSECTE, Type.PLANTE, Espece.EVOLUTION_BY_LEVEL, 24, listePoke[47], null, null, new Stats[]{Stats.ATK}, 0.3f, 5.4f, "Il s'enfouit sous terre pour ronger des racines afin de nourrir les champignons sur son dos.", 70);
		 listePoke[47] = new Espece(95, 80, 60, 80, 30, 60, "Parasect", Type.INSECTE, Type.PLANTE, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATK, Stats.ATK, Stats.DEF}, 1f, 29.5f, "Un champignon parasite plus gros que Parasect contrôle son corps. Il répand des spores empoisonnées.", 128);
		 listePoke[48] = new Espece(55, 50, 40, 55, 45, 60, "Mimitoss", Type.INSECTE, Type.POISON, Espece.EVOLUTION_BY_LEVEL, 31, listePoke[49], null, null, new Stats[]{Stats.DEFSPE}, 1f, 30f, "Il vit à l'ombre des grands arbres où il se nourrit d'insectes. Il est attiré par la lumière.", 75);
		 listePoke[49] = new Espece(65, 60, 90, 75, 90, 70, "Aéromite", Type.INSECTE, Type.POISON,Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.VIT}, 1.5f, 12.5f, "Les écailles qu'il sème ont le pouvoir de paralyser totalement un ennemi.", 138);
		 listePoke[50] = new Espece(55, 25, 35, 45, 95, 10, "Taupiqueur", Type.SOL, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 26, listePoke[51], null, null, new Stats[]{Stats.VIT}, 0.2f, 0.8f, "Son épiderme est très fin. S'il est exposé au soleil, son sang se réchauffe, ce qui l'affaiblit.", 81);
		 listePoke[51] = new Espece(80, 50, 50, 70, 120, 35, "Triopikeur", Type.SOL, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.VIT, Stats.VIT}, 0.7f, 33.3f, "Terriblement puissants, ils peuvent creuser un tunnel dans tout type de sol et jusqu'à 100 km de profondeur.", 153);
		 listePoke[52] = new Espece(45, 35, 40, 40, 90, 40, "Miaouss", Type.NORMAL, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 28, listePoke[53], null, null, new Stats[]{Stats.VIT}, 0.4f, 4.2f, "Son regard s'anime à la vue d'un objet brillant. C'est un Pokémon nocturne.", 69);
		 listePoke[53] = new Espece(70, 60, 65, 65, 115, 65, "Persian", Type.NORMAL, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.VIT, Stats.VIT}, 1f, 32f, "Un Pokémon très snob. La taille du joyau qui orne son front alimente bien des débats parmi ses fans.", 148);
		 listePoke[54] = new Espece(52, 48, 65, 50, 55, 50, "Psykokwak", Type.EAU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 33, listePoke[55], null, null, new Stats[]{Stats.ATKSPE}, 0.8f, 19.6f, "Il ne se souvient pas qu'il a des pouvoirs psy. C'est pour cela qu'il a l'air si confus.", 80);
		 listePoke[55] = new Espece(82, 78, 95, 80, 85, 80, "Akwakwak", Type.EAU, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE}, 1.7f, 76.6f, "Il apparaît dans les étendues d'eau au crépuscule. Si son front brille, il se sert de sa télékinésie.", 174);
		 listePoke[56] = new Espece(80, 35, 35, 45, 70, 40, "Férosinge", Type.COMBAT, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 28, listePoke[57], null, null, new Stats[]{Stats.ATK}, 0.5f, 28f, "Il ne peut dissocier ses amis de ses ennemis et a tendance à enrager lorsqu'on l'approche.", 74);
		 listePoke[57] = new Espece(105, 60, 60, 70, 95, 65, "Colossinge", Type.COMBAT, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATK, Stats.ATK}, 1f, 32f, "Sa fureur prend fin quand il n'a plus personne à frapper. Il est difficile d'en être témoin.", 149);
		 listePoke[58] = new Espece(70, 45, 70, 50, 60, 55, "Caninos", Type.FEU, Type.AUCUN, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[59], null, null, new Stats[]{Stats.ATK}, 0.7f, 19f, "Il est courageux et fier. Il se dresse vaillamment devant ses ennemis même s'ils sont plus puissants.", 91);
		 listePoke[59] = new Espece(110, 80, 100, 80 , 95, 90, "Arcanin", Type.FEU, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null ,null, new Stats[]{Stats.ATK, Stats.ATK}, 1.9f, 155f, "Son aboiement est tout simplement majestueux. On ne peut que ramper à ses pieds après l'avoir entendu.", 213);
		 listePoke[60] = new Espece(50, 40, 40, 40, 90, 40, "Ptitard", Type.EAU, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 25, listePoke[61], null, null, new Stats[]{Stats.VIT}, 0.6f, 12.4f, "Sa peau est si mince qu'on voit ses organes internes. Il tient à peine sur ses nouveaux pieds.", 77);
		 listePoke[61] = new Espece(65, 65, 50, 50, 90, 65, "Têtarte", Type.EAU, Type.AUCUN, Espece.EVOLUTION_BY_OBJECT, -1, listePoke[62], null, null, new Stats[]{Stats.VIT, Stats.VIT}, 1f, 20f, " Ce Pokémon amphibie transpire continuellement quand il est hors de l'eau afin d'hydrater son corps.", 131);
		 listePoke[62] = new Espece(95, 95, 70, 90, 70, 90, "Tartard", Type.EAU, Type.COMBAT, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.DEF, Stats.DEF, Stats.DEF}, 1.3f, 54f, "Il possède de sacrés biscoteaux. Il peut parcourir sans relâche l'Océan Pacifique.", 185);
		 listePoke[63] = new Espece(20, 15, 105, 55, 90, 25, "Abra", Type.PSY, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 16, listePoke[64], null, null, new Stats[]{Stats.ATKSPE}, 0.9f, 19.5f, "Il prévoit les attaques futures et se téléporte pour se mettre à l'abri et éviter le combat.", 75);
		 listePoke[64] = new Espece(35, 30, 120, 70, 105, 40, "Kadabra", Type.PSY, Type.AUCUN, Espece.EVOLUTION_BY_TRADE, -1, listePoke[65], null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE}, 1.3f, 56.5f, "En utilisant ses pouvoirs, il émet des ondes alphas et cause des distorsions électroniques.", 145);
		 listePoke[65] = new Espece(50, 45, 135, 95, 120, 55, "Alakazam", Type.PSY, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATKSPE, Stats.ATKSPE, Stats.ATKSPE}, 1.5f, 48f, "Son cerveau hors du commun peut effectuer des opérations à la vitesse d'un ordinateur. Il a un QI de 5 000.", 186);
		 listePoke[66] = new Espece(80, 50, 35, 35, 35, 70, "Machoc", Type.COMBAT, Type.AUCUN, Espece.EVOLUTION_BY_LEVEL, 28, listePoke[67], null, null, new Stats[]{Stats.ATK}, 0.8f, 19.5f, "Son corps est essentiellement composé de muscles. Même s'il a la taille d'un petit enfant, il peut soulever 100 adultes avec ses bras.", 75);
		 listePoke[67] = new Espece(100, 70, 50, 60, 45, 80, "Machopeur", Type.COMBAT, Type.AUCUN, Espece.EVOLUTION_BY_TRADE, -1, listePoke[68], null, null, new Stats[]{Stats.ATK, Stats.ATK}, 1.5f, 70.5f, "Son corps est si puissant qu'il lui faut une ceinture de force pour équilibrer ses mouvements.", 146);
		 listePoke[68] = new Espece(130, 80, 65, 85, 55, 90, "Mackogneur", Type.COMBAT, Type.AUCUN, Espece.NO_EVOLUTION, -1, null, null, null, new Stats[]{Stats.ATK, Stats.ATK, Stats.ATK}, 1.6f, 130f, "Ses deux paires de bras permettent à Mackogneur d'envoyer une série de 1000 coups de poing en 2s.", 193);
		 listPoke[612] = new Espece (999, 999, 999, 999, 999, 999, "GrossBite", Type.BITE, Type.COMBAT, Espece.NO_EVOLUTION, -1, null, null, null, new Stat[]{Stats.ATK, Stats.ATK, Stats.ATK}, 1.6f, 130f, "Sa grosse queue terasse tout ses adversaires, meme sa pute de mère", 199)
	
	 }
	 /**
	  * Initialise les sprites
	  */
	 public static void initSprites(){
		 
	 }
	 
	 public static void initKeys(){
		 StringKey.initialisateKeys();
	 }
	 
	 
}
