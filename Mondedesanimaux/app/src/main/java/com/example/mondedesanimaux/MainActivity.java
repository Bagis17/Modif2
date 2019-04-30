package com.example.mondedesanimaux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.support.v7.widget.RecyclerView;
import android.support.v7.widget.GridLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Animal> lstAnimal ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstAnimal = new ArrayList<>();
        lstAnimal.add(new Animal("Lion","sylla","Le lion (Panthera leo) est une espèce de mammifères carnivores de la famille des félidés. La femelle du lion est la lionne, son petit est le lionceau.\n Le lion est le deuxième plus grand félidé, après le tigre, et ainsi le plus grand carnivore d'Afrique.\n Bien qu'étant aujourd'hui confiné presque uniquement à la savane africaine, la répartition passée du lion montre qu'il a une grande capacité d'adaptation et peut vivre dans de nombreux habitats et sous des climats très différents (tempérés à tropicaux). Le lion est cependant inféodé aux milieux ouverts ou semi-ouverts plutôt secs. En Afrique l'habitat naturel du lion est donc principalement la savane, mais aussi les forêts décidues semi-ouvertes (forêt tropicale sèche) et les semi-déserts. L'espèce manque ainsi naturellement dans les forêts tropicales humides denses d'Afrique centrale, dans les marais à végétation trop haute, et dans les déserts les plus arides de l'Afrique du Nord et du Proche-Orient. En Inde le lion d'Asie pouvait vivre autrefois dans les mêmes régions que le tigre, car ils n'occupaient pas les mêmes habitats et ne chassaient pas les mêmes proies, le tigre vivant plutôt dans les forêts denses et autres végétations très fournies comme les marais. Il n'y avait donc que peu de concurrence entre ces deux espèces, leur niche écologique était bien différenciée. ",R.drawable.lion));
        lstAnimal.add(new Animal("Chacal du Sénégal","sylla","Le chacal du Sénégal (Canis aureus anthus) est une sous-espèce de canidé qui vit en Afrique de l'Ouest. Aussi appelé chacal svelte, il est le plus grand des espèces de chacals.\n Comme le loup et le chien, ils appartiennent au genre Canis. On les trouve en Afrique, en Asie mais également en Europe méditerranéenne et plus particulièrement dans les Balkans. ",R.drawable.chacal));
        lstAnimal.add(new Animal("Leopard","sylla","Le Léopard ou Panthère (Panthera pardus) est une espèce de félins de la sous-famille des panthérinés. Ce félin présente un pelage fauve tacheté de rosettes ; une forme mélanique existe également. Excellent grimpeur et sauteur, le léopard a la particularité de hisser ses proies à la fourche d'un arbre pour les mettre hors de portée des autres prédateurs.\n Félin solitaire et opportuniste, le léopard est largement distribué en Afrique et en Asie du Sud-Est sur de nombreux types d'habitats. La taille de la population est toutefois considérée comme en baisse par l'Union internationale pour la conservation de la nature, qui classe l'espèce comme quasi menacée. Cinq sous-espèces sont considérées comme en danger ou en danger critique d'extinction : le léopard d'Arabie, le léopard de l'Amour, la panthère de Java, la panthère de Ceylan et la panthère de Perse. \n Le léopard a une place importante dans certaines cultures africaines où l'animal, considéré comme le roi des animaux, est l'attribut des chefs. La société secrète Aniota peut être considérée comme l'origine de légendes sur les hommes-léopards, équivalents des loups-garous occidentaux. En Europe, le léopard est décrit pour la première fois dans les bestiaires comme un animal vil issu d'un croisement adultère entre le lion (leo) et un félin légendaire, le pard. Cette réputation d'animal cruel et sanguinaire perdurera au moins jusqu'au XVIe siècle. L'image du félin est souvent utilisée dans la publicité (Dulux Valentine par exemple) ou dans les arts, comme la célèbre Panthère rose. ",R.drawable.b987fdec7e900eda));

        lstAnimal.add(new Animal("Coucal noir","Coucal noir","Le Coucal noir (Centropus grillii), également appelé coucal noiron ou coucal noirou, est une espèce d'oiseaux de la famille des Cuculidae. C'est une espèce monotypique. Il était auparavant considéré comme une sous-espèce du Coucal toulou (Centropus toulou). \n Le coucal noir mâle mesure 30 cm de longueur, tandis que la femelle mesure 34 cm, sinon ils ont une apparence similaire. En plumage nuptial, la tête, le corps et la queue sont noirs, à l'exception de quelques taches chamois sur la croupe, et les ailes sont roux. En dehors de la saison de reproduction, les parties supérieures sont brun foncé avec un barrage roussâtre. Les yeux sont bruns et le bec et les pattes sont noirs. Les juvéniles sont roux avec diverses barrières et traînées sombres et légères.\nOn le trouve en Angola, Bénin, Botswana, Burkina Faso, Burundi, Cameroun, République centrafricaine, Tchad, République du Congo, RDC, Côte-d'Ivoire, Ethiopie, Gabon, Gambie, Ghana, Guinée, Guinée-Bissau, Kenya, Libéria, Malawi, Mali, Mozambique, Namibie, Niger, Nigéria, Rwanda, Sénégal, Sierra Leone, Afrique du Sud, Soudan, Swaziland, Tanzanie, Togo, Ouganda, Zambie et Zimbabwe. Il est résident dans certains endroits et migrant dans d'autres. Son habitat est constitué de marais, de savanes, de prairies, de fougères, de sous-bois et de clairières dans les bois, et parfois de roseaux et de papyrus. Il se produit généralement en dessous de 1 500 m, mais parfois jusqu'à 2 000 m.\nL'espèce a le rôle des sexes inversés avec les mâles s'occupant du nid alors que les femelles sont polyandres et maintiennent des territoires. Des études sur le système hormonal montrent que la progestérone est responsable du contrôle de l'agressivité des femelles.",R.drawable.coucal_noir));
        lstAnimal.add(new Animal("Euplecte franciscain","Euplecte franciscain","L'Euplecte franciscain (Euplectes franciscanus) est une espèce de passereaux de la famille des Ploceidae. \n C'est un oiseau trapu de 12,5 à 15 cm de long. Le mâle, en période de reproduction, est écarlate en dehors de sa face et de son poitrail qui sont noirs et de ses ailes et de sa queue brunes. Le bec conique est épais et noir. Hors période de reproduction, le mâle est jaune-pâle, maculé de brun au-dessus et devenant blanchâtre au-dessous. Il a des sourcils chamois. Les femelles ressemblent aux mâles mais sont plus petites. Les jeunes ont des bandes pâles plus larges sur leurs ailes. \n Ce tisserin vit dans les zones dégagées, en particulier les prairies d'altitude et souvent près de l'eau ",R.drawable.euplecte_franciscain));
        lstAnimal.add(new Animal("Euplecte vorabe","Categorie","L'Euplecte vorabé (Euplectes afer), aussi appelé Worabée, est une espèce de passereaux de la famille des Ploceidae.\n" +
                "\n" +
                "Il est l'un des tisserins les plus connus, et recherché comme oiseau de cage. \n Cet oiseau possède des couleurs vives. En plumage nuptial, le mâle est de couleur jaune d'or, avec la poitrine, la face et la gorge d'un noir brillant.\n" +
                "\n" +
                "En dehors de la saison de reproduction, de juillet à décembre, il est semblable aux femelles et aux juvéniles\n C'est une espèce grégaire, aimant vivre en groupes. En cage il peut aussi cohabiter avec des Euplectes ignicolores. ",R.drawable.euplecte_vorabe));

        lstAnimal.add(new Animal("Impala","","L'impala (Aepyceros melampus) est une espèce de mammifère faisant partie de l’ordre des artiodactyles et plus précisément de la famille des bovidés.\n" +
                "\n" +
                "On le retrouve principalement à l’est de l’Afrique centrale et du sud (notamment en Afrique du Sud, en Angola, en République démocratique du Congo, au Rwanda, en Ouganda et au Kenya).\n" +
                "\n" +
                "Deux sous-espèces sont reconnues. Cette espèce est la seule du genre Aepyceros. \n Les impalas font partie de la famille des antilopes, ils ressemblent aux kobs, gazelles et aux cerfs, ils mesurent généralement de 1,10 m à 1,50 m de longueur \nl faut aussi mentionner leurs lignes noires uniques à chaque individu au bout des oreilles, sur le dos de la queue, le haut des cuisses et sur le front. Ces lignes noires sont très utiles aux impalas puisque ce sont des signes qui leur permettent de se reconnaître entre eux.\n L'impala est une antilope, athlétique et très gracieuse, réputé pour sa vitesse et son agilité à bondir. L’ouïe et l'odorat de l'impala sont complétés par une vue excellente. \n Les impalas vivent dans les savanes où l’herbe (courte ou moyenne) abonde. Bien qu’ils apprécient la proximité d’une source d’eau, celle-ci n'est généralement pas essentielle aux impalas puisqu’ils peuvent se satisfaire de l’eau contenue dans l’herbe qu’ils consomment. Leur environnement est relativement peu accidenté et n'est composé que d'herbes, de buissons ainsi que de quelques arbres. ",R.drawable.impala));
        lstAnimal.add(new Animal("Gazelle","Categorie","Les gazelles sont des mammifères, de la famille des bovidés, principalement de la sous-famille des antilopinés, vivant dans les steppes d'Afrique et d'Asie. Le nom gazelle, féminin, est issu du mot Persan ghazâl, qui signifie « élégante et rapide ».\n" +
                "\n" +
                "Les gazelles sont des petites antilopes élancées, agiles et très rapides à la course. Certaines gazelles peuvent atteindre une vitesse de plus de 100 km/h sur une distance de plusieurs centaines de mètres ou courir à une vitesse de 90 km/h sur des plus longues distances allant de 30 à 80 km et ont aussi la faculté d'entrecouper leurs courses de grands bonds. On trouve la plupart des gazelles dans les savanes africaines, sud-asiatiques et au Sahara. \nAu sens strict les gazelles correspondent aux espèces du genre Gazella. Toutefois le genre Gazella a été scindé en plusieurs genres en 2005 : Gazella, Eudorcas et Nanger. Il existe également des espèces d'autres genres qui portent le nom vernaculaire de « gazelle », certaines en dehors de la sous-famille des Antilopinae (par exemple Aepyceros melampus dans la sous-famille des Aepycerotinae, appelé impala mais également gazelle à pieds noirs).  ",R.drawable.gazellev));
        lstAnimal.add(new Animal("Girafe","Girafe","La girafe ou 'Ndiambala'au Senegal est un genre de mammifères africains d'ongulés à doigts égaux, les plus hauts animaux terrestres vivants et les plus grands ruminants. \n" +
                "Afficher la description d'origine\n" +
                "Nom scientifique : Giraffa\n" +
                "Taille : Girafe: 4,6 m 6,1 m\n" +
                "Période de gestation : Girafe: 15 mois \n" +
                "Poids : Girafe: 800 kg \n" +
                "Vitesse : 60 km/h \n" +
                "Sommeil quotidien : 4,6 heures ",R.drawable.giraf));

        lstAnimal.add(new Animal("Martin pecheur pie","","Le Martin-pêcheur pie (Ceryle rudis) ou Alcyon pie, est une espèce d'oiseau de la famille des Alcedinidae. \n Cet oiseau se reconnait facilement à son plumage moucheté noir et blanc (qui lui a donné son nom), son gros et long bec noir et à sa huppe.\n" +
                "\n" +
                "Il est relativement grand (25 cm de longueur pour une envergure de 46 cm) pour un oiseau de sa famille.\n" +
                "\n" +
                "Ses yeux sont brun foncé.\n" +
                "\n" +
                "Il présente un dimorphisme sexuel : le mâle arbore deux bandes pectorales noires (une davantage que la femelle). \n Son aire s'étend de l'Afrique subsaharienne via la vallée du Nil et l'Asie méridionale à l'Indochine.\n     Il vit aussi bien autour des points d'eau douce que salée. Il creuse des galeries horizontales dans les berges des fleuves. Elles sont assez étroites, mais elles présentent l'avantage de les protéger des prédateurs (tel que les serpents).\n" +
                "    L'oiseau y a juste l'espace pour se retourner. Il met la tête vers la sortie, les œufs étant à l'abri tout au fond.\n" +
                "\n" +
                "    C'est un oiseau grégaire.",R.drawable.martin_pecheur_pie));
        lstAnimal.add(new Animal("Aigrette garzette","","L'Aigrette garzette (Egretta garzetta) est une espèce d'oiseaux de la famille des Ardeidae.\n L'aigrette garzette mesure entre 55 et 65 cm avec une envergure de 85 à 95 cm. Elle pèse 500 g en moyenne. Il n'y a pas de dimorphisme sexuel. Elle est entièrement blanche avec un bec noir légèrement gris bleuté à la base et ses pattes sont noires avec des doigts jaunes. En période nuptiale, elle porte sur la nuque deux longues plumes fines de 20 cm environ appelés les aigrettes\n L'Aigrette garzette se rencontre dans toutes les zones humides aux eaux peu profondes, lagunes, claires à huîtres, avec une prédilection pour les eaux saumâtres. Elle est aussi fréquente le long des cours d'eau que dans les marais dans certaines régions. Souvent observée en compagnie d'autres ardéidés.   ",R.drawable.aigrette_garzette));
        lstAnimal.add(new Animal("Pelican","","Les pélicans (du grec Πελεκάν ) forment le genre d'oiseaux Pelecanus, unique représentant de la famille des Pelecanidae (ou pélécanidés) qui compte huit espèces vivantes. \n Les pélicans sont de grands oiseaux (de 105 à 350 cm) aquatiques piscivores caractérisés par un grand bec muni d'une volumineuse poche extensible.\n" +
                "\n" +
                "Cosmopolites à l'exception des hautes latitudes, les pélicans fréquentent les étendues d'eau libre, à la fois sur les côtes et à l'intérieur des terres, depuis les régions tropicales jusqu'aux zones tempérées chaudes. \n D'après la classification de référence (version 5.1, 2014) du Congrès ornithologique international (ordre phylogénique) :\n" +
                "\n" +
                "    Pelecanus onocrotalus – Pélican blanc\n" +
                "    Pelecanus rufescens – Pélican gris\n" +
                "    Pelecanus philippensis – Pélican à bec tacheté\n" +
                "    Pelecanus crispus – Pélican frisé\n" +
                "    Pelecanus conspicillatus – Pélican à lunettes\n" +
                "    Pelecanus erythrorhynchos – Pélican d'Amérique\n" +
                "    Pelecanus occidentalis – Pélican brun\n" +
                "    Pelecanus thagus – Pélican thage\n Les pélicans préfèrent les régions tropicales ou tempérées chaudes. On les trouve souvent sur les grands lacs et les mers intérieures, dans les deltas et autres vastes zones humides, marais inclus. La plupart des espèces préfèrent l’eau douce, mais on peut aussi les trouver dans des lagunes saumâtres et des estuaires, et moins souvent le long des côtes. Le seul vraiment marin est le pélican brun. Plusieurs espèces sont souvent vues dans des ports de pêche, à la recherche de déchets de poisson.\n",R.drawable.pelican));

        lstAnimal.add(new Animal("Chimpanzes","","Pan (ou le Chimpanzé) est un genre de singes appartenant à la famille des hominidés1. Ce genre comprend deux espèces : le Chimpanzé commun (Pan troglodytes) et le Bonobo ou Chimpanzé nain (Pan paniscus). Ces hominidés d'Afrique équatoriale sont les animaux génétiquement les plus proches de l'Homme.\n" +
                "\n" +
                "La répartition géographique du Chimpanzé commun s'étend de la Guinée aux lacs Tanganyika et Victoria. Reconnu tardivement comme espèce à part entière, le Bonobo ne se trouve que dans le bassin oriental du fleuve Congo, en République démocratique du Congo.\n" +
                "\n" +
                "Les deux espèces présentent des traits physiques, affectifs, mentaux, de même que des comportements relationnels et sociaux, particulièrement remarquables pour l'être humain dans leur similitude ou parfois dans leur différence. Pour cette raison, elles sont des sujets privilégiés d'étude scientifique avec en arrière-plan l'énigme de la nature humaine et de son histoire évolutive. \nLe genre Pan compte deux espèces, le Chimpanzé commun comptant quatre sous-espèces5 :\n" +
                "\n" +
                "    Pan paniscus (Bonobo)\n" +
                "    Pan troglodytes (Chimpanzé commun)\n" +
                "        Pan troglodytes schweinfurthii\n" +
                "        Pan troglodytes troglodytes\n" +
                "        Pan troglodytes vellerosus\n" +
                "        Pan troglodytes verus \n Le mot chimpanzé vient d'une langue congolaise, le kikongo, et signifie faux-homme.\n" +
                "\n" +
                "Le Chimpanzé et surtout le Bonobo sont menacés d'extinction du fait essentiellement de l'activité humaine : destruction de leur habitat, chasse, guerre. ",R.drawable.chimpanzes_cannibal));
        lstAnimal.add(new Animal("Galago du Sénégal","","Le Galago du Sénégal1 (Galago senegalensis) est un primate d'Afrique.\n" +
                "\n" +
                "Il est commun dans les forêts et savanes d'Afrique tropicale.\n" +
                "\n" +
                "De la taille d'un rat (15 à 20 cm de long pour le corps, et 20 à 25 pour la queue), cet animal est nocturne et arboricole ; essentiellement insectivore, il mange aussi quelques substances végétales (fruits, feuilles, pousses et sève). Il se déplace en grimpant ou par bonds, et ne descend pas à terre.\n" +
                "\n" +
                "Il est facile à apprivoiser et a un régime très diversifié, quasi omnivore en captivité.\n" +
                "\n" +
                "Il peut vivre jusqu'à dix ans et demi.\n" +
                "\n" +
                "C'est un primate primitif, qui est apparenté aux lémuriens de Madagascar. \nSelon Mammal Species of the World (version 3, 2005)\n" +
                "\n" +
                "    sous-espèce Galago senegalensis braccatus\n" +
                "    sous-espèce Galago senegalensis dunni\n" +
                "    sous-espèce Galago senegalensis senegalensis\n" +
                "    sous-espèce Galago senegalensis sotikae",R.drawable.galago_du_senegal));
        lstAnimal.add(new Animal("Macaque","","Les Macaques (Macaca) constituent un genre de primates de la famille des Cercopithecidae.\n" +
                "\n" +
                "Ces singes catarhiniens sont largement répandus en Asie, de l'Inde jusqu'au Japon et à la ligne Wallace, ainsi qu'en Afrique du Nord et à Gibraltar. Ce sont en effet les seuls primates, à l'exception de l'Homme, qui soient présents sur deux (voire trois) continents et surtout qui se soient acclimatés largement au-dessus de la zone intertropicale. \n Le mot « macaque » vient du portugais macaco, qui signifie « singe ».\n Le pelage des macaques va du beige au noir en passant par toutes les nuances du brun.\n" +
                "\n" +
                "Chez quelques espèces, la face se colore en rose ou même en rouge. Les macaques ont des abajoues, ce sont deux poches qui s'ouvrent dans la bouche. Ils peuvent y emmagasiner rapidement de la nourriture pour ensuite la manger tranquillement, loin de leurs concurrents. Leurs yeux, placés frontalement, leur donnent une vision en trois dimensions semblable à celle de l'être humain. \nLes macaques sont des animaux adaptables, on les voit dans toutes sortes d'habitats : les plaines ou les montagnes, les forêts tropicales ou tempérées, les marécages ou les régions semi-désertiques. On rencontre parfois deux espèces différentes de macaques dans les mêmes forêts. C’est le cas par exemple du macaque à queue de cochon et du macaque crabier qui habitent tous deux les mêmes îles d'Indonésie.\n" +
                "\n" +
                "Les macaques sont susceptibles d'habiter dans les villes à cause de leur nature qui tolère et s'adapte au changement. Chaque pays d'Asie à sa propre espèce et chaque espèce peut habiter dans les villes comme New Delhi en Inde ou encore à Singapour.\n" +
                "\n" +
                "Chaque groupe vit sur un domaine de quelques kilomètres carrés. Les macaques sont actifs le jour et ils dorment la nuit dans les arbres. Ils se sentent plus à l’abri dans les hauteurs. Ils doivent se protéger des prédateurs comme les léopards et les pythons, mais le plus grand danger vient des hommes et de leurs chiens. ",R.drawable.macaque));

        lstAnimal.add(new Animal("Pigeon","","Les pigeons (genre Columba) sont des oiseaux de la famille des Columbidae, vivant à l'origine dans les milieux terrestres mais s'étant répandus, pour certaines espèces, en plaine et dans les villes, et se nourrissant principalement de graines, mais avec un régime très élargi autour des lieux où les déchets alimentaires leur sont disponibles, ce qui les fait parfois qualifier d'éboueurs urbains.\n" +
                "\n" +
                "Pesant en moyenne de 500 à 800 g, ces oiseaux appartiennent à plusieurs espèces. On les trouve dans tous les continents. Le pigeon vit entre 5 et 10 ans et (en général) forme des couples stables. Le mâle et la femelle partagent toutes les tâches, y compris celle de nourrir les pigeonneaux avec le lait de jabot qu'ils produisent à l'aide d'une glande de leur jabot.\n" +
                "\n" +
                "Le Pigeon domestique (Columba livia domestica) est élevé pour sa chair, mais aussi pour la colombophilie et la colombiculture. C'est aussi un oiseau commensal des centres-villes où l'on est obligé de limiter sa reproduction. \nLes pigeons font souvent partie de la faune urbaine. En ville, de nombreux habitants se plaignent des pigeons ou d'une surpopulation de pigeons. Le grief le plus courant est la dégradation des maisons ou des immeubles par les déjections, celles-ci étant particulièrement acides. Pour lutter contre ces volatiles, plusieurs méthodes sont employées, parmi lesquelles les pigeonniers contraceptifs ou la capture et la stérilisation.",R.drawable.pigeon3));
        lstAnimal.add(new Animal("Souimanga a ceinture rouge","","Le Souimanga à ceinture rouge (Cinnyris erythrocercus), dit aussi Souimanga orné, est une espèce de passereaux de la famille des Nectariniidae. Cette espèce est endémique du continent africain. \n Cet oiseau est nectarivore. Il est présent en Afrique équatoriale (Burundi, est de la République démocratique du Congo, Kenya, Rwanda, Soudan, Tanzanie, Ouganda). \nCette espèce, déclarée commune sur son aire de répartition, a été classée dans la catégorie LC (préoccupation mineure) par l'UICN.\nLe Rwanda a émis un timbre à l'effigie de cet oiseau en 1982. ",R.drawable.souimanga_a_poitrine_rouge));
        lstAnimal.add(new Animal("Souimanga a ventre olive","","Le Souimanga à ventre olive (Cinnyris chloropygius) est une espèce de passereaux de la famille des Nectariniidae.\nD'après le Congrès ornithologique international, cette espèce est constituée des sous-espèces suivantes (ordre phylogénique) :\n" +
                "\n" +
                "    Cinnyris chloropygius kempi Ogilvie-Grant 1910 ;\n" +
                "    Cinnyris chloropygius chloropygius (Jardine) 1842 ;\n" +
                "    Cinnyris chloropygius orphogaster Reichenow 1899.",R.drawable.savo));

        lstAnimal.add(new Animal("Chat des sables","","Le Chat des sables (Felis margarita), appelé aussi Chat du désert, Chat du général Margueritte ou Chat de Margueritte, vit dans les régions désertiques .\nLe Chat des sables est le félin le plus adapté aux habitats désertiques très arides.\n" +
                "\n" +
                "La fourrure du Chat des sables est souvent couleur sable. Les marques varient selon les individus : certaines n'ont ni taches ni rayures, d'autres sont légèrement tachetées, d'autres ont des taches et des rayures. Il a des barres noirâtres sur les membres, et la queue a une pointe noire avec deux ou trois anneaux sombres alternant avec des bandes chamois.\nLes Chats des sables en captivité sont très sensibles aux maladies respiratoires et à l'infection des voies respiratoires supérieures. C'est la principale cause de décès chez les adultes. La maladie la plus fréquente est la rhinotrachéite infectieuse. Les Chats des sables étant très sensibles aux infections respiratoires, ils doivent être gardés dans des enceintes très arides où l'humidité et la température ne fluctuent pas",R.drawable.chat1));
        lstAnimal.add(new Animal("Serval","","Le serval (Leptailurus serval, anciennement Felis serval) est un félin de la sous-famille des félinés.\n" +
                "\n" +
                "Le serval est la seule espèce du genre Leptailurus. Des analyses d'ADN ont montré que le serval descend du même ancêtre que le lion, mais qu'il constitue une lignée unique n'ayant pas de rapports proches avec d'autres espèces de félins, bien qu'il présente quelques points communs avec le guépard. Cependant, d'autres études indiquent que le serval est proche du chat doré africain ainsi que du caracal.\nl a de longues pattes et une tête élancée ; ses oreilles sont à la fois longues et larges en comparaison avec sa tête et ont la particularité d'être arrondies. Les oreilles du serval et son long cou lui permettent d'entendre et de voir au-dessus des hautes herbes de la savane.\n" +
                "\n" +
                "L'aspect de sa fourrure est variable : bien que la plupart des servals arborent des points ou taches à la manière des guépards, certains n'ont pour marques apparentes que quelques taches au-dessus des yeux et des anneaux autour de la queue.\n" +
                "\n" +
                "La longévité moyenne du serval est de 20 ans. \nCe chat serval, assez commun en Afrique, vit principalement dans les savanes humides. Comme les servals ont besoin de cours d'eau dans leur territoire, on ne les trouve pas dans les demi-déserts ou les steppes arides. Le serval est capable d'escalader et de nager, mais il le fait rarement.\n" +
                "\n" +
                "Il peut uriner 30 fois par heure pour marquer son territoire. ",R.drawable.serval));
        lstAnimal.add(new Animal("Chat doré africain","","Le chat doré africain (Caracal aurata ou Profelis aurata) est un chat sauvage de taille moyenne distribué à travers les forêts tropicales d'Afrique de l'Ouest et d'Afrique centrale. Il a une longueur d'environ 80 cm, dont plus de 30 cm de queue. Découvert par le naturaliste Coenraad Jacob Temminck (1778-1858) au XVIIIe siècle, ce gros chat était autrefois surnommé « chat-pard ».\n" +
                " \n" +
                "Profelis aurata était la seule espèce du genre Profelis. Une étude récente la classe plutôt dans le genre Caracal\nCe félidé possède un pelage court et serré, d'une teinte brun-doré et souvent marqué de mouchetures sombres.\n" +
                "\n" +
                "    Longueur totale du mâle : 80 cm\n" +
                "    Longueur totale de la femelle : 80 cm\n" +
                "    Longueur de la queue : 30 cm\n" +
                "    Poids adulte : 5 à 15 kg\n" +
                "\n" +
                "Certains individus peuvent mesurer 1,05 m dont une queue de 55 cm selon les individus. ",R.drawable.chatdoreaf));

        lstAnimal.add(new Animal("Echasse blanche","","L'Échasse blanche (Himantopus himantopus) est une espèce d'oiseau échassier limicole de la famille des recurvirostridae. \nCet échassier de taille moyenne (longueur totale de 37 cm ; envergure de 75 cm) est reconnaissable à ses formes élégantes, ses couleurs contrastées et ses très longues pattes roses semblables à des échasses. En vol, le dessous de ses ailes triangulaires semble tout noir, tandis que ses pattes dépassent de la queue d'environ 15 cm. Il émet un cri insistant et plaintif. \nCes oiseaux se nourrissent d'invertébrés principalement d'insectes aquatiques et de mollusques pris sur la vase, le sable, la végétation ou à la surface de l'eau. \nette espèce fréquente les étangs bordés de roseaux, les champs inondés, les rizières, les salines, les lagunes et, moins souvent, les estuaires. ",R.drawable.echasse_blanche));
        lstAnimal.add(new Animal("Calao à bec rouge","","Le Calao à bec rouge (Tockus erythrorhyncghus) est une espèce d'oiseau appartenant à la famille des Bucerotidae vivant dans les savanes et les forêts de l'Afrique subsaharienne. \nCette espèce a le dessous blanchâtre et la tête et le dos gris. Il a une longue queue et un long bec rouge courbe qui n'a pas de casque. Les deux sexes sont similaires, mais la femelle a un bec plus petit. Il mesure 42 cm de longueur et est l'un des plus petits calaos. \nCette espèce est omnivore, se nourrissant d'insectes, de fruits et de graines. Il se nourrit principalement sur le sol et forme des groupes en dehors de la saison de reproduction. ",R.drawable.calaobecrouge1));
        lstAnimal.add(new Animal("Petit duc africain","","Le Petit-duc africain (Otus senegalensis) est une espèce de rapaces nocturnes de la famille des Strigidae. \nLe Petit-duc africain est une petite chouette mesurant environ 15 à17 cm de hauteur. Il possède une envergure d'aile de 45 cm. Son plumage est tapissé de stries et de marbrures qui constituent un excellent camouflage. Son disque facial est gris, cerné d'un étroit contour noir. Il a des touffes d'oreilles, généralement gardées basses lorsque l'oiseau n'est pas dérangé.\nLe Petit-duc africain est endémique de l’Afrique subsaharienne, on le trouve dans les habitats boisés, à l’orée des forêts, et parfois dans les mangroves.",R.drawable.hibou_petit_duc_africain));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstAnimal);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
