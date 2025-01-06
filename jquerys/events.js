


    // Función para inicializar el autocomplete

    $(()=>{
        const mapas = ["alcyone", "atlas a", "atlas b", "atlas c", "aquila", "auriga", "bootes", "cygni", "eridani",
            "helvetios", "maia", "orion", "persei", "sadatoni", "sirius", "volantis"
          ];
        console.log(" iniciamos ")
        $("#origenMapa, #destinoMapa").autocomplete({
          source: mapas
        });
    });
