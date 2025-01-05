

const mapas = ["alcyone", "atlas a", "atlas b", "atlas c", "aquila", "auriga", "bootes", "cygni", "eridani",
    "helvetios", "maia", "orion", "persei", "sadatoni", "sirius", "volantis"
  ];
    // Función para inicializar el autocomplete
    $(function () {
        $("#origenMapa, #destinoMapa").autocomplete({
          source: mapas
        });
      });