package com.valeria.a00002024_pddm_taller2

import com.valeria.a00002024_pddm_taller2.model.Dish
import com.valeria.a00002024_pddm_taller2.model.Restaurant
val sampleRestaurants = listOf(

    Restaurant(
        id = 1,
        name = "Sushi World",
        description = "Auténtica comida japonesa fresca",
        imageUrl = "https://images.unsplash.com/photo-1579584425555-c3ce17fd4351",
        categories = listOf("Comida Asiatica"),
        menu = listOf(
            Dish(1,"California Roll","Cangrejo, aguacate y pepino","https://media.istockphoto.com/id/1932845749/es/foto/rollos-de-sushi-con-salm%C3%B3n-queso-caviar.jpg?s=612x612&w=0&k=20&c=P4E5Ni1Pqx3RORySyMLAZH9WZZMgjK2j4voSoj8_sQ8="),
            Dish(2,"Salmón Nigiri","Arroz con salmón fresco","https://images.unsplash.com/photo-1553621042-f6e147245754"),
            Dish(3,"Tempura Roll","Roll crujiente con camarón","https://images.unsplash.com/photo-1582450871972-ab5ca641643d")
        )
    ),

    Restaurant(
        id = 2,
        name = "Burger House",
        description = "Hamburguesas artesanales",
        imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349",
        categories = listOf("Americana"),
        menu = listOf(
            Dish(1,"Classic Burger","Carne y vegetales","https://images.unsplash.com/photo-1568901346375-23c9450c58cd"),
            Dish(2,"Cheese Bacon","Queso y tocino","https://images.unsplash.com/photo-1553979459-d2229ba7433b"),
            Dish(3,"BBQ Burger","Salsa BBQ","https://images.unsplash.com/photo-1606755962773-d324e0a13086")
        )
    ),

    Restaurant(
        id = 3,
        name = "Taco Fiesta",
        description = "Comida mexicana tradicional",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
        categories = listOf("Mexicana"),
        menu = listOf(
            Dish(1,"Tacos al Pastor","Cerdo con piña","https://media.istockphoto.com/id/1131715969/es/foto/una-placa-de-tacos-al-pastor-tortillas-de-ma%C3%ADz-cerdo-afeitado-salsa-pi%C3%B1a-en-rodajas-cilantro.jpg?s=612x612&w=0&k=20&c=X3SUOyO63axNRVIrPB-mCnuxj3vtQCIozVfcp6RwyHw="),
            Dish(2,"Quesadillas","Con queso","https://images.unsplash.com/photo-1615870216519-2f9fa575fa5c"),
            Dish(3,"Nachos","Con guacamole","https://images.unsplash.com/photo-1582169296194-e4d644c48063")
        )
    ),

    Restaurant(
        id = 4,
        name = "Pasta Bella",
        description = "Pastas italianas",
        imageUrl = "https://media.istockphoto.com/id/1189709277/es/foto/pasta-penne-con-tomate-asado-salsa-queso-mozzarella-fondo-de-piedra-gris-vista-superior.jpg?s=1024x1024&w=is&k=20&c=kFylKGRvAiOXaDvXU_I7MwhGX7yzjYXbPfmhhrYeWwE=",
        categories = listOf("Italiana"),
        menu = listOf(
            Dish(1,"Spaghetti","Con carne","https://media.istockphoto.com/id/1410128919/es/foto/espaguetis-pasta-bolo%C3%B1esa-servida-en-un-plato-aislado-en-el-fondo-oscuro-vista-de-la-comida.jpg?s=612x612&w=0&k=20&c=a5CWrbqd2k5h7iCtZd5d_yawCvdYgfoCFyQF2ga7-pQ="),
            Dish(2,"Fettuccine","Salsa cremosa","https://images.unsplash.com/photo-1645112411341-6c4fd023714a"),
            Dish(3,"Lasagna","Al horno","https://images.unsplash.com/photo-1619895092538-128341789043")
        )
    ),

    Restaurant(
        id = 5,
        name = "Green Bowl",
        description = "Comida saludable",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd",
        categories = listOf("Saludable"),
        menu = listOf(
            Dish(1,"Ensalada","Fresca","https://images.unsplash.com/photo-1550304943-4f24f54ddde9"),
            Dish(2,"Bowl Vegano","Quinoa","https://images.unsplash.com/photo-1546069901-ba9599a7e63c"),
            Dish(3,"Wrap","Integral","https://media.istockphoto.com/id/941025092/es/foto/rollos-de-pollo.jpg?s=612x612&w=0&k=20&c=gxJQQN4408QZ0NHjMccUZCWtfL5o5j7Me1Aql049r24=")
        )
    ),

    Restaurant(
        id = 6,
        name = "Steak House",
        description = "Carnes premium",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
        categories = listOf("Americana", "Saludable"),
        menu = listOf(
            Dish(1,"Ribeye","A la parrilla","https://media.istockphoto.com/id/587207508/es/foto/filete-a-la-parrilla-en-rodajas-ribeye-con-mantequilla-de-hierbas.jpg?s=612x612&w=0&k=20&c=FpPGPX-jIkIIORr1L40LE-YozmaWbiGlAPeni5qGNhg="),
            Dish(2,"T-Bone","Jugoso","https://images.unsplash.com/photo-1558030006-450675393462"),
            Dish(3,"Filete","Premium","https://media.istockphoto.com/id/972852490/es/foto/filetes-de-solomillo-barbacoa-con-tomillo-fresco.jpg?s=612x612&w=0&k=20&c=mQ6V0z4baSE0ApjLQRkw1vTdy5kejSB_Y2acl8iqeRE=")
        )
    ),

    Restaurant(
        id = 7,
        name = "Seafood Bay",
        description = "Mariscos frescos",
        imageUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836",
        categories = listOf("Americana", "Saludable"),
        menu = listOf(
            Dish(1,"Camarones","Al ajillo","https://media.istockphoto.com/id/1414307299/es/foto/primer-plano-de-mantequilla-de-ajo-camarones-en-sart%C3%A9n.jpg?s=612x612&w=0&k=20&c=KgxUSMwcEyKz9Q91b3YxgU-b9U4w3O9QtNJiMpXfOx0="),
            Dish(2,"Pulpo","Parrilla","https://media.istockphoto.com/id/1216250666/es/foto/pulpo-frito-sobre-mesa-de-madera.jpg?s=612x612&w=0&k=20&c=Pv9H_DrOTkXPkynPiJCE6jEjPgpcFt4QJO8USh0xH4M="),
            Dish(3,"Pescado","Frito","https://images.unsplash.com/photo-1544025162-d76694265947")
        )
    ),

    Restaurant(
        id = 8,
        name = "Asian Fusion",
        description = "Comida asiática",
        imageUrl = "https://www.gffoodservice.com.au/wp-content/uploads/2021/03/article-hero-banner-asian_fusion-@1x.jpg",
            categories = listOf("Comida Asiatica", "Saludable"),
        menu = listOf(
            Dish(1,"Pad Thai","Fideos","https://media.istockphoto.com/id/510163478/es/foto/pad-thai.jpg?s=612x612&w=0&k=20&c=XAAEOs0ElFsoVl7PmhiubI6yKMx9ci5cMczP0dVmNDg="),
            Dish(2,"Arroz","Frito","https://media.istockphoto.com/id/945606006/es/foto/arroz-frito-de-pollo.jpg?s=612x612&w=0&k=20&c=Esli_5JhEAB5io0KlKcXP5RcaP2pZphOqc-zTJbk6P8="),
            Dish(3,"Teriyaki","Pollo","https://images.unsplash.com/photo-1553621042-f6e147245754")
        )
    ),

    Restaurant(
        id = 9,
        name = "Coffee Corner",
        description = "Café y postres",
        imageUrl = "https://images.unsplash.com/photo-1509042239860-f550ce710b93",
        categories = listOf("Panaderia", "Italiana"),
        menu = listOf(
            Dish(1,"Capuccino","Espuma","https://images.unsplash.com/photo-1511920170033-f8396924c348"),
            Dish(2,"Cheesecake","Cremoso","https://images.unsplash.com/photo-1551024601-bec78aea704b"),
            Dish(3,"Croissant","Hojaldre","https://images.unsplash.com/photo-1509440159596-0249088772ff")
        )
    ),

    Restaurant(
        id = 10,
        name = "Grill Master",
        description = "BBQ",
        imageUrl = "https://images.unsplash.com/photo-1558030006-450675393462",
        categories = listOf("Americana", "Mexicana"),
        menu = listOf(
            Dish(1,"Costillas","BBQ","https://media.istockphoto.com/id/1086140442/es/foto/closeup-de-costillas-de-cerdo-a-la-parrilla-con-salsa-bbq-y-caramelizado-en-miel-sabroso.jpg?s=612x612&w=0&k=20&c=q-jhX4_Ljdp6px2N7T-JpZvFSW-fAM3iV300HPo6aoo="),
            Dish(2,"Pollo","Parrilla","https://media.istockphoto.com/id/622185412/es/foto/filetes-de-pollo-frito-y-verduras-sobre-fondo-de-madera.jpg?s=612x612&w=0&k=20&c=M_ref9PT9JVvFPAtyv9TZ-Rwho6gAyHjvXkH4dI-8Rw="),
            Dish(3,"Chorizo","Asado","https://media.istockphoto.com/id/876611828/es/foto/espa%C3%B1ol-a-la-parrilla-salchichas.jpg?s=612x612&w=0&k=20&c=Gv9DqRpAMivmEW27PaCiYlQshosb4ahKqd70-rWDSFI=")
        )
    ),

    Restaurant(
        id = 11,
        name = "Bakery Delight",
        description = "Panadería",
        imageUrl = "https://images.unsplash.com/photo-1509440159596-0249088772ff",
        categories = listOf("Panaderia"),
        menu = listOf(
            Dish(1,"Pan","Dulce","https://images.unsplash.com/photo-1509440159596-0249088772ff"),
            Dish(2,"Donas","Suaves","https://images.unsplash.com/photo-1551024601-bec78aea704b"),
            Dish(3,"Pastel","Chocolate","https://images.unsplash.com/photo-1578985545062-69928b1d9587")
        )
    ),

    Restaurant(
        id = 12,
        name = "Veggie Life",
        description = "Vegetariano",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd",
        categories = listOf("Saludable"),
        menu = listOf(
            Dish(1,"Burger Vegana","Lentejas","https://images.unsplash.com/photo-1546069901-ba9599a7e63c"),
            Dish(2,"Tacos Veganos","Vegetales","https://media.istockphoto.com/id/1155044772/es/foto/tortillas-veganas-con-quinoa-esp%C3%A1rragos-frijoles-verduras-y-guacamole.jpg?s=612x612&w=0&k=20&c=VPfyOnmJfCQ_lDMeI5J3Berh_8tnv41qTTUZjtBZXRo="),
            Dish(3,"Ensalada","Detox","https://images.unsplash.com/photo-1550304943-4f24f54ddde9")
        )
    )
)