package com.valeria.a00002024_pddm_taller2

import com.valeria.a00002024_pddm_taller2.model.Dish
import com.valeria.a00002024_pddm_taller2.model.Restaurant

val sampleRestaurants = listOf(

    Restaurant(
        id = 1,
        name = "Sushi World",
        description = "Auténtica comida japonesa fresca",
        imageUrl = "https://images.unsplash.com/photo-1579584425555-c3ce17fd4351",
        categories = listOf("Japonesa", "Sushi"),
        menu = listOf(
            Dish(
                1,
                "California Roll",
                "Cangrejo, aguacate y pepino",
                "https://images.unsplash.com/photo-1604908176997-431f2e7c4c1d"
            ),
            Dish(
                2,
                "Salmón Nigiri",
                "Arroz con salmón fresco",
                "https://images.unsplash.com/photo-1553621042-f6e147245754"
            ),
            Dish(
                3,
                "Tempura Roll",
                "Roll crujiente con camarón",
                "https://images.unsplash.com/photo-1582450871972-ab5ca641643d"
            )
        )
    ),

    Restaurant(
        id = 2,
        name = "Burger House",
        description = "Hamburguesas jugosas y artesanales",
        imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349",
        categories = listOf("Americana", "Hamburguesas"),
        menu = listOf(
            Dish(
                1,
                "Classic Burger",
                "Carne, lechuga y tomate",
                "https://images.unsplash.com/photo-1568901346375-23c9450c58cd"
            ),
            Dish(
                2,
                "Cheese Bacon",
                "Queso cheddar y tocino",
                "https://images.unsplash.com/photo-1553979459-d2229ba7433b"
            ),
            Dish(
                3,
                "BBQ Burger",
                "Salsa BBQ y cebolla caramelizada",
                "https://images.unsplash.com/photo-1606755962773-d324e0a13086"
            )
        )
    ),

    Restaurant(
        id = 3,
        name = "Taco Fiesta",
        description = "Sabores auténticos mexicanos",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
        categories = listOf("Mexicana"),
        menu = listOf(
            Dish(
                1,
                "Tacos al Pastor",
                "Cerdo con piña",
                "https://images.unsplash.com/photo-1601924638867-3ec2f2c7b0d7"
            ),
            Dish(
                2,
                "Quesadillas",
                "Tortilla con queso derretido",
                "https://images.unsplash.com/photo-1615870216519-2f9fa575fa5c"
            ),
            Dish(
                3,
                "Nachos",
                "Totopos con queso y guacamole",
                "https://images.unsplash.com/photo-1582169296194-e4d644c48063"
            )
        )
    ),

    Restaurant(
        id = 4,
        name = "Pasta Bella",
        description = "Pastas italianas hechas a mano",
        imageUrl = "https://images.unsplash.com/photo-1528715471579-d1bcf0ba5e83",
        categories = listOf("Italiana"),
        menu = listOf(
            Dish(
                1,
                "Spaghetti Bolognese",
                "Carne y salsa de tomate",
                "https://images.unsplash.com/photo-1589308078054-832a2f9c2b5c"
            ),
            Dish(
                2,
                "Fettuccine Alfredo",
                "Salsa cremosa con queso",
                "https://images.unsplash.com/photo-1645112411341-6c4fd023714a"
            ),
            Dish(
                3,
                "Lasagna",
                "Capas de pasta con carne",
                "https://images.unsplash.com/photo-1619895092538-128341789043"
            )
        )
    ),

    Restaurant(
        id = 5,
        name = "Green Bowl",
        description = "Comida saludable y fresca",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd",
        categories = listOf("Saludable"),
        menu = listOf(
            Dish(
                1,
                "Ensalada César",
                "Pollo, lechuga y aderezo",
                "https://images.unsplash.com/photo-1550304943-4f24f54ddde9"
            ),
            Dish(
                2,
                "Bowl Vegano",
                "Quinoa, vegetales y aguacate",
                "https://images.unsplash.com/photo-1546069901-ba9599a7e63c"
            ),
            Dish(
                3,
                "Wrap Integral",
                "Pollo y vegetales frescos",
                "https://images.unsplash.com/photo-1604908177522-432f6bb1b1d6"
            )
        )
    ),

    Restaurant(
        id = 6,
        name = "Steak House",
        description = "Cortes de carne premium",
        imageUrl = "https://images.unsplash.com/photo-1600891964599-f61ba0e24092",
        categories = listOf("Carnes"),
        menu = listOf(
            Dish(
                1,
                "Ribeye",
                "Corte jugoso a la parrilla",
                "https://images.unsplash.com/photo-1604908811824-1c4c6b0f1b09"
            ),
            Dish(
                2,
                "T-Bone",
                "Carne con hueso",
                "https://images.unsplash.com/photo-1558030006-450675393462"
            ),
            Dish(
                3,
                "Filete Mignon",
                "Corte suave y premium",
                "https://images.unsplash.com/photo-1600891963933-6b0f1b0f8b06"
            )
        )
    ),

    Restaurant(
        id = 7,
        name = "Seafood Bay",
        description = "Lo mejor del mar",
        imageUrl = "https://images.unsplash.com/photo-1504674900247-0877df9cc836",
        categories = listOf("Mariscos"),
        menu = listOf(
            Dish(
                1,
                "Camarones al Ajillo",
                "Camarones con ajo",
                "https://images.unsplash.com/photo-1625944525533-473f1f39d1e3"
            ),
            Dish(
                2,
                "Pulpo a la Parrilla",
                "Pulpo tierno",
                "https://images.unsplash.com/photo-1604908176997-431f2e7c4c1d"
            ),
            Dish(
                3,
                "Pescado Frito",
                "Filete crujiente",
                "https://images.unsplash.com/photo-1544025162-d76694265947"
            )
        )
    ),

    Restaurant(
        id = 8,
        name = "Asian Fusion",
        description = "Sabores asiáticos modernos",
        imageUrl = "https://images.unsplash.com/photo-1512058564366-c9e3e046b6c3",
        categories = listOf("Asiática"),
        menu = listOf(
            Dish(
                1,
                "Pad Thai",
                "Fideos con camarón",
                "https://images.unsplash.com/photo-1604908811824-1c4c6b0f1b09"
            ),
            Dish(
                2,
                "Arroz Frito",
                "Arroz con vegetales y pollo",
                "https://images.unsplash.com/photo-1604908176997-431f2e7c4c1d"
            ),
            Dish(
                3,
                "Pollo Teriyaki",
                "Salsa dulce japonesa",
                "https://images.unsplash.com/photo-1553621042-f6e147245754"
            )
        )
    ),

    Restaurant(
        id = 9,
        name = "Coffee Corner",
        description = "Café y postres deliciosos",
        imageUrl = "https://images.unsplash.com/photo-1509042239860-f550ce710b93",
        categories = listOf("Café"),
        menu = listOf(
            Dish(
                1,
                "Capuccino",
                "Café con espuma",
                "https://images.unsplash.com/photo-1511920170033-f8396924c348"
            ),
            Dish(
                2,
                "Cheesecake",
                "Pastel cremoso",
                "https://images.unsplash.com/photo-1551024601-bec78aea704b"
            ),
            Dish(
                3,
                "Croissant",
                "Pan hojaldrado",
                "https://images.unsplash.com/photo-1509440159596-0249088772ff"
            )
        )
    ),

    Restaurant(
        id = 10,
        name = "Grill Master",
        description = "Parrilladas al estilo BBQ",
        imageUrl = "https://images.unsplash.com/photo-1558030006-450675393462",
        categories = listOf("BBQ"),
        menu = listOf(
            Dish(
                1,
                "Costillas BBQ",
                "Salsa ahumada",
                "https://images.unsplash.com/photo-1600891963933-6b0f1b0f8b06"
            ),
            Dish(
                2,
                "Pollo a la Parrilla",
                "Jugoso y sazonado",
                "https://images.unsplash.com/photo-1604908811824-1c4c6b0f1b09"
            ),
            Dish(
                3,
                "Chorizo Asado",
                "Picante y delicioso",
                "https://images.unsplash.com/photo-1604908176997-431f2e7c4c1d"
            )
        )
    ),

    Restaurant(
        id = 11,
        name = "Bakery Delight",
        description = "Panadería artesanal",
        imageUrl = "https://images.unsplash.com/photo-1509440159596-0249088772ff",
        categories = listOf("Panadería"),
        menu = listOf(
            Dish(
                1,
                "Pan Dulce",
                "Recién horneado",
                "https://images.unsplash.com/photo-1509440159596-0249088772ff"
            ),
            Dish(
                2,
                "Donas",
                "Glaseadas y suaves",
                "https://images.unsplash.com/photo-1551024601-bec78aea704b"
            ),
            Dish(
                3,
                "Pastel de Chocolate",
                "Rico y húmedo",
                "https://images.unsplash.com/photo-1578985545062-69928b1d9587"
            )
        )
    ),

    Restaurant(
        id = 12,
        name = "Veggie Life",
        description = "Opciones vegetarianas deliciosas",
        imageUrl = "https://images.unsplash.com/photo-1512621776951-a57141f2eefd",
        categories = listOf("Vegetariana"),
        menu = listOf(
            Dish(
                1,
                "Hamburguesa Vegana",
                "Base de lentejas",
                "https://images.unsplash.com/photo-1546069901-ba9599a7e63c"
            ),
            Dish(
                2,
                "Tacos Veganos",
                "Relleno de vegetales",
                "https://images.unsplash.com/photo-1601924638867-3ec2f2c7b0d7"
            ),
            Dish(
                3,
                "Ensalada Detox",
                "Ingredientes frescos",
                "https://images.unsplash.com/photo-1550304943-4f24f54ddde9"
            )
        )
    )

)